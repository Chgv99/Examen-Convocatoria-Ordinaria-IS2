package presenter;

import java.util.ArrayList;
import model.Movie;

public class ViewIterator implements Iterator {
    
    ArrayList<Movie> movies;
    int position = 0;

    public ViewIterator(ArrayList<Movie> movies) {
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
