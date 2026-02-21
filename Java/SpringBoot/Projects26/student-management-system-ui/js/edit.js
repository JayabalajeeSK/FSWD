const token = localStorage.getItem("token");
if (!token) window.location.href = "index.html";

const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get("id");
if (!id) window.location.href = "home.html";

const backendStuUrl = "http://localhost:8080/api/students";

async function loadStudent(id) {
    try {
        const res = await fetch(`${backendStuUrl}/get/${id}`, {
            headers: { "Authorization": "Bearer " + token }
        });
        if (!res.ok) {
            alert("Failed to fetch student data");
            return;
        }
        const student = await res.json();
        document.getElementById("name").value = student.name || "";
        document.getElementById("email").value = student.email || "";
        document.getElementById("course").value = student.course || "";
        document.getElementById("age").value = student.age || "";
    } catch (error) {
        console.error(error);
        alert("Error loading student data");
    }
}

// FORM SUBMIT
const form = document.getElementById("editForm");
form.addEventListener("submit", async (e) => {
    e.preventDefault();
    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const course = document.getElementById("course").value.trim();
    const age = parseInt(document.getElementById("age").value.trim());

    try {
        const res = await fetch(`${backendStuUrl}/update/${id}`, {
            method: "PUT",
            headers: { 
                "Content-Type": "application/json",
                "Authorization": "Bearer " + token 
            },
            body: JSON.stringify({ name, email, course, age })
        });

        const data = await res.json();

        if (res.ok) {
            window.location.href = "home.html";
        } else {
            console.error(data);
            alert(data.message || "Update failed");
        }
    } catch (error) {
        console.error(error);
        alert("Error connecting to backend");
    }
});

// Load student on page load
loadStudent(id);
