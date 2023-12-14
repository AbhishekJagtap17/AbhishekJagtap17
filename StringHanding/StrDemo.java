package StringHanding;

public class StrDemo {
    public static void main(String[] args) {
       String s1=new String("Deepak");
        String s2=new String("Deepak");
        String s3="Deepak";
        String s4="Deepak";
        System.out.println(s1.equals(s3));    //True
        System.out.println(s1.equals(s2));      //True
        System.out.println(s1==s2);         //False
        System.out.println(s2==s3);        //False
        System.out.println(s1==s3);     //False
        System.out.println(s3==s4);    //true

//        String s1=new String("Abhi");
//        System.out.println(s1.concat(" Jagtap"));
//
//        System.out.println(s1.concat( " Rajendra Jagtap"));
//
//        System.out.println(s1);
    }
}
