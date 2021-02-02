/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import presenter.Command;
import presenter.FilmCommand;

/**
 *
 * @author scast
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().execute();
    }
    
    public void execute(){
        Command filmCommand = new FilmCommand();
        filmCommand.createDisplay();
    }
    
}
