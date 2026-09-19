public class Domain_and_extension {
    public static void main(String[] args) {
        String Domain_Extension="chanting.free.je";
        String Splits="[.]";
        String []Splits_2=Domain_Extension.split(Splits);
        System.out.println("Domain Name: "+Splits_2[0]+"\nExtension: "+Splits_2[1]+"."+Splits_2[2]);
    }
}
