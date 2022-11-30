/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.AcessScreen;


import View.telaAlmoxarifadoPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author uande
 */
public class accessAlmoxarifado extends AccessingScreen {
    @Override
    protected void openScreen(){
        JOptionPane.showInternalMessageDialog(null,"Acesso somente aos menus do setor de Almoxarifado!");
        telaAlmoxarifadoPrincipal  objtela = new telaAlmoxarifadoPrincipal();
        objtela.setVisible(true);
                
    }
    
}
