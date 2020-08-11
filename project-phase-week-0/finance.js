

// We are going to represent our expenses in a list containing integers.

// Create a list with the following items.
// 500, 1000, 1250, 175, 800 and 120
// Create an application which solves the following problems.
// How much did we spend?
// Which was our greatest expense?
// Which was our cheapest spending?
// What was the average amount of our spendings?


const expenses = [500, 1000, 1250, 175, 800, 120];

function findSum(expenses) {
    let sum = 0;
    expenses.forEach(element => {
        sum += element;
    });
    return sum;
}
console.log("Total spent: " + findSum(expenses));

function findGreatest(expenses) {
    let max = 0;
    expenses.forEach(element => {
        if (element > max) {
            max = element;
        }
    })
    return max;
}
console.log("The greatest expense was: " + findGreatest(expenses));

function findCheapest(expenses) {
    let min = findGreatest(expenses);

    expenses.forEach(element => {
        if (element < min) {
            min = element;
        }
    });
    return min;
}

console.log("The cheapest expense was: " + findCheapest(expenses));
function findAverage(expenses) {
    let sum = findSum(expenses);
    let average = sum / expenses.length;
    return average;
}

console.log("The average is: " + findAverage(expenses));