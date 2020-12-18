
public class DryRun {
	
	public static void main(String[] args) {
		int n =5;
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println("\n");
		}System.out.println("\n");
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println("\n");
		}System.out.println("\n");
		for(int i =n;i>0;i--) {
			for(int j =i;j>0;j--) {
				System.out.print(j + " ");
			}
			System.out.println("\n");
		}System.out.println("\n");
		
	}

}
