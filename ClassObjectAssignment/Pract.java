package ClassObjectAssignment;

import java.util.Scanner;

public class Pract {
    String name;
    int yearJoining;
    int salary;
    int address;
    void setName( String n,int y,int sal,int a){
        name=n;
        yearJoining=y;
        salary=sal;
        address=a;
    }
    void printOutput(){
        System.out.println(name+"\t"+yearJoining+"\t"+salary+"\t"+address);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pract pract=new Pract();
        pract.setName("Robert",1994,20000,2020);

        Pract pract2=new Pract();
        pract2.setName("sam",2022,10320,2010);


        Pract pract3=new Pract();
        pract3.setName("king",2012,40000,2210);

        pract.printOutput();
        pract2.printOutput();
        pract3.printOutput();

    }
}
