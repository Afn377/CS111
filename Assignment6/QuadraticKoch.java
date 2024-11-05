/*************************************************************************
 * Compilation: javac QuadraticKoch.java
 * Execution: java QuadraticKoch n
 *
 * @author Jeremy Hui
 *
 *************************************************************************/
import java.awt.Color;
public class QuadraticKoch {

    /**
     * Gets the set of coordinates to draw one segment of the Quadratic Koch Curve.
     * Returns the coordinates in a 2D array of doubles in the following format:
     * {array of x-coordinates,
     * array of y-coordinates}
     * 
     * @param x0 the x-coordinate of one endpoint
     * @param y0 the y-coordinate of one endpoint
     * @param x5 the x-coordinate of the other endpoint
     * @param y5 the y-coordinate of the other endpoint
     * @return the set of coordinates to draw one segment of the Quadratic Koch
     *         Curve
     */
    public static double[][] getCoords(double x0, double y0, double x5, double y5) {
        // WRITE YOUR CODE HERE
        if(x5 == x0){
            double d = y5-y0;
            double[][] coords = {
                {x0, x0, x0-d/3, x0-d/3, x0, x5},
                {y0, y0+d/3, y0+d/3, y0+2*d/3, y0+2*d/3, y5},
            };
            return coords;
        }
        else{
            double d = x5-x0;
            double[][] coords = {
                {x0, x0+d/3, x0+d/3, x0+2*d/3, x0+2*d/3, x5},
                {y0, y0, y0+d/3, y0+d/3, y0, y5},
            };
            
            return coords;
        }
        
    }

    /**
     * Gets the set of coordinates from getCoords() to draw the snowflake,
     * and calls Koch on two adjacent array indices with n being one less.
     * The method draws a line between the two endpoints if n == 0.
     * 
     * @param x0 the x-coordinate of one endpoint
     * @param y0 the y-coordinate of one endpoint
     * @param x5 the x-coordinate of the other endpoint
     * @param y5 the y-coordinate of the other endpoint
     * @param n  The current order
     */
    public static void koch(double x0, double y0, double x5, double y5, int n) {
        StdDraw.setPenColor(Color.BLACK);
        if (n == 0) {
            StdDraw.line(x0, y0, x5, y5);
            return;
        }
        double[][] coords = getCoords(x0, y0, x5, y5);
    
        koch(x0, y0, coords[0][1], coords[1][1], n - 1);  // First segment
        koch(coords[0][1], coords[1][1], coords[0][2], coords[1][2], n - 1);  // Second segment (spike up)
        koch(coords[0][2], coords[1][2], coords[0][3], coords[1][3], n - 1);  // Third segment (spike down)
        koch(coords[0][3], coords[1][3], coords[0][4], coords[1][4], n - 1);  // Fourth segment
        koch(coords[0][4], coords[1][4], x5, y5, n - 1);  // Last segment to (x5, y5)
        return;

    }
    

    /**
     * Takes an integer command-line argument n,
     * and draws a Quadratic Koch Curve of order n in a 1 x 1 canvas
     * with an initial square side length of 0.5.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE
        StdDraw.setCanvasSize(800, 800);
        int n = Integer.parseInt(args[0]);
        koch(0.25, 0.25, 0.25, 0.75, n);
        koch(0.25, 0.75, 0.75, 0.75, n);
        koch(0.75, 0.75, 0.75, 0.25, n);
        koch(0.75, 0.25, 0.25, 0.25, n);

    }
}