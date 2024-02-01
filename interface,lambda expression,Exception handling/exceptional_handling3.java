public class exceptional_handling3 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        int value[] = { 4, 7, 2, 9 };
        String name = null;

        try {
            result = num1 / name.length();
            result = num1 / num2;
            System.out.println(value[5]);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("enter limit value ");
        } catch (Exception e) {
            System.out.println("something  went wrong ");
        }

        System.out.println(result);

        System.out.println("task done");
    }
}
