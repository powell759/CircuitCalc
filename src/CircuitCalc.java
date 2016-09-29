import java.util.Scanner;

public class CircuitCalc {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int tmpAmp;
		int tmpOhm;
		
		System.out.print("Enter a integer:");
		tmpAmp = in.nextInt();
		System.out.print("Enter antother integer:");
		tmpOhm = in.nextInt();
		
		Norton testNorton = new Norton(tmpAmp, tmpOhm);
		
		System.out.println("Created Norton Circuit");
		System.out.printf("Current: %d Amps \n", testNorton.get_amperage());
		System.out.printf("Current: %d Ohms \n", testNorton.get_resistance());
		
		in.close();
	}
}
