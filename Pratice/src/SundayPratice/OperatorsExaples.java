package SundayPratice;

public class OperatorsExaples {
	public static void main(String[] args) {

	        double a=101;
	         double b=101;
	         
	         
	         //Arthematic 
	         System.out.println("*******Arthematic********");
	         System.out.println("sum="+(a+b));
	         System.out.println("sub="+(b-a));
	         System.out.println("Multiply="+(b*a));
	         System.out.println("Divide="+(b/a));
	         System.out.println("Modulo="+(b%a));
	         
	         System.out.println();
	         System.out.println("******Relational*******");
	   //Relational Or Comparison
	         double c=10.1;
	         int d=10;
	         System.out.println("Compare=="+(c==d));
	         System.out.println("Greater="+(d>c));
	         System.out.println("lessThan="+(c<d));
	         System.out.println("Less and equal="+(c<=d));
	         System.out.println("greather or Equal="+(c>d));
	         System.out.println("Not equal to="+(c!=d));
	         
	         
	         //Logical Operator
	         System.out.println();
	         System.out.println("*******Logical******");
	         boolean  x=false;
	         boolean y=false;
	         
	         System.out.println("And="+(x && y));
	         System.out.println("Or="+(x||y));
	         System.out.println("Not="+(!y));
	         
	         //Increment and Decrement
	         System.out.println();
	         System.out.println("*******Incremantr/Decrement*****");
	      int g=1;
	      g++;
	      g--;
	      g--;
	      g--;
	      g=g+20;
	      System.out.println("Inc/Dec="+g);
	       
	}
}
