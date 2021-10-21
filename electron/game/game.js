const screenWidth = 800;
const screenHeight = 600;
const shipSpeed = 4;

const config = {
  type: Phaser.AUTO,
  width: screenWidth,
  height: screenHeight,
  backgroundColor: "#03187D",
  scene: {
    preload: preload,
    create: create,
    update: update,
  },
};

const game = new Phaser.Game(config);
let ship;
let cursors;

function preload() {
  this.load.setBaseURL(".");
  this.load.image("background", "assets/background.jpg");
  this.load.image("ship", "assets/phaser-ship.png");
}

function create() {
  cursors = this.input.keyboard.createCursorKeys();
  const image = this.add.image(
    this.cameras.main.width / 2,
    this.cameras.main.height / 2,
    "background"
  );

  const scaleX = this.cameras.main.width / image.width;
  const scaleY = this.cameras.main.height / image.height;
  const scale = Math.max(scaleX, scaleY);
  image.setScale(scale).setScrollFactor(0);

  ship = this.add.sprite(100, 100, "ship");
  ship.setScale(4, 4);
}

function update() {
  if (cursors.right.isDown) {
    ship.x += shipSpeed;
    if (ship.x >= screenWidth) {
      ship.x = 0;
    }
    ship.flipX = false;
  } else if (cursors.left.isDown) {
    ship.x -= shipSpeed;
    if (ship.x <= 0) {
      ship.x = screenWidth;
    }
    ship.flipX = true;
  } else if (cursors.up.isDown) {
    ship.y -= shipSpeed;
    if (ship.y <= 0) {
      ship.y = screenHeight;
    }
  } else if (cursors.down.isDown) {
    ship.y += shipSpeed;
    if (ship.y >= screenHeight) {
      ship.y = 0;
    }
  }
}
