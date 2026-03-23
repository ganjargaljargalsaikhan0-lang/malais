function fizzBuzz(n){
    if (n % 3 === 0 && n % 5 ===0 ) {
        return "fizzBuzz";
    }
    if (n % 3 === 0 ){
        return "fizz";


    }
    if (n % 5 === 0) {
        return "Buzz";
    }
    return n;
}
for (let i = 1; i <= 20; i++) {
    console.log(fizzBuzz(i));
}