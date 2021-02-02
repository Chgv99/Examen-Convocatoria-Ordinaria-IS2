package model;

import java.util.Date;

public class Movie {
    
    private String genre;
    private Date releaseDate;
    private int views;
    private int rate;
    
    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getRate() {
        return rate;
    }

    public int getViews() {
        return views;
    }
}
