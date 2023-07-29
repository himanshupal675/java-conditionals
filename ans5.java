import java.util.Scanner;

public class ans5 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter First Number :");
     int n1= sc.nextInt();
     System.out.print("Enter Second Number :");
     int n2= sc.nextInt();
     System.out.println("Enter the Operator (+,-,*,/)");
     char op =sc.next().charAt(0);

     switch(op){
        case '+':
            System.out.println(n1+" + "+n2+" = "+(n1+n2));
            break;
        case '-':
            System.out.println(n1+" - "+n2+" = "+(n1-n2));
            break;
        case '*':
            System.out.println(n1+" * "+n2+" = "+(n1*n2));
            break;
        case '/':
            System.out.println(n1+" + "+n2+" = "+(n1/n2));
            break;
     }
   } 
}
