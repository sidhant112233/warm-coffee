import java.util.Scanner;

public class s2 {
    public static void main(String args[]){
	
        int a,b;
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter value for A = ");
        a=scan.nextInt();
        System.out.println("Enter value for B = ");
        b=scan.nextInt();


        if(a>b)
        {
            System.out.println("A is larger numer" +a);
        }
        else
        {
            System.out.println("B is larger numer" +b);
        }
        
        
        }
}
