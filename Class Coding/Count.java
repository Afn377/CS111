public class Count{


    public static int Count(int[] A, int n){
        if(n == A.length)
            return 0;
        else if(A[n] == 11)
            return 1 + Count(A, n+1);
        else
            return Count(A, n+1);
    }


    public static void main(String args[]){
        int[] A = {2, 43, 4, 6, 11, 11, 11, 11};
        System.out.println(Count(A, 0));

    }

    
}

