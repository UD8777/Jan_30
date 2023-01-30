package program;

public class palindrom {

	public palindrom() {
		
		int no = 12921 ;
		int u = no ;
		int m = 0 ;
		int e ;
		
		while (u != 0) 
		{
			e = u % 10 ;
			m = m * 10 + e ;
			u = u / 10 ;
		}
		
		if (no == m) System.out.println("Its a Palindrom no = " + no);
		else System.out.println("Its a Non_palindrom no = " + no);


	}
	
	public static void main (String [] args) {
		
		new palindrom () ;
		
	}

}
