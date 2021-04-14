const fs = require("fs");
const path = require("path");

module.exports = (caminho, nomeDoArquivo, callbackImagemCriada) => {
  const tiposValidos = ["jpg", "png", "jpeg"];
  const tipo = path.extname(caminho);
  const tipoEhValido = tiposValidos.indexOf(tipo.substring(1)) !== -1;
  if (!tipoEhValido) {
    const erro = "Tipo invalido";
    console.log("Tipo inválido");
    callbackImagemCriada(erro);
  } else {
    const novoCaminho = `./assests/imagens/${nomeDoArquivo}${tipo}`;

    fs.createReadStream(caminho)
      .pipe(fs.createWriteStream(novoCaminho))
      .on("finish", () => callbackImagemCriada(false, novoCaminho));
  }
};
