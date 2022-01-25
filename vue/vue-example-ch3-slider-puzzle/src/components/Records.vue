<template>
  <div>
    <h1>Records</h1>
    <button @click="getRecods">Refresh</button>
    <div v-for="(r, index) of records" :key="index">
      {{ index + 1 }} - {{ r.elapsedTime }}
    </div>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line
  name: "Records",
  data() {
    return {
      records: [],
    };
  },
  created() {
    this.getRecods();
  },
  methods: {
    getRecods() {
      const records = JSON.parse(localStorage.getItem("records")) || [];
      this.records = records;
    },
  },
};
</script>
