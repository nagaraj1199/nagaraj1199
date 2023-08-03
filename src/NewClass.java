
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Raja
 */
class mango
{
    int mango;
    void m()
    {
        System.out.println("Enter the mango");
        Scanner s1=new Scanner(System.in);
        mango=s1.nextInt();
    }
}
class apple extends mango
{
    int apples;
    void a()
    {
        m();
        System.out.println("Enter the apple");
        Scanner s1=new Scanner(System.in);
        apples=s1.nextInt();
    }

}
public class NewClass extends apple
{
    int total;
    void c()
    {
    a();
    
    total=mango+apples;
    System.out.println("total="+total);
    }
    public static void main(String arg[])
    {
        NewClass s2=new NewClass();
        s2.c();
    }}
