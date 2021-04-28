/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner; 
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
        
        Scanner console = new Scanner (System.in);
        System.out.println ("Hello, what is your name?") ;
        String name = console.nextLine();
        System.out.println ("what is your age?") ;
        Scanner two = new Scanner(System.in);
        int age = two.nextInt();
        System.out.println (" your name is "+ name + " and you are "+age) ;
        
        
        
        
        
        
        
    }
    
}
