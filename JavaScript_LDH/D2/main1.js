 /* External Script */

    // debugger
    console.log(document.getElementById("para1").innerHTML);
    // console.log(document.getElementById("para1").innerHTML="<b>Paragraph 1: This is the 1st paragraph.</b>"); //used with console.log to check on console

    function changeText()
    {
        document.getElementById('para1').innerHTML='<b>Paragraph 1: This is the 1st paragraph.</b>' 
    }

    // event handling in javascript
    document.getElementById('changeBtn').onclick = function()
    {
        changeText();
        console.log("test - directly in js");
    }

    // event handling - using addEventListener
    document.getElementById('changeBtn').addEventListener('click', function()
    {
        {
            changeText();
            console.log("click");
        }
    })

    document.getElementById('changeBtn').addEventListener('mouseover', function()
    {
        {
            changeText();
            console.log("mouseover");
        }
    })
    document.getElementById('changeBtn').addEventListener('mouseover', function()
    {
        {
            changeText();
            console.log("alert");
            alert("hello");
        }
    })