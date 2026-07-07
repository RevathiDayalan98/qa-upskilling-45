public class TypeConversion {
    public static void main(String[] args) {
        //Automatic Type Promotion in Expressions (Java)
        //byte->short/char-> int-> long-> float-> double -- converts to highest primitive type if it involves expressions
        byte b=78;
        char c= 'b';
        short s= 125;
        int i= 8598;
        float f= 12.54f;
        double d= 4.45897;
        double result = (f*b) + (i+b) + (d*s);
        System.out.println((f*b)+ " "+ (i+b) + " " + (d*s));
        System.out.println(result);
    }
}
