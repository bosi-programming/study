const conexao = require("../infraestrutura/conexao");

class Pet {
  adiciona(pet, res) {
    const query = "INSERT INT Pets SET ?";

    conexao.query(query, pet, (err, result) => {
      if (err) {
        console.log(err);
        res.status(400).json(err);
      } else {
        res.status(200).json(pet);
      }
    });
  }
}

module.exports = new Pet();
