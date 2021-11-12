package sistemaclinico_dc;

import java.time.LocalDateTime;

public class Receta {

    protected LocalDateTime fecha;

    protected java.util.ArrayList<Medicamento> medicamentos;
    
    protected PlanNutricional planNutricional;
    
    protected Doctor registradoPor;
    
    public Receta() {
        medicamentos = new java.util.ArrayList<>();
        planNutricional = new PlanNutricional();
    }
    
}
