/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing_game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mobholar yhousouph Olatunji
 */
public class Guessing_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to my program  environment Game!");
        
        System.out.println("please may i know your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Greatings to you " + name);
        
        System.out.println("Shall we begin the Game ?");
        System.out.println("\t1 is Yes");
        System.out.println("\t2 is No");
        
        int typeReslt = input.nextInt();
        
        while(typeReslt != 1){
            System.out.println("Shall we start the Game ?");
            System.out.println("\t1 is Yes");
            System.out.println("\t2 is No");
            
            typeReslt = input.nextInt();
        }
        
        Random randomNumber = new Random();
        int number = randomNumber.nextInt( 20 ) +1;
        System.out.println("please guess a Number of your choice: ");
        int userInput = input.nextInt();
        
        int numOfTried = 0;
        boolean hasWon = false;
        boolean hasFinish = false;
        //Iteration for result
        
        while(!hasFinish){
            numOfTried++;
            
            if(numOfTried < 5){
                
                if(userInput == number){
                    hasWon = true;
                    hasFinish = true;
                }else if(userInput > number){
                    System.out.println("Guess a lower number");
                    userInput = input.nextInt();
                }else {
                    System.out.println("Guess a higher Number");
                    userInput = input.nextInt();
                }
            }else {
                        hasFinish = true;
                        }
        }
                if (hasWon){
                System.out.println("Congratulation! you have guessed right in your " + numOfTried + " Time(s) guessed");
            }else{
        System.out.println("Game Over!");
        System.out.println("The number was: "+ number);
        }
    }
    
}
