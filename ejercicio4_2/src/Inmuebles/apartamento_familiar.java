package Inmuebles;

public class apartamento_familiar extends apartamento{
    protected static double valor_area = 2000000;
    protected int valor_administracion;

    public apartamento_familiar(int identificador_inmobiliario, int area, String direccion, int numero_habitaciones, int numero_banos, int valor_administracion) {
        super(identificador_inmobiliario, area, direccion, numero_habitaciones, numero_banos);
        this.valor_administracion = valor_administracion;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion = $" + valor_administracion);
        System.out.println();
    }
}    

