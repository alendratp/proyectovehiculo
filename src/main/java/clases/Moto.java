<<<<<<< HEAD
package clases;

import acciones.Iacciones;

public abstract class Moto extends Vehiculo implements Iacciones{
    private int velocidad_maxima;

    public Moto(int velocidad_maxima, String nombre, String modelo, int año_fabricacion) {
        super(nombre, modelo, año_fabricacion);
        this.velocidad_maxima = velocidad_maxima;
    }

    public int getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(int velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }
 
    
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author pc14
 */
public class Moto {
    
}
>>>>>>> rama2
