/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico_dc;

import java.util.ArrayList;

/**
 *
 * @author JMaci
 */
public class Doctor extends Persona{
    protected int regDoctor;
    protected String especialidad;
    protected ArrayList<Cita> citasPendientes;
    protected Secretaria s;
    public void recetar(){
    }
    
    public void agregarPlanNut(){ 
    }
    
    public void imprimirReceta(){
    } 
    
    public void registrarSecretaria(Secretaria secretaria){
        secretaria = s;
    }
    
    
}
