const backendUrl = "http://localhost:8080/api/auth";

// ===== LOGIN FORM =====
const loginForm = document.getElementById("loginForm");
if (loginForm) {
    loginForm.addEventListener("submit", async (e) => {
        e.preventDefault();

        const email = document.getElementById("email").value.trim();
        const password = document.getElementById("password").value.trim();

        if (!email || !password) {
            showMessage("Please enter email and password");
            return;
        }

        try {
            const res = await fetch(`${backendUrl}/login`, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ email, password })
            });

            if (res.ok) {
                const data = await res.json();
                localStorage.setItem("token", data.token);
                window.location.href = "home.html"; // redirect after login
            } else {
                const err = await res.json();
                showMessage(err.message || "Login failed");
            }
        } catch (error) {
            console.error(error);
            showMessage("Error connecting to backend");
        }
    });
}

// ===== REGISTER FORM =====
const registerForm = document.getElementById("registerForm");
if (registerForm) {
    registerForm.addEventListener("submit", async (e) => {
        e.preventDefault();

        const email = document.getElementById("email").value.trim();
        const password = document.getElementById("password").value.trim();

        if (!email || !password) {
            showMessage("Please enter email and password");
            return;
        }

        try {
            const res = await fetch(`${backendUrl}/register`, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ email, password })
            });

            if (res.ok) {
                showMessage("Registered successfully! Redirecting to login...");
                setTimeout(() => window.location.href = "index.html", 2000);
            } else {
                const err = await res.json();
                showMessage(err.message || "Registration failed");
            }
        } catch (error) {
            console.error(error);
            showMessage("Error connecting to backend");
        }
    });
}

// ===== HELPER FUNCTION =====
function showMessage(msg) {
    const messageEl = document.getElementById("message");
    if (messageEl) messageEl.innerText = msg;
}
