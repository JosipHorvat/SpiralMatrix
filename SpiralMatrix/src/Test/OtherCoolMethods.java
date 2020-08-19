package Test;

public class OtherCoolMethods {

	public void multiplyingGrid() {
		
		int a = PomocnaMetoda.ucitajBroj("Enter 1st number:");
		int b = PomocnaMetoda.ucitajBroj("Enter 2nd number:");
		int multiply;
		for (int i = 1; i<= a; i++) {
			for (int j=1; j<= b; j++){
				multiply = i*j;
			System.out.printf("%5d" ,multiply);
			}
			System.out.println();
		}
	}
}
