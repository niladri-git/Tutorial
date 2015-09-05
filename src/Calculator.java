import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
			
		int num1,num2;			
		Scanner input= new Scanner(System.in);
			
		System.out.print("Enter first and second number: ");
			
		num1 = input.nextInt();
		num2 = input.nextInt();
			
		System.out.println("\nEnter your selection: " + "\n\n 1 for Addition" + "\n 2 for Subtraction" + "\n 3 for Multiplication" + "\n 4 for Division");
		System.out.println(" 5 for Power");
		System.out.print("\nEnter Choice: ");
			
		int choice;
		choice = input.nextInt();
			
		Operators op = new Operators();
		Scientific sc = new Scientific();
		
		switch (choice){
				
			case 1:
				System.out.println(op.add( num1,num2));
				break;
			case 2:
				System.out.println(op.sub( num1,num2));
				break;      
			case 3:
				System.out.println(op.mult( num1,num2));
				break;
			case 4:
				System.out.println(op.div( num1,num2));
				break;
			case 5:
				System.out.println(sc.power( num1,num2));
				break;
					
			default:
				System.out.println("Illigal Operation");

			}
		}
}