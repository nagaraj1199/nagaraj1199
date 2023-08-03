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
public class add 
{
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    int c[][]=new int[2][2];
    int i,j;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("value");
        for(i=0;i<2;i++)
        for(j=0;j<2;j++)
        a[i][j]=s1.nextInt();
        for(i=0;i<2;i++)
        for(j=0;j<2;j++)
        b[i][j]=s1.nextInt();
        System.out.println("view");
        System.out.println("matrix a");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("matrix b");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("\t"+b[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("mat a+b");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print("\t"+c[i][j]);
            }
            System.out.print( "\n");
        }}
    public static void main(String arg[])
    {
        add s2=new add();
        s2.get();
    }
    
}
