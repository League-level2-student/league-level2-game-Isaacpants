import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject {

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=10;
	}void draw(Graphics g){
		   g.setColor(Color.BLUE);
		   g.fillOval(x,y,width,height);
			//g.drawOval(x, y, 50, 50);
	}    public void left() {
        x-=speed;
    }    public void right() {
        x+=speed;
    }    public void up() {
        y-=speed;
    }    public void down() {
        y+=speed;
    }

}
