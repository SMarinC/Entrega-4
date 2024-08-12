package Inmuebles;

public class casa_conjunto_cerrado extends casa_urbana{
    protected static double valor_area = 2500000;
    protected int valor_administracion;
    protected boolean tiene_piscina;
    protected boolean tiene_campos_deportivos;

    public casa_conjunto_cerrado(int identificador_inmobiliario, int area, String direccion, int numero_habitaciones, int numero_banos, int numero_pisos, int valor_administracion, boolean tiene_piscina, boolean tiene_campos_deportivos) {
        super(identificador_inmobiliario, area, direccion, numero_habitaciones, numero_banos, numero_pisos);
        this.valor_administracion = valor_administracion;
        this.tiene_piscina = tiene_piscina;
        this.tiene_campos_deportivos = tiene_campos_deportivos;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion = " + valor_administracion);
        System.out.println("Tiene piscina? = " + tiene_piscina);
        System.out.println("Tiene campos deportivos? = " + tiene_campos_deportivos);
        System.out.println();
    }
}
