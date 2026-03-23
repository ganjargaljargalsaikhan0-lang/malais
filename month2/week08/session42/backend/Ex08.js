const isEven = n => n % 2 === 0;

for (let i = 1; i <= 10; i++) {
    if (isEven(i)) {
        console.log(i + " is even");
    }
}