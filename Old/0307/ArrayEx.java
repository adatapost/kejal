package com.avd.model;

public class ArrayEx
{
  public static void main(String []args)
   {

        int [][]array= new int[3][6];
            
         
         for(int []ar : array)
          {
             for(int n : ar) 
              {
                 System.out.print("  " + n);
               }
              System.out.println();
            }
    }
} 