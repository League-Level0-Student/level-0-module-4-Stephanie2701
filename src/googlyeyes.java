


void setup(){
    
    PImage spongebob=loadImage("SpongeBob.png");
    size(800,400);
    spongebob.resize(800,400);
    background(spongebob);
    
  }

  void draw(){
    if(mousePressed){
      println(mouseX+"  "+mouseY);
    }
    fill(255);
    noStroke();
    ellipse(483,87,70,56);
      noStroke();
     ellipse(381,100,115,60);
  
   
    
    fill(0);
    int X= mouseX;
    int Y= mouseY;
   
    if(X<448){
     X=448;
    }
    else if(X<518){
      X=518;
    }
    
    ellipse(X,Y,40,40);
    ellipse(X-102,Y+13,40,40);
  
  
  }