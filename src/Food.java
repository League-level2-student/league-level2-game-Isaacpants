import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Food extends GameObject{

	public Food(int x, int y, int width, int height) {
		
		super(x,y, width, height);
		// TODO Auto-generated constructor stub
	}void draw(Graphics g){
		   g.setColor(Color.GREEN);
		   g.fillRect(x,y,width,height);
		   g.fillRect(275, 375, 10, 10);
		
	}
	
}