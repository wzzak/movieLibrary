package org.example.handlers;

public enum MenuOptions {
    DISPLAYINFORMATIONABOUTRANOOMMOVIE(1),
        DISPLAYALLMOVIESFORACTOR(2),
            QUIT(3);
    int action;
    MenuOptions (int action){
        this.action=action;
    }
}
