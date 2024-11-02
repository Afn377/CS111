
/*************************************************************************
 *  Compilation:  javac FloorIsLava.java
 *  Execution:    java FloorIsLava n
 *
 *  @author Shane Haughton, Maaz Mansuri
 *
 **************************************************************************/

public class FloorIsLava {

    public static void main (String[] args ) {

        int n = Integer.parseInt(args[0]);
        

        int count = 2;
        while(count <= n){
            System.out.print(count + " ");
            count = count + 2;
        }

        if(n % 2 == 0){
            count = n - 1;
        } else{
            count = n;
        }

        while(count > 0){
            System.out.print(count + " ");
            count = count - 2;
        }

    }
}
