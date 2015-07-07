import java.util.Scanner;


public class triangle {
    public static void main(String[] agre) {
    	System.out.println("Please enter the longth.");
    	Scanner scanner = new Scanner(System.in);
    	int input = scanner.nextInt();
		for(int i = 1;i <= input;i++){
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}
