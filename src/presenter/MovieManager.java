package presenter;

import model.Catalog;

class MovieManager {
    Catalog catalog;

    public MovieManager(Catalog catalog) {
        this.catalog = catalog;
    }
    
    public void printCatalog(){
        Iterator rateIterator = catalog.createIterator();
    }
    
    public void printCatalog(String criteria){
        Iterator iterator;
        if (criteria.equals("genre")){
            iterator = catalog.createIterator();
        }   
    }
    
}
