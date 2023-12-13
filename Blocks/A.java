package Blocks;

public class A {
        int a,b;
    static int c;
        A(){
            a=70;b=80;
            System.out.println("Constructor :"+a+" "+b);
        }
    void show(){                                                 //Method with no return type.
        a=10;b=20;
        System.out.println("Show method "+a+" "+b);
    }
    {
        a=30;b=40;c=100;                                          //We access instance as well as static variable inside the instance block.
        System.out.println("Instance block 2 "+a+" "+b);
    }
    {
        a=50;b=60;                                    // Block without any name called instance block
        System.out.println("Instance Block");           //Body inside the instance block
    }
    static {
        System.out.println("Static Block 1 :"+c);      //compiler gives default value of c and we don't need to create object for execution of static block.
    }                                                   //It can be executed at the time between compiling and loading .class file
    static {
        c=100;                                        //WE Access only static variable in static block.
        System.out.println("static Block 2: "+c);       //we already assign value c=100;then op is 100.
    }

    public static void main(String[] args) {
        A a=new A();   //Calling block directly by creating Object. and also call to default constructor .
        a.show();       //Calling show method with reference Name.
    }
}
