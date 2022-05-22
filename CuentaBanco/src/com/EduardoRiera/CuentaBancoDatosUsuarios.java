
package com.EduardoRiera;

/**
 *
 * @author E-Riera-1
 */
public class CuentaBancoDatosUsuarios {
    private String titular;
    private int codigo;
    private float saldo;
    public static boolean precencia = true;
void setTitular(String dat){
    titular = dat;
}
String getTitular(){
    return titular;
}
void setCodigo(int dat){
    codigo = dat;
    switch(codigo){
        case 2048:{
            setTitular("Eduardo José Riera");
            setSaldo(100000);
            precencia = true;
        }break;
        case 1024: {
            setTitular("Natalia estefanía del Valle Carivali");
            setSaldo(500000);
            precencia = true;
        }break;
        case 4096: {
            setTitular("Antonio José Riera");
            setSaldo(1000000);
            precencia = true;
        }break;
        case 512: {
            setTitular("Eduardo Riera");
            setSaldo(250000);
            precencia = true;
        }break;
        case 256: {
            setTitular("Johan Sebastian Riera");
            setSaldo(30000);
            precencia = true;
        }break;
        default:{
            System.out.println("Usuario inexistente.\n");
            precencia = false;
        }
    }
}
float getCodigo(){
    return codigo;
}
void setSaldo(float dat){
    saldo = dat;
}
float getSaldo(){
    return saldo;
}

    
    
}
