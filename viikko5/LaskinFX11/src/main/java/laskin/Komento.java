/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author emma
 */
public abstract class Komento {
    protected Sovelluslogiikka sovellus;
    protected TextField syotekentta;
    protected TextField tuloskentta;
    protected Button nollaa;
    protected Button undo;
    protected int edellinen;
    
    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
        this.nollaa = nollaa;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
        this.undo = undo;
    }
    public abstract void suorita();
    public abstract void peru();
}
