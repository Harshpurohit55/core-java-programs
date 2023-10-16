

    class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}

public class custexcep {
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 0 || age > 120) {
            throw new AgeValidationException("Age must be between 0 and 120.");
        }
    }

    public static void main(String[] args) {
        try {
            int age = 20; 
            validateAge(age);
            System.out.println("Age is valid.");
        } catch (AgeValidationException e) {
            System.out.println("Age validation failed: " + e.getMessage());
        }
    }
}
