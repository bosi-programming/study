const Joi = require("joi");
const Knex = require("../db");

const todoList = [
  {
    title: "Shopping",
    dateCreated: "Jan 21, 2018",
    list: [
      {
        text: "Node.js Books",
        done: false,
      },
      { text: "MacBook", done: false },
      { text: "Shoes", done: true },
    ],
  },
  {
    title: "Places to visit",
    dateCreated: "Feb 12, 2018",
    list: [
      { text: "Nairobi, Kenya", done: false },
      { text: "Moscow, Russia", done: false },
    ],
  },
];

module.exports = [
  {
    method: "GET",
    path: "/todo",
    handler: (request, reply) => {
      return reply(todoList);
    },
  },
  {
    method: "GET",
    path: "/todo/{id}",
    handler: (request, reply) => {
      const id = request.params.id - 1; // since array is 0-based index
      // should return 404 error if item
      // is not found
      if (todoList[id]) return reply(todoList[id]);
      return reply({ message: "Not found" }).code(404);
    },
  },
  {
    method: "POST",
    path: "/todo",
    handler: async (request, reply) => {
      const todo = request.payload;
      todo.user_id = 1;
      const [todoId] = await Knex("todo").returning("id").insert(todo);
      todoList.push(todo);
      return reply({ message: "created", todo_id: todoId });
    },
    config: {
      validate: {
        payload: {
          title: Joi.string().required(),
        },
      },
    },
  },
  {
    method: "POST",
    path: "/todo/{id}/item",
    handler: async (request, reply) => {
      const todoItem = request.payload;
      todoItem.todo_id = request.params.id;
      const [id] = await Knex("todo_item").insert(todoItem);
      return reply({ message: "created", id: id });
    },
    config: {
      validate: {
        payload: {
          text: Joi.string().required(),
        },
      },
    },
  },
  {
    method: "PUT",
    path: "/todo/{id}",
    handler: (request, reply) => {
      const index = request.params.id - 1;
      // replace the whole resource with the new one
      todoList[index] = request.payload;
      return reply({ message: "updated" });
    },
  },
  {
    method: "PATCH",
    path: "/todo/{id}",
    handler: (request, reply) => {
      const index = request.params.id - 1;
      // item to be patched
      const todo = todoList[index];
      // for each key provided, update on
      // the resource
      Object.keys(request.payload).forEach((key) => {
        if (key in todo) {
          todo[key] = request.payload[key];
        }
      });
      return reply({ message: "patched" });
    },
  },
  {
    method: "DELETE",
    path: "/todo/{id}",
    handler: (request, reply) => {
      const index = request.params.id - 1;
      delete todoList[index]; // replaces with `undefined`
      return reply({ message: "deleted" });
    },
  },
];
