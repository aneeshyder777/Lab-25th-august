
public class HCFOfNumbers {

	public static void main(String[] args) {
		int a =60;
		int b =36;
		int i , hcf =0;
		for(i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				hcf =i;
			}
		
			 
		}
		 System.out.print("HCF of 60 and 36 is: " +hcf);
	}

}
