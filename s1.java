import java.util.Scanner;

public class s1{
    public static void main(String arg[]){
     int a;
	float b;
	double c;
	long  d;
	int e ;
	int f;
    
    Scanner scan= new Scanner(System.in);
	System.out.println("Enter value for A = ");
    a=scan.nextInt();

    System.out.println("Enter value for B = ");
	b=scan.nextFloat();   

     System.out.println("Enter value for c = ");
	c=scan.nextDouble();   

	 System.out.println("Enter value for d = ");
    d=scan.nextLong(); 

	 System.out.println("Enter value for e = ");
    e=scan.nextInt();  

	 System.out.println("Enter value for f = ");
    f=scan.nextInt();

	System.out.println("\n");
	System.out.println(b);
	System.out.println(c);
	System.out.println(e);
	System.out.println(f);
	System.out.println(d);
	
    }
}