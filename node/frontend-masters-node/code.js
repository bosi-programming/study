console.log("hello");

const notPublic = 22;
const add = (...num) => {
  console.log(num);
};

module.exports = { add };
