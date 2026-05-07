const buttons = document.querySelectorAll(".btn");
const display = document.getElementById("display");
const toggle = document.getElementById("toggle");
const calculator = document.getElementById("calculator");
const modeIcon = document.getElementById("modeIcon");

let input = "";

buttons.forEach(button => {

    button.addEventListener("click", () => {

        let value = button.textContent;

        if (value === "AC") {
            input = "";
            display.textContent = "0";
        }

        else if (value === "C") {
            input = input.slice(0, -1);
            display.textContent = input || "0";
        }

        else if (value === "=") {

            try {

                input = eval(
                    input
                        .replace(/×/g, "*")
                        .replace(/÷/g, "/")
                        .replace(/−/g, "-")
                );

                display.textContent = input;

            } catch {
                display.textContent = "Error";
                input = "";
            }

        }

        else {

            input += value;
            display.textContent = input;

        }

    });

});

toggle.addEventListener("click", () => {

    calculator.classList.toggle("dark");

    if (calculator.classList.contains("dark")) {
        modeIcon.src = "mode (3).png";
    } else {
        modeIcon.src = "mode (4).png";
    }

});