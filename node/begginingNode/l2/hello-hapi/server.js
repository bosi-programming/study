const Hapi = require("hapi");
const good = require("good");

const routes = {};

routes.todo = require('./routes/todo');

const server = new Hapi.Server();
server.connection({
  host: "localhost",
  port: process.argv[2] || 8000,
});

server.route(routes.todo);

const options = {
  ops: {
    interval: 100000,
  },
  reporters: {
    consoleReporters: [{ module: "good-console" }, "stdout"],
  },
};

server.register(
  {
    register: good,
    options,
  },
  (err) => {
    if (err) return console.error(err);

    server.start((err) => {
      if (err) throw err;
      console.log(`Server running at: ${server.info.uri}`);
    });
  }
);
