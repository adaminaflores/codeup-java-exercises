package movies;

import util.Input;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println();
        System.out.println("Enter your choice: ");
        System.out.println();

        Input in = new Input();
        String userInput = in.getString();

        if (userInput.equals("0")) {
            System.out.println("Bye!");
        } else if (userInput.equals("1")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                System.out.println(pMovie.getName() + "-------" + pMovie.getCategory());
            }
            repeat();
        } else if (userInput.equals("2")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                if (pMovie.getCategory().equals("animated")) {
                    System.out.println(pMovie.getName() + "-------" + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userInput.equals("3")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                if (pMovie.getCategory().equals("drama")) {
                    System.out.println(pMovie.getName() + "-------" + pMovie.getCategory());


                } else {
                    continue;
                }

            }

        } else if (userInput.equals("4")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                if (pMovie.getCategory().equals("horror")) {
                    System.out.println(pMovie.getName() + "-------" + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userInput.equals("5")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                if (pMovie.getCategory().equals("scifi")) {
                    System.out.println(pMovie.getName() + "-------" + pMovie.getCategory());
                } else {
                    continue;
                }
            }
        repeat();
        }
    }

    private static void repeat(){
        System.out.println("----------");
        System.out.println("NAVIGATION");
        System.out.println("0-exit 1-all 2-animated 3-drama 4-horror 5-scifi");

        System.out.println("Enter your choice: ");
        Input in = new Input();
        String userInput = in.getString();

        if (userInput.equals("0")) {
            System.out.println("Bye!");
        } else if (userInput.equals("1")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
            }
            repeat();
        } else if (userInput.equals("2")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                if(pMovie.getCategory().equals("animated")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                }else{
                    continue;
                }
            }
            repeat();
        }else if (userInput.equals("3")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                if (pMovie.getCategory().equals("drama")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userInput.equals("4")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                if (pMovie.getCategory().equals("horror")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        } else if (userInput.equals("5")) {
            Movie[] movieList = findAll();
            for (Movie pMovie : movieList) {
                if (pMovie.getCategory().equals("scifi")) {
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                } else {
                    continue;
                }
            }
            repeat();
        }

    }
}



        }
}