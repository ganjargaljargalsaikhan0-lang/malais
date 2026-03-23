// TODO: энд кодоо бичнэ үү

const btn = document.querySelector("#faq-btn");
const content = document.querySelector("#faq-content");

btn.addEventListener("click", function() {
    // TODO 1: content-д "visible" class toggle хий
    content.classList.toggle("visible");


    // TODO 2: content.classList.contains("visible") ашиглан
    //          товчны текстийг ▼ ↔ ▲ солих
    if (content.classList.contains("visible")) {
        btn.textContent = "FAQ: JavaScript хэл гэж юу вэ? ▲";
    } else {
        btn.textContent = "FAQ: JavaScript хэл гэж юу вэ? ▼";
    }
});