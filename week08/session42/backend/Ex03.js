function absolute(n) {
    return n < 0 ?-n : n;
}
function max (a ,b ) {
    return a > b ? a : b;
}
const isBetween = (n, min, max ) =>{
    return n >=min && n <=max;
}
console.log(absolute(-7));          // 7
console.log(absolute(3));           // 3
console.log(max(10, 4));            // 10
console.log(max(3, 9));             // 9
console.log(isBetween(5, 1, 10));   // true
console.log(isBetween(0, 1, 10));   // false