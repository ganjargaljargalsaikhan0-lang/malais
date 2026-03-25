const star = document.querySelector("#four-stars");
let i = 0
let stars = "";
while (i < 4) {
    stars += `<span>⭐</span>`;
    i++;
}
star.innerHTML = stars;

const fiveCircles = document.querySelector('#five-circles');
let count = 1;
let html = "";
while (count <= 5) {
    let opacity = count * 0.2;
    html += `<div style="background: rgba(255, 150, 170,${opacity});
    padding: 10px; margin: 5px;
    width: 100px; height: 100px; border-radius: 50%; display:flex;
    justify-content: center; align-items:center;
    ">  
    Circle ${count}
    </div>`;
    count++;

}
fiveCircles.innerHTML = html;