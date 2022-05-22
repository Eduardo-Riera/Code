
package com.EduardoRiera;

/**
 *
 * @author E-Riera-1
 */
public class CalculoNucleoDeHierro {
    
    private double tensionPrimario = 0;
    private double tensionSecundario = 0;
    private double medidaAarmadura = 0;
    private double medidaBarmadura = 0;
    
    void setTensionPrimario(double dat){
        tensionPrimario = dat;
    }
    double getTensionPrimario(){
        return tensionPrimario;
    }
    void setTensionSecundario(double dat){
        tensionSecundario = dat;
    }
    double getTensionSecundario(){
        return tensionSecundario;
    }
    double getPotencia(){
        double potencia = Math.pow(getAreaDelNucleo(), 2);
        return potencia;
    }
    void setMedidaAarmadura(double dat){
        medidaAarmadura = dat;
    }
    void setMedidaBarmadura(double dat){
        medidaBarmadura = dat;
    }
    double getMedidaBarmadura(){
        return medidaBarmadura;
    }
    double getMedidaAarmadura(){
        return medidaAarmadura;
    }
    double getIntensidadPrimario(){
        double intensidadPrimario = getPotencia() / tensionPrimario;
        return intensidadPrimario;
    }
    double getIntensidadSecundario(){
        double intensidadSecundario = getPotencia() / tensionSecundario;
        return intensidadSecundario;
    }
    double getAreaDelNucleo(){
        double areaNucleo = medidaAarmadura * medidaBarmadura;
        return areaNucleo;
    }
    double getEspirasPorVoltio(){
        double espirasPorVoltio = 37.54 / getAreaDelNucleo();                
        return espirasPorVoltio;
    }
    double getEspirasPrimario(){
        double espirasPrimario = getEspirasPorVoltio() * tensionPrimario;
        return espirasPrimario;
    }
    double getEspirasSecundario(){
        double espirasSecundario = getEspirasPorVoltio() * tensionSecundario;
        return espirasSecundario;
    }
    double getDiametroAlambrePrimario(){
        double seccionAlambrePrimario = getIntensidadPrimario() / 4;
        double diametroAlambrePrimario = Math.sqrt(seccionAlambrePrimario / 3.1416) * 2;
        return diametroAlambrePrimario;
    }
    double getDiametroAlambreSecundario(){
        double seccionAlambreSecundario = getIntensidadSecundario() / 4;
        double diametroAlambreSecundario = Math.sqrt(seccionAlambreSecundario / 3.1416) * 2;
        return diametroAlambreSecundario;
    }
    
}
