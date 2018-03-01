/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Automovil {
    
    private String marca;
    private int anio;
    private String modelo;
    private Llanta[] llantas;
    private Motor motor;
    private Puerta[] puertas;
    
    public Automovil(){
        this.llantas = new Llanta[4];
        this.puertas = new Puerta[4];
    };
    
    public Motor getMotor(){
        return motor;
    }
    
    public void replacerMotor (Motor motor){
        this.motor=motor;
    }
    
    public Llanta[] getLlantas(){
        return this.llantas;
    }
    
    public boolean addLlanta(Llanta llantas){
        //
        return false;
    }
    
    public boolean removeLlanta(Llanta llanta){
        return false;
    }
    
    public boolean replaceLlanta(Llanta llanta){
        //Buscar y cambiar
        return false;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
