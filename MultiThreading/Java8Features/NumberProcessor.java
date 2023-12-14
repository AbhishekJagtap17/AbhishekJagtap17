package MultiThreading.Java8Features;

@FunctionalInterface
public interface NumberProcessor {
    int process(int number);

    public static void main(String[] args) {
        NumberProcessor demo=new Demo();
        System.out.println(demo.process(100));

        NumberProcessor Anno=new Demo(){
            @Override
            public int process(int number) {
                System.out.println("Anonymous class");
          return number*number;
            }
        };
        System.out.println(Anno.process(100));

        NumberProcessor lambda=(number -> number*number);
        System.out.println("By lambda expression : "+lambda.process(100));
    }
}
class  Demo implements NumberProcessor{
    @Override
    public int process(int number) {
        return number*number;
    }
}