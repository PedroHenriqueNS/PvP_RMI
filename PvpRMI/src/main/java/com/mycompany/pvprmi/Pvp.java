/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pvprmi;

import java.io.Serializable;

/**
 *
 * @author pedro
 */
public class Pvp implements Serializable {
    
    public Pvp() {}
    public Pvp(int jogador) {
        this.jogador = jogador;
    }
    
    public int jogador;
    
    public int vida = 100;
}
