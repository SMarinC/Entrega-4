package carrera_ciclistica;

public class Velocista extends Ciclista {
    private double potencia_promedio;
    private double velocidad_promedio;
    
    public Velocista(int identificador, String nombre, double potencia, double velocidad) {
        super(identificador, nombre);
        this.potencia_promedio = potencia;
        this.velocidad_promedio = velocidad;
    }
    
    protected double get_potencia_promedio() {
        return potencia_promedio;
    }
    
    protected void setPotencia_promedio(double potencia) {
        this.potencia_promedio = potencia;
    }
    
    protected double get_velocidad_promedio() {
        return velocidad_promedio;
    }
    
    protected void set_velocidad_promedio(double velocidad) {
        this.velocidad_promedio = velocidad;
    }
    
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio = " + potencia_promedio);
        System.out.println("Velocidad promedio = " + velocidad_promedio);
    }

    @Override
    protected String imprimir_tipo() {
        return "Es un velocista";
    }

}
