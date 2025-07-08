var u = 1200; // Units consumed
var bill = 0;

switch (true) {
  case (u < 200):
    bill = 0;
    break;

  case (u >= 200 && u < 500):
    bill = u * 5;
    break;

  case (u >= 500 && u < 1000):
    bill = u * 5;
    break;

  case (u >= 1000 && u < 1500):
    bill = u * 10;
    break;

  case (u >= 1500):
    bill = u * 20;
    break;

  default:
    bill = 0;
}

console.log("Units Consumed: " + u);
console.log("Electricity Bill: ₹" + bill);
