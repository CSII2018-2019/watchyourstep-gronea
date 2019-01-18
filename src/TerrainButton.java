import java.awt.Dimension;

import javax.swing.JButton;

public class TerrainButton extends JButton{
	private final static int SIZE = 50;
	
	private int row = 0;
	private int col = 0;
	private int nextToHoles = 0;
	private boolean hole = false;
	private boolean revealed = false;
	
	private void Size(int r, int c) {
		row = r;
		col = c;
		
		Dimension size = new Dimension (row, col);
		
		
	}
}
