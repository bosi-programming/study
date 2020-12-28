const Knex = require("./db");

Knex.raw("select 1+1 as sum")
  .then(([res]) => console.log("connected: ", res[0].sum))
  .catch((err) => console.log(err.message));
