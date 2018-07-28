void setup(){
size(2000,2000);

}
void draw(){
background(#BFBBBB);
  fill(#FCFCFC);
ellipse(500,400,800,500);
fill(#FCFCFC);
ellipse(1500,400,800,500);
if(mouseX<225){mouseX=225;}
else if(mouseX>775){mouseX=775;}
if(mouseY<  ){mouseY=  ;}


if(mouseX>=225&&mouseX<=775&&mouseY>=275&&mouseY<=425){

fill(#030303);
ellipse(mouseX,mouseY,250,250);
fill(#030303);
ellipse(mouseX,mouseY,250,250);

}
else {

}
//if(mouseY>=){
} 