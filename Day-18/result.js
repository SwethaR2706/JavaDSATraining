var sub1 = 88;
var sub2 = 78;
var sub3 = 99;

var total = sub1 + sub2 + sub3;
var average = total / 3;

var grade;

switch (true) {
  case (average >= 90):
    grade = "A";
    break;
  case (average >= 80):
    grade = "B";
    break;
  case (average >= 70):
    grade = "C";
    break;
  case (average >= 60):
    grade = "D";
    break;
  default:
    grade = "F";
}

document.write("Total: " + total);
document.write("Average: " + average.toFixed(2));
document.write("Grade: " + grade);
