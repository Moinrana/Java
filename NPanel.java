import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;

class NPanel extends JPanel implements ActionListener{
	private Timer t;
	public int x=10;
	private ImageIcon i;
	private ImageIcon bg;
	private ImageIcon imageArray[];
	private int delay =100,totalFrame =5,currentFrame =0;
	public NPanel(){
		this.setBounds(0,0,800,600);
		bg = new ImageIcon("bg1.png");
		imageArray = new ImageIcon[totalFrame];
		for(int i=0;i<imageArray.length;i++){
			imageArray[i] = new ImageIcon(i+".png");
		}
		
		t = new Timer(delay,this);
		t.start();
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		bg.paintIcon(this,g,10,10);
		
		if(currentFrame >=imageArray.length){
			currentFrame =0 ;
		}
		imageArray[currentFrame].paintIcon(this,g,x,200);
		currentFrame++;
		x=x+20;
		if(x>600){
			x=10;
		}
		
		
	}
	public void actionPerformed(ActionEvent e){
		repaint();
	}
	
}