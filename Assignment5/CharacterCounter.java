public class CharacterCounter {

    public static void main(String[] args) {
		StdIn.setFile(args[0]);
		StdOut.setFile(args[1]);
		int[] arr = new int[128];
		int count =  0;
		for(int i = 0; i < arr.length; i++){
			arr[i] = 0;
		}
		while(StdIn.hasNextChar()){
			arr[(int)StdIn.readChar()]++;
			count ++;
		}
		for(int i = 32; i < 127; i++){
			StdOut.println((char)i+","+i+","+arr[i]+","+((double)arr[i]/count * 100));
		}
    }
}
