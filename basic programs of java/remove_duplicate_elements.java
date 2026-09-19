public class remove_duplicate_elements {
    public static void main(String[] args) {
        String input="Deepanshu Bharadwaj";
        String s=input;
        String s1="";
        System.out.println("input: "+input);
        System.out.println("=====================================");
  for (int i=0;i<s.length();i++){
      int count=0;
      for (int j=0;j<s.length();j++){
          if (s.charAt(i)==s.charAt(j)){
              count++;
          }
      }
  if (count==1){
      s1+=s.charAt(i);
  }
  }
        System.out.println("ouput: "+s1);
    }

}
