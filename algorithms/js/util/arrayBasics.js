function checkArray(array) {
  if(!array || array.length <=2) return;
}

function swap(array, leftPosition, rightPosition) {
  let rightValue = array[rightPosition];
  array[rightPosition] = array[leftPosition];
  array[leftPosition] = rightValue;
}

module.exports = { checkArray, swap };
