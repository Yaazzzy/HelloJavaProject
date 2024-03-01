import java.util.Scanner;

public class RepetitionStructures {
    /**
     * Repetitions are a java statement that allow to execute a specific blocks of code a number of times
     *
     * there are 3 types
     * 1. while-loop
     * 2. do-while loop
     * 3. for-loop
     */

    public static void main(String[] args) {
        //1.  while-loop -> is a statement or a block of code that is repeated as long as some condition is satisfied.

        // while loop has the form (syntax)

//        while (boolean_expression){
//            statement1;
//            statement2;
//        }

        // the statement inside the while loop executed as long as the boolean evaluates to true

        // example:

        // write a while loop that prints the integers 1 2 3 4 5 6 7 8 9 10

        int x = 1;

        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        //output 0 2 4 6 8 10 12 14 16 18 20

        int y = 0;

        while (y <= 20){
            System.out.println(y);
            y +=2;
        }

        // 2. do ... while
        // statements inside a do while loop are executed several times as long as the condition is true or satisfied
        // it is similar to while loop the main diff is that statement inside a do while loop are executed once

        // syntax
        // do {
            // statement1;
            // statement2;
        //} while (boolean_expression);

        // 0 5 10 15 20 25 30 35 40 45 50

        int b = 0;

        do{
            System.out.println(b);
            b+=5;
        } while (b <=50);


        // 3.for-loop
        // a for loop allows execution of the same code a number of times.

        // for loop syntax

//        for (initializationExpression; LoopCondition; StepExpression){
//            statement1;
//            statement2;
//        }

        // where;
        // -> InitializationExpression: initialize the loop variable
        // -> LoopCondition: Compares the loop variable to some limit
        // -> StepExpression: Updates the loop variable

        //Example:
        // output: 1 2 3 4 5 6 7 8 9 10

        for (int c = 1; c<=10; c++){
            System.out.println(c);
        }

        // output: 10 20 30 40 50 60 70 80 90 100

        for (int k = 10; k <= 100; k+=10){
            System.out.println(k);
        }
        System.out.println("*************************************************************************************");

        // Branching Statements
        // allow us to redirect the flow of program execution
        //  java offers 3 branching statements
        // 1. break
        // 2. continue
        // 3. return

        // 1. break statement
        // terminates the enclosing switch statements and flow of control transfers to the statement immediately following the switch statement

        // this can also be used to terminate a for, while or do-while loop

        String [] studentNames = {"Joanoah", "Bradley", "Muzna", "Hamza", "Ian", "Benson", "Frank", "Nethan", "Yasmin", "Domnic" };


       // create a scanner project
       Scanner sc = new Scanner(System.in);

        // ask the user for the new name they want to search in the class
        System.out.println("Enter the name of the student you wish to search for:");
        String searchName = sc.next();

        boolean foundName = false;

        for (int idx = 0; idx < studentNames.length; idx++){
            if (studentNames[idx].equals(searchName)){
                foundName = true;
                break;
            }
        }

        if (foundName){
            System.out.println(searchName + "found!!!");
        } else {
            System.out.println(searchName + " not found!!");
        }

        // 2. Continue statement
        // skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop, basically skipping the remainder of this iteration of the loop

        // Example:
        String[] names = {"Beah", "Bianca", "Lance", "Beah"};

        int count = 0;

        for (int p = 0; p < names.length; p++) {
            if (!names[p].equals("Beah")){
                continue;// skip next statement
            }
            count++;
        }

        System.out.println(" There are  " + count + " Beahs in this list.");

        System.out.println("***********************************************************************");

        // nested for loop
        // create a times table for a user provided number

        // ask the user for the times table number
        System.out.println(" Enter the times table number: ");
        int timesTable = sc.nextInt();

        for (int times = 1; times <=12; times++){
            System.out.println(timesTable + "X" + times + " = " + (timesTable * times));
        }

        System.out.println("*********************************************************");

        // create the whole times table

        for (int q = 1; q <= 12; q++){
            for (int r = 1; r <=12; r++){
                System.out.println(q + "X" + r + " = " + (q * r));
            }
            System.out.println("=========================================================");
        }

        System.out.println("=============================================================");

        // iii. return statement
        // is used to exit from the current method.
        // flow of control returns to the statement that follows the original method call
        // to return, simply put the value (or an expression that calculates the value) after the return keyword
        // for example:
        // return count++; or return "Java";
        // the type of data declared by the method MUST match the type of value returned by the return statement
        // When a method is declared void, use the form of return that doesn't return a value.

        System.out.println("****************************************************************");



        // close our scanner object
        sc.close();

        // Next -> Java Arrays
    }
}
