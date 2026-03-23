console.log('JS Array Datastructure');

const a = [1,6,7];

console.log(a[0])
console.log(a[2])

let i = 0;
while(i < 3){
    console.log(a[i]);
    i++;

}
const myFavorite = []

const foodFormElement = document.querySelector("#food-form");

foodFormElement.addEventListener('submit', (e)=>{
    e.preventDefault();
    let input = e.target.elements[0].value;
    console.log(input);

    myFavorite.push(input);
    console.log(myFavorite);
    input ='';
});


const displayFoods = (foodList)=> {
    let i = 0; 
    let displayELemnts = '';
    while(i < foodList.length){
        const liElements = `
        <li>${foodList[i]}</li>
        `;
        displayELemnts += liElements;
        i++;
    }
    const foodsdisplay = document.querySelector('#foods-display');
    foodsdisplay.innerHTML = displayELemnts;
}