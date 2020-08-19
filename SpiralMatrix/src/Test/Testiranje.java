package Test;

import javax.swing.JOptionPane;

public class Testiranje {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Upisi broj "));
		int drugiBroj=Integer.parseInt(JOptionPane.showInputDialog("Upisi broj "));

		int[][] spirala = new int[prviBroj][drugiBroj];
	
	int vrijednost = 1;
	int minStupac = 0;
	int minRed = 0;
	int maxStupac = drugiBroj -1;
	int maxRed = prviBroj -1;
	
	while(vrijednost <= prviBroj * drugiBroj) {
		
		for(int i = minRed ; i<= maxRed; i++) {
			spirala[i][maxStupac]= vrijednost;
			vrijednost++;
			if( vrijednost > prviBroj * drugiBroj) {
				break;
			}
		}
		for (int i =maxStupac -1; i>= minStupac; i-- ){
			spirala[maxRed][i] = vrijednost ;
			vrijednost++;
			if(vrijednost > prviBroj * drugiBroj) {
				break;
			}
		}
		for (int i = maxRed -1; i >= minRed; i--) {
		spirala[i][minStupac]= vrijednost;
		vrijednost++;
		if(vrijednost > prviBroj * drugiBroj) {
			break;
		}
	}
		for(int i = minStupac +1 ; i<maxStupac; i++) {
			spirala[minRed][i] = vrijednost; 
			vrijednost++; 
			if(vrijednost > prviBroj * drugiBroj) {
				break;
			}
		}
		
		
	  minStupac++;
      maxStupac--;
      minRed++;
	  maxRed--;

}
	for (int i = 0; i < prviBroj; i++) {
		for (int j = 0; j < drugiBroj; j++) {
			System.out.print(spirala[i][j] + "\t");
		}
		System.out.println();

	}
	  
	}
}
