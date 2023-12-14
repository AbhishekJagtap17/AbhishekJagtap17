package StringHanding;
import java.util.*;

//Convert String to double
public class Demo04 {
    public static void main(String[] args) {
        String str1="25";
        String str2="535.2";

        //Convert String to double by using  parseDouble
        Integer number1=Integer.parseInt(str1);
        double number2=Double.parseDouble(str2);


        System.out.println(number1);
        System.out.println(number2);

    }
}
