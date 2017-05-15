/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokereecs55;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class PokerEECS55 {

    public static void main(String[] args) {
        do {
            Deck dec = new Deck();
            Card[] choices = new Card[52];
            for (int i = 0; i < 52; i++) {
                choices[i] = dec.DealCard();
            }

            //user selects players first card
            Card Hand1 = (Card) JOptionPane.showInputDialog(null, "Choose",
                    "PlayerCard 1", JOptionPane.QUESTION_MESSAGE, null,
                    choices, // Array of choices
                    choices[0]); // Initial choice
            choices = removecard(Hand1, choices);

            Card Hand2 = (Card) JOptionPane.showInputDialog(null, "Choose",
                    "PlayerCard 2", JOptionPane.QUESTION_MESSAGE, null,
                    choices, // Array of choices
                    choices[0]); // Initial choice           
            choices = removecard(Hand2, choices);

            Card Board1 = (Card) JOptionPane.showInputDialog(null, "Choose",
                    "Board 1", JOptionPane.QUESTION_MESSAGE, null,
                    choices, // Array of choices
                    choices[0]); // Initial choice             
            choices = removecard(Board1, choices);

            Card Board2 = (Card) JOptionPane.showInputDialog(null, "Choose",
                    "Board 2", JOptionPane.QUESTION_MESSAGE, null,
                    choices, // Array of choices
                    choices[0]); // Initial choice             
            choices = removecard(Board2, choices);

            Card Board3 = (Card) JOptionPane.showInputDialog(null, "Choose",
                    "Board 3", JOptionPane.QUESTION_MESSAGE, null,
                    choices, // Array of choices
                    choices[0]); // Initial choice
            choices = removecard(Board3, choices);

            Card Board4 = (Card) JOptionPane.showInputDialog(null, "Choose",
                    "Board 4", JOptionPane.QUESTION_MESSAGE, null,
                    choices, // Array of choices
                    choices[0]); // Initial choice
            choices = removecard(Board4, choices);

            JOptionPane.showMessageDialog(null, "The probability that your hand will win with the next card is: " + ComputeProbability(Hand1, Hand2, Board1, Board2, Board3, Board4, choices));

        } while (JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Do you want to play again?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }

    private static Card[] removecard(Card c, Card[] list) {
        Card[] temp = new Card[list.length - 1];
        boolean isSkipped = false;
        for (int i = 0; i < list.length - 1; i++) {
            if (isSkipped || c.equals(list[i])) {
                isSkipped = true;
                temp[i] = list[i + 1];
            } else {
                temp[i] = list[i];
            }
        }
        return temp;
    }

    private static double ComputeProbability(Card Hand1, Card Hand2, Card Board1, Card Board2, Card Board3, Card Board4, Card[] choices) {
        //test
        return 0;
    }

}
