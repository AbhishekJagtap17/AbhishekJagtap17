package ExceptionHandling;

public class Demo24ClassCastException {
    public static void main(String[] args) {
        Product product=new Product();
        Student student=new Student(0,null);
        display(product);
    }
    public static void display(Object object){
        Student student=(Student) object;
        System.out.println(student);
    }
}
class Product{
    int id;
    String Name;
    int price;

}
