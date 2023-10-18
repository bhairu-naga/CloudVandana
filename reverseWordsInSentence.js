//Take a sentence as an input and reverse every word in that sentence.
function reverseWordsInSentence(sentence) {
    let words = sentence.split(' ');
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    let reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence)
