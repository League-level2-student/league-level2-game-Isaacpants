import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Ball b;
Random r = new Random();
ArrayList<Food> foods = new ArrayList<Food>();
public ObjectManager(Ball b) {
this.b=b;

}void addFood(){
	foods.add(new Food(r.nextInt(JumpingGame.JG_WIDTH),r.nextInt(JumpingGame.JG_HEIGHT),50,50));

}void draw (Graphics g){
		b.draw(g);
		for (Food f : foods) {
			f.draw(g);
		} 
	}
void checkCollision() {
	for (Food f : foods) {
		if (b.collisionBox.intersects(f.collisionBox)) {
			f.isActive = false;
			//System.out.println("HI");
	}
	}
}
void purgeObjects(){
	for (int i = 0; i < foods.size(); i++) {
		if(foods.get(i).isActive==false) {
			foods.remove(i);
		}
		}
	}


	
}
	



