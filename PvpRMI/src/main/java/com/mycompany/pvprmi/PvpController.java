/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pvprmi;

/**
 *
 * @author pedro
 */
public class PvpController {
    
    public int checkWhoIsYourEnemy(int jogador) {
        
        if (jogador == 1) return 2;
        if (jogador == 2) return 1;
        return 0;
        
    }
    
    public Pvp atacar(Pvp jogadorAtacado) {
        jogadorAtacado.vida = jogadorAtacado.vida - 10;
        System.out.println("Ataque realizado, -10 vida.\nVida atual: " + jogadorAtacado.vida);
        
        return jogadorAtacado;
    }
}
