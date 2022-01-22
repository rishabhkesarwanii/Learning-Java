public class operator {

    public static void main(String[] args) {
        // Java Arithmetic Operators

        // declare variables
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));

        // Java Assignment Operators

        // create variables
        int var;

        // assign value using =
        var = a;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += a;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= a;
        System.out.println("var using *=: " + var);

        // Java Relational Operators

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);

        // operator !=
        System.out.println(a != b);

        // > operator
        System.out.println(a > b);

        // < operator
        System.out.println(a < b);

        // >= operator
        System.out.println(a >= b);

        // <= operator
        System.out.println(a <= b);

        // Java Logical Operators

        // && operator
        System.out.println((5 > 3) && (8 > 5)); // true
        System.out.println((5 > 3) && (8 < 5)); // false

        // || operator
        System.out.println((5 < 3) || (8 > 5)); // true
        System.out.println((5 > 3) || (8 < 5)); // true
        System.out.println((5 < 3) || (8 < 5)); // false

        // operator !
        System.out.println(!(5 == 3)); // true
        System.out.println(!(5 > 3)); // false

        // Java Unary Operators

        // original value

        int result1, result2;
        System.out.println("Value of a: " + a);

        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + b);

        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);

        // Java Ternary Operator

        int februaryDays = 29;
        String result;

        // ternary operator
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);

        System.out.println("End");

    }
}
