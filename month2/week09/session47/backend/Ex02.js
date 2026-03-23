// TODO: энд кодоо бичнэ үү

const items = document.querySelectorAll("#color-list li");
const selected = document.querySelector("#selected");

items.forEach(function (item) {
    item.addEventListener("click", function () {

        // TODO 1: Өмнөх сонгогдсон бүх элементийн background-г арилга
        items.forEach(function (el) {
            el.style.background = " ";
            // TODO: el.style.background = ...
        });
        item.style.background = "#b3d9ff";

        // TODO 2: Дарагдсан item-ийн background-г #b3d9ff болго
        selected.textContent = item.textContent
        // TODO 3: selected span-д item-ийн textContent-г тавь
    });
});