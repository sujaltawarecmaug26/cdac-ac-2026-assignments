//Bonus Question Menu-Driven Java Program(Switch Case);

import java.util.Scanner;

public class MenuDriven{

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
		byte a = 0;
        	short b = 0;
       		int c = 0;
        	long d = 0L;
        	float e = 0.0f;
        	double f = 0.0;
        	char g = '\u0000';
        	boolean h = false;

       		System.out.println(a);
        	System.out.println(b);
        	System.out.println(c);
        	System.out.println(d);
        	System.out.println(e);
        	System.out.println(f);
        	System.out.println(g);
        	System.out.println(h);	
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