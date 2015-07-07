import java.util.Scanner;


public class triangle2 {
	public static void main(String[] agre) {
    	System.out.println("Please enter the longth.");
    	Scanner scanner = new Scanner(System.in);
    	int input = scanner.nextInt();
		for(int i = 1;i <= input;i++){
			for (int k =1; k <= input-i;k++ ){
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
}
}
