import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
        int a;

        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();

        if(a < 0)
        {
            System.out.println(a+"number is nagative");
        }
        else if(a == 0)
        {
            System.out.println(a+"number is zero");
        }
        else
        {
            System.out.println(a+"number is positive");
        }
    }
}
