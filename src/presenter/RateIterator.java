package presenter;

import java.util.ArrayList;
import model.Movie;

public class RateIterator implements Iterator {
    
    ArrayList<Movie> movies;
    int position = 0;
    
    int max = 0;
    int max_pos = -1;
    
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
        ArrayList<Movie> new_movies = (ArrayList)movies.clone();
        for (Movie movie : new_movies) {
            if (movie.getRate() >= max){
                max_pos = new_movies.indexOf(movie);
            }
        }
        return max_pos;
    }
}
