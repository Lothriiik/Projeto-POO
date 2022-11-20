/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author uande
 */
public class delete {
    public boolean Delete(String cpf) throws SQLException{
        connectionDataBase  conexao = new connectionDataBase();
        int registros;
        try (PreparedStatement pstmt = conexao.getConnection().prepareStatement 
        ("delete from registro_recepcao where cpf=?")){
            pstmt.setString(1,cpf);
            registros = pstmt.executeUpdate();
    }
        if (registros ==1){
            return true;}
        else{
            return false;}
        }
    
}
    

