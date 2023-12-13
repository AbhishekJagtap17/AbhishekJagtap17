package operatorAssignment;

public class Operator14 {
    public static void main(String[] args) {
        int num=5696;
        int lastDigt=num%10;//6
        num/=10;                             //569
        int thirdDigit=num%10;//9
        num/=10;                          //56
        int secondDigit=num%10;//6
        num/=10;                            //5
        int firstDigit=num%10;   //5
        int newNum=num+2;              //7
        int newFirstDigit=newNum;      //7
        int newSecondDigit=(secondDigit+2);
        newNum=newNum*10+newSecondDigit;  //78
        int newThirdDigit=(thirdDigit+2)/10; //1
        newNum=newNum*10+newThirdDigit;    //781
        int newLastDigit=(lastDigt+2);    //8
        newNum=(newNum*10)+newLastDigit;   //7818
        System.out.println(newNum);
    }
}
