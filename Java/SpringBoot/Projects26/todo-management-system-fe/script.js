// Shared script for login, register, and todos pages
const SERVER_URL = "http://localhost:8080";
const token = localStorage.getItem("token");

// Login page logic
function login() {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    fetch(`${SERVER_URL}/auth/login`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ email, password })
    })
    .then(response => {
        if (!response.ok) throw new Error("Invalid email or password");
        return response.json();   // expect { token: "..." }
    })
    .then(data => {
        localStorage.setItem("token", data.token);
        window.location.href = "todos.html";
    })
    .catch(err => alert(err.message));
}

// Register page logic
function register() {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    fetch(`${SERVER_URL}/auth/register`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ email, password })
    })
    .then(res => {
        if (!res.ok) throw new Error("Registration failed");
        alert("Register successful. Please login.");
        window.location.href = "login.html";
    })
    .catch(err => alert(err.message));
}


// Todos page logic
function createTodoCard(todo) {
    const card = document.createElement("div");
    card.className = "todo-card";

    // checkbox
    const checkbox = document.createElement("input");
    checkbox.type = "checkbox";
    checkbox.className = "todo-checkbox";
    checkbox.checked = todo.isCompleted;

    checkbox.addEventListener("change", () => {
        updateTodoStatus(todo.id, checkbox.checked);
    });

    // text
    const span = document.createElement("span");
    span.textContent = todo.title;

    if (todo.isCompleted) {
        span.style.textDecoration = "line-through";
    }

    // delete button
    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "Delete";
    deleteBtn.onclick = () => deleteTodo(todo.id);

    // append
    card.appendChild(checkbox);
    card.appendChild(span);
    card.appendChild(deleteBtn);

    return card;
}


function loadTodos() {
    fetch(`${SERVER_URL}/api/todos/view/AllTodos`, {
        headers: {
            "Authorization": `Bearer ${localStorage.getItem("token")}`
        }
    })
    .then(response => {
        if (!response.ok) throw new Error("Failed to load todos");
        return response.json();
    })
    .then(todos => {
        const list = document.getElementById("todo-list");
        list.innerHTML = "";

        if (todos.length === 0) {
            list.innerHTML = "<p>No todos found</p>";
            return;
        }

        todos.forEach(todo => {
            list.appendChild(createTodoCard(todo));
        });
    })
    .catch(err => alert(err.message));
}


function addTodo() {
    const title = document.getElementById("new-todo").value.trim();
    if (!title) return alert("Todo cannot be empty");

    fetch(`${SERVER_URL}/api/todos/create`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
            "Authorization": `Bearer ${localStorage.getItem("token")}`
        },
        body: JSON.stringify({ title })
    })
    .then(response => {
        if (!response.ok) throw new Error("Failed to add todo");
        return response.json();
    })
    .then(() => {
        document.getElementById("new-todo").value = "";
        loadTodos();
    })
    .catch(err => alert(err.message));
}

function updateTodoStatus(todo) {
    fetch(`${SERVER_URL}/api/todos/update/${todo.id}`, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json",
            "Authorization": `Bearer ${localStorage.getItem("token")}`
        },
        body: JSON.stringify({
            isCompleted: todo.isCompleted
        })
    })
    .then(response => {
        if (!response.ok) throw new Error("Failed to update todo");
        loadTodos();
    })
    .catch(err => alert(err.message));
}


function deleteTodo(id) {
    fetch(`${SERVER_URL}/api/todos/delete/${id}`, {
        method: "DELETE",
        headers: {
            "Authorization": `Bearer ${localStorage.getItem("token")}`
        }
    })
    .then(response => {
        if (!response.ok) throw new Error("Failed to delete todo");
        loadTodos();
    })
    .catch(err => alert(err.message));
}


// Page-specific initializations
document.addEventListener("DOMContentLoaded", function () {
    if (document.getElementById("todo-list")) {
        loadTodos();
    }
});