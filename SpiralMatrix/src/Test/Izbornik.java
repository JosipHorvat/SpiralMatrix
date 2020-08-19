package Test;

import javax.swing.JOptionPane;


public class Izbornik {
	
	public Izbornik() {
		
	izbor();
	}
	
	
	private void izbor() {
		System.out.println("1. Ciklicna Matrica");
		System.out.println("2. Ciklicna Matrica dva");
		System.out.println("3. Ciklicna Matrica tri: ");
		System.out.println("4. Ciklicna Matrica cetiri:");
		System.out.println("0. EXIT");
		odrediAkciju();
	}
	
	private void odrediAkciju() {
		SpiralMatrix spiralMatrix = new SpiralMatrix();
		int akcija = PomocnaMetoda.ucitajBroj("Odaberi metodu:");
		switch(akcija) {
		
		case 1:
			System.out.println("***********************************");
			System.out.println();
			spiralMatrix.ciklicnaMatrica();
			break;
		case 2:
			System.out.println("***********************************");
			System.out.println();
			spiralMatrix.ciklicnaMatricaDva();
			break;
		case 3: 
			System.out.println("***********************************");
			System.out.println();
			spiralMatrix.ciklicnaMatricaTri();
			break;
		case 4: 
			System.out.println("***********************************");
			System.out.println();
			spiralMatrix.ciklicnaMatricaCetiri();
			break;
		case 0: 
			System.out.println("Dovidjenja.");
			return;
			default: 
				JOptionPane.showMessageDialog(null, "Ne postojeca akcija!!");
				izbor();
		}
		
		izbor();
	}
	public static void main(String[] args) {
		new Izbornik();
	}
}
