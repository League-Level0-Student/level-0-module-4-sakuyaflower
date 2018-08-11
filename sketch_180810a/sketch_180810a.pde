int x=1678; 
int y=600;
PImage creeper;
PImage minecraft;
void setup() {
  size(1980, 1080);
  minecraft = loadImage("images.jpg");  
  minecraft.resize(1980, 1080);
  background(minecraft);
  creeper=loadImage("166.jpg");
  creeper.resize(25, 25);
}

void draw() {
  background(minecraft);
  image(creeper, x, y);
  if (mouseX<40&&mouseY<40) {
    fill(#03FF8F);
  } else {
    fill(#FF0303);
  }
 
if(isNear(x,mouseX)&&isNear(y,mouseY)){
fill(#03FF8F);
}
else{
fill(#FF0303);
}
if(mousePressed){
 ellipse(mouseX,mouseY,50,50);
}
}
boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
    return true;
  else
    return false;
}