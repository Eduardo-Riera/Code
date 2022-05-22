
package com.EduardoRiera;

/**
 *
 * @author E-Riera-1
 */
    //int codigo = 0;
public class CuentaBancoRetiro {
        private int codigo;
        private float saldo;
        private String titular;
        private float retiro;
        CuentaBancoDatosUsuarios miUsuario = new CuentaBancoDatosUsuarios();
    int getCodigo(){
        return codigo;
    }
    float getSaldo(){
        return saldo;
    }
    String getTitular(){
        return titular;
    }    
    void setCodigo(int cod){
        codigo = cod;
        miUsuario.setCodigo(codigo);
        setTitular(miUsuario.getTitular());
        setSaldo(miUsuario.getSaldo());
    }
    void setSaldo(float cod){
        saldo = cod;
    }
    void setTitular(String cod){
        titular = cod;
    }
    void setRetiro(float cod){
        retiro = cod;        
    }
    float getRetiro(){
        return retiro;
    }
    float getFinal(){
        float newSaldo = saldo - retiro;
        return newSaldo;
    }
}
