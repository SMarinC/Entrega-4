package ejercicio_cuentas;

public class cuenta_corriente extends cuenta {

    float sobregiro;

    public cuenta_corriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }

    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;

        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;

        if (sobregiro > 0) {
            if ( residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    public void extractoMensual() {
        super.extractoMensual(); // Invoca al método de la clase padre
    }

    public void imprimir() {
        System.out.println("Saldo = $"  + saldo);
        System.out.println("Cargo mensual =  $ " + comision_mensual);
        System.out.println("Numero de transacciones = " + (numero_consignaciones + numero_retiros));
        System.out.println("Valor de sogregiro = $" + (numero_consignaciones + numero_retiros));
        System.out.println();
    }
}

