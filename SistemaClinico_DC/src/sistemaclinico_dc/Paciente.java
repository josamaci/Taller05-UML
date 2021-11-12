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
public class Paciente extends Persona{
    protected String email;
    public ArrayList <Cita> citas;
    public boolean solicitarCita(){
        return true;
    }

    public Paciente() {
        HistoriaClinica hc = new HistoriaClinica();
        Receta rc = new Receta();
    }
    
}
