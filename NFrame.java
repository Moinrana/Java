import javax.swing.*;
import java.awt.*;


class NFrame extends JFrame{
	public NPanel np;
	public NFrame(){
		this.setTitle("Game");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		construct();
		
	}
	public void construct(){
		this.np = new NPanel();
		this.add(np);
		
	}

	
}