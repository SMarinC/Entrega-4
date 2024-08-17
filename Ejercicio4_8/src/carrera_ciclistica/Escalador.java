package carrera_ciclistica;

public class Escalador extends Ciclista {
    private double aceleracion_promedio;
    private double grado_rampa;
    
    public Escalador(int identificador, String nombre, double aceleraciónPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleracion_promedio = aceleraciónPromedio;
        this.grado_rampa = gradoRampa;
    }
    
    protected double get_aceleracion_promedio() {
        return aceleracion_promedio;
    }
    
    protected void set_aceleracion_promedio(double aceleracion) {
        this.aceleracion_promedio = aceleracion;
    }
    
    protected double get_grado_rampa() {
        return grado_rampa;
    }
    
    protected void setGradoRampa(double gradoRampa) {
        this.grado_rampa = gradoRampa;
    }
    
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " +  aceleracion_promedio);
        System.out.println("Grado de rampa = " + grado_rampa);
    }
    
    @Override
    protected String imprimir_tipo() {
        return "Es un escalador";
    }
}
