package Inmuebles;

public class inmueble {
    protected int identificador_inmobiliario;
    protected int area;
    protected String direccion;
    protected double precio_venta;

    public inmueble(int identificador_inmobiliario, int area, String direccion) {
        this.identificador_inmobiliario = identificador_inmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public double calcular_precio_venta(double valor_area) {
        precio_venta = area * valor_area;
        return precio_venta;
    }

    public void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificador_inmobiliario);
        System.out.println("Area = " + area);
        System.out.println("Direccion = " + direccion);
        System.out.println("Precio de venta = $" + precio_venta);
    }
}    

