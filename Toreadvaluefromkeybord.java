/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.toreadvaluefromkeybord;

/**
 *
 * @author hirki
 */
import java.util.Scanner;
public class Toreadvaluefromkeybord {

int sum(int x, int y)
{
    x=3;
    y=7;
return x+y;
}
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] x= new int [5];
        
//        for(int i=0; i<5; i++){
//        
//            System.out.println("Enter the value of: "+(i+1)+ " Element ");
//            
//            x[i]=sc.nextInt();
//        
//        }
        
//        System.out.println("You Entered the following Elements ");
//       for(int i=0; i<5; i++){
//        
//            System.out.println(" "+x[i]);    
//        }
       
       Toreadvaluefromkeybord add = new Toreadvaluefromkeybord();
       
               System.out.println(add.sum(6,8));

    }
    }


