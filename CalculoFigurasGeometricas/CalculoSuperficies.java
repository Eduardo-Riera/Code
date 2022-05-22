
public class CalculoSuperficies {

    private double base;
    private double altura = 0;
    
    void setBase(double dat){
        this.base = dat;
    }
    void setAltura(double dat){
        this.altura = dat;
    }
    double getSuperficieTriangulo(){
        double superficieTriangulo = (base * altura) / 2; 
        return superficieTriangulo;
    }
    double getSuperficieCuadrado(){
        double superficieCuadrado = base * base;
        return superficieCuadrado;
    }
    double getSuperficieRectangulo(){
        double superficieRectangulo = base * base;
        return superficieRectangulo;
    }
    double getSuperficiePentagono(){
        double superficiePentagono = ((base * altura) / 2) * 5;
        return superficiePentagono;
    }
    double getSuperficieExagono(){
        double superficieExagono = ((base * altura) / 2) * 6;
        return superficieExagono;
    }


}

