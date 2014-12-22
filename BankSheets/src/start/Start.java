/**
 * 
 */
package start;

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
		setSize(400, 400);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	

}
