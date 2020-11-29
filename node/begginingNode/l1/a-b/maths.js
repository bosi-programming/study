const _ = require('lodash');

function add(num1, num2) {
  return num1 + num2;
}

function sum(...nums) {
  let sum = 0;
  nums.forEach(num => {
    sum += num
  })
  return sum;
}

function sumArray() {
  let arr = arguments[0];
  if(arguments.length > 1) {
    arr = _.concat(...arguments);
  }

  return sum(...arr);
}

module.exports = {
  add,
  sum,
  sumArray,
};
