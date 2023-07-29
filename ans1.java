import java.util.Scanner;

public class ans1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Length : ");
    int length= sc.nextInt();
    System.out.print("Enter breadth");
    int breadth= sc.nextInt();
    if(length==breadth){
        System.out.println("it is a square.");
    }else{
        System.out.println("it isn't a squre.");
    }
   } 
}
