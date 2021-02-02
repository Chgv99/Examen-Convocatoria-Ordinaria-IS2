package presenter;

import java.util.ArrayList;
import model.Movie;

public class RateIterator implements Iterator {
    
    ArrayList<Movie> movies;
    int position = 0;

    public RateIterator(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    
    public boolean hasNext(){
        if (position >= movies.size()){
            return false;
        } else {
            return true;
        }
    }
    
    public Object next(){
        //movie = movies[position]
        return null;
    }
}
