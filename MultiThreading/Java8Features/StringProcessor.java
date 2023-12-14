package MultiThreading.Java8Features;

@FunctionalInterface
public interface StringProcessor {
   public  String process(String str);


    public static void main(String[] args) {
        StringProcessor Anony=new StringProcessor() {
            @Override
            public String process(String str) {
                return str.toUpperCase();
            }
        };
        System.out.println(Anony.process("welcome to Anonymous"));

        //Lambda Expression:
        StringProcessor lambda=(str)->str.toUpperCase();
        System.out.println(lambda.process("welcome to lambda"));

        StringProcessor removeSpace=(str)->str.trim();
        System.out.println(removeSpace.process("         welcome to lambda.     "));
    }
}
