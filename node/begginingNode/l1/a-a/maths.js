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
console.log(add(2, 5))
console.log(sum(10, 5, 6))

module.exports = {
  add,
  sum,
};
