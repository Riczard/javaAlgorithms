package com.codecool.tinkerTailor;

import java.util.ArrayList;
import java.util.List;

/*
"Tinker, Tailor, Soldier, Sailor, Rich Man, Poor Man, Beggar Man, Thief!"

This is an old English children's rhyme for counting out one of the players. Let's make this rhyme abstract!

It is a K-long sequence of syllables after all, and play this game repeatedly: N children stand in a circle, and they count from 1 to K starting from Player #1. This time Player #K gets excluded. They continue counting from the next player, #(K+1), and after each round one player leaves the circle. After N-1 rounds there will be one player standing, who wins the game.

The outcome of this game for N and K is the sequence of the excluded numbers. For example, in case of N = 5, K = 3 the solution is [3, 1, 5, 2, 4]. In a more verbose form:

starting from 1 --> [1 2 3 4 5] --> 3 is out --> starting from 4 --> [1 2 4 5] --> 1 is out --> starting from 2 --> [ 2 4 5] --> 5 is out --> starting from 2 --> [ 2 4 ] --> 2 is out --> [4] wins
 */

public class Tinker {

    private int counting;
    private List<Player> playerList;

    public Tinker(int numberOfPlayers, int counting) {
        this.counting = counting;
        playerList = createPlayers(numberOfPlayers);
    }

    public int getWiner(){
        int playerIndex = 0;
        while (playerList.size() > 1){

            if(playerIndex > playerList.size() - 1){
                playerIndex = 0;
            }

            playerIndex +=counting -1; //because we count myself
            while (playerIndex > playerList.size() - 1) {
                playerIndex = playerIndex - (playerList.size() - 1) - 1;
            }
            playerList.remove(playerIndex);
        }
        return playerList.get(0).getPlayerName();
    }

    private List<Player> createPlayers(int numbersOfPlayers) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 1; i <= numbersOfPlayers; i++) {
            players.add(new Player(i));
        }
        return players;
    }

}
