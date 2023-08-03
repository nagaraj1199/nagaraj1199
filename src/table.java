
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
public class table 
{
    int a,i,m;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        i=1;
        while(i<=a)
        {
            m=(2*2)*i;
            System.out.println(m);
            i++;
        }
    }
    public static void main(String arg[])
    {
        table s2=new table();
        s2.get();
    }
}
