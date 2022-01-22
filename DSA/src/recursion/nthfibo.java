package recursion;

public class nthfibo {
	
	
	public static int fibo(int n) {
		
		if(n==0 || n==1) {
			
			return n;
		}
		
		int result = fibo(n-1) + fibo(n-2);
		
		return result;
	}
	
	public static void main(String args[]) {
		
		System.out.println(fibo(5));
	}

}
