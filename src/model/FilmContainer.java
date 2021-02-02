/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Set;

/**
 *
 * @author scast
 */
public interface FilmContainer {
    public Film getFilm(String t);
    public boolean registerFilm(Film f);
    public boolean deleteFilm(Film f);
    public Set<Film> getContainer();
    
}
