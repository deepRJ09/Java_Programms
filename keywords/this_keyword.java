class this_keywords{
    String name;
    int age;
    this_keywords(String key_1,int key_2){
        this.name=key_1;
        this.age=key_2;
    }
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}
public class this_keyword {
    public static void main(String[] args) {
        this_keywords key_1= new this_keywords("Deepanshu",22);
        this_keywords key_2=new this_keywords("Aditya",20);
        this_keywords key_3=new this_keywords("raj",27);
        key_1.display();
    }
}
