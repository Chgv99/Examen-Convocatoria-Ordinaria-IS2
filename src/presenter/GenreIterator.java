package presenter;

import java.util.ArrayList;
import model.Movie;

public class GenreIterator implements Iterator {
    
    ArrayList<Movie> movies;
    int position = 0;
    String genre;

    public GenreIterator(ArrayList<Movie> movies, String genre) {
        this.movies = movies;
        this.genre = genre;
    }
    
    public boolean hasNext(){
        if (position >= movies.size()){
            return false;
        } else {
            return true;
        }
    }
    
    public Object next(){
        Movie nextMovieOfGenre;
        System.out.println(movies.get(position).getGenre() + ", " + genre);
        if (movies.get(position).getGenre().equals(genre)){
            nextMovieOfGenre = movies.get(position);
        } else {
            nextMovieOfGenre = null;
        }
        position = position + 1;
        return nextMovieOfGenre;
    }
}
