package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User();

        int sumInt = user.add(5,10);
        System.out.println("The sumInt is: " + sumInt);
        double sumDouble = user.add (5.2,3.6);
        System.out.println("The sumDouble is: " + sumDouble);

        int differenceInt = user.subtract(5,1);
        System.out.println("The differenceInt is: " + differenceInt);
        double differenceDouble = user.subtract(5.5,1.3);
        System.out.println("The differenceDouble is: " + differenceDouble);

        int productInt = user.multiplication(5,10);
        System.out.println("The productInt is: " + productInt);
        double productDouble = user.multiplication(5.1,10.1);
        System.out.println("The productDouble is: " + productDouble);

        int quotientInt = user.divide(50,10);
        System.out.println("The quotientInt is: " + quotientInt);
        double quotientDouble = user.divide(50.0,10.0);
        System.out.println("The quotientDouble is: " + quotientDouble);

        int remainderInt = user.modulo(5,3);
        System.out.println("The remainderInt is: " + remainderInt);
        double remainderDouble = user.modulo(5.0,3.0);
        System.out.println("The remainderDouble is: " + remainderDouble);

        int result1Int = user.calculate1(2,5,3);
        System.out.println("The result of the operation is: " + result1Int);
        double result1Double = user.calculate1(3.2,5,3);
        System.out.println("The result of the operation is: " + result1Double);

        int result2Int = user.calculate2(10,5,3);
        System.out.println("The result of the operation is: " + result2Int);
        double result2Double = user.calculate2(10,5,3.5);
        System.out.println("The result of the operation is: " + result2Double);
    }

}


