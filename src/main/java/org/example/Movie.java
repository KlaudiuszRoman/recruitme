package org.example;

public class Movie {
    private String title; // tytuł
    private String plot; // opis
    private String genere; //gatunek
    private String director; //reżyser
    private String poster;

    public Movie() {
    }

    public Movie(String title, String plot, String genere, String director, String poster) {
        this.title = title;
        this.plot = plot;
        this.genere = genere;
        this.director = director;
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", plot='" + plot + '\'' +
                ", genere='" + genere + '\'' +
                ", director='" + director + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}

