
var num1 = document.form1.fno.value;
var num2=document.form1.sno.value;


function sum(){
    var sum=eval(num1)+eval(num2);
    document.form1.res.value=sum;
    document.form1.fno.value=" ";
    document.form1.sno.value=" ";
}

function diff(){
    var sum=eval(num1)-eval(num2);
    document.form1.res.value=sum;
    document.form1.fno.value=" ";
    document.form1.sno.value=" ";
}