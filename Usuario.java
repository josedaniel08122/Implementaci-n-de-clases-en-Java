/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class Usuario {
    private String nombre;
    private CuentaBancaria cuenta;
    
    public Usuario(String nombre, double saldoInicial){
        this.nombre=nombre;
        this.cuenta=new CuentaBancaria(saldoInicial);
    }
    
    public String getNombre(){
        return nombre;
    }
    public CuentaBancaria getCuenta(){
        return cuenta;
    }
}
