/**** ARRAYS *****/

// -  Create a variable named `numbers`
//    with the following content: `[1, 3, 5, 7]`
// -  Print the third element of `numbers`

// const numbers = [1, 3, 5, 7];
// console.log(numbers[2]);



// - Create a variable named `firstList`
//   with the following content: `[1, 2, 3]`
// - Create a variable named `secondList`
//   with the following content: `[4, 5]`
// - Log "p2 is longer" to the console if `secondList` has more elements than
//   `firstList`

// const firstList = [1, 2, 3];
// const secondList = [4, 5];

// if (firstList.length < secondList.length) {
//     console.log("p2 is longer");
// }

// - Create an array variable named `drinks` with the following content:
//   `['Gin', 'Whiskey', 'Wine', 'Beer']`
// - Double all the strings in the array, use a built in array method instead of
//   a loop
// - It should print: ['GinGin', 'WhiskeyWhiskey', 'WineWine', 'BeerBeer']`

// let drinks = ['Gin', 'Whiskey', 'Wine', 'Beer'];
// drinks.forEach(function (value) {
//     console.log(value + value);
// })
// console.log(drinks);

// -  Create a variable named `numbers`
//    with the following content: `[3, 4, 5, 6, 7]`
// -  Reverse the order of the elements in `numbers`
// 	   -  do it with the built in method
//	   -  do it with creating a new temp array and a loop
// -  Print the elements of the reversed `numbers`


// const numbers = [3, 4, 5, 6, 7];
// const reversed = numbers.reverse();
// console.log(reversed);



// -  Create (dynamically*) a two dimensional list
//    with the following matrix**. Use a loop!
//
//    0 0 0 1
//    0 0 1 0
//    0 1 0 0
//    1 0 0 0
//
// -  Print this two dimensional list to the console
//
// * size should depend on a variable
// ** Relax, a matrix is just like an array




// const matrix = [[0, 0, 0, 1], [0, 0, 1, 0], [0, 1, 0, 0], [1, 0, 0, 0]];
// console.log(matrix);

// let matrix = [];
// const size = 4;
// for (i = 0; i < size; i++){
//     for (let j = 0; j < i; j++) {
//         matrix.push([i,j])
//         console.log(matrix);

//     }
// }


/**** FUNCTIONS *****/

// -  Create a variable named `baseNum` and assign the value `123` to it
// -  Create a function called `doubling` that doubles it's input parameter and returns with an integer
// -  Log the result of `doubling(baseNum)` to the console

// const baseNum = 123;
// function doubling(num) {
//     const result = num * 2;
//     return result
// }
// console.log(doubling(baseNum));

// -  Create a string variable named `typo` and assign the value `Chinchill` to it
// -  Write a function called `appendAFunc` that gets a string as an input,
//    appends an 'a' character to its end and returns with a string
// -  Print the result of `appendAFunc(typo)`

// const typo = 'Chinchill';

// function appendAFunc (string){
//     return string + "a";
// }
// console.log(appendAFunc(typo));


// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

// function sum(num) {
//     let sum = 0;
//     for (i = 0; i < num ; i++) {
//         console.log(i);
//         sum += i;
//     }
//     return sum; 
// }

// console.log("sum = " + sum(10));

// -  Create a function called `factorio`
//    that returns it's input's factorial

//     function factorio(num) {
//         // num * (num - 1);
//         return (num != 1) ? num * factorio(num - 1) : 1;
//     }

// console.log(factorio(50));

/*****DATA STRUCTURES*****/



// let example = 'In a dishwasher far far away';

// I would like to replace "dishwasher" with "galaxy" in this example
// Please fix it for me!
// Expected ouput: In a galaxy far far away

// console.log(example.replace("dishwasher", "galaxy"));


// Create a function that can reverse a string, which is passed as the parameter
// Use it on this reversed string to check it!

// let toBeReversed = `.eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI`;

// function reverse(string) {

//     let splited = string.split("");

//     let reversedStr = splited.reverse().join("");

//     return reversedStr;
// }

// console.log(reverse(toBeReversed));
