/*
 * Write the Palindrome program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac Palindrome.java
 * To execute:
 *        java Palindrome 5 4 6 6 4 5
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */

public class Palindrome {
    public static void main(String[] args) {
       
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        int i3 = Integer.parseInt(args[2]);
        int i4 = Integer.parseInt(args[3]);
        int i5 = Integer.parseInt(args[4]);
        int i6 = Integer.parseInt(args[5]);
        System.out.println((i1 == i6 && i2 == i5 && i3 == i4));
    }
}
