package forPetlje;

import javax.swing.JOptionPane;

public class Sp {
	

	public static void main(String[] args) {
		spirala();		
		
		
	}
	public static int spirala() {
	
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Upisi broj:"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Upisi broj:"));
		
	    int[][] spirala = new int[prviBroj][drugiBroj];{
		

		int vrijednost = 1;
		int minStupac = 0;
		int minRed = 0;
		int maxStupac = drugiBroj - 1;
		int maxRed = prviBroj-1;

		
		while (vrijednost <= prviBroj *drugiBroj) {
			
			for (int i = maxStupac; i >= minStupac; i--) {
				spirala[maxRed][i] = vrijednost;
				vrijednost++;
				if (vrijednost > prviBroj * drugiBroj) {
					break ;
				}
				
			}
			for (int i = maxRed -1 ; i >= minRed; i--) {
				spirala[i][minStupac] = vrijednost;
				vrijednost++;
				if (vrijednost > prviBroj *drugiBroj) {
					break;
				}
			}
			for (int i = minStupac +1; i <= maxStupac; i++) {
				spirala[minRed][i] = vrijednost;
				vrijednost++;
				if (vrijednost > prviBroj * drugiBroj) {
					break;
				}
			}
			for (int i = minRed + 1; i < maxRed ; i++) {
				spirala[i][maxStupac] = vrijednost;
				vrijednost++;
				if (vrijednost > prviBroj * drugiBroj) {
					break;
				}
			}
			maxRed--;
     		maxStupac--;
			minRed++;
			minStupac++;
		}
		for (int i = 0; i < prviBroj; i++) {
			for (int j = 0; j < prviBroj; j++) {
				System.out.print(spirala[i][j] + "\t");
			}
			System.out.println();

		}
	}return spirala[prviBroj -1][drugiBroj -1];
	}
	}


