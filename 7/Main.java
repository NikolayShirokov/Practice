package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    static GameDrunker game = new GameDrunker();
    static ArrayDeque<Integer> player1 = new ArrayDeque<Integer>(5);
    static ArrayDeque<Integer> player2 = new ArrayDeque<Integer>(5);
    static int card1 = 0;
    static int card2 = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Player 1 cards: ");
        game.inputData(player1, s);
        game.outputData(player1);
        System.out.print("Player 2 cards: ");
        game.inputData(player2, s);
        game.outputData(player2);
        while (true) {
            if (game.getRun() > 106) {
                System.out.println("Botva");
                break;
            }
            if (player1.size() == 0 || player2.size() == 0) {
                if (player1.size() == 0) {
                    System.out.println("Player 2 win!");
                    System.out.println(game.getRun());
                }
                else if (player2.size() == 0) {
                    System.out.println("Player 1 win!");
                    System.out.println(game.getRun());
                }
                break;
            }
            game.checkCards(player1, player2, card1, card2);
        }
    }
}
