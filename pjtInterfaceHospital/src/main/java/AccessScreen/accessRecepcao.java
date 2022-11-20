/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessScreen;

import Interface.telaPrincipalRecepcao;
import Interface.telaPrincipalTI;
import javax.swing.JOptionPane;

/**
 *
 * @author uande
 */
public class accessRecepcao extends AccessingScreen {

    public accessRecepcao() {
    }
    @Override
    protected void openScreen(){
        JOptionPane.showInternalMessageDialog(null,"Acesso somente aos menus do setor de Recepção!");
        
        telaPrincipalRecepcao  objtela = new telaPrincipalRecepcao();
        objtela.setVisible(true);
    }
    
}
