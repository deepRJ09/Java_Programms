import java.util.Scanner;

public class Factorial_of_a_number {
    static int factorial_1(int n) {
        int stored = 1;
        for (int i = 2; i <= n; i++) {
            stored *= i;
        }
        return stored;
    }

    static int factorial_2(int n) {
        int stored = 1;
        for (int i = 33; i <= n; i++) {
            stored *= i;
        }
        return stored;
    }
    static int factorial_3(int n){
        int stored=1;
        for (int i=63; i<=n;i++){
            stored*=i;
        }
        return stored;
    }
    static  int factorial_4(int n){
        int stored=1;
        for (int i=93;i<=n;i++){
            stored*=i;
        }
    return stored;
    }
    static  int factorial_5(int n){
        int stored=1;
        for (int i=123;i<=n;i++){
            stored*=i;
        }
        return stored;
    }
    static  int factorial_6(int n){
        int stored=1;
        for (int i=150;i<=n;i++){
            stored*=i;
        }
        return stored;
    }
    static  int factorial_7(int n){
        int stored=1;
        for (int i=180;i<=n;i++){
            stored*=i;
        }
        return stored;
    }
    static  int factorial_8(int n){
        int stored=1;
        for (int i=209;i<=n;i++){
            stored*=i;
        }
        return stored;
    }
    static  int factorial_9(int n){
        int stored=1;
        for (int i=240;i<=n;i++){
            stored*=i;
        }
        return stored;
    }
    static  int factorial_10(int n){
        int stored=1;
        for (int i=260;i<=n;i++){
            stored*=i;
        }
        return stored;
    }
    static  int factorial_11(int n){
        int stored=1;
        for (int i=290;i<=n;i++){
            stored*=i;
        }
        return stored;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("===================================================");
        if (n <=33) {
            System.out.println(factorial_1(n)+ " its a factorial of " +n);


        } else if (n<=63){
            System.out.println(factorial_2(n)+ " its a factorial of " +n);
        }
        else if (n<=93){
            System.out.println(factorial_3(n)+ " its a factorial of " +n);
        }
        else if (n<=123){
            System.out.println(factorial_4(n)+ " its a factorial of " +n);
        }
        else if (n<=150){
            System.out.println(factorial_5(n)+ " its a factorial of " +n);
        }
        else if (n<=180){
            System.out.println(factorial_6(n)+ " its a factorial of " +n);
        }
        else if (n<=209){
            System.out.println(factorial_7(n)+ " its a factorial of " +n);
        }
        else if (n<=240){
            System.out.println(factorial_8(n)+ " its a factorial of " +n);
        }
        else if (n<=260){
            System.out.println(factorial_9(n)+ " its a factorial of " +n);
        }
        else if (n<=290){
            System.out.println(factorial_10(n)+ " its a factorial of " +n);
        }
        else if (n<=300){
            System.out.println(factorial_11(n)+ " its a factorial of " +n);
        }
else {
            System.out.println("The limit is close!");
        }
        System.out.println("===================================================");
    }
}