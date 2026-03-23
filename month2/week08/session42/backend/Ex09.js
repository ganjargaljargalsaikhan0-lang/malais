function sum(numbers) {
    let total = 0;
    for (let n  of numbers ) {
        total += n;

    }
    return total;

}
const nums = [1, 2, 3, 4, 5,]
console.log(`sum : ${sum(nums)}`)