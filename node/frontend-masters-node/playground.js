const fs = require("fs");
const path = require('path')

console.log(path.join('../test', 'app/', '/22/'))

const file = fs.readFileSync("./code2.js", { encoding: "utf8" }).toString();

fs.writeFileSync('./code2.js', 'var test = test')
console.log(file);
