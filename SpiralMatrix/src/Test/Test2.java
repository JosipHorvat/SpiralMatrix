package Test;

import javax.swing.JOptionPane;

public class Test2 {

	public static void main(String[] args) {
		
		   
        int broj1 =5;//Integer.parseInt(JOptionPane.showInputDialog("Upisi x broj za matricu:"));    
        int broj2 =5;// Integer.parseInt(JOptionPane.showInputDialog("Upisi y broj za matricu:"));    
        
        int [][] spirala = new int[ broj1][ broj2];
        
        
        int vrijednost=1;
        int minStupac=0;
        int minRed=0;
        int maxStupac=broj1-1;
        int maxRed= broj2-1;
       

      //  while(vrijednost<= broj1* broj2)
            {
        	for (int i = minRed; i<= maxRed; i++) {
        		spirala[i][minStupac] = vrijednost;
        		vrijednost++;
        	}
        	for(int i = minStupac +1; i<=maxStupac; i++) {
        		spirala[maxRed][i] = vrijednost;
        		vrijednost++;
        	}
        	for(int i = maxRed -1; i>=minRed; i-- ) {
        		spirala[i][maxStupac] = vrijednost;
        		vrijednost++;
        	}
//        	for(int i = maxStupac -1; i>minStupac; i-- ) {
//        		spirala[minRed][i] = vrijednost;
//        		vrijednost++;
//        		
//        	}
        	
               	 
//             minStupac++;
//             maxStupac--;
//             minRed++;
//             maxRed--;
//            }

        
        System.out.println("Spirala sa gornje lijeve strane prema dolje:");
        for(int i=0;i<broj1;i++)
            {
                for(int j=0;j<broj2;j++)
                    {
                        System.out.printf( "%5d", spirala[i][j]);
                    }
             System.out.println();
            }
		
	}
}
}
