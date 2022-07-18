package br.com.mateus.ClassesUtilitárias.Wrappers;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Float floatJ = 7F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

       int i = intW.hashCode(); // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("false");
        System.out.println(Float.compare(floatW, floatJ)+"Compare float");
        System.out.println(Character.charCount(charW)+" charCount");
        System.out.println(Character.isDigit('A')+" A IsDigit?");
        System.out.println(Character.isDigit('9')+" 9 IsDigit?");
        System.out.println(Character.isLetterOrDigit('!')+" ! isLetterOrDigit?");
        System.out.println(Character.isUpperCase('!')+" ! isUpperCase?");
        System.out.println(Character.isLowerCase('!')+" ! isLowerCase?");
        System.out.println(Character.toUpperCase('m')+" m toUpperCase");
        System.out.println(Character.toLowerCase('M')+" M toLowerCase");
        System.out.println(Character.isAlphabetic('8')+" 8 isAlphabetic?");
    }
}
