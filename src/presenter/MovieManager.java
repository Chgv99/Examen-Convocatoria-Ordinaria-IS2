package presenter;

import model.Catalog;
import model.Movie;

class MovieManager {
    Catalog catalog;

    public MovieManager(Catalog catalog) {
        this.catalog = catalog;
    }
    
    public void printCatalog(String criteria){
        Iterator iterator = null;
        if (criteria.equals("release")){
            iterator = catalog.createReleaseIterator();
        } else if (criteria.equals("view")){
            iterator = catalog.createRateIterator();
        } else if (criteria.equals("rate")){
            iterator = catalog.createViewIterator();
        }
        print(iterator);
    }
    
    public void printCatalog(String criteria, String genre){
        Iterator iterator = null;
        if (criteria.equals("genre")){
            iterator = catalog.createGenreIterator(genre);
        }
        print(iterator);
    }
    
    private void print(Iterator it){
        while(it.hasNext()) {
            Movie movie = (Movie) it.next();
            if (movie != null) System.out.println(movie.getTitle() +  ", " + movie.getGenre() + ", " + movie.getRate() +  ", " + movie.getViews() + ", ");
        }
    }
}
