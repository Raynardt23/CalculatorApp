import java.util.Scanner;


public class CalculatorApp {

    double numberOne;
    double numberTwo;

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);    // Getting the user input by making use of a Scanner object


        System.out.print("Please enter the first number: ");   // Prompting the user to enter the first number

        double firstNumber = userInput.nextDouble();

        System.out.print("Please enter the second number: ");

        double secondNumber = userInput.nextDouble();

        CalculatorApp calculating = new CalculatorApp(firstNumber, secondNumber);   // Creating an object of the class to access the methods


            System.out.println("Please enter the number operation you want to perform: ");  // Prompting the user to enter the operation they want to perform
        
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

        int operation = userInput.nextInt();   // Getting the operation from the user
        
        
        double result;   // Initializing my result variable

        switch (operation) {   // Using a switch statement to determine which operation to perform
            case 1:
                result = calculating.addition();   // Calling the Addition method
                break;
            case 2:
                result = calculating.subtraction();   // Calling the Subtraction method
                break;
            case 3:
                result = calculating.multiplication();   // Calling the Multiplication method
                break;
            case 4:
                result = calculating.division();   // Calling the Division method
                break;
            default:
                System.out.println("Invalid operation");   // If the user enters an invalid operation
                return;   // Exiting the program
        }


        System.out.println("The result is: " + result);   // Printing the result of the operation
        
    }


    public CalculatorApp(double numberOne, double numberTwo){   // Constructor to initialize the numbers

        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }


    // Creating a method for Addition

    public double addition(){
        
            return this.numberOne + this.numberTwo;

    }

    // Integer version of the Addition method

    public int addition(int numberOne, int numberTwo){   // Overloading the addition method to handle integer values

        return numberOne + numberTwo;

    }

    // Creating a method for Subtraction 

    public  double subtraction(){
        
            return this.numberOne - this.numberTwo;

    }

    // Integer version of the Subtraction method

    public int subtraction(int numberOne, int numberTwo){   

        return numberOne - numberTwo;

    }



    // Creating a method for Multiplication

    public double multiplication(){

        return this.numberOne * this.numberTwo;

    }


    // Integer version of the multiplication method


    public int multiplication(int numberOne, int numberTwo){   // Overloading the multiplication method to handle integer values

        return numberOne * numberTwo;

    }


    // Creating a method for Division 

    public double division(){

        if(this.numberTwo == 0){                                         // This is to see if the second number is a zero                              
            System.out.println("You cannot divide by zero");
            return 0;

        } else{

            return this.numberOne / this.numberTwo;
        }
    }

    // Integer version of the division method

    public int division(int numberOne, int numberTwo){

        if(numberTwo == 0){
            
            System.out.println("You cannot divide by zero");
            return 0;

        } else{

            return numberOne / numberTwo;
        }
    }


    // Creating a method for Division handling decimal values

   
}
