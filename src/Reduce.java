public class Reduce {
    public static void main(String[] args) {
        int i = 0;
        int g = 100;
        while (g > 0) {
            i++;
            boolean even = g % 2 == 0;
            if (even) {
                g = (g / 2);
            } else {
                g--;
            }
        }
        System.out.println(i);

        System.out.println(9);
    }
}
