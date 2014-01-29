package tittown;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JTextArea;

public class TITTGUI extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextArea area;
	Font myFont = new Font("Serif", Font.BOLD, 200);
	private String message;
	private Color color;
		
	public TITTGUI(String newMessage, Color newColor) {
		super("Trouble in Terrorist's Town");
		setLayout(new FlowLayout());
		message = newMessage;
		color = newColor;
		area = new JTextArea(message);
		area.setForeground(color);
		area.setFont(myFont);
		area.setEditable(false);
		add(area);	
	}
	public void update(String newMessage, Color newColor){
		message = newMessage;
		color = newColor;
	}

}
