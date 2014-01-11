/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rnd;

import java.util.Random;

/**
 *
 * @author akshay
 */
public class test {
    //variable declaration
    private String girlName;
    
    //constructor
    public test(String name){
        girlName = name;
    }
    
    //method declarations
    public void setName(String name){
        girlName = name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first gf was %s",getName());
    }
    public void random() {
        Random i = new Random();
        int num = i.nextInt(50);
        System.out.println("Random Number: "+num );
    }
 
}
