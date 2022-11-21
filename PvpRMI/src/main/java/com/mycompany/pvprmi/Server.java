/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pvprmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author pedro
 */
public class Server {
    
    Pvp jogador1 = new Pvp(1);
    Registry registry = LocateRegistry.createRegistry(1099);
    registry.rebind("PVP", jogador1);
    
    System.out.println("Aguardando jogador 2...")
    
    Pvp jogador2 = new Pvp(2);
    registry.rebind("PVP", jogador2);
}
