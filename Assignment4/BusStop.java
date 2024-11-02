/*
 * Write your program inside the main method to find the order
 * which the bus the student needs to take will arrive
 * according to the assignemnt description. 
 *
 * To compile:
 *        javac BusStop.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class BusStop {

    public static void main(String[] args) {

        int length = args.length;
        char[] arr = new char[length-1];
        char c = args[length-1].charAt(0);
        int index = -1;
        for(int i = 0; i < args.length-1; i++){
            arr[i] = args[i].charAt(0);
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == c){
                index = i+1;
                break;
            }
        }
        System.out.println(index);
    }
}
