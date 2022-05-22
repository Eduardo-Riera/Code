
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculosMain {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        CalculoSuperficies miSuperficie = new CalculoSuperficies();
        CalculoVolumenes miVolumen = new CalculoVolumenes();
        boolean repetir = false; int tipoDeCalculo = 0, tipoDeFigura = 0; double aristasDeBase = 0;
        double base = 0, altura = 0;

        do{
            try{
                System.out.println("Ingrese que tipo de calculo decea:");
                try{
                System.out.print("1 Superficie, 2 Volumen, 3 Perímetro: ");
                    tipoDeCalculo = dato.nextInt();
                    switch(tipoDeCalculo){
                        // Cálculo de superficies.
                        case 1:{
                            System.out.println("Elija la figura geometrica: ");
                            System.out.println("1 = Triángulo");
                            System.out.println("2 = Cuadrado");
                            System.out.println("3 = Rectángulo");
                            System.out.println("4 = Pentágono");
                            System.out.println("5 = Exágono");
                            System.out.print("Ingrese el tipo: ");
                            tipoDeFigura = dato.nextInt();
                            switch(tipoDeFigura){
                                case 1: {
                                    System.out.print("Ingrese el valor de la base: ");
                                    base = dato.nextDouble();
                                    miSuperficie.setBase(base);
                                    System.out.print("Ingrese el valor de la altura: ");
                                    altura = dato.nextDouble();
                                    miSuperficie.setAltura(altura);
                                    System.out.print("Superficie del triángulo: " + miSuperficie.getSuperficieTriangulo());
                                }break;
                                case 2: {
                                    System.out.print("Ingrese el valor de la arista: ");
                                    base = dato.nextDouble();
                                    miSuperficie.setBase(base);
                                    System.out.print("Superficie del cuadrado: " + miSuperficie.getSuperficieCuadrado());
                                }break;
                                case 3: {
                                    System.out.print("Ingrese el valor de la arista menor: ");
                                    base = dato.nextDouble();
                                    miSuperficie.setBase(base);
                                    System.out.print("Ingrese el valor de la arista mayor: ");
                                    altura = dato.nextDouble();
                                    miSuperficie.setAltura(altura);
                                    System.out.print("Superficie del rectángulo: " + miSuperficie.getSuperficieRectangulo());
                                }break;
                                case 4: {
                                    System.out.print("Ingrese el valor de la arista: ");
                                    base = dato.nextDouble();
                                    miSuperficie.setBase(base);
                                    System.out.print("Ingrese el valor del altura: ");
                                    altura = dato.nextDouble();
                                    miSuperficie.setAltura(altura);
                                    System.out.print("Superficie del pentágono: " + miSuperficie.getSuperficiePentagono());
                                }break;
                                case 5: {
                                    System.out.print("Ingrese el valor de la base: ");
                                    base = dato.nextDouble();
                                    miSuperficie.setBase(base);
                                    System.out.print("Ingrese el valor de la altura: ");
                                    altura = dato.nextDouble();
                                    miSuperficie.setAltura(altura);
                                    System.out.print("Superficie del exágono: " + miSuperficie.getSuperficieExagono());
                                }break;
                                default:{
                                    System.out.println("Ingrese un número valido!");
                                }
                            }
                        }break;
                        // Cálculo de volumenes.
                        case 2: {
                            System.out.println("Elija la figura geometrica: ");
                            System.out.println("1 = Tetraedro");
                            System.out.println("2 = Cubo");
                            System.out.println("3 = Prisma regular");
                            System.out.println("4 = Cono");
                            System.out.println("5 = Piramide regular");
                            System.out.println("6 = Esfera");
                            System.out.print("Ingrese el tipo: ");
                            tipoDeFigura = dato.nextInt();
                            switch(tipoDeFigura){
                                // Volumenes.
                                case 1: {
                                    // Volumen del tetraedro.
                                    System.out.print("Ingrese el valor de la arista de base: ");
                                    base = dato.nextDouble();
                                    miVolumen.setBase(base);
                                    System.out.print("Ingrese el valor de la altura: ");
                                    altura = dato.nextDouble();
                                    miVolumen.setAltura(altura);
                                    System.out.print("volumen del tetraedro: " + miVolumen.getVolumenTetraedro());
                                }break;
                                case 2: {
                                    // Volumen del cubo.
                                    System.out.print("Ingrese el valor de la arista: ");
                                    base = dato.nextDouble();
                                    miVolumen.setBase(base);
                                    System.out.print("Volumen del cubo: " + miVolumen.getVolumenCubo());
                                }break;
                                case 3: {
                                    // Volumen del prisma regular.
                                    System.out.print("Ingrese el valor de la arista de base: ");
                                    base = dato.nextDouble();
                                    miVolumen.setBase(base);
                                    System.out.print("Ingrese el valor de la altura: ");
                                    altura = dato.nextDouble();
                                    miVolumen.setAltura(altura);
                                    System.out.print("Ingrese cantidad de aristas de la base: ");
                                    aristasDeBase = dato.nextDouble();
                                    miVolumen.setAristasDeBase(aristasDeBase);
                                    System.out.print("Ingrese el apotema: ");
                                    double apotema = dato.nextDouble();
                                    miVolumen.setApotema(apotema);
                                    System.out.print("Volumen del prisma: " + miVolumen.getVolumenPrisma());
                                }break;
                                case 4: {
                                    // Volumen del cono.
                                    System.out.print("Ingrese el valor del radio: ");
                                    double radio = dato.nextDouble();
                                    miVolumen.setRadio(radio);
                                    System.out.print("Ingrese el valor del altura: ");
                                    altura = dato.nextDouble();
                                    miVolumen.setAltura(altura);
                                    System.out.print("Volumen del cono: " + miVolumen.getVolumenCono());
                                }break;
                                case 5: {
                                    // Volumen de la pirámide regular.
                                    System.out.print("Ingrese el valor de la base: ");
                                    base = dato.nextDouble();
                                    miVolumen.setBase(base);
                                    System.out.print("Ingrese el valor de la altura: ");
                                    altura = dato.nextDouble();
                                    miVolumen.setAltura(altura);
                                    System.out.print("Ingrese el apotema: ");
                                    double apotema = dato.nextDouble();
                                    miVolumen.setApotema(apotema);
                                    System.out.print("Ingrese la cantidad de aristas de la base: ");
                                    aristasDeBase = dato.nextDouble();
                                    miVolumen.setAristasDeBase(aristasDeBase);
                                    System.out.print("Volumen de la piramide: " + miVolumen.getVolumenPiramide());
                                }break;
                                case 6:{
                                    // Volumen de la esfera.
                                    System.out.print("Ingrese el radio: ");
                                    double radio = dato.nextDouble();
                                    miVolumen.setRadio(radio);
                                    System.out.print("Volumen de la esfera: " + miVolumen.getVolumenEsfera());
                                }break;
                                default:{
                                    dato.next();
                                    System.out.println("Ingrese un número valido!");
                                }
                        }
                    }
                }
            }
                catch(InputMismatchException e){
                    repetir = true;
                }
            }
            catch(InputMismatchException e){
                repetir = true;
            }
        }while(repetir);
        dato.close();
    }
    
}