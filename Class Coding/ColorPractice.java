import java.awt.Color;

public class ColorPractice{
    public static void main(String[] args){
        Color c1 = new Color(200, 0, 0);
        StdDraw.setPenColor(c1);
        StdDraw.filledCircle(0.5, 0.5, 0.3); 

        Color c2 = new Color(156, 23, 147);
        StdDraw.setPenColor(c2);
        StdDraw.filledCircle(0.5, 0.5, 0.2);

        Color c3 = c1.brighter();
        StdDraw.setPenColor(c3);
        StdDraw.filledCircle(0.5, 0.5, 0.1);

        c1 = c3;

        System.out.println(c3.getRed());
        System.out.println(c3.getGreen());
        System.out.println(c3.getBlue());
        System.out.println(c1.equals(c3));
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c3.toString());

    }
}