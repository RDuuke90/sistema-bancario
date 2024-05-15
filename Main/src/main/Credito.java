/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 *
 * @author ESTUDIANTE
 */
public class Credito {
    public int Id;
    public int IdentificacionDeudor;
    public int Saldo;
    public int SaldoPendiente;
    public EstadosCredito Estado;

    public Credito(int IdentificacionDeudor, int Saldo) {
        Random r = new Random();
        this.Id = r.nextInt(99999);
        this.IdentificacionDeudor = IdentificacionDeudor;
        this.Saldo = Saldo;
        this.SaldoPendiente = Saldo;
        this.Estado = EstadosCredito.PENDIENTE;
    }

    public void ActualizarSaldo(int Monto) {
        this.SaldoPendiente -= Monto;
        if (this.SaldoPendiente <= 0){
            this.Estado = EstadosCredito.FINALIZADO; 
        }
      
    }

    void Informacion() {
        System.out.println("Id: "+this.Id);
        System.out.println("Saldo: "+this.Saldo);
        System.out.println("Saldo Pendiente: "+this.SaldoPendiente);
        System.out.println("Estado: "+this.Estado);


    }
    
    
}
