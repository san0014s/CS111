import java.awt.*;
import javax.swing.*;

public class importImage extends JFrame {
	private ImageIcon image1;
	private JLabel label1;

	 importImage(){
		setLayout(new FlowLayout());
		image1 = new ImageIcon(getClass().getResource("bluebird.jpg"));
		label1 = new JLabel(image1);
		add(label1);
	}

	public static void picture(double x,double y,String filename) {


	}

	public static void main(String[] args) {
		importImage gui = new importImage();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.pack();
		gui.setTitle("Image Program");
		
	}

}
