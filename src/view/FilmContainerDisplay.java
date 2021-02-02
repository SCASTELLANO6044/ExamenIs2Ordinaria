/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import presenter.FilmCommand;

/**
 *
 * @author scast
 */
public class FilmContainerDisplay implements Display{
    private FilmCommand filmCommand;
    public FilmContainerDisplay(FilmCommand aThis) {
        this.filmCommand=aThis;
        createDisplay();
    }
    

    @Override
    public void createDisplay() {
        filmCommand.registerFilm("genero",2021,1050,10,"imagen","holaMundo","director",120);
        filmCommand.registerFilm("accion",2050,1020,9,"imagen","peli1","director",120);
        filmCommand.registerFilm("accion",2020,1060,8,"imagen","ejemplo","director",120);
        filmCommand.registerFilm("drama",2020,1058,7,"imagen","peli2","director",120);
        updateDisplay(0);
        System.out.println(this.filmCommand.getFilmCollection());
        updateDisplay(1);
        System.out.println(this.filmCommand.getFilmCollection());
        updateDisplay(2);
        System.out.println(this.filmCommand.getFilmCollection());
    }

    @Override
    public void updateDisplay(int mode) {
        this.filmCommand.updateDisplay(mode);
    }
    
}
