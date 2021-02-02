/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author scast
 */
public class ViewFilmContainerCreator implements FilmContainerCreator{
    FilmContainer filmContainer;
    @Override
    public FilmContainer createFilmContainer() {
        return filmContainer=new ViewsFilmContainer("titulo");
    }

    @Override
    public FilmContainer updateFilmContainer(FilmContainer f) {
        return filmContainer=new ViewsFilmContainer(f.getContainer());
    }
    
}