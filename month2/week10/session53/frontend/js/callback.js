console.log("function Callback");

const add = (a, b) => a + b;

const addFour = (add) => {
    return add(4, 0);
}
const outputElement = document.getElementById('output');

outputElement.addEventListener('click', () => console.log(add(5, 6)));

const multiply = (a, b) => a * b;
const btn1 = document.getElementById('btn1');
btn1.addEventListener('click', () => console.log(multipy(4, 5)));

const subtract = (a, b) => a - b;

const calc01 = document.getElementById('calc01');
const calc02 = document.getElementById('calc02');
const calc03 = document.getElementById('calc03');

const calc = (a, b, operation) => {
    let result = 0
    switch (operation) {
        case add:
            result = add(a, b);
            calc01.textcontent = result;
        case subtract:
            result = subtract(a, b);
            calc02.textContent = result;
        case multiply:
            result = multiply(a, b);
            calc03.textContent = result;
            default:
                break


    }

}
calc(10, 3, add);
calc(10, 3 ,multiply);
calc(10, 3, subtract);