/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import model.DateFilmContainer;
import model.Film;
import model.FilmContainer;
import model.GenreFilmContainer;
import model.GenreFilmContainerCreator;
import model.PuntuationFilmContainer;
import model.ViewsFilmContainer;
import view.Display;
import view.FilmContainerDisplay;

/**
 *
 * @author scast
 */
public class FilmCommand implements Command{
    private FilmContainer filmContainer;

    public FilmCommand() {
        this.filmContainer = new GenreFilmContainerCreator().createFilmContainer();
    }
    
    
    @Override
    public Film askForFilm(String t) {
        return this.filmContainer.getFilm(t);
    }

    @Override
    public void createDisplay() {
        
        FilmContainerDisplay view = new FilmContainerDisplay(this);
        
    }

    @Override
    public void updateDisplay(int mode) {
        if(mode==0){
            this.filmContainer = new GenreFilmContainer(filmContainer.getContainer());
        }else if(mode==1){
            this.filmContainer = new DateFilmContainer(filmContainer.getContainer());
        }else if(mode==2){
            this.filmContainer = new ViewsFilmContainer(filmContainer.getContainer());
        }else if (mode==3){
            this.filmContainer = new PuntuationFilmContainer(filmContainer.getContainer());
        }
    }

    @Override
    public boolean registerFilm(String genre, int date, int views, int Puntuation, String image,
            String title, String director, int duration) {
        return this.filmContainer.registerFilm(new Film(genre, date, views, Puntuation,image,
            title, director, duration));
    }
    
    public String getFilmCollection(){
        return this.filmContainer.toString();
    }
}
