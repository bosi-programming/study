const { checkArray , swap } = require('./util/arrayBasics');

function bubble(array) {
  checkArray(array);

  for (let i = array.length - 1; i > 0; i--) {
    for (let j = 0; j < i; j++) {
      if(array[j] > array[j+1]) swap (array, j, j + 1);
    }
  }
  return array
}

console.log(bubble([1,33,52,22,3]));
