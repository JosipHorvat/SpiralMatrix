package Test;

import javax.swing.JOptionPane;

public class SpiralMatrix {
	/*
	 *       min red
	 *     
	 *    m          m
	 *    i			 a
	 *    n 		 x
	 *    S 		 S
	 *    t			 t
	 *    u			 u
	 *    p			 p
	 *    
	 *      max red
	 *      
	 *      min/max red represents x in matrix;
	 *      min/max stupac represents y in matrix;
	 *      
	 *      if I say :
	 *      
	 *      for (int i = maxStupac; i >= minStupac; i--) {
				spirala[maxRed][i] = vrijednost;
				vrijednost++;
				if (vrijednost > prviBroj * drugiBroj) {
					break ;
				}
		 imagine it is 3x3 matrix 		
		 spirala[maxRed][i] = vrijednost is going to be printed like 
		 
		 0 0 0
		 0 0 0
		 3 2 1
		 
	 */
	
	public void ciklicnaMatrica() {
		int prviBroj = PomocnaMetoda.ucitajBroj("Upisi x dimenzije:");
		int drugiBroj = PomocnaMetoda.ucitajBroj("Upisi y dimenzije:");
		
	    int[][] spirala = new int[prviBroj][drugiBroj];
	    
		

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
			for (int j = 0; j < drugiBroj; j++) {
				System.out.print(spirala[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println("**************************");
		System.out.println();
	
	}
	
    public void ciklicnaMatricaDva() {
		
		int prviBroj = PomocnaMetoda.ucitajBroj("Upisi x dimenzije");
		int drugiBroj =PomocnaMetoda.ucitajBroj("Upisi y dimenzije");

		int[][] spirala = new int[prviBroj][drugiBroj];
	
	int vrijednost = 1;
	int minStupac = 0;
	int minRed = 0;
	int maxStupac = drugiBroj -1;
	int maxRed = prviBroj -1;
	
	while(vrijednost <= prviBroj * drugiBroj) {
		
		for (int i = minStupac ; i <= maxStupac; i++) {
			spirala[maxRed][i]= vrijednost;
			vrijednost++;
			if(vrijednost > prviBroj * drugiBroj) {
				break;
			}
		}
		
		for(int i = maxRed -1; i>= minRed; i--) {
			spirala[i][maxStupac]= vrijednost;
			vrijednost++;
			if( vrijednost > prviBroj * drugiBroj) {
				break;
			}
		}
		
		for (int i = maxStupac -1 ; i>= minStupac; i-- ){
			spirala[minRed][i] = vrijednost ;
			vrijednost++;
			if(vrijednost > prviBroj * drugiBroj) {
				break;
			}
		}
		for(int i = minStupac +1 ; i<maxStupac; i++) {
			spirala[i][minStupac] = vrijednost; 
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
	System.out.println("**************************");
	System.out.println();
	  
	}

	public void ciklicnaMatricaTri() {
		
	   
      int   broj1 =PomocnaMetoda.ucitajBroj("Upisi x dimenzije:");    
      int  broj2 = PomocnaMetoda.ucitajBroj("Upisi y dimenzije:");    
	 
	    
        int [][] spirala = new int[ broj1][ broj2];
        
        
        int vrijednost=1;
        int minStupac=0;
        int minRed=0;
        int maxStupac=broj1-1;
        int maxRed= broj2-1;
       

        while(vrijednost<= broj1* broj2)
            {
        	for (int i = minRed; i<= maxRed; i++) {
        		spirala[i][minStupac] = vrijednost;
        		vrijednost++;
        		if(vrijednost > broj1 * broj2) {
    				break;
    			}
        	}
        	for(int i = minStupac +1; i<=maxStupac; i++) {
        		spirala[maxRed][i] = vrijednost;
        		vrijednost++;
        		if(vrijednost > broj1 * broj2) {
    				break;
        		}
        	}
        	for(int i = maxRed -1; i>=minRed; i-- ) {
        		spirala[i][maxStupac] = vrijednost;
        		vrijednost++;
        		if(vrijednost > broj1 * broj2) {
    				break;
        		}
        	}
        	for(int i = maxStupac -1; i>minStupac; i-- ) {
        		spirala[minRed][i] = vrijednost;
        		vrijednost++;
        		if(vrijednost > broj1 * broj2) {
    				break;
        		}
        		
        	}
        	
               	 
             minStupac++;
             maxStupac--;
             minRed++;
             maxRed--;
            }

        
        
        for(int i=0; i<broj1; i++) {
        	 for(int j=0;j<broj2;j++) {
        		 System.out.print(spirala[i][j] + "\t");
                             }
             System.out.println();
            }
        System.out.println("**************************");
		System.out.println();
	}
   
	public void ciklicnaMatricaCetiri() {
		
		
		int prviBroj = PomocnaMetoda.ucitajBroj("Upisi x dimenzije:");
		int drugiBroj =PomocnaMetoda.ucitajBroj("Upisi y dimenzije:");

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
	System.out.println("**************************");
	System.out.println();
	}
}
