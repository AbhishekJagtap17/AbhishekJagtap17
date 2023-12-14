package ExceptionHandling;

public class Demo20InvalidAgeException extends Exception{
    public Demo20InvalidAgeException(){

    }
    public Demo20InvalidAgeException(String message){
        super(message);
    }
}
