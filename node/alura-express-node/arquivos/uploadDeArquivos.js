const fs = require("fs");

fs.createReadStream("./assests/salsicha.jsp")
  .pipe(fs.createWriteStream("./assests/salsicha2.jpg"))
  .on("finish", () => console.log("Imagem"));
