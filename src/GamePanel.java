import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements MouseListener {
	public static BufferedImage backgroundImg;
	public GamePanel() {
		try {
			backgroundImg = ImageIO.read(this.getClass().getResourceAsStream("scrolling.png"));
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
	}
	@Override
	public void paintComponent(Graphics g) {
	g.fillOval(50,50,50,50);
		g.drawOval(50, 50, 50, 50);
		
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
	

}
