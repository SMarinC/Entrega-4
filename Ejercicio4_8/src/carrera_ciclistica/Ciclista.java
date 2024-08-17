package carrera_ciclistica;


public abstract class Ciclista {
    private int identificador; 
    private String nombre; 
    private int tiempo_acumulado = 0; 
    
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    
    abstract String imprimir_tipo();

    protected int get_identificador() {
        return identificador;
    }

    protected void set_identificador() {
        this.identificador = identificador;
    }
    
    protected String get_nombre() {
        return nombre;
    }

    protected void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    protected int get_posicion_general(int posicion_general) {
        return posicion_general;
    }
    
    protected void set_posicion_general(int posicion_general) {
        posicion_general = posicion_general;
    }

    protected int get_tiempo_acumulado() {
        return tiempo_acumulado;
    }
    
    protected void set_tiempo_acumulado(int tiempo) {
        this.tiempo_acumulado = tiempo;
    }

    protected void imprimir() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempo_acumulado);
    }
 }
