public class DecisionControlStructures {
    /**
     * Decision Control Structures
     *
     * These are java statements that allow us to select and execute specific blocks of code while skipping other sections
     *
     * There are three types:
     *
     * i. if statement
     * ii. if-else statement
     * iii. if-else-if statement
     */

    public static void main(String[] args) {
        // i. if statement
        // specifies that a statement (or block of code) will be executed if and only if a certain boolean statement is true.

        // syntax
       //if (boolean_expression statement);


       // or

       // if (boolean_expression){
       // statement1;
       // statement2;
       //}

       // where;
        // -> boolean_expression is either a boolean expression or boolean variable.


        // Example:
        int grade = 68;

        // Print congratulations if grade is greater than 60
        if (grade > 60)
            System.out.println("Congratulations!!!!");

        if (grade > 60){
            System.out.println("Congratulations!!!!");
        }

        // print "congratulations" if grade is greater than 60 and also print "you passed!!"


        if (grade > 60)
            System.out.println("Congratulations!!!!!!");
            System.out.println("You Passed!!!!");

        System.out.println("============================================================================================");

        // ii. if-else statement
        // used when we want to execute a certain statement if a condition is true and a different statement if the condition is false.

        // syntax
        // if (boolean_expression){
        // statement1;
        // statement2
        // } else {
        // statement3;
        // statement4;
        // }

        if (grade > 60) {
            System.out.println("Congrats!!!");
        }else {
            System.out.println("Sorry You Failed!");
        }

        System.out.println("==============================================================================================");


        // iii. if-else-if-else statement
        // The statement in the else clause of an if-else block can be another if-else structures
        // This cascading of structures allows us to make more complex selections
        // used to execute multiple courses of action

        // syntax

        // if (condition1) {
        // statement will execute if condition1 is true
        // }else if (condition2){
        // statement will execute if condition1 is false and condition2 is true
        // }else if (condition3){
        // statement will execute if condition1 and condition2 are false and condition3 is true
        // } else {
        // will execute if all conditions are false
        // }

        // Example:

        // print "Excellent" if grade is greater than 90, "Very Good" if it is greater than 60, otherwise "Sorry You Failed"

        if (grade > 90){
            System.out.println("Excellent!!!");
        } else if (grade > 60) {
            System.out.println("Very Good");
        }else {
            System.out.println("Sorry You Failed");
        }
    }
}
