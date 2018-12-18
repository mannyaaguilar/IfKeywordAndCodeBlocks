package com.manny;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        }else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        }else{
//            System.out.println("Got here!");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //int savedFinalScore = finalScore;
        //Once the above section of code has finished processing Java will automatically
        // delete any variables created inside that code block
        //i.e., Can't access variables outside of the code block created in the code block
        //You can, however, access variables outside of the code block to use inside of the code block
        //The concept of variables inside a code block is called "scope".

        //Challenge
        // 1. Print out a second score on the screen with the following:
        // 2. score set to 10000
        // 3. levelCompleted set to 8
        // 4. bonus set to 200
        // But, make sure the first printout above still displays as well
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (newGameOver) {
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}

