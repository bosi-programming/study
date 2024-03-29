import { createApp } from "vue";
import App from "./App.vue";
import { createRouter, createWebHistory } from "vue-router";
import PhotoFormPage from "./components/PhotoFormPage.vue";
import SearchPage from "./components/SearchPage.vue";
import HomePage from "./components/HomePage.vue";

const routes = [
  { path: "/add-photo-form", component: PhotoFormPage },
  { path: "/edit-photo-form/:id", component: PhotoFormPage },
  { path: "/search", component: SearchPage },
  { path: "/", component: HomePage },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

const app = createApp(App);
app.use(router);
app.mount("#app");
