package ExceptionCode;

public class TestThrow1 {
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("invalid age");
        }else{
            System.out.println("welcome to vote");
        }
    }
    public static void main(String args[]){
        validate(20);
        System.out.println("rest of the code");
    }
}
