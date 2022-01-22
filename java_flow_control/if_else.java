public class if_else {

    public static void main(String[] args) {

        int number = 10;

        // Java if (if-then) Statement

        // checks if number is less than 0
        if (number < 0) {
            System.out.println("The number is negative.");
        }

        System.out.println("Statement outside if block");
        //
        //
        //
        //
        // Java if with String
        String language = "Java";

        // if statement
        if (language == "Java") {
            System.out.println("Best Programming Language");
        }

        //
        //
        //
        //

        // if-then-else
        //
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // execute this block
        // if number is not greater than 0
        else {
            System.out.println("The number is not positive.");
        }

        System.out.println("Statement outside if...else block");
        //
        //
        //
        // if...else...if Statement

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }

        // if both condition is false
        else {
            System.out.println("The number is 0.");

        }
    }

}
