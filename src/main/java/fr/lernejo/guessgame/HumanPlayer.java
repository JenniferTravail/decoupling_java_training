package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{
    private Logger log = LoggerFactory.getLogger("player");
    @Override
    public long askNextGuess() {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        sc.nextLine();
        return number;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater == true){
            log.log("Rentrer un nombre plus petit");
        }
        else{
            log.log("Rentrer un nombre plus grand");
        }
    }
}