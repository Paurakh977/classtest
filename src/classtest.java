import java.util.Random;
import java.util.Scanner;

public class classtest {
    public static void main(String[] args) {
        String static_username = "Paurakh_01";
        String static_password = "ok123";
        System.out.println("Please Login Your Username and Password to proceed");
        Scanner inp = new Scanner(System.in);
        System.out.println("Please Enter Your username");
        String username = inp.next();
        System.out.println("Enter your password");
        String password = inp.next();
        if (static_username.equals(username)) {
            if (static_password.equals(password)) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWELCOME TO OUR PAGE " + username);
                System.out.println("\nWhat operation do you want to carry out?");
                System.out.println(
                        "1)Greatest number\t\t\t\t\t\t\t\t2)Calculator\t\t\t\t\t\t3)Result Calculator\t\t\t\t\t\t4)Guessing Game");
                int choose = inp.nextInt();
                switch (choose) {
                    case (1):
                        System.out.println(
                                "\t\t\t\t\t\t\t\t\t\t\t\t\tGive us your 3 numbers we'll ive you your greatest number");
                        System.out.println("\n Your 1st number");
                        int num1 = inp.nextInt();
                        System.out.println("\n Your 2nd number");
                        int num2 = inp.nextInt();
                        System.out.println("\n Your 3rd number");
                        int num3 = inp.nextInt();
                        System.out.println("Processing");
                        if (num1 > num2 & num1 > num3) {
                            System.out.println("Your Greatest number is " + num1);
                        } else if (num2 > num1 & num2 > num3) {
                            System.out.println("Your Greatest number is " + num2);
                        } else if (num3 > num1 & num3 > num2) {
                            System.out.println("Your Greatest number is " + num3);
                        } else {
                            System.out.println("your inputs are equal. Please try again");
                        }
                        break;
                    case (2):
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWELCOME TO OUR CALCULATOR");
                        System.out.println("\n Your 1st number");
                        double num_1 = inp.nextInt();
                        System.out.println("\n Your 2nd number");
                        double num_2 = inp.nextInt();
                        System.out.println("What Operations would you like to carry on?");
                        System.out.println(
                                "1)Addition (+)\t\t\t\t\t\t\t\t2)Subtraction (-)\t\t\t\t\t\t3)Multiplication (X)\t\t\t\t\t\t4)Division (/)");
                        String Operation = inp.next();
                        if (Operation.equals("+") || Operation.equals("1")) {
                            double result = num_1 + num_2;
                            System.out.println("Your Sum is: " + result);
                        } else if (Operation.equals("-") || Operation.equals("2")) {
                            double result = num_1 - num_2;
                            System.out.println("Your Difference is: " + result);
                        } else if (Operation.equals("X") || Operation.equals("3")) {
                            double result = num_1 * num_2;
                            System.out.println("Your Product is: " + result);
                        } else if (Operation.equals("/") || Operation.equals("4")) {
                            double result = num_1 / num_2;
                            System.out.println("Your Quotient is: " + result);
                        } else {
                            System.out.println("Invalid Operation");
                        }
                        break;
                    case (3):
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWELCOME TO RESULT CALCULATOR");
                        System.out.println("enter your marks in Maths");
                        double maths = inp.nextInt();
                        System.out.println("enter your marks in Physic");
                        double physics = inp.nextInt();
                        System.out.println("enter your marks in Chemistry");
                        double chemistry = inp.nextInt();
                        if (maths > 100 || maths < 0 || physics > 100 || physics < 0 || chemistry > 100
                                || chemistry < 0) {
                            System.out.println("Invalid marks given");
                        } else {
                            System.out.println("Processing");
                            double percentage = (physics + chemistry + maths) * (100.0 / 300.0);
                            if (percentage >= 80) {
                                System.out.println("Congratualtions you got A+ with " + percentage);
                            } else if (percentage < 80 & percentage >= 50) {
                                System.out.println("Congratualtions you got B+ with " + percentage);
                            } else if (percentage < 50 & percentage >= 40) {
                                System.out.println("Congratualtions you got C+ with " + percentage);
                            } else {
                                System.out.println("You failed. Your percentage " + percentage);
                            }
                        }
                        break;
                    case (4):
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWELCOME TO OUR GUESSING CENTER");
                        Random obj = new Random();
                        Scanner xyz = new Scanner(System.in);
                        int rand_number, choice;
                        rand_number = obj.nextInt(10);
                        System.out.println("We Challenge you to Guess the number");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t" +
                                "******************** GENERATING NUMBER ********************\n");
                        System.out.println("THE NUMBER IS BETWEEN 0-9");
                        System.out.println("\nEnter Your GUESS --->");
                        choice = xyz.nextInt();
                        if (choice < 0 || choice > 9) {
                            System.out.println("Entered Number is out of range");
                        } else {
                            if (choice == rand_number) {
                                System.out.println("AMAZING! YOU GUESSED IT CORRECT THE  NUMBER IS " + rand_number);
                            } else if (choice != rand_number) {
                                System.out.println(
                                        "OPPS! Better Luck next time. You guessed Wrong. The number is " + rand_number);
                            }
                            break;
                        }
                    default:
                        System.out.println("Invalid choice");
                        break;

                }
            } else {
                System.out.println("Invalid Password please try again");
            }
        } else {
            System.out.println("Invalid username");
        }
    }
}
