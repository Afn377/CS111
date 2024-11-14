public class TestInput{
    public static void main(String[] args){
        int[] a = StdIn.readAllInts();
        int count = 0;
        for (int elt = 0; elt < a.length; elt++){
            if (a[elt] == count){
                StdOut.print(elt + " ");
            }
            count++;
        }
        StdOut.println(count + " ");
    }
}