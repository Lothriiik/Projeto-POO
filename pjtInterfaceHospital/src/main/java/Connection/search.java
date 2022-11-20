/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import Construct.dadosRecepcao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uande
 */
public class search {
    dadosRecepcao objpes = new dadosRecepcao();
    
    public boolean Search(dadosRecepcao objpes) throws SQLException
    {       
        String cpf=objpes.getCpf();
        
        connectionDataBase  conexao = new connectionDataBase();
        PreparedStatement pstmt =
         conexao.getConnection().prepareStatement(
         "SELECT * FROM registro_recepcao where cpf =  ?");
        pstmt.setString(1,cpf);
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()){
            objpes.setNome(rs.getString("nome"));
            objpes.setData(rs.getString("data"));
            objpes.setCep(rs.getString("cep"));
            objpes.setRua(rs.getString("rua"));
            objpes.setBairro(rs.getString("bairro"));
            objpes.setNumeroCasa(rs.getString("numerocasa"));
            objpes.setComplemento(rs.getString("complemento"));
            objpes.setCidade(rs.getString("cidade"));
            objpes.setEstado(rs.getString("estado"));
            objpes.setTelefoneProprio(rs.getString("telefoneproprio"));
            objpes.setTelefoneConhecido(rs.getString("telefoneconhecido"));
            objpes.setSexo(rs.getString("sexo"));
            objpes.setCor(rs.getString("cor"));
            objpes.setCivil(rs.getString("civil"));
            objpes.setCpf(rs.getString("cpf"));
            objpes.setRg(rs.getString("rg"));
            objpes.setEscolaridade(rs.getString("escolaridade"));
            objpes.setSus(rs.getString("sus"));
            objpes.setAdicional(rs.getString("adicional"));
        }
                return true;    
}
}