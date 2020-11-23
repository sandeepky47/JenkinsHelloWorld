public class Factorial {

	public static void main(String[] args) {
		
	    int n = 5;
	      long factorial = 1;
	      int i = 1;
	      
	      do
	      {
	    	  factorial = factorial * i;
	          i++;
	      } while (i <= n);
	      
	      System.out.println("Factorial is= " + factorial);

	}

}
