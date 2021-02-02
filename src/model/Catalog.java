package model;

import java.util.ArrayList;
import java.util.Date;
import presenter.GenreIterator;
import presenter.RateIterator;
import presenter.ReleaseIterator;
import presenter.ViewIterator;
import presenter.Iterator;

public class Catalog {
    
    ArrayList<Movie> movies;
    
    public Catalog() {
        movies = new ArrayList<>();
        
        addItem("El Planeta del Tesoro", "Aventuras", new Date(99, 8, 22), 3216, 4.7f);
        addItem("Saw", "Terror", new Date(96, 12, 1), 45091, 4.9f);
        addItem("Saw 2", "Terror", new Date(100, 3, 3), 50431, 3.9f);
        addItem("Buscando a Nemo", "Infantil", new Date(101, 5, 13), 10100, 4.8f);
    }
    
    public void addItem(String title, String genre, Date releaseDate, int views, float rate){
        Movie newMovie = new Movie(title, genre, releaseDate, views, rate);
        movies.add(newMovie);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
    
    public Iterator createGenreIterator(String genre) {
        return new GenreIterator(movies, genre);
    }
    
    public Iterator createReleaseIterator() {
        return new ReleaseIterator(movies);
    }
    
    public Iterator createViewIterator() {
        return new ViewIterator(movies);
    }
    
    public Iterator createRateIterator() {
        return new RateIterator(movies);
    }
}
