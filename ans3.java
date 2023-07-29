import java.util.Scanner;

public class ans3 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Cost Price :");
    int CP= sc.nextInt();
    System.out.print("Enter Selling Price :");
    int SP= sc.nextInt();
    if(SP>CP){
        System.out.println("Profit : "+ (SP-CP));
    }else{
        System.out.println("Loss : "+(CP-SP));
    }
   } 
}
