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
        for(Dice dice1: dice) {
            dice1.value = 6;
        }
        dice[5].value = 1;
        //Assert something?
    }
}
