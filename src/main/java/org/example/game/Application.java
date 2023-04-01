package org.example.game;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        System.out.println("Добро пожаловать! Выберете тип игры: \n 1 - Цифры \n 2 - буквы EN \n 3 - Буквы RU");
        Scanner in=new Scanner(System.in);
        System.out.println("Введите номер ниже: ");
        int num=in.nextInt();
        Game game = null;
        switch (num){
            case 1:game=new NumberGame();
                break;
            case 2:game=new WordGame();
                break;
            case 3:game=new WordRussianGame();
                break;
            default:
                System.out.println("такой игры еще не существует");
        }
        game.start(5,5);
        while(game.getGameStatus().equals(GameStatus.START)){
            System.out.println("Ваш ход");
            String answer=in.next().toUpperCase();
            Answer answerGame=game.inputAnswer(answer);
            System.out.println(String.format("Найдено %d коров и %d быков",answerGame.getCows(),answerGame.getBulls()));
        }
        System.out.println(game.getGameStatus());
        System.out.println("Нужна информация о ходах?");
        String answer2 = in.next().toLowerCase();

    }
}
