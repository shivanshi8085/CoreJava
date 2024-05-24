package corejava;

public class ArmstrongNo {
	public static void main(String[] args) {
		
		int a= 123;
		 int b = a;
		 int c=0;
		 int d;
		 
		 while(b>0) {
			 d=b%10;
			 c= c+(d*d*d);
			 b=b/10;
		 
		 }
		 if(a==0) {
			 System.out.println("It is ArmstrongNo..");
			 
		 }else {
			 System.out.println("it is not arstrong");
		 }
	}
	
	

}
