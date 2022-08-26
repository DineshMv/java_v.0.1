package com.myJava.OOP2.Polymorphism;

//polymorphism is a method or mechanism in OOP that allows actions
// to act differently based on actual object that the action is being performed on!
class Movie {
    private String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public String plot() {
        return "No Plot here!";
    }

    public String getMovieName() {
        return movieName;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");

    }

    @Override
    public String plot() {
        return "Aliens attempt to takeover planet";
    }
}

class mazeRunner extends Movie {
    public mazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape from maze!";
    }
}

class starWars extends Movie {
    public starWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over universe!";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
    //No plot method
}

//Automatically inherits from other class and got methods and overrides the method.
// Unique functionality for class that has inherited from base class

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #"+ i + ":"+ movie.getMovieName() + "\n"+
                    "Plot: "+ movie.plot()+"\n");
        }
    }


    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new mazeRunner();
            case 4:
                return new starWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}

