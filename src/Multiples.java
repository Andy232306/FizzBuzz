public class Multiples {

    public static int main(int n, int a, int b) {
        int sum = 0;
        if (a == b) {
            for (int i = 1; i < n; i++) {
                if (i % a == 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = 1; i < n; i++) {
                if (i % a == 0 || i % b == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static int main() {
        return main(1000, 3, 5);
    }

    public static void main(String[] args) {
        System.out.println(main()); // Expected output for n=1000, a=3, b=5
    }
}
