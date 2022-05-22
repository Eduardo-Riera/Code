
package com.EduardoRiera;

/**
 *
 * @author E-Riera-1
 */
public class CuentaBancoDeposito {
        private int codigo;
        private float saldo;
        private String titular;
        private float deposito;
        CuentaBancoDatosUsuarios miUsuario = new CuentaBancoDatosUsuarios();
    void setCodigo(int cod){
        codigo = cod;
        miUsuario.setCodigo(codigo);
        setTitular(miUsuario.getTitular());
        setSaldo(miUsuario.getSaldo());
    }
    void setSaldo(float dat){
        saldo = dat;
    }
    void setTitular(String dat){
        titular = dat;
    }
    void setDeposito(float dat){
        deposito = dat;
    }
    String getTitular(){
        //titular = dat;
        return titular;
    }
    float getNewSaldo(){
        //deposito = dat;
        saldo = saldo + deposito;
        return saldo;
    }
    int getCodigo(){
        //codigo = dat;
        return codigo;
    }
    float getSaldo(){
        return saldo;
    }
    float getDeposito(){
        return deposito;
    }
        
}
