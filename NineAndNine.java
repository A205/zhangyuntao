
public class NineAndNine {
    public static void main(String[] agre) {
		int sum;
		for(int i = 1;i<=9;i++){
			for(int j = 1;j<=9;j++){
				if(j<=i){
					sum = i*j;
					System.out.print(j+"*"+i+"="+sum+" ");
				}
			}
			System.out.println();
		}
	}
}