
/*************************************************************************
 *  Compilation:  javac Elevator.java
 *  Execution:    java Elevator 'number of floors' 'floor requests' 'number of restricted floors' 'optional passcode'
 *
 *  @author Pooja Kedia
 *  @author Vidushi Jindal
 *
 *************************************************************************/
public class Elevator {
    
    public static void main ( String[] args ) {

	int n = Integer.parseInt(args[0]);
    int floor_reqs = Integer.parseInt(args[1]);
    int n_res_floors = Integer.parseInt(args[2]);
    
    int e1 = 1;
    int e2 = 1;

    while(floor_reqs > 0){
        int floor = floor_reqs % 10;
        floor_reqs = floor_reqs / 10;
        
        if(Math.abs(floor-e1) > Math.abs(floor-e2)){
            System.out.println(2 + " " + floor);
            e2 = floor;
        }else{
            System.out.println(1 + " " + floor);
            e1 = floor;
        }

        if(floor > n - n_res_floors){
            int passcode = Integer.parseInt(args[3]);
            if(passcode % n == floor || (passcode % n == 0 && floor == n)){
                System.out.println("Granted");
            }else{
                System.out.println("Denied");
            }
        }
    }
    
    }
}