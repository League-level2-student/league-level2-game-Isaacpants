import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class objectManager {
Ball b;
Random r = new Random();
ArrayList<food> foods = new ArrayList<food>();
public objectManager(Ball b) {
b=new Ball(250,300,50,50);

}void addFood(){
	foods.add(new food(r.nextInt(JumpingGame.JG_WIDTH),r.nextInt(JumpingGame.JG_HEIGHT),50,50));

}void draw (Graphics g){
		b.draw(g);
		for (food f : foods) {
			f.draw(g);
		} 
	}void purgeObjects(){
	for (int i = 0; i < foods.size(); i++) {
		if(foods.get(i).isActive==false) {
			foods.remove(i);
		}
		}
	}
	}
	



