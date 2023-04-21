package exceptionsTryCatch;

public class Main {
    public static void main(String[] args) {

        int a = 10;

        try {
            System.out.println(5 / 0);
            if (a == 10) {
                throw new OurException("a equals 10, You sinner!");

            }

        } catch (OurException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }



        try {
            System.out.println("Everything before the instruction that give exception is triggered");
            System.out.println(5/0);
            System.out.println("Everything after the instruction that give exception is NOT triggered");
        } catch (ArithmeticException e) {
            System.out.println("Exception occured: " + e.getMessage());
        } finally {
            System.out.println("Always is trigerred");
        }

    }



}

// Our own exception
class OurException extends Exception {
    public OurException(String string){
        super(string);
    }
}