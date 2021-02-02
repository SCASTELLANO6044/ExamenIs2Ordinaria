/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author scast
 */
public class DateFilmContainer implements FilmContainer{
    private String title;
    private Set<Film> filmContainer;

    public DateFilmContainer(String title) {
        this.title = title;
        this.filmContainer=new TreeSet<Film>(new DateOrden());
    }

    public DateFilmContainer(Set<Film> filmContainer) {
        this.filmContainer = new TreeSet<>(new DateOrden());
        for (Film film : filmContainer) {
            this.filmContainer.add(film);
        }
    }
    
    
    public boolean registerFilm(Film f){
        for (Film film : filmContainer) {
            if (f.equals(film)){
                return false;
            }
        }
        return filmContainer.add(f);
    }
    
    public boolean deleteFilm(Film f){
        for (Film film : filmContainer) {
            if(f.equals(film)){
                filmContainer.remove(f);
                return true;
            }
        }
        return false;
    }
    
    public Film getFilm(String title){
        for (Film film : filmContainer) {
            if (film.getTitle().equals(title)){
                return film;
            }
        }
        return null;
    }

    @Override
    public Set<Film> getContainer() {
        return this.filmContainer;
    }

    @Override
    public String toString() {
        String res ="";
        for (Film film : filmContainer) {
            res +=film.toString();
        }
        return res;
    }
    
    
}

class DateOrden implements Comparator<Film>{

    @Override
    public int compare(Film o1, Film o2) {
        int condition1=o1.getDate()-o2.getDate();
        if(condition1==0){
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return condition1;
    }
    
}

