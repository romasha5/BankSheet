/**
 * 
 */
package start;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * @author Roman
 *
 */
public class Start extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Start("Формування списків в банк");
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public Start(String title) throws HeadlessException {
		super(title);
		setPreferredSize(new Dimension(400,400));
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setConPan(getContentPane());
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	private void setConPan(Container contentPane) {
		
		
	}

	

}
