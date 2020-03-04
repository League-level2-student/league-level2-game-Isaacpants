import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements MouseListener, ActionListener, KeyListener {
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Font titleFont;
	Font semiFont;
	Timer frameDraw;
	Timer foodSpawn;
	Ball b = new Ball(250, 300, 50, 50);
	ObjectManager om = new ObjectManager(b);
	//Food f = new Food(100,100,10,10);
	static Random rand = new Random();

	public static BufferedImage backgroundImg;

	public GamePanel() {

		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();

		titleFont = new Font("Arial", Font.PLAIN, 50);
		semiFont = new Font("Arial", Font.PLAIN, 25);

		try {
			backgroundImg = ImageIO.read(this.getClass().getResourceAsStream("scrolling.png"));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}void startGame(){
		//foodSpawn = new Timer(1000, om);
		//foodSpawn.start();
	}

	void updateMenuState() {
	}

	void updateGameState() {
		
		//b.update();
		om.update();
		om.manageFood();
	}

	void updateEndState() {
	}

	void drawMenuState(Graphics g) {

		g.setColor(Color.GREEN);
		g.fillRect(0, 0, JumpingGame.JG_WIDTH, JumpingGame.JG_HEIGHT);

		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("Jumping Game", 325, 300);

		g.setFont(semiFont);
		g.drawString("Press Enter to start", 400, 400);
		g.setFont(semiFont);
		g.drawString("Press SPACE for instructions", 350, 500);
	}

	void drawGameState(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, JumpingGame.JG_WIDTH, JumpingGame.JG_HEIGHT);
		om.draw(g);
//      f.draw(g);
		g.setFont(semiFont);
		g.setColor(Color.WHITE);
		g.drawString("Score = " + om.score, 50,50);
		
//		for (int i = 0; i < 20; i++) {
//			 food f = new food(rand.nextInt(1000), rand.nextInt(800), 10, 10);
//				f.draw(g);
//		}
//	
	}

	void drawEndState(Graphics g) {

		g.setColor(Color.RED);
		g.fillRect(0, 0, JumpingGame.JG_WIDTH, JumpingGame.JG_HEIGHT);

		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 325, 300);

	}

	@Override
	public void paintComponent(Graphics g) {

		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == GAME) {
			drawGameState(g);
		} else if (currentState == END) {
			drawEndState(g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		repaint();
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
		} else if (currentState == END) {
			updateEndState();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {

			JOptionPane.showMessageDialog(null,
					"Press ENTER to start, Use ARROW KEYS to move, Don't get hit by the walls");

		}

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END) {
				currentState = MENU;
			} else {
				currentState++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			//System.out.println("up");
			b.UP = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			//System.out.println("down");
			b.DOWN = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			//System.out.println("left");
			b.LEFT = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		//	System.out.println("right");
			b.RIGHT = true;
			
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			b.UP = false;

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

			b.DOWN = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			b.LEFT = false;

		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			b.RIGHT = false;

		}
	}

}
