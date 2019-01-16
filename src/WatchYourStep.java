import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
	
	private static void initGUI() {
		//TITLE
		//create label
		JLabel titleLabel = new JLabel("Watch Your Step");
		Font titleFont = new Font (Font.SERIF, Font.BOLD + Font.ITALIC, 32);
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(Color.MAGENTA);
		//titleLabel.setBackground(Color.BLACK); 
		//or Go on Google and search rgb color picker to find new colors then use:
		titleLabel.setBackground(new Color(29,62,114));
		titleLabel.setOpaque(true);
		//Add the label to the window, make sure it is on top
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
