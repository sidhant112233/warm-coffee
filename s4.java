import java.util.Scanner;

public class s4 {
    public static void main(String args[]){
	
	
		int a,b,c;
			
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value for A = ");
        a=scan.nextInt();
        System.out.println("Enter value for B = ");
        b=scan.nextInt();
        System.out.println("Enter value for C = ");
        c=scan.nextInt();

		if(a<b){
			  if(a<c){
				 System.out.println(a+" is small"); 
			  }
			  else{
				 System.out.println(c+" is small"); 
			  }	
		}
		else{
			if(b<c){
			
				 System.out.println(b+" is samll"); 
			}
			else{
			
				 System.out.println(c+" is small"); 
			}
		}
	
	
	
	}
}
