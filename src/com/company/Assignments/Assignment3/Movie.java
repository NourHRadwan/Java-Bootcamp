package com.company.Assignments.Assignment3;

public class Movie {

    //Fields
    private String title;  //representing the title of the movie
    private String studio; //representing the studio that made the movie
    private String rating; //representing the rating of the movie

    // a) Constructor
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    // b) Constructor with rating PG
    public Movie(String title, String studio) {
        this(title, studio, "PG");
    }

    // c) method getPG
    public static Movie[] getPG(Movie[] Movies) {
        int count = 0;
        for (Movie movie : Movies) {
            if (movie.rating.equals("PG")) {
                count++;
            }
        }

        Movie[] pgMovies = new Movie[count];

        int pgIndex = 0;
        for (Movie movie : Movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[pgIndex] = movie;
                pgIndex++;
            }
        }

        return pgMovies;
    }

    public void printFormat() {
        System.out.println("\nTitle: " + this.title + ", Studio: " + this.studio + ", Rating: " + this.rating);
    }

    public static void main(String[] args) {

        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        casinoRoyale.printFormat();

        Movie movie1 = new Movie("Movie 1", "Studio A");
        Movie movie2 = new Movie("Movie 2", "Studio D", "PG");
        Movie movie3 = new Movie("Movie 3", "Studio A", "PG");
        Movie movie4 = new Movie("Movie 4", "Studio F", "PG13");


        Movie[] movies = {movie1, movie2, movie3, movie4};
        Movie[] pgMovies = getPG(movies);

        for (Movie movie : pgMovies) {
            movie.printFormat();
        }


    }

}
