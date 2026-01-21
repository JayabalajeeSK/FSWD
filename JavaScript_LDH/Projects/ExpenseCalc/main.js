function calculate() {
    let input = document.getElementById("expenses").value;

    if (input.trim() === "") {
        document.getElementById("output").innerHTML = "Please enter expenses";
        return;
    }

    let values = input.split(",");
    let total = 0;
    let max = 0;
    let i = 0;

    // WHILE loop
    while (i < values.length) {
        let amount = Number(values[i]);

        if (isNaN(amount)) {
            document.getElementById("output").innerHTML = "Invalid number found";
            return;
        }

        total += amount;

        if (amount > max) {
            max = amount;
        }
        i++;
    }

    // DO-WHILE loop (counting)
    let count = 0;
    let j = 0;
    do {
        count++;
        j++;
    } while (j < values.length);

    // FOR loop (average)
    let average = total / count;

    document.getElementById("output").innerHTML = `
        <b>Total Expense:</b> ₹${total}<br>
        <b>Average Expense:</b> ₹${average.toFixed(2)}<br>
        <b>Highest Expense:</b> ₹${max}
    `;
}
