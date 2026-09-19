public class fisrt_to_last_to_fisrt_int {
    public static void main(String[] args) {
        int a = 123456;
        int temp = a;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        if (digits <= 1) {
            System.out.println(a);
            return;
        }
        int power = 1;
        for (int i = 1; i <= digits - 1; i++) {
            power *= 10;
        }
        int first = a / power;
        int last = a % 10;
        int middle = (a / 10) % (power / 10);

        int result = last * power + middle * 10 + first;

        System.out.println(result);
    }
}
