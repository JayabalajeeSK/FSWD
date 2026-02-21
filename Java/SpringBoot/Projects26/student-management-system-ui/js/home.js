const backendUrl = "http://localhost:8080/api/students";
const token = localStorage.getItem("token");

// Admin emails
const adminEmails = ["admin1@gmail.com", "admin2@gmail.com"];

if (!token) {
    window.location.href = "index.html"; // redirect if not logged in
}

let currentEmail = "";

// Fetch the current user's email from JWT
async function getCurrentUserEmail() {
    try {
        // Decode JWT to get email
        const payload = JSON.parse(atob(token.split(".")[1]));
        currentEmail = payload.sub; // 'sub' contains email

        // Show add form only for admins
        if (adminEmails.includes(currentEmail)) {
            document.getElementById("addStudentDiv").style.display = "block";
            document.querySelector("#studentTable th:last-child").style.display = "table-cell"; // show Actions header
        } else {
            document.querySelector("#studentTable th:last-child").style.display = "none"; // hide Actions header
        }

        loadStudents();
    } catch (error) {
        console.error("Error fetching user email:", error);
        alert("Error connecting to backend");
    }
}

async function loadStudents() {
    try {
        const res = await fetch(`${backendUrl}/all`, {
            headers: { "Authorization": "Bearer " + token }
        });

        if (!res.ok) throw new Error("Cannot get students");
        const students = await res.json();

        const tbody = document.querySelector("#studentTable tbody");
        tbody.innerHTML = "";

        students.forEach(s => {
            let actions = "";
            if (adminEmails.includes(currentEmail)) {
                actions = `<a href="edit.html?id=${s.id}">Edit</a>
                           <button onclick="deleteStudent(${s.id})">Delete</button>`;
            }

            tbody.innerHTML += `
                <tr>
                    <td>${s.id}</td>
                    <td>${s.name}</td>
                    <td>${s.email}</td>
                    <td>${s.course}</td>
                    <td>${s.age}</td>
                    <td style="${adminEmails.includes(currentEmail) ? "" : "display:none;"}">
                        ${actions}
                    </td>
                </tr>
            `;
        });
    } catch (error) {
        console.error("Error loading students:", error);
        alert("Error connecting to backend");
    }
}

// Delete student
async function deleteStudent(id) {
    if (!confirm("Are you sure?")) return;
    try {
        const res = await fetch(`${backendUrl}/delete/${id}`, {
            method: "DELETE",
            headers: { "Authorization": "Bearer " + token }
        });
        if (res.ok) loadStudents();
        else alert("Delete failed or not allowed");
    } catch (error) {
        console.error("Error deleting student:", error);
        alert("Error connecting to backend");
    }
}

// Add student
const addForm = document.getElementById("addStudentForm");
if (addForm) {
    addForm.addEventListener("submit", async (e) => {
        e.preventDefault();
        const name = document.getElementById("name").value;
        const email = document.getElementById("email").value;
        const course = document.getElementById("course").value;
        const age = document.getElementById("age").value;

        try {
            const res = await fetch(`${backendUrl}/create`, {
                method: "POST",
                headers: { 
                    "Content-Type": "application/json",
                    "Authorization": "Bearer " + token
                },
                body: JSON.stringify({ name, email, course, age })
            });

            if (res.ok) {
                document.getElementById("addMessage").innerText = "Student added successfully!";
                loadStudents();
            } else {
                alert("Add failed or not allowed");
            }
        } catch (error) {
            console.error("Error adding student:", error);
            alert("Error connecting to backend");
        }
    });
}

function logout() {
    localStorage.removeItem("token");
    window.location.href = "index.html";
}

// Initial load
getCurrentUserEmail();
