import java.util.Scanner;

public class ans2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    if(n<0){
        n*=-1;
    }
    System.out.println("The Absolute value is : "+ n);
  }  
}
