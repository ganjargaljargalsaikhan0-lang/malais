// 1. Returns how many words are in a sentence
function wordCount(sentence) {
    return sentence.split(" ").length
    // Hint: sentence.split(" ").length
}

// 2. Returns the sentence reversed word by word
// "hello world" → "world hello"
function reverseWords(sentence) {
    return sentence.split(" ").reverse().join(" ") 
    // Hint: sentence.split(" ").reverse().join(" ")
}

// 3. Returns true if the string is longer than the given length
const isLongerThan = (str, length) => {
    return str.length > length;
    // TODO
};

console.log(wordCount("the quick brown fox"));  // 4
console.log(reverseWords("hello world"));        // world hello
console.log(isLongerThan("JavaScript", 5));      // true
console.log(isLongerThan("hi", 5));              // false