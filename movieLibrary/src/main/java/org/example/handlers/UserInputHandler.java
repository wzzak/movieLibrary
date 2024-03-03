package org.example.handlers;

import org.example.models.Actor;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scan = new Scanner (System.in);
    private static int getIntigerFromUser() {
        while (!scan.hasNext()) {
            scan.nextLine();
            System.out.println("To nie jest poprawna wartosc, wpisz ponownie.");
        }
        return scan.nextInt();
    }
    private static int getSelectedOptionFromUser(){

        int result=getIntigerFromUser();
        scan.nextLine();
        if (result >0 && result < MenuOptions.values().length +1){
            return result;
        }
        else {
            System.out.println("Wybrales nieistniejaca opcje, wpisz ponownie");
            return getSelectedOptionFromUser();
        }
    }
    public static MenuOptions getMenuOptions(){
        return MenuOptions.values()[getSelectedOptionFromUser()-1];

    }

    public static Actor getActorFromUser() {
        System.out.println("Type an actor: ");
        String[] actors = scan.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);
    }

}
