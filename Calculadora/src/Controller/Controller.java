/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import calculadora.*;

/**
 *
 * @author Rubén
 */
public class Controller {
    
    // Contenido evaluable
    private String evaluable; 
    
    // Model
    private Calculadora model; 
    
    /**
     * Controlador vacío, setea de forma vacía el contenido evaluable
     */
    public Controller() {
        this.evaluable = "";
    }
    
    /**
     * Constructor que añade una cadena ya formada, hay que comprobarla para ver si es correcta
     * @param evaluable String, contenido que será evaluado, normalmente ese es el que se añade a mano
     */
    public Controller(String evaluable) {
        this.evaluable = evaluable;
        
        // Aquí se podría comprobar si este está bien definido, la entrada evaluable puede ser escrita a mano
        // por el usuario, sería bueno que comporbar que tiene los carácteres adecuados.
    }
    
    /**
     * Añade mas operaciones (caácteres al evaluable)
     * @param evaluable String, contenido que será evaluado, este metodo no sobreescribe lo evaluable si no que añade mas operaciones.
     */
    public void addEvaluable(String evaluable) {
        
    }
    
    /**
     * Setea el contenido evaluable, lo sobreewscribe entero.
     * @param evaluable
     */
    public void setEvaluable(String evaluable) {
        
    }
    
    /**
     * Método generico que comprueba si una cadena de caráctes tiene los valores adecuados.
     * @param evaluable, parametro a comprobar si es valido
     * @return boolean, es o no evaluable
     */
    public boolean compruebaEvaluable(String evaluable) {
        return true;
    }
    
    /**
     * Genera una calculadora, la cual debe guardarse en el m,odelo, supongo, se puede cambiar. El contenido
     * evaluable a enviar debe de haber sido comprobado previamente.
     * @param Evaluable
     * @return
     */
    public Calculadora generaCalculadora(String Evaluable) {
        return new Calculadora(Evaluable);
    }
    
    
}
