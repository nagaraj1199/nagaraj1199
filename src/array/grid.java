/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Raja
 */
public class grid 
{
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    int i,j,c;
    void get()
    {
        System.out.println("enter the value");
        Scanner s1=new Scanner(System.in);
        for(i=0;i<2;i++)
        for(j=0;j<2;j++)
        a[i][j]=s1.nextInt();
        
        
         System.out.println("veiw");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
            System.out.print("\n");
        }
        c=a[0][0];
        for(i=0;i<2;i++)
        for(j=0;j<2;j++)
        {if(c>a[i][j])
        {
            c=a[i][j];
            b[i][j]=c;
        }}
         for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+b[i][j]);
            }
            System.out.print("\n");
        }
        
    }
    public static void main(String arg[])
    {
        grid s2=new grid();
        s2.get();
    }
    
}
