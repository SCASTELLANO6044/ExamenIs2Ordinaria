/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import model.Film;

/**
 *
 * @author scast
 */
public interface Command {
    public Film askForFilm(String t);
    public void createDisplay();
    public void updateDisplay(int mode);
    public boolean registerFilm(String genre, int date, int views, int Puntuation, String image,
            String title, String director, int duration);
}
