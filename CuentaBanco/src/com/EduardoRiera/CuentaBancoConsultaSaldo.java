
package com.EduardoRiera;

/**
 *
 * @author E-Riera-1
 */
public class CuentaBancoConsultaSaldo {
        private int codigo;
        private float saldo;
        private String titular;
        CuentaBancoDatosUsuarios miUsuario = new CuentaBancoDatosUsuarios();
    void setCodigo(int dat){
        codigo = dat;
        miUsuario.setCodigo(codigo);
        setTitular(miUsuario.getTitular());
        setSaldo(miUsuario.getSaldo());
    }
    int getCodigo(){
        return codigo;
    }
    void setSaldo(float dat){
        saldo = dat;
    }
    float getSaldo(){
        return saldo;
    }
    void setTitular(String dat){
        titular = dat;
    }
    String getTitular(){
        return titular;
    }
    
}
