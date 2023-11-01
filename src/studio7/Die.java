package studio7;

public class Die {
	public static int n = 0;
	
	public Die(int n) {
		// TODO Auto-generated method stub
		int[] sides = new int[n];
		for (int i=0; i<n;i++) {
			sides[i] = i+1;
		}
 
	}
	public static int thrown() {
		return (int) Math.floor(Math.random() * (n  + 1)) ;
		
	}

}
