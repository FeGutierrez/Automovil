/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setNumeroSerie("123");
        Llanta ll = new Llanta();
        ll.setModelo("12");
        Puerta puerta = new Puerta();
        
        Automovil auto = new Automovil();
        auto.addPuerta(puerta);
        //...
        auto.addLlanta(ll);
        auto.replaceMotor(motor);
        
    }
    
}
