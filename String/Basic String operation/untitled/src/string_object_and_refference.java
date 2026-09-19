public class string_object_and_refference {
    public static void main(String[] args) {
     Student student= new Student();
     student.name="Deepanshu";
     student.address="Chadametta";
     student.standard=12;
     student.rollNumber=5;
        System.out.println(student.name);
    }
}
class Student{
    String name;
    String address;
    int standard;
    int rollNumber;

}
