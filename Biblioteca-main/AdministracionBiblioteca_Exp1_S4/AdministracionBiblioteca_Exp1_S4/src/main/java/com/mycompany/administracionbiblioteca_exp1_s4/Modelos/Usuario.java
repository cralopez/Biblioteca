/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administracionbiblioteca_exp1_s4.Modelos;

/**
 *
 * @author crist
 */
public class Usuario {
    private String rut;
    private String nombre;

    public Usuario(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getRut() { return rut; }
    public String getNombre() { return nombre; }
}

