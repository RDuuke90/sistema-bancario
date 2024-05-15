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
public class SistemaBancario {
    private HashMap<Integer, Usuario> Usuarios  = new HashMap();
    private HashMap<Integer, Cuenta> HistoricoCuentas = new HashMap();
    private HashMap<Integer, Credito> HistoricoCreditos = new HashMap();
    
   
    public void CrearUsuario(TipoIdentificacion Tipo, 
            String Nombres, 
            String Apellidos, 
            int Identificacion)
    {
        this.Usuarios.put(Identificacion, new Usuario(
                Tipo, Nombres, Apellidos, Identificacion
        ));
    }
    
    public void AgregarCuentaUsuario(int Identificacion, TipoCuenta tipo){
        Usuario usuario = this.Usuarios.get(Identificacion);        
        switch(tipo){
            case AHORROS:
                usuario.AsociarCuenta(Cuenta.CuentaAhorro(usuario.Identificacion));
                break;
            case CORRIENTE:
                usuario.AsociarCuenta(Cuenta.CuentaCorriente(usuario.Identificacion));
                break;
            
            default:
                break;
        }
        
        this.Usuarios.put(usuario.Identificacion, usuario);
        this.HistoricoCuentas.put(
                usuario.Identificacion, 
                usuario.Cuenta);
        // Imprimir el nro de cuenta del banco .size();
        // Obtener la cuenta de un usuario .get(); Un objeto
    }
    
    public int CantidadCuentas(){
        return this.HistoricoCuentas.size();
    }
    
    public Cuenta ObtenerCuentaPorIdentificacion(int identificacion){
        return this.HistoricoCuentas.get(identificacion);
        //return this.Usuarios.get(identificacion).Cuenta;
        
        
        
        
    }
    
    public void AgregarCreditoUsuario(int Identificacion, int Saldo){
        Usuario usuario = this.Usuarios.get(Identificacion);
        Credito credito = new Credito(usuario.Identificacion, Saldo);
        usuario.AgregarCredito(credito);
        this.Usuarios.put(usuario.Identificacion, usuario);
        this.HistoricoCreditos.put(credito.Id, credito);
    }
    
    public Credito BuscarCreditoPorId(int Id)
    {
        return this.HistoricoCreditos.get(Id);
    }
    
    public Usuario BuscarUsuario(int Identificacion)
    {
        return this.Usuarios.get(Identificacion);
    }
}
