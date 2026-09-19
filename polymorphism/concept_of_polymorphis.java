import java.util.Scanner;

class Polymorphism{
    Polymorphism(){}

    public void Polymorphism(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public void Polymorphism(float a, float b) {
        float c = a + b;
        System.out.println(c);
    }
    public void Polymorphism(long a, float b) {
        float c = a + b;
        System.out.println(c);
    }

}
class Polymorphism_2 extends Polymorphism {

}

    public class concept_of_polymorphis {
        public static void main(String[] args) {
            Polymorphism_2 p = new Polymorphism_2();
p.Polymorphism(20,25F);
            }

        }


