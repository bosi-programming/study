<template>
  <div>
    <div v-id="comments.length > 0">
      <h4>Comments</h4>
      <div v-for="c of comments" :key="c.id">
        {{ c.user && c.user.login }} - {{ c.body }}
      </div>
    </div>
  </div>
</template>

<script>
export default {
  
}
</script>
