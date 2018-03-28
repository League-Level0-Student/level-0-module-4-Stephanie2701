


void setup(){
	  
	  PImage spongebob=loadImage("spongebob.jpeg");
	  size(800,400);
	  spongebob.resize(800,400);
	  background(spongebob);
	  
	}

	void draw(){
	  if(mousePressed){
	    print(mouseX+""+mouseY);
	  }
	    
	   ellipse(380,150,60,60);
	  
	  
	}
