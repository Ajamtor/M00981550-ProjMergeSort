public class Main {
    public static void main(String[] args) {
        if (Tester.testSort()) {
            System.out.println("Test successful! The months are sorted correctly.");
        } else {
            System.out.println("Test unsuccessful. The months are not sorted correctly.");
        }
    }
}

// The main part of this code is "public static void", and I used "public" so it can be
// accessed from anywehre, "static" to say the method belongs to the class itself, and "void"
// to specify the method does not return a value.
// The method then takes arrays in the form of a string, and calls on the "testSort" method
// which is a boolean, and satisfies the "if" condition. If the boolean has returned true,
// it will print a successful message, and if it returns false, it will execute the "else"
// block part of the code. 