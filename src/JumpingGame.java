


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public class JumpingGame implements MouseListener{
	static JFrame jf;
	static GamePanel gp = new GamePanel();
	public static int JG_WIDTH = 1000	;
	public static int JG_HEIGHT = 700;
	
	public JumpingGame() {
		jf = new JFrame();
	}public void setup() {
		jf.add(gp);
		jf.setSize(JG_WIDTH, JG_HEIGHT);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.addMouseListener(gp);
		jf.addKeyListener(gp);
		
	}
public static void main(String[] args) {
	
	JumpingGame jg = new JumpingGame();
	jg.setup();

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
