import java.util.Scanner;
public class LargestOfThreeNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of a:");
        int b=sc.nextInt();
        System.out.print("Enter value of a:");
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("a is Largest");
        }
        else if(b>=c){
            System.out.println("b is Largest");
        }
        else{
            System.out.println("c is Largest");
        }

    }
}
