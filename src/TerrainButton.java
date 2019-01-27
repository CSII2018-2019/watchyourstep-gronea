import java.awt.Color;
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
	

	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public boolean hasHole() {
		return hole;
	}
	
	public boolean isRevealed() {
		return revealed;
	}
	
	public void setHole(boolean hasHole) {
		hole = hasHole;
	}
	
	public void increaseHoleCount() {
		nextToHoles++;
	}
	
	public boolean isNextToHoles() {
		if(nextToHoles > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void reveal(boolean reveal) {
		revealed = reveal;
		if (revealed = true) {
			if(hole = true) {
				setBackground(Color.BLACK);
			}else {
				setBackground(Color.CYAN);
				if(nextToHoles > 0) {
					setText(Integer.toString(nextToHoles));
				}
			}
		}
		else {
			setBackground(null);
			setText(null);
		}
	}
	
	public void reset() {
		hole = false;
		revealed = false;
		setText(null);
		setBackground(null);
	}
}
