package ExceptionHandling;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

    }
    public String toString(){
        return "Student{"+
                "Id="+id +
                ", name= "+ name+'\''+'}';
    }
}
