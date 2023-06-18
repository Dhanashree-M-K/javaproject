package demo1;

public class Main {

	public static void main(String[] args) {
	  int num=1;
	  while(num<=10) {
		   int factorial = 1;
		       int i =num;
		      while (i>0) {
		    	   factorial *=i;
		    	   i--;
		      }
	System.out.println("factorial of "+num+" is : "+factorial);
			num++;
	      
	  }

	}

}
