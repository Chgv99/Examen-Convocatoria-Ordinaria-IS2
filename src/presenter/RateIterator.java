package presenter;

import java.util.ArrayList;
import model.Movie;

public class RateIterator {
    
    ArrayList<Movie> movies;
    int position = 0;

    public RateIterator(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    
    public boolean hasNext(){
        return false;
    }
    
    public Object next(){
        return null;
    }
}
