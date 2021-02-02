package presenter;

import java.util.ArrayList;
import model.Movie;

public class ReleaseIterator implements Iterator {
    
    ArrayList<Movie> movies;
    int position = 0;

    public ReleaseIterator(ArrayList<Movie> movies) {
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
        return null;
    }
}
