/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pvprmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author pedro
 */
public interface PvpInterface extends Remote {
    
    public void atacar() throws RemoteException;
}
