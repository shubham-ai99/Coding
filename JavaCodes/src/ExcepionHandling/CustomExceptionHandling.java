package ExcepionHandling;

public class CustomExceptionHandling {
    public static void validateAge(int age) throws CustomExceptionHandlingInterface {
        if (age < 18) {
            throw new CustomExceptionHandlingInterface("Age must be 18 or above.");
        }
        System.out.println(age + " : Age is valid.");
    }

    public static void main(String[] args) {
        try {
            validateAge(90);
        } catch (CustomExceptionHandlingInterface e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

