/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import Controller.dadosRecepcao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author uande
 */
public class logIncluirCadastro extends addEdit {
    @Override
    public void IncluirLog( dadosRecepcao objpes) throws SQLException{
        connectionDataBase  conexao = new connectionDataBase();
          int registros;
          String argumento="Foi adicionado um cadastro com o CPF: "+ objpes.getCpf()+" e Nome:"+ objpes.getNome();
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO log (log)  VALUES (?)"))                               {
                            pstmt.setString(1,argumento);


                           
       registros = pstmt.executeUpdate();        
    }
    }
}
