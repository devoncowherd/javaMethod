package javaMethod;

public class Methods 
{

    //static method that belongs to the class and cannot be overridden but they can be overloaded
    public static int multiply(int a,int b)
    {
        int c = a*b;
        return c;
    }

    //overloading now

    public static int multiply(String c, String d)
    {
        int e = Integer.parseInt(c) * Integer.parseInt(d);
        return e;
    };

    public static int multiply(double g, double h)
    {
        int i = (int)(Math.round(g)) * (int)(Math.round(h)); 
        return i;
    }

    public static void main(String[] args)
    {
        int a = 16;
        int b = 32;
        
        //int input
        int c = multiply(a,b);

        //String input
        int d = multiply("5","10");

        //double input

        double f = 32.55; 
        double g = 1.34;

        int z = multiply(f,g);
        
        //print
        System.out.println(c);
        System.out.println(d);
        System.out.println(z);
        System.out.println("\t The above integers are a result of overloading the same multiply() method that takes two variables!");
    }
    
}