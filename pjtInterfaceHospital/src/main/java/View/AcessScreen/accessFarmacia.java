/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.AcessScreen;


import View.telaFarmaciaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author uande
 */
public class accessFarmacia extends AccessingScreen {
    @Override
    protected void openScreen(){
        JOptionPane.showInternalMessageDialog(null,"Acesso somente aos menus do setor de Farmacia!");
        telaFarmaciaPrincipal  objtela = new telaFarmaciaPrincipal();
        objtela.setVisible(true);
                
    }
    
}
