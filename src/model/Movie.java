package model;

import java.util.Date;

public class Movie {
    
    private final String title;
    private final String genre;
    private final Date releaseDate;
    private Views views;
    private float rate;

    Movie(String title, String genre, Date releaseDate, int views, float rate) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.views = new Views(views);
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }
    
    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
    
    public float getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }    
}
