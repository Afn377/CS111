public class BunnyEars{


    public static int BunnyEars(int n){
        if(n == 0)
            return 0;
        else if(n % 2 == 0)
            return 3 + BunnyEars(n-1);
        else
            return 2 + BunnyEars(n-1);
    }


    public static void main(String args[]){
        System.out.println(BunnyEars(2));

    }

    
}