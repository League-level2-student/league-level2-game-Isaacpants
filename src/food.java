import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class food extends GameObject{

	public food(int x, int y, int width, int height) {
		
		super(x,y, width, height);
		// TODO Auto-generated constructor stub
	}void draw(Graphics g){
		   g.setColor(Color.GREEN);
		   g.fillRect(x,y,width,height);
		
	}
	
}
