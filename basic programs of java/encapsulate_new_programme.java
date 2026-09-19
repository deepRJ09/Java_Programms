public class encapsulate_new_programme {
    private  int x=20;
    public void setX(int x){
        this.x+=x+2;
    }
    public int getX(){
        return x;
    }
    public static void main(String[] args) {
        encapsulate_new_programme ep=new encapsulate_new_programme();
        ep.setX(2);
        System.out.println(ep.getX());
    }
}
