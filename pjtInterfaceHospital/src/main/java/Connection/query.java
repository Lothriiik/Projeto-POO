/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uande
 */
public class query {
    public static ResultSet loadTable() throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT nome, sexo, data, cpf, telefoneproprio, telefoneconhecido, rua, bairro, numerocasa FROM registro_recepcao");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }
    public static ResultSet loadTable (String tipo, String arg) throws SQLException
    {
        String argumento=tipo+" "+"like '"+arg+"%'";
        
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
              "SELECT nome, data, cpf, telefoneproprio, telefoneconhecido, rua, bairro, numerocasa FROM registro_recepcao where "+argumento+"");
             
                ResultSet rs = pstmt.executeQuery();
                
                return rs;
    }
}
