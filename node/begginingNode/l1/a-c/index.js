const fs = require("fs");
const util = require("util");

const readFile = util.promisify(fs.readFile);
const writeFile = util.promisify(fs.writeFile);

async function transformFile(file) {
  console.log(`reading file: ${file}`);
  const content = await readFile(`${__dirname}/${file}`);
  console.log(`reading file: out-file.txt`);
  await writeFile(`${__dirname}/out-file.txt`, content);
}

transformFile('in-file.txt').then(() => console.log('done'))
