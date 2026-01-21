document.getElementById("add").addEventListener("click",function()
{
            let a = Number(document.getElementById("num1").value);
            let b = Number(document.getElementById("num2").value);
            document.getElementById("result1").value = a + b;
            document.getElementById("result2").innerHTML = "Result: " + (a + b);
});



document.getElementById("sub").addEventListener('click',function()
{
            let a = Number(document.getElementById("num1").value);
            let b = Number(document.getElementById("num2").value);
            document.getElementById("result1").value = a - b;
            document.getElementById("result2").innerHTML = "Result: " + (a - b);
});

document.getElementById("mul").addEventListener('click',function()
{
            let a = Number(document.getElementById("num1").value);
            let b = Number(document.getElementById("num2").value);
            document.getElementById("result1").value = a * b;
            document.getElementById("result2").innerHTML = "Result: " + (a * b);
});

document.getElementById("div").addEventListener('click',function()
{
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);

    if (b === 0) 
    {
        document.getElementById("result1").value = "Cannot divide by zero";
        document.getElementById("result2").innerHTML = "Cannot divide by zero";
    } 
    else 
    {
        document.getElementById("result1").value = a / b;
        document.getElementById("result2").innerHTML = "Result: " + (a / b);
    }
});

document.getElementById("join").addEventListener('click',function()
{
            let a = (document.getElementById("num1").value);
            let b = (document.getElementById("num2").value);
            document.getElementById("result1").value = a + b;
            document.getElementById("result2").innerHTML = "Result: " + (a + b);
});

//Variable Intro
// let a;
// undefined
// a = "jaya"
// 'jaya'
// a
// 'jaya
