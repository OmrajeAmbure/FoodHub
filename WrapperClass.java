public class WrapperClass {
    // in java wrapper class use to proof the java 100% oop's language . Wrapper classes in Java are used to convert primitive data types into objects
    // Wrapper classes in Java provide a way to use primitive data types (int, char, etc.) as objects.
    // by using wrapper class we crate the variable without using datatype

    public static void main(String[] args) {
        String num1 = "87999";
        System.out.println(num1);

        int num2 = Integer.parseInt(num1);
        System.out.println(num2);

        float num3 = Float.parseFloat(num1);
        System.out.println(num3);

        String str = new String(num1);
        System.out.println(str);
    }
}
