console.log('Callback function, arrow function');

// one, two, three elements need to be 
// caught up with className on DOM

const elementOne = document.getElementsByClassName('one')[0];
console.log(elementOne); // 

const elementTwo = document.getElementsByClassName('two')[0];
console.log(elementTwo);

const elementThree = document.getElementsByClassName('three')[0];
console.log(elementThree);

// function declaration
function add(a, b){
    return a + b;
}

// elementOne-дээр 5, 6 хоёр утгыг add function ашиглаад
// харуулдаг болгох. elementTwo - 8, 1. elementThree - (-1, 6)
elementOne.textContent = add(5, 6);

elementTwo.textContent = add(8, 1);

elementThree.textContent = add(-1, 6);

// function expression
const multiply = function(a, b) {
    return a * b;
}

// arrow function
const divide = (a, b) => {
    return a / b;
}

// function call
console.log(multiply(5, 6)); // 30

console.log(divide(5, 6)); // 



const color = ['red', 'green', 'blue'];
const addTolist = (Text) => {
    const li = document.createElement("li");
    li.textContent = Text;
    document.querySelector('#list').appendChild(li);
}
document.querySelector("#btn1").addEventListener("click", () => {
        // block scope: count зөвхөн энэ callback дотор
        for (let i = 0; i < colors.length; i++) {
            addToList(colors[i]);       // global colors хэрэглэж болно
        }
    });
