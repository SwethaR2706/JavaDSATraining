// for (var i = 1; i <= 10; i++) {
//   if (i <= 5) {
//     document.write("5 x " + i + " = " + (5 * i) + "<br>");
//   }  

// }

// //
// var count=0;
// for(var i=1;i<=50;i++){
//     if(i%2==0){
//         count++;
//         document.write( i + "<br>");
//     }
// }
// document.write("Count:"+count);

// //
// document.write("<br>");
// var sum=0;
// for(i=1;i<=10;i++){
//     for(j=1;j<=i;j++){
//         document.write(i);
//     }
//     document.write("<br>");
// }
// document.write("sum=",sum+i);


// var num = 24;  // Change this number to test other values

// document.write("Factors of " + num + ":<br>");

// for (var i = 1; i <= num; i++) {
//   if (num % i === 0) {
//     document.write(i + "<br>");
//   }
// }

var num = 5;
var fact = 1;

document.write("Factorial of " + num + ":<br>");

for (var i = 1; i <= num; i++) {
  fact *= i;
}                                                     

document.write(fact);