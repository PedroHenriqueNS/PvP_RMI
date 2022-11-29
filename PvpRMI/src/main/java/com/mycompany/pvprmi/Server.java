/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pvprmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author pedro
 */
public class Server {

    public static void main(String[] args) throws RemoteException {
        
        String winner;

        Pvp jogador1 = new Pvp(1);
        
        PvpInterface stub = (PvpInterface) UnicastRemoteObject.exportObject((PvpInterface) this, 0);
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("PVP", stub);
        
        System.out.println("Jogador 1 Entrou");
        System.out.println("Aguardando jogador 2...");
    
        Pvp jogador2 = new Pvp(2);
        registry.rebind("PVP", (Remote) jogador2);
        
        System.out.println("Jogador 2 Entrou");
        
        while(true) {
            if (jogador1.vida <= 0) {
                winner = "Jogador 2";
                break;
            }
            if (jogador2.vida <= 0) {
                winner = "Jogador 1";
                break;
            }
        }
        System.out.println("Vencedor" + winner);
    }
}
