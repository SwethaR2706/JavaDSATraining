function allLetter(inputtxt)
{
    var letters = /^[A-Za-z]+$/;
    if(inputtxt.value.match(letters))
    {
        alert("Your name is accepted");
        return true;
    }
    else
    {
        alert("Please enter alphabets only");
        return false;
    }
}