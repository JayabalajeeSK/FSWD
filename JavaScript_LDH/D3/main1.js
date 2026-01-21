document.getElementById('submitBtn').addEventListener('click',function()
{
    let inputValue = document.getElementById('input').value.toLowerCase();
    if(inputValue === 'raining' || inputValue === 'winter')
    {
        document.getElementById('result').innerHTML = "Take a Black Umberlla"
    }
    else if(inputValue === 'sunny' || inputValue === 'summer')
    {
        document.getElementById('result').innerHTML = "Take a White Umberlla"
    }
    else 
    {
        document.getElementById('result').innerHTML = "Invalid Input"
    }
})