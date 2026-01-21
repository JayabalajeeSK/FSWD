function getInputValue() {
    let value = document.getElementById("num").value;
    if (value === "" || value <= 0) {
        document.getElementById("output").innerHTML = "Please enter a valid number";
        return null;
    }
    return Number(value);
}

// FOR LOOP
function generateFor() {
    let n = getInputValue();
    if (n === null) return;

    let result = "";
    for (let i = 1; i <= n; i++) {
        result += i;
    }
    document.getElementById("output").innerHTML = "For Loop Output: " + result;
}

// WHILE LOOP
function generateWhile() {
    let n = getInputValue();
    if (n === null) return;

    let i = 1;
    let result = "";
    while (i <= n) {
        result += i;
        i++;
    }
    document.getElementById("output").innerHTML = "While Loop Output: " + result;
}

// DO-WHILE LOOP
function generateDoWhile() {
    let n = getInputValue();
    if (n === null) return;

    let i = 1;
    let result = "";
    do {
        result += i;
        i++;
    } while (i <= n);

    document.getElementById("output").innerHTML = "Do-While Loop Output: " + result;
}
