

public class CalculoVolumenes{
    private double base;
    private double altura;
    private double aristasDeBase;
    private double apotema;
    private double radio;

    void setBase(double base){
        this.base = base;
    }
    void setAltura(double altura){
        this.altura = altura;
    }
    void setAristasDeBase(double aristasDeBase){
        this.aristasDeBase = aristasDeBase;
    }
    void setApotema(double apotema){
        this.apotema = apotema;
    }
    void setRadio(double radio){
        this.radio = radio;
    }
    double getVolumenTetraedro(){
        double volumenTetraedro = (Math.sqrt(2)/12)* Math.pow(base, 3);
        return volumenTetraedro;
    }
    double getVolumenCubo(){
        double volumenCubo = Math.pow(base, 3);
        return volumenCubo;
    }
    double getVolumenPrisma(){
        double volumenPrisma = ((base * aristasDeBase * apotema) / 2) * altura;
        return volumenPrisma;
    }
    double getVolumenCono(){
        double volumenCono = 1/3 * Math.PI * Math.pow(radio, 2) * altura;
        return volumenCono;
    }
    double getVolumenConoTruncado(){
        double volumenConoTruncado = 0;
        return volumenConoTruncado;
    }
    double getVolumenPiramide(){
        double volumenPiramide = ((((base*apotema)/2)*aristasDeBase)*altura)/3;
        return volumenPiramide;
    }
    double getVolumenPiramideTruncada(){
        double volumenPiramideTruncada = 0;
        return volumenPiramideTruncada;
    }
    double getVolumenEsfera(){
        double volumenEsfera = (4/3) * Math.PI * Math.pow(radio, 3);
        return volumenEsfera;
    }

}