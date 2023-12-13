package ClassObjectAssignment;

public class Employee {
   String name;
   String address;
   int yearOfJoining;
   int salary;
   void setemployeeDetails(String n,String a,int y,int sal){
       name=n;
       address=a;
       yearOfJoining=y;
       salary=sal;
   }
   void printEmployeeDetails(){
       System.out.println(name+"\t"+address+"\t"+yearOfJoining+"\t"+salary);
   }

    public static void main(String[] args) {
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();

        emp1.setemployeeDetails("Sam","Pune",2020,25000);
        emp2.setemployeeDetails("John","nigdi",2021,28000);
        emp3.setemployeeDetails("robert","mumbai",2023,20000);

        emp1.printEmployeeDetails();

        emp2.printEmployeeDetails();

        emp3.printEmployeeDetails();
    }
}

