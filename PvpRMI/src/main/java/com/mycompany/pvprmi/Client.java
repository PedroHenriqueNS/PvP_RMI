/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pvprmi;

/**
 *
 * @author pedro
 */
public class Client {
    
    Scanner scan = new Scanner();
    
    PvpInterface client = new PvpInterface();
    PvpInterface server = (PvpInterface) registry.lookup("PVP");
}
