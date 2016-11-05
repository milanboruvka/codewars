public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {

        int n = 0;

        if (h < window) {
            return -1;
        }

        if (bounce < 0 || bounce >= 1) {
            return -1;
        }


        while (h > window) {
            System.out.println("h = " + h);
            h = h * bounce;
            n++;
            if (h > window) {
                n++;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int n = bouncingBall(3, 0.66, 1.5);
        System.out.println("n = " + n);

        n = bouncingBall(3, 1, 1.5);
        System.out.println("n = " + n);

    }
}