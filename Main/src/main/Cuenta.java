/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ESTUDIANTE
 */
public class Cuenta {
    public int IdentificacionDeudor;
    public TipoCuenta Tipo;
    public int Saldo = 10000;
    
    public Cuenta(int Identificacion, TipoCuenta Tipo)
    {
        this.IdentificacionDeudor = Identificacion;
        this.Tipo = Tipo;
    }
    
    public static Cuenta CuentaAhorro(int Identificacion)
    {
        return new Cuenta(Identificacion, TipoCuenta.AHORROS);
    }
    
    public static Cuenta CuentaCorriente(int Identificacion)
    {
        return new Cuenta(Identificacion, TipoCuenta.CORRIENTE);
    }
}
