import java.awt.*;
import java.awt.event.*;

public class KeyPink extends Frame implements KeyListener{

	String msg = "My name is KHUSHI JAIN";
	int X = 50, Y = 100; // output coordinates

	public KeyPink() 
	{
		addKeyListener(this); //Register the listener
	}

	public void keyPressed(KeyEvent ke) 
	{

	}

	public void keyReleased(KeyEvent ke) 
	{
		
	}
	public void keyTyped(KeyEvent ke) 
	{
		
	}

	// Display keystrokes.
	public void paint(Graphics g) 
	{
        setBackground(Color.pink);
		g.setColor(Color.black);
		g.drawString(msg, X, Y);
	}

	public static void main(String[] args)
	{
		KeyPink obj = new KeyPink();

		obj.setSize(new Dimension(300, 300));
		obj.setTitle("Keyboard Events");
		obj.setVisible(true);
	}
}
