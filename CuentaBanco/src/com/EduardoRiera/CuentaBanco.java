
package com.EduardoRiera;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author E-Riera-1
 */
public class CuentaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CuentaBancoRetiro miRetiro = new CuentaBancoRetiro();
        CuentaBancoDeposito miDeposito = new CuentaBancoDeposito();
        CuentaBancoConsultaSaldo miConsulta = new CuentaBancoConsultaSaldo();
        String repetir = "";
    do{//Bucle de repetición
        try{//Catcheo de errores tipo Mismatch
            System.out.print("Ingrese operacion (1) = Retiro, (2) = Deposito, (3) Consulta: ");
                int operacion = entrada.nextInt();
            switch(operacion){
                case 1: {
                    // Código de cuenta 1 = 256
                    // Código de cuenta 2 = 512
                    // Código de cuenta 3 = 1024
                    // Código de cuenta 4 = 2048
                    // Código de cuenta 5 = 4096
                    System.out.print("Ingrese código de cuenta: ");
                        int codigo = entrada.nextInt();
                        miRetiro.setCodigo(codigo);
                        if (CuentaBancoDatosUsuarios.precencia == false){
                            repetir = "si";
                            break;
                        }
                    System.out.println("\nTitular: " + miRetiro.getTitular() + " Codigo: " + miRetiro.getCodigo());
                    System.out.print("Ingrese cantidad a retirar: ");
                        float retiro = entrada.nextFloat();
                        miRetiro.setRetiro(retiro);
                    System.out.println("\nTitular   $: " + miRetiro.getTitular() + " Codigo: " + miRetiro.getCodigo());
                    System.out.println("Saldo     $: " + miRetiro.getSaldo());
                    System.out.println("Retiro    $: " + miRetiro.getRetiro());
                    System.out.println("New Saldo $: " + miRetiro.getFinal()+ "\n");
                    System.out.print("Decea una nueva operación? (si), (no): ");
                    entrada.nextLine();
                    repetir = entrada.nextLine();
                }break;
                case 2: {
                    System.out.print("Ingrese código de cuenta: ");
                        int codigo = entrada.nextInt();
                        miDeposito.setCodigo(codigo);
                        if (CuentaBancoDatosUsuarios.precencia == false){
                            repetir = "si";
                            break;
                        }
                    System.out.println("\nTitular: " + miDeposito.getTitular() + " Codigo: " + miDeposito.getCodigo());    
                    System.out.print("Ingrese cantidad a depositar: ");
                        float deposito = entrada.nextFloat();
                        miDeposito.setDeposito(deposito);
                    System.out.println("\nTitular    : " + miDeposito.getTitular() + " Codigo: " + miDeposito.getCodigo());
                    System.out.println("Saldo     $: " + miDeposito.getSaldo());
                    System.out.println("Deposito  $: " + miDeposito.getDeposito());
                    System.out.println("New Saldo $: " + miDeposito.getNewSaldo()+ "\n");
                    System.out.print("Decea una nueva operación? (si), (no): ");
                    entrada.nextLine();
                    repetir = entrada.nextLine();
                }break;
                case 3: {
                    System.out.print("Ingrese código de cuenta: ");
                        int codigo = entrada.nextInt();
                        miConsulta.setCodigo(codigo);
                        if (CuentaBancoDatosUsuarios.precencia == false){
                            repetir = "si";
                            break;
                        }
                    System.out.println("\nTitular: " + miConsulta.miUsuario.getTitular() + " Codigo: " + miConsulta.getCodigo());
                    System.out.println("Saldo $: " + miConsulta.miUsuario.getSaldo() + "\n");
                    System.out.print("Decea una nueva operación? (si), (no): ");
                    entrada.nextLine();
                    repetir = entrada.nextLine();
                }break;
                default:{
                    System.out.print("Operación no valida!!!.\n\n");
                    System.out.print("Decea una nueva operación? (si), (no): \n");
                    entrada.nextLine();
                    repetir = entrada.nextLine();
                }
            }
        }catch(InputMismatchException x){
                System.out.println("Dato incorrecto!!!");
                entrada.nextLine(); repetir = "si";
        }
    }while(repetir.equalsIgnoreCase("si")); 
    System.out.println("\nGrscias por utilizar nuestro sistema.\n");
    }
}
    




    

