

import javax.swing.JFrame;

public class JumpingGame  {
	static JFrame jf;
	static GamePanel gp = new GamePanel();
	public static int JG_WIDTH = 1000	;
	public static int JG_HEIGHT = 700;
	public JumpingGame() {
		jf = new JFrame();
	}public void setup() {
		jf.add(gp);
		jf.setSize(JG_WIDTH, JG_HEIGHT);
		jf.addKeyListener(gp);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}
public static void main(String[] args) {
	
	//JumpingGame jg = new JumpingGame();
	//jg.setup();
	
	
	
	
	new Level2GameTemplate();
}


}
