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

        int sum = user.add(5,10);
        System.out.println("The sum is: " + sum);

        double difference = user.subtract(5.5,1.3);
        System.out.println("The difference is: " + difference);

        int product = user.multiplication(5,10);
        System.out.println("The product is: " + product);

        int quotient = user.divide(50,10);
        System.out.println("The quotient is: " + quotient);

        int remainder = user.modulo(5,3);
        System.out.println("The remainder is: " + remainder);

        int result1 = user.calculate1(2,5,3);
        System.out.println("The result of the operation is: " + result1);

        int result2 = user.calculate2(10,5,3);
        System.out.println("The result of the operation is: " + result2);

    }



}


