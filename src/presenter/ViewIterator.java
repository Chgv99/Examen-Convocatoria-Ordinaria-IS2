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
        return false;
    }
    
    public Object next(){
        return null;
    }
}
