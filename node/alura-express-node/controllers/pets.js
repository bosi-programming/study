const Pet = require('../models/pets');

module.exports = (app) => {
  app.post("pet", () => {
      const pet = req.body;

      Pet.adiciona(pet, res);
  });
};
