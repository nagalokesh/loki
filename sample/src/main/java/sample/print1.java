package sample;

import java.util.Scanner;

public class print1 {

    public static void main(String args[])
    {
    	System.out.println("enter the count values");
    	Scanner s1=new Scanner(System.in);
    	int n=s1.nextInt();
    int a[]=new int[n];
    System.out.println("enter the values");
    for(int i=0;i<n;i++)
    {
    	a[i]=s1.nextInt();
    }
        int k=0;
        for (int i=n-1;i>=0;i--)
        {
       	System.out.println(a[i]);
       
        	if(i==(n/2))
        	{
        		break;
        	}
        	else
        	{		
        			System.out.println(a[k]);
        			 k++;
        			
        	}
        	
        }

        }
}
