package presenter;

import model.Catalog;

/**
 *
 * @author Christian García Viguera
 */
public class main {
    
    public static void main(String[] args) {
        Catalog catalogo = new Catalog();
        
        MovieManager manager = new MovieManager(catalogo);
        manager.printCatalog("genre", "Terror");
    }
    
}
