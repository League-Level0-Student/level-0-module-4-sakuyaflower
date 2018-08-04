PImage creeper;
void setup(){
size(2000,1100);
PImage minecraft = loadImage("thumb-1920-594461.png");
minecraft.resize(2000,1100);
background(minecraft);
creeper=loadImage("d9f3417c2fdb096aa8f02617e8dbd408.jpg");
creeper.resize(20,20);
}
void draw(){
 image(creeper,mouseX,mouseY);

}