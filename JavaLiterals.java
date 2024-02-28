public class JavaLiterals {
    public static void main(String[] args) {
        /**
         * Java Literals
         * There are different types of literals
         *  i. Integer Literals
         *  ii. Floating-point Literals
         *  iii. Boolean Literals
         *  iv. Character Literals
         *  v. String Literals
         */

        // 1. Integer Literals
        // They come in different formats
        // -> decimal (base 10)
        // it doesn't have a special notation e.g. 12
        System.out.println("Example of a decimal literal is: " + 12);

        // -> hexadecimal (base 16)
        // preceded by 0x or 0X e.g. 0XC
        System.out.println("Example of a Hexadecimal literal is: " + 0XC);

        // -> octal (base 8)
        // preceded by 0 e.g. 014
        System.out.println("Example of a octal literal is: " + 015);

        // 2. Floating-point Literals
        // Represents decimals with fractional parts e.g. 3.1416
        // can be expressed in standard or scientific notation
        // e.g. 583.45 (standard) or 5.8345e2
        System.out.println("Example of a Standard Float literal is: " + 583.45);
        System.out.println("Example of a Scientific Float literal is: " + 5.8345e2);

        // 3. Boolean Literals
        // They have only two values, true or false
        System.out.println("Example of Boolean Literal is: true and false");

        // 4. Character Literals
        // represents single unicode characters
        // A unicode character replaces the 8-bit ASCII set.
        // Unicode allows the inclusion of symbols and special characters
        // from other languages
        // To use a character literal, enclose the character in single quote.
        // e.g. letter a is represented as 'a'
        System.out.println('a');

        System.out.println("This is a paragraph with \n a new line or line break");

        // 5. String Literals
        // represents multiple characters and are enclosed by double quotes
        //example: "Hello World"
        System.out.println("Hello World!!!!!!");


    }
}
