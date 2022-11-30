/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.AcessScreen;


import View.telaTIPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author uande
 */
public class accessTi extends AccessingScreen {
    @Override
    protected void openScreen(){
        JOptionPane.showInternalMessageDialog(null,"Acesso somente aos menus do setor de TI!");
        telaTIPrincipal  objtela = new telaTIPrincipal();
        objtela.setVisible(true);
                
    }
    
}
