package halloween;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JTextArea;

public class HalloweenGui extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextArea area;
	Font myFont = new Font("Serif", Font.BOLD, 275);
		
	public HalloweenGui() {
		super("Halloween");
		setLayout(new FlowLayout());
		
		area = new JTextArea(String.format("    Happy \nHalloween!"));
		area.setForeground(Color.orange);
		area.setFont(myFont);
		area.setEditable(false);
		add(area);
				
	}

}
