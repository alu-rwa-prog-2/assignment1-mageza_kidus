// Author: Shalom Mageza
// Cohort: 2


// Here I start by  asigning user input variables for Height and weight
var userHeight = window.prompt("Enter your Height (Meters): "); 
var userWeight = window.prompt("Enter your Weight (Kilograms): "); 

// next I create a function for calculationg the BMI of the person
function userBMI(x, y) {
    z = x/ (y^2);
    alert("Your BMI is " + z);

  }

// Here I call the BMI Function 
userBMI(userWeight, userHeight);   

