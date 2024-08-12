package ejercicio_cuentas;
import java.util.Scanner;

public class prueba_cuenta {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial= $");
        float saldo_inicial_ahorros = input.nextFloat();
        
        System.out.print("Ingrese tasa de interes= ");
        float tasa_ahorros = input.nextFloat();
        
        cuenta_ahorros cuenta1 = new
            cuenta_ahorros(saldo_inicial_ahorros, tasa_ahorros);
        
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidad_depositar = input.nextFloat();
        cuenta1.consignar(cantidad_depositar);
        System.out.print("Ingresar cantidad a retirar: $");
        
        float cantidad_retirar = input.nextFloat();
        cuenta1.retirar(cantidad_retirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
    }
}