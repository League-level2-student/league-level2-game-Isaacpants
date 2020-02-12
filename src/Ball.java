import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject {
	boolean UP = false;
	boolean RIGHT = false;
	boolean LEFT = false;
	boolean DOWN = false;
	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=10;
	}void draw(Graphics g){
		   g.setColor(Color.BLUE);
		   g.fillOval(x,y,width,height);
		
	}   
	void update() {
		super.update();
		if(UP) {
			up();
			
		}
		if(RIGHT) {
			right();
		}
		if(LEFT) {
			left();
		}
		if(DOWN) {
			down();
		}
	}
		public void right() {

			  if(x<950) {
					x += speed;
				    }
		}

		public void up() {
			
		    if(y>=5) {
			    y-=speed;
			    }
		}

		public void down() {
		
			   if(y<725) {
					y += speed;
				    }
		}

		public void left() {
			
			  if(x>0) {
				  x -= speed;
				    }
		}
}
//			}public void left() {
//        x-=speed;
//    }    public void right() {
//        x+=speed;
//    }    public void up() {
//        y-=speed;
//    }    public void down() {
//        y+=speed;
//    }


