/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author scast
 */
public class Film {
    private String genre;
    private int date;
    private int views;
    private int puntuation;
    private String image;
    private String title;
    private String director;
    private int duration;

    public Film(String genre, int date, int views, int puntuation, String image, String title, String director, int duration) {
        this.genre = genre;
        this.date = date;
        this.views = views;
        this.puntuation = puntuation;
        this.image = image;
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public int getDate() {
        return date;
    }

    public int getViews() {
        return views;
    }

    public int getPuntuation() {
        return puntuation;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Film{" + "genre=" + genre + ", date=" + date + ", views=" + views + ", puntuation=" + puntuation + ", image=" + image + ", title=" + title + ", director=" + director + ", duration=" + duration + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if (this.date != other.date) {
            return false;
        }
        if (this.views != other.views) {
            return false;
        }
        if (this.puntuation != other.puntuation) {
            return false;
        }
        if (this.duration != other.duration) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        return true;
    }
    
    
}
