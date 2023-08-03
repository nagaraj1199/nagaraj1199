
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
public class pyramid 
{
    int i,j,row;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        row=s1.nextInt();
        for(i=row;i>=1;i--)
        {
            for(j=i;j<row;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    
    public static void main(String arg[])
    {
        pyramid s2=new pyramid();
        s2.get();
    }
}
