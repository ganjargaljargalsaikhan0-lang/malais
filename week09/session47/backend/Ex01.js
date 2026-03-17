const title = document.querySelector("#page-title");
console.log("garchig", title.textContent);

const intro = document.querySelector(".intro");
console.log("taniltsuulga", intro.textContent);

const fruits = document.querySelectorAll("#fruits")
fruits.forEach(function (fruit) {
    console.log("jims", fruits.textContent)
});

const activeFruit = document.querySelector(".fruit.active");
console.log("activeFruit", activeFruit.textContent);

const count = document.querySelector("container .count");
console.log("too:", count.textContent);