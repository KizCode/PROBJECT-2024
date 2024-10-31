import java.util.ArrayList;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");

        try {
            System.out.println("Outer try block starts");
            try {
                System.out.println("Inner try block starts");
                // Attempting to access an index out of bounds
                System.out.println(list.get(5)); // This will throw IndexOutOfBoundsException
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Inner catch: IndexOutOfBoundsException caught");
                throw new CustomException("Error accessing ArrayList element");
            } finally {
                System.out.println("Inner finally block executed");
            }
        } catch (CustomException e) {
            System.out.println("Outer catch: CustomException caught - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Outer catch: Generic Exception caught");
        } finally {
            System.out.println("Outer finally block executed");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
