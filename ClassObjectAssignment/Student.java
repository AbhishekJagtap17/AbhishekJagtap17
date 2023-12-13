package ClassObjectAssignment;


public class Student {
       String name;
       int roll_No;
       String address;
      int phoneNumber;

    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="John";
        student1.roll_No=25;
        student1.address="Nigdi";
        student1.phoneNumber=92156;

        Student student2=new Student();
        student2.name="Sam";
        student2.roll_No=20;
        student2.address="Puna";
        student2.phoneNumber=32452;

        System.out.println(student1.name+"\t"+student1.roll_No+"\t"+student1.address+"\t"+student1.phoneNumber);

        System.out.println(student2.name+"\t"+student2.roll_No+"\t"+student2.address+"\t"+student2.phoneNumber);
    }
}
