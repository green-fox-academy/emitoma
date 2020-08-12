//       On the click of the button,
//       Count the items in the list
//       And display the result in the result element.

const button = document.getElementById("btn");
button.addEventListener('click', () => {
    const items = document.querySelectorAll("li");
    const result = items.length;

    document.getElementById("result").innerHTML = result;

})



// var now = new Date();
// // convert date to a string in UTC timezone format:
// console.log(now.toUTCString());
// Output: Wed, 21 Jun 2017 09:13:01 GMT

const firstOneTimeBtn = document.getElementById("first");
firstOneTimeBtn.setAttribute("onclick", "currentTime()");

function currentTime() {
    const now = new Date();
    console.log(now.toUTCString());

    firstOneTimeBtn.removeAttribute("onclick");
}

const oneTimeBtn = document.getElementById("one");

oneTimeBtn.addEventListener('click', () => {
    const now = new Date();
    console.log(now.toUTCString());
}, { once: true });