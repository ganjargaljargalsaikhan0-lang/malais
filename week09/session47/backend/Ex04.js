
const display = document.querySelector("#calc-display");
const buttons = document.querySelector("#calc-buttons");
let currentValue = "";

buttons.addEventListener("click", function (e) {

    if (e.target.tagName !== "BUTTON") return;

    if (e.target.id === "clear-btn") {
        currentValue = '',
            display.textContent = '0';
        return;
    }

    const value = e.target.dataset.val;
    currentValue += value;
    display.textContent = currentValue;
});

// TODO: энд кодоо бичнэ үү

const form = document.querySelector("#login");
const usernameInput = document.querySelector("#username");
const passwordInput = document.querySelector("#password");
const usernameError = document.querySelector("#username-error");
const passwordError = document.querySelector("#password-error");
const successMsg = document.querySelector("#success");

form.addEventListener("submit", function(e) {
    // TODO 1: e.preventDefault() — хуудас reload хийхгүй
    e.preventDefault()
    // TODO 2: Алдааны мессежүүдийг цэвэрлэх (textContent = "")
    //          successMsg.style.display = "none"
    usernameError.textContent = "";
    passwordError.textContent = "";
    successMsg.computedStyleMap.display = "none"
    let isValid = true;

    // TODO 3: usernameInput.value.trim() === "" бол
    //          usernameError-д мессеж тавь, isValid = false
    if (usernameInput.value.trim() === "") {
        usernameError.textContent = "nevtreh ner oruulna uu";
        isValid = false
    }
    // TODO 4: passwordInput.value.length < 6 бол
    //          passwordError-д мессеж тавь, isValid = false
    if(passwordInput.value.length < 6){
        passwordError.textContent = "nuuts ug hamgiin baga daa 6 temdegt"
        isValid = false
    }

    // TODO 5: isValid байвал successMsg харуул, form.reset() дуудах
    
    if (isValid) {
        successMsg.style.display = "block"
        form.reset()
        // TODO: successMsg.style.display = "block"
        // TODO: form.reset()
    }
});
// TODO: энд кодоо бичнэ үү

const picker = document.querySelector("#colorPicker");
const preview = document.querySelector("#preview");
const colorCode = document.querySelector("#colorCode");

picker.addEventListener(/* TODO: ямар event? */, function(e) {
    const color = e.target.value;

    // TODO 1: preview-ийн backgroundColor-г color-ар солих

    // TODO 2: colorCode-ийн textContent-г color болгох

    // Нэмэлт сорилт: preview дотор hex кодыг текстээр харуул
    // (заавал биш)
}); 