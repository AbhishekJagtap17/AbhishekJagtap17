package FileHandling;

import java.io.Serializable;

public class Student implements Serializable {
    int rollNumber;
    String Name;
    transient  String address;

    public Student(int rollNumber, String name, String address) {
        this.rollNumber = rollNumber;
        Name = name;
        this.address = address;
    }

    public Student() {
    }
    public String toString() {
        return "Student {" +
                "rollNumber=" + rollNumber +
                ", name " + Name +
                ", Address " + address + '\'' +
                '}';
    }

}
