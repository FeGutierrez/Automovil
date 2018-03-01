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
    
    public void replaceMotor (Motor motor){
        this.motor=motor;
    }
    
    public Llanta[] getLlantas(){
        return this.llantas;
    }
    
    public boolean addLlanta(Llanta llantas){
        for (int i = 0; i < this.llantas.length; i++) {
            if(this.llantas[i]==null){
                this.llantas[i]=llantas;                
                //Para creacion por composicion se elimina (Llanta llantas ) Ej public boolean addLlanta(){};
//                this.llantas[i] = new Llanta();
//                this.llantas[i].setMarca("Marca1");
//                this.llantas[i].setModelo("Modelo1");
//                this.llantas[i].setTamanoPulgadas(16);
                return true;
                
            }            
        }
        return false;
    }
    
    public boolean removeLlanta(Llanta llanta){
        return false;
    }
    
    public boolean replaceLlanta(Llanta llanta){
        //Buscar y cambiar
        return false;
    }
    
    public Puerta[] getPuerta(){
        return this.puertas;
    }
    
    public boolean addPuerta(Puerta puertas){
        return false;
    }
    
    public boolean removePuerta(Puerta puerta){
        return false;
    }
    
    public boolean replacePuerta(Puerta puerta, Puerta nuevaPuerta){
        return false;
    }
    
    //Add Remove replace 
    

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
