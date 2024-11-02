public class FruitCosts {

    public static void main(String[] args) {
        StdIn.setFile(args[0]);

        int num = StdIn.readInt();
        String name, name1, name2;
        double lowest1, lowest2, price;
        name1 = StdIn.readString();
        name2 = "";
        lowest1 = StdIn.readDouble();
        lowest2 = -1;
        for(int i = 1; i < num; i++){
            name = StdIn.readString();
            price = StdIn.readDouble();
            temp = 0;
            if(lowest1 > price){
                lowest2 = lowest1;
                lowest1 = price;
                name2 = name1;
                name1 = name;
            } else if (lowest1 == price || lowest2 > price){
                lowest2 = price;
                name2 = name;
            }
        }
        if(lowest1 <= lowest2){
            StdOut.println(name1 + " " + lowest1);
            StdOut.println(name2 + " " + lowest2);    
        } else{
            StdOut.println(name2 + " " + lowest2);
            StdOut.println(name1 + " " + lowest1);
        }
        StdOut.println("Total " + String.format("%.2f", (lowest1 + lowest2)));
    }
}
