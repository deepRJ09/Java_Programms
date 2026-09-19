public class first_last_int {
    public static void main(String[] args) {
        int input = 123456;
        int first = input;
        int last =input % 10;
        while (first >= 10) {
            first /= 10;
        }
        int middle = (input% 100000) / 10;
        int result = last * 100000 + middle * 10 + first;
        System.out.println(result);
    }
}
