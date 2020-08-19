package Test;

import javax.swing.JOptionPane;

public class PomocnaMetoda {

	
	@SuppressWarnings("static-access")
	public static int ucitajBroj(String poruka) {
		
		while(true) {
			Integer broj = null;
			try {
				return broj.parseInt(JOptionPane.showInputDialog(poruka));
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
		
		
		
	}
}
