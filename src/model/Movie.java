package model;

import java.util.Date;

public class Movie {
    
    private final Title title;
    private final Genre genre;
    private final ReleaseDate releaseDate;
    private Views views;
    private Rate rate;

    Movie(String title, String genre, Date releaseDate, int views, float rate) {
        this.title = new Title(title);
        this.genre = new Genre(genre);
        this.releaseDate = new ReleaseDate(releaseDate);
        this.views = new Views(views);
        this.rate = new Rate(rate);
    }

    public String getTitle() {
        return title.getTitle();
    }
    
    public String getGenre() {
        return genre.getGenre();
    }

    public Date getReleaseDate() {
        return releaseDate.getDate();
    }

    public int getViews() {
        return views.getViews();
    }

    public void setViews(int views) {
        this.views = new Views(views);
    }
    
    public float getRate() {
        return rate.getRate();
    }

    public void setRate(int rate) {
        this.rate = new Rate(rate);
    }    
}
