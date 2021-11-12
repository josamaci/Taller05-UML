package sistemaclinico_dc;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Receta {

    protected LocalDateTime fecha;

    protected java.util.ArrayList<Medicamento> medicamentos;
    
    protected PlanNutricional planNutricional;
    
    protected Doctor registradoPor;
    
    public Receta() {
        medicamentos = new java.util.ArrayList<>();
        planNutricional = new PlanNutricional();
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public PlanNutricional getPlanNutricional() {
        return planNutricional;
    }

    public void setPlanNutricional(PlanNutricional planNutricional) {
        this.planNutricional = planNutricional;
    }

    public Doctor getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(Doctor registradoPor) {
        this.registradoPor = registradoPor;
    }
    
}
