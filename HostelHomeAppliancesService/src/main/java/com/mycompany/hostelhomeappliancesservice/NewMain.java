/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hostelhomeappliancesservice;

/**
 *
 * @author Jer Shin
 */
public class NewMain {
    static Login loginPage;
    static User currentUser;
    static Admin admin;
    static Manager manager;
    static Technician technician;
    static Customer customer;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataIO.read();
        loginPage = new Login();
        loginPage.setVisible(true);
    }
    
}
