package carrera_ciclistica;


public class Contrarrelojista extends Ciclista {
    private double velocidad_maxima;
    
    public Contrarrelojista(int identificador, String nombre, double velocidad_maxima) {
        super(identificador, nombre);
        this.velocidad_maxima = velocidad_maxima;
    }
    
    protected double get_velocidad_maxima() {
        return velocidad_maxima;
    }
    
    protected void set_velocidad_maxima(double velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " + velocidad_maxima);
    }

    @Override
    protected String imprimir_tipo() {
        return "Es un constrarrelojista";
    }
}
