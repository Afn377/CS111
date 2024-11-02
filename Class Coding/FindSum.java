public class FindSum{


    public static int FindSum(int[] A, int n){
        if(A.length == n)
            return 0;
        else
            return A[n] + FindSum(A, n+1);
    }


    public static void main(String args[]){
        int[] A = {2, 43, 4, 6};
        System.out.println(FindSum(A, 0));

    }

    
}

