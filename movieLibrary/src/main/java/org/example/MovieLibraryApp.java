package org.example;

import org.example.handlers.MenuHandler;
import org.example.handlers.UserInputHandler;
import org.example.models.MovieLibrary;

public class MovieLibraryApp {
    public static void main(String[] args) {
        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();
        MenuHandler.print();
        while(true){

        switch(UserInputHandler.getMenuOptions()){
            case DISPLAYINFORMATIONABOUTRANOOMMOVIE:
              movieLibrary.getRandomMovieInformation();
                break;
            case DISPLAYALLMOVIESFORACTOR :
                movieLibrary.getFilmsForActor();
                break;
            case QUIT:
                System.out.println("Wychodzenie");
                System.exit(1);

        }
         }
    }
}