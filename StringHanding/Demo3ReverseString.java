package StringHanding;

public class Demo3ReverseString {
    public static void main(String[] args) {
        String str="Welcome to IT shaala";
        char[]chars=str.toCharArray();
        int left=0;
        int right= chars.length-1;

        while(left<=right){
            char ch=chars[left];
            chars[left]=chars[right];
            chars[right]=ch;
            left++;
            right--;
        }
        for(int index=0;index< chars.length;index++){
            System.out.print(chars[index]);
        }

        AnotherWay a=new AnotherWay();
        a.revString();
    }
}

class AnotherWay{
    String str2="Abhishek Jagtap";
    String str3="";
    public void revString(){
        for(int i=str2.length()-1;i>=0;i--){
            str3=str3+str2.charAt(i);
        }

        System.out.println(str3);
     //   return str3;
    }
}