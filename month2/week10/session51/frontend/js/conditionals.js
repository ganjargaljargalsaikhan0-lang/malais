console.log('JS conditionals');

const a1 = true;
const b1 = false;

console.log('And logical operator');

console.log(a1 && b1);

console.log('OR logical operator');
console.log(a1 || b1);

console.log('NOT logical operator');
console.log(!true);
console.log(!false);

const a2 = true;
const b2 = false;
const c2 = true;
const d2 = true;
const e2 = false;


const result2 = ((a2 && b2) || c2 && (d2 && !e2));

const election = document.querySelector("#election");
const electionelement = document.querySelector("#election-display");

election.addEventListener('submit', function (e) {
    e.preventDefault();
    const ageInput = document.querySelector("#age");
    const citizeninput = document.querySelector("#citizenship");
    if (parseInt(ageInput.value) >= 18 && citizeninput.value === 'mongolian') {
        electionelement.textContent = 'eligible';
    } else {
        electionelement.textContent = 'Not Eligible';
    }
});


const seasonsElement = document.querySelector("#seasons");
const display = document.querySelector("#seasons-display");
seasonsElement.addEventListener('change', function (e) {
    console.log(e.target.value);
    const choice = e.target.value;

    switch (choice) {
        case "summer":
            display.style.backgroundColor = "green";
            display.style.color = "white";
            display.textContent = "summer";
            break;
        case "winter":
            display.style.backgroundColor = "blue";
            display.style.color = "white";
            display.textContent = "winter";
            break;
        case "spring":
            display.style.backgroundColor = "yellow";
            display.style.color = "white";
            display.textContent = "spring";
            break;
        case "autumn":
            display.style.backgroundColor = "red";
            display.style.color = "black";
            display.textContent = "autumn";
            break;
        default:
            display.textContent = "Тодорхойгүй өнгө.";
    }
})





