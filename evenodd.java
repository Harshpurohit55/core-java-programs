public class evenodd {
    
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        String result1 = checkOddEven(num1);
        String result2 = checkOddEven(num2);
        String result3 = checkOddEven(num3);

        System.out.println(num1 + " is " + result1 + ".");
        System.out.println(num2 + " is " + result2 + ".");
        System.out.println(num3 + " is " + result3 + ".");
    }
}
