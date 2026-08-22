//Bonus Question Menu-Driven Java Program(Switch Case);

import java.util.Scanner;

public class MenuDriven{

	static	byte a;
    static	short b;
    static 	int c;
    static  long d;
    static float e;
    static  double f;
    static char g;
    static  boolean h;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Grade Evaluation System
	int math = 80;
	int sci = 85;
	int his = 90;

	int avg = (math + sci + his) / 3;

	if(avg >= 90){

		System.out.println("Grade A");

		}
	else if(avg > 70 && avg < 89){

		System.out.println("Grade B");

		}
	else if(avg > 50 && avg < 69){

		System.out.println("Grade C");

		}else {

		System.out.println("Grade D");

		}
                    break;

                case 2:
                    // Leap Year Check
			int year = 2012;

			if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

    				System.out.println(year + " Is Leap Year");

			} else {

 				System.out.println(year + " Is Not a Leap Year");
			}

                    break;

                case 3:
                    // Day of the Week
			int day = 2;
		
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;

			case 4:
				System.out.println("Thursday");
				break;

			case 5:
				System.out.println("Friday");
				break;

			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
	
				System.out.println("Invalid day");

			}

                    break;

                case 4:
                // Default Values of Variables
					
		 			System.out.println("byte " +a);
                    System.out.println("short :" +b);
                    System.out.println("int :" +c);
                    System.out.println("long : "+d);
                    System.out.println("float : "+e);
                    System.out.println("double :" +f);
                    System.out.println("char : "+g);
                    System.out.println("boolean : "+h);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);


    }
}
