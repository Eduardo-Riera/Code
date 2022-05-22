
package com.EduardoRiera;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author E-Riera-1
 */
public class CalculoTransformador {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        CalculoNucleoDeHierro miCalculo = new CalculoNucleoDeHierro();
        boolean repetir;
        do{
            try{
                System.out.print("Ingrese la tensión del primario: ");
                    double tensionPrimario = dato.nextDouble();
                        miCalculo.setTensionPrimario(tensionPrimario);
                    repetir = false;
            }catch(InputMismatchException e){
                repetir = true;
            }
        }while(repetir);
        do{
            try{
                System.out.print("Ingrese la tensión del secundario: ");
                    double tensionSecundario = dato.nextDouble();
                        miCalculo.setTensionSecundario(tensionSecundario);
                    repetir = false;
            }catch(InputMismatchException e){
                repetir = true;
            }
        }while(repetir);
        do{
            try{
                System.out.print("Ingrese la medida A de la armadura: ");
                    double medidaAarmadura = dato.nextDouble();
                        miCalculo.setMedidaAarmadura(medidaAarmadura);
                    repetir = false;
            }catch(InputMismatchException e){
                repetir = true;
            }
        }while(repetir);
        do{
            try{
                System.out.print("Ingrese la medida B de la armadura: ");
                    double medidaBarmadura = dato.nextDouble();
                        miCalculo.setMedidaBarmadura(medidaBarmadura);
                    repetir = false;
            }catch(InputMismatchException e){
                repetir = true;
            }
        }while (repetir);
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Potencia____________________:" + miCalculo.getPotencia());
        System.out.println("Espiras del primario________:" + miCalculo.getEspirasPrimario());
        System.out.println("Intensidad del primario_____:" + miCalculo.getIntensidadPrimario());
        System.out.println("Diámetro Alambre primario___:" + miCalculo.getDiametroAlambrePrimario());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Espiras del secundario______:" + miCalculo.getEspirasSecundario());
        System.out.println("Intensidad del secundario___:" + miCalculo.getIntensidadSecundario());
        System.out.println("Diámetro Alambre Secundario_:" + miCalculo.getDiametroAlambreSecundario());
    }
    
}
