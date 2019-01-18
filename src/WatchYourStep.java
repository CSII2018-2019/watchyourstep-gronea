import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class WatchYourStep extends JFrame{

	
	public WatchYourStep () {
		//setup what goes into the window
		initGUI();
		//Title
		setTitle("Game Window");
		//Size
		setSize(400, 200); //pixels
		setResizable(false);
		//Makes everything really tight - overrides size
		pack();
		setLocationRelativeTo(null); //centers on screen, do this after packing but before visible

		//Needs to one of the last things you do- making it visible	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void initGUI() {
		//TITLE
		JLabel titleLabel = new JLabel("Watch Your Step");
		Font titleFont = new Font (Font.SERIF, Font.BOLD + Font.ITALIC, 32);
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(Color.MAGENTA);
		titleLabel.setBackground(new Color(29,62,114));
		titleLabel.setOpaque(true);
		add(titleLabel, BorderLayout.PAGE_START);
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //left or right
	}

	
	public static void main(String[] args) {
		try {
            //UI = user interface
			String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new WatchYourStep();
            }   
        });

	}



}
