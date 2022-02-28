
import java.util.Scanner;

class Calculator{


    int c ;

  public void additon(int a ,int b) {

    c=a+b;

    System.out.println("The 2 number are " +a +" and "+b+" the result of addition is "+c);

     
 }

 public void subtraction(int a, int b){

    if (a>b) {
        c=a-b;

        System.out.println("The 2 number are " +a +" and "+b+" the result of substraction is "+c);
         
     } else {

        c=b-a;

    System.out.println("The 2 number are " +b +" and "+a+" the result of substraction is "+c);
         
     }
 }

 public void multiplication(int a, int b)
 {
    c=a*b;

    if (c>1000)
    {
        System.out.println("Not a valid output");
        
    }
        else{
    System.out.println("The 2 number are " +b +" and "+a+" the result of multiplication is "+c);
 }
}

 public void divide(int a ,int b)
 {
    float c=a/b;
    System.out.println("The 2 number are " +b +" and "+a+" the result of multiplication is "+c);
 }



public static void main(String[] args) {
    int c;
System.out.print("Enter the 2 numbers");


     Scanner s = new Scanner(System.in);
        int a=s.nextInt();
         
    
         Scanner s2 = new Scanner(System.in);
         int b=s2.nextInt();

System.out.println("Please select the command");

System.out.println("Enter 1 for addition");
System.out.println("Enter 2 for subtraction");
System.out.println("Enter 3 for multiplicaiton");
System.out.println("Enter 4 for divison");

Scanner s3 = new Scanner(System.in);
int d =s3.nextInt();

Calculator obj =new Calculator();

switch (d)
{
    case 1: 
   obj.additon(a, b);

    break;

    case 2:
    
    obj.subtraction(a, b);

    
    break;

    case 3:

    obj.multiplication(a, b);
    

    break;

    case 4:

    obj.divide(a, b);
   

    break;

    default:

    System.out.println("Invalid option");

    

}

    
     
}
}