/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;

/**
 *
 * @author ESTUDIANTE
 */
public class Usuario {
    public TipoIdentificacion Tipo;
    public int Identificacion;
    public String Nombres;
    public String Apellidos;
    public Cuenta Cuenta;
    public HashMap<Integer, Credito> Creditos;
    public Usuario(TipoIdentificacion Tipo, 
            String Nombres, 
            String Apellidos, 
            int Identificacion){
        this.Tipo = Tipo;
        this.Identificacion = Identificacion;
        this.Apellidos  = Apellidos;
        this.Nombres = Nombres;
        this.Creditos = new HashMap();
    };
    
    public void Informacion()
    {
        System.out.println("Nombre y Apellido: "+this.Nombres+" "+this.Apellidos);
    }
    
    public void AgregarCredito(Credito credito){
        this.Creditos.put(credito.Id, credito);
        
        Credito c = this.Creditos.get(1);
    }
    
    public void InformacionCredito(int IdCredito){
        Credito credito = this.Creditos.get(IdCredito);
        credito.Informacion();
    }
    
    public void AbonarCredito(int IdCredito, int Monto){
        Credito credito = this.Creditos.get(IdCredito);
        credito.ActualizarSaldo(Monto);
        this.Creditos.put(credito.Id, credito);
    }
    
    public void AsociarCuenta(Cuenta cuentaE)
    {
        this.Cuenta = cuentaE;
    }
}
