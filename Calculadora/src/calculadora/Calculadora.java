/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Rubén
 */
public class Calculadora {

    private int resultado;
    private String evaluable;
    
    /**
     * Contructor de la calculadora, en principio pienso qeu debe recibir por parámetros los valores que usuara
     * para calcular el resultado final
     * @param evaluable String, contenido que sera evaluado para generar loas cálculos
     */
    public Calculadora(String evaluable) {
        this.evaluable = evaluable;
    }
    
    /**
     * Coge la variable evaluable y la convierte en un int que puede ser procesada y calculada, puede incluso devolver el resultado final.
     * @return int,
     */
    public int convertEvaluable() {
        return 0;
    }
    
}
