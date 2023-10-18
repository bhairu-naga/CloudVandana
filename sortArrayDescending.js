//Perform sorting of an array in descending order.
function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}
const inputArray = [5, 2, 8, 1, 9];
const sortedArray = sortArrayDescending(inputArray);
console.log(sortedArray);
