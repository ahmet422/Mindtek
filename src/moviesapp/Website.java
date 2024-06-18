package moviesapp;

import arraylist3.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Website {
    public static void main(String[] args) {

        // Scanner :
        // keep showing menu until user exits
        // Search by:
        // 1 Genre
        // 2 Director
        // 3 Year
        // 4 For children
        // 5 Exit

        // 1 -> which genre? - Drama : Movies found with given genre: print movies
        // 2 -> which director? - Nolan : Movies found with given dir: print movies
        // 3
        // 4 - > Movies for children : print movies
        // 5 -> Thanks for using Movies app

      //  for(Movie m : Database.provide()) System.out.println(m);
//      List<Movie> movies = searchByGenre("action");
//        List<Movie> movies = searchByDirector("a");
        List<Movie> movies = searchByYears(2000,2015);


      print(movies);
    }

    private static List<Movie> searchByYears(int year1, int year2) {
        return null;
    }

    private static List<Movie> searchByDirector(String name) {
        List<Movie> list = new ArrayList<>();
        for(Movie m: Database.provide()) if(name.length() >= 3 && m.getDirector().contains(name)) list.add(m);
        return list;
    }

    private static void print(List<Movie> movies) {
        int num = 1;
        for (Movie m : movies){
            System.out.println(num + ") " + m);
            num++;
        }
   //     movies.forEach(movie -> System.out.println(movie));
    }

    private static List<Movie> searchByGenre(String genre) {
//        ArrayList<Movie> list = new ArrayList<>();
//        for(Movie m : Database.provide()) if(m.getGenre().equalsIgnoreCase(genre)) list.add(m);
//        return list;
        return Database.provide().stream()
                .filter(m -> m.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }
}
