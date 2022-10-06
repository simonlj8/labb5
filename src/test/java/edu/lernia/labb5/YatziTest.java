package edu.lernia.labb5;

import org.junit.jupiter.api.Test;
import edu.lernia.labb5.Dice;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
	
	
    @Test
    void isYatziWhenAllDiceMatches() {
    	 Dice[] dice = new Dice[5];
         for(int i = 0; i < 5; i++) {
             dice[i] = new Dice();
         }
         //Assert something?
         assertEquals(true, BoardGameMaterial.ifYatzi(dice));
    }
    @Test
    void isNotYatziWhenOneDiceIsNotMatchingTheOther() {
        Dice[] dice = new Dice[5];
        for(int i = 0; i < 5; i++) {
            dice[i] = new Dice();        
            dice[i].value = 6;
        }
       
        //Assert something?
        dice[1].value = 1;

        boolean yatzi = true;
        
        for(int j = 1; j < 5; j++) {
        	if(dice[j].value != dice[j-1].value) {
        		yatzi = false;
        		break;
        	}
        }
	    
	    
        assertEquals(yatzi, false );
        
    }
}
