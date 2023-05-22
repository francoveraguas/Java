/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.claseservicio.ejercicio01.entidades;

/**
 *
 * @author Franco
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    
    public CuentaBancaria() {
    }

    
    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    
    public long getDniCliente() {
        return dniCliente;
    }

    
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    
    public double getSaldoActual() {
        return saldoActual;
    }

    
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    
    @Override
    public String toString() {
        System.out.println("-{- NUMERO DE CUENTA= "+numeroCuenta+" -|- DNI CLIENTE= "+dniCliente+" -|- SALDO ACTUAL="+saldoActual);
        System.out.println("");
        return "RED LINK - { TODOS LOS DERECHOS RESERVADOS }";
        
    }
    
}
