package movies;

import util.Input;

import java.util.Objects;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        displayMovies(input.getInt(0, 5,
            """
            What would you like to do?
    
            0 - exit
            1 - view all movies
            2 - view movies in the animated category
            3 - view movies in the drama category
            4 - view movies in the horror category
            5 - view movies in the scifi category
    
            Enter your choice:\s"""
        ));
    }
    public static void displayMovies(int userChoice) {
        while(true) {
            if(userChoice == 0) {
                System.exit(0);
            } else if(userChoice == 1) {
                for(Movie movie : findAll()) {
                    System.out.println(movie);
                }
            } else if(userChoice == 2) {
                for (Movie movie : findAll()) {
                    if (Objects.equals(movie.getCategory(), "animated")) {
                        System.out.println(movie);
                    }
                }
            } else if(userChoice == 3) {
                for (Movie movie : findAll()) {
                    if (Objects.equals(movie.getCategory(), "drama")) {
                        System.out.println(movie);
                    }
                }
            } else if(userChoice == 4) {
                for (Movie movie : findAll()) {
                    if (Objects.equals(movie.getCategory(), "horror")) {
                        System.out.println(movie);
                    }
                }
            } else if(userChoice == 5) {
                for (Movie movie : findAll()) {
                    if (Objects.equals(movie.getCategory(), "scifi")) {
                        System.out.println(movie);
                    }
                }
            }
            Input input = new Input();
            displayMovies(input.getInt(0, 5,
                    """
                    What would you like to do?
            
                    0 - exit
                    1 - view all movies
                    2 - view movies in the animated category
                    3 - view movies in the drama category
                    4 - view movies in the horror category
                    5 - view movies in the scifi category
            
                    Enter your choice:\s"""
            ));
        }
    }
}
