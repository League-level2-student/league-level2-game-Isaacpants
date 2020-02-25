import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
Ball b;
int score = 0;
Random r = new Random();
public int getScore() {
	return score;
}
ArrayList<Food> foods = new ArrayList<Food>();
public ObjectManager(Ball b) {
this.b=b;

}void addFood(){
	foods.add(new Food(r.nextInt(JumpingGame.JG_WIDTH),r.nextInt(JumpingGame.JG_HEIGHT),50,50));
	
	checkCollision();
	purgeObjects();
	
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
			score++;
	}	
	}		
				
}
void purgeObjects(){
	for (int i = 0; i < foods.size(); i++) {
		if(foods.get(i).isActive==false) {
			foods.remove(i);
		}
		}
	for (int i = foods.size() - 1; i >= 0; i--) {
		if (foods.get(i).isActive == false) {
			foods.remove(i);

		}

	
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	addFood();
}


	
}
	



