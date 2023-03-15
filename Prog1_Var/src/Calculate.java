
public class Calculate {
	
	public boolean isPrime(int num) {
		boolean isPrime=true;
		int temp;
		for(int i=2; i<=num/2; i++) {
			temp = num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public boolean isPrime(double numValue) {
		int num = (int) numValue;
		boolean isPrime=true;
		int temp;
		for(int i=2; i<=num/2; i++) {
			temp = num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

}
