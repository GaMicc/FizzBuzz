public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;

        while (j < 1000){
            boolean divisibleBya = j % 3 == 0;
            boolean divisibleByb = j % 5 == 0;
            if (divisibleBya) {
                i++;
            } else if (divisibleByb) {
                i++;
            }
            j++;
        }
        System.out.println(i);
        System.out.println(466);
    }
}
