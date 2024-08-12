package ejercicio_cuentas;

public class cuenta_ahorros extends cuenta {

    private boolean activa;

    public cuenta_ahorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000)
            activa = false;
        else
            activa = true;
    }

    public void retirar(float cantidad) {
        if (activa)
            super.retirar(cantidad);

    }

    public void consignar(float cantidad) {
        if (activa)
            super.consignar(cantidad);
    }

    public void extracto_mensual() {
        if (numero_retiros > 4) {
            comision_mensual += (numero_retiros - 4) * 1000;
        }
        super.extractoMensual();

        if (saldo < 10000)
            activa = false;
    }

    public void imprimir() {
        System.out.println("Saldo = $" + saldo);
        System.out.println("Comision mensual =  $ " + comision_mensual);
        System.out.println("Numero de transacciones = " + (numero_consignaciones + numero_retiros));
        System.out.println();
    }
}