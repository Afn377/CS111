
public class EgyptianPyramid {
    
    public static void main(String[] args) {
    
    int size = Integer.parseInt(args[0]);
    int bricks = Integer.parseInt(args[1]);
	char[][] arr = new char[size][size];
    int front = 0;
    int back = arr.length-1;
    for(int i = size - 1; i > -1; i--){
        for(int j = 0; j < size; j++){
            if(j < front || j > back || bricks == 0)
                arr[i][j] = '=';
            else{
                arr[i][j] = 'X';
                bricks -= 1;
            }
        }
        front += 1;
        back -= 1;
    }

    for(int k = 0; k < size; k++){
        for(int l = 0; l < size; l++){
            System.out.print(arr[k][l]);
        }
        System.out.println("");
    }
    System.out.print(bricks + " Bricks Remaining");
    }
}
