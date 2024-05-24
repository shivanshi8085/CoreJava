package corejava;

public class Prime {
	public static void main(String[] args) {
		
		int n = 77;
		int count =0;
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				count++;
				System.out.println("yes");
				
			}else {
				System.out.println("No");
			}
		}
	}

}
    