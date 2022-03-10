package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        logger.log("Veuillez donner un nombre");
        long number = player.askNextGuess();
        if (number == this.numberToGuess){
            return true;
        }
        else{
            player.respond(number > this.numberToGuess);
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
      while (true){
          if (nextRound() == true)
              break;
      }
    }
}