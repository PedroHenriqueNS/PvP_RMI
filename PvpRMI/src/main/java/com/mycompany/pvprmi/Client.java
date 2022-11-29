/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pvprmi;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Client {

    public static void main(String args[]) {

        Scanner scan = new Scanner(in);

        PvpInterface client = new PvpInterface();
        PvpInterface server = (PvpInterface) registry.lookup("PVP");
    }
}
