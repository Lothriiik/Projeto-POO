/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.AcessScreen;


import javax.swing.JOptionPane;

/**
 *
 * @author uande
 */
abstract public class AccessingScreen {
    
   
    protected abstract void openScreen();
    private  void message(){
        JOptionPane.showInternalMessageDialog(null,"Bem vindo ao aplicativo pooHospital !");
    }

    public void acessScreen() {
        message();
        openScreen();
    }
}
