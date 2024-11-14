public class GravitationalForce{
    public static void main(String[] args) {
        double m1 = Double.parseDouble(args[0]);
        double m2 = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        double F = 6.6743e-11 * (m1*m2) / (r*r);
        System.out.println(F);
    }
}