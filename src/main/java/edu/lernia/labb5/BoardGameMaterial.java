package edu.lernia.labb5;

import java.util.Scanner;

public class BoardGameMaterial {
    /* Will be used to store all boardgamematerials in one class */	
		
	public static Dice[] dice;
	private static boolean yatzi = true;
	private static boolean bGameIsOn = true;
	
	public static void Start() {
		dice = new Dice[5];
		for(int i = 0; i < 5; i++) {
	           dice[i] = new Dice();
	        }
	}
	
	public static boolean ifYatzi(Dice[] dice) {
		for (int j = 1; j < 5; j++) {
            if(dice[j].value != dice[j-1].value) {
                //Set flag to false
                yatzi = false;
            }
        }
        if(yatzi == true) {
            System.out.println("You got YATZI! in " + dice[0].value + "'s");
            return yatzi;
	}
		return yatzi;
	}
	
	public static void rollDice() {
		 while(bGameIsOn == true) {
	         int turn = 0;
	         System.out.println("Welcome to Yatzi!");   
	        while(turn < 3) {
	             System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice.");
	                for(int i = 0; i < dice.length; i++) {
	                    dice[i].DiceRoll();
	                    //dice[i].value = 5; //Test if yatzi work
	                    System.out.println(i + ": " + dice[i].getString());
	                }
	                
	             
	                
	                if(turn != 2) {
                        System.out.println("Want to throw again? (y for yes, anything else for no)");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            turn++;
                        } else {
                            bGameIsOn = !bGameIsOn;
                            break;
                        }
                        
                    } else {
                        System.out.println("Game over! Want to play again?");
                        Scanner sc2 = new Scanner(System.in);
                        if(sc2.next().equals("y")) {
                            turn = 0;
                        } else {
                            bGameIsOn = !bGameIsOn;
                            break;
	}
                       
                    
	
		 }
		//return yatzi;
		
	}
	
	
 }
	//	return bGameIsOn;
}
	
};


