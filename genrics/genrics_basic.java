class Boxes <T>{
    T value;
    Boxes(T value){
        this.value=value;
    }
    T get(){
        return  value;
    }
}
public class genrics_basic {
    public static void main(String[] args) {
        Boxes <Integer> integerBoxes =new Boxes<>(12);
        System.out.println(integerBoxes.get());
    }
}
