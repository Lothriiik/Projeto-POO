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
public class addEdit {
    dadosRecepcao objpes = new dadosRecepcao();
    
    public void Incluir(dadosRecepcao objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO registro_recepcao(nome, data, cep, rua, bairro, numerocasa,complemento, cidade, estado, telefoneProprio, telefoneConhecido, sexo, cor,civil, cpf, rg, escolaridade, sus, adicional)"+
     " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"))                               {
          pstmt.setString(1,objpes.getNome().toUpperCase().trim());
          pstmt.setString(2,objpes.getData());       
          pstmt.setString(3,objpes.getCep().trim()); 
          pstmt.setString(4,objpes.getRua().trim()); 
          pstmt.setString(5,objpes.getBairro().trim()); 
          pstmt.setString(6,objpes.getNumeroCasa().trim()); 
          pstmt.setString(7,objpes.getComplemento().trim()); 
          pstmt.setString(8,objpes.getCidade().trim()); 
          pstmt.setString(9,objpes.getEstado().trim()); 
          pstmt.setString(10,objpes.getTelefoneProprio().trim()); 
          pstmt.setString(11,objpes.getTelefoneConhecido().trim()); 
          pstmt.setString(12,objpes.getSexo().trim()); 
          pstmt.setString(13,objpes.getCor().trim()); 
          pstmt.setString(14,objpes.getCivil().trim()); 
          pstmt.setString(15,objpes.getCpf().trim()); 
          pstmt.setString(16,objpes.getRg().trim()); 
          pstmt.setString(17,objpes.getEscolaridade().trim()); 
          pstmt.setString(18,objpes.getSus().trim()); 
          pstmt.setString(19,objpes.getAdicional().trim()); 
          
                  
       registros = pstmt.executeUpdate();        
    }
          
  
    
    
    }//fim do metodo incluir
    
    public boolean Editar(dadosRecepcao objpes)  throws SQLException
        {
                connectionDataBase  conexao = new connectionDataBase();
                int registros;
                try  (PreparedStatement pstmt = conexao.getConnection().prepareStatement
                            ("update registro_recepcao set nome=?, data=?, cep=?, rua=?, bairro=?, numerocasa=?,complemento=?, cidade=?, estado=?, telefoneproprio=?, telefoneconhecido=?, sexo=?, cor=?,civil=?, cpf=?, rg=?, escolaridade=?, sus=?, adicional=? where cpf = ?")) {
                            pstmt.setString(1,objpes.getNome().toUpperCase().trim());
                            pstmt.setString(2,objpes.getData());
                            pstmt.setString(3,objpes.getCep().trim()); 
                            pstmt.setString(4,objpes.getRua().trim()); 
                            pstmt.setString(5,objpes.getBairro().trim()); 
                            pstmt.setString(6,objpes.getNumeroCasa().trim()); 
                            pstmt.setString(7,objpes.getComplemento().trim()); 
                            pstmt.setString(8,objpes.getCidade().trim()); 
                            pstmt.setString(9,objpes.getEstado().trim()); 
                            pstmt.setString(10,objpes.getTelefoneProprio().trim()); 
                            pstmt.setString(11,objpes.getTelefoneConhecido().trim()); 
                            pstmt.setString(12,objpes.getSexo().trim()); 
                            pstmt.setString(13,objpes.getCor().trim()); 
                            pstmt.setString(14,objpes.getCivil().trim()); 
                            pstmt.setString(15,objpes.getCpf().trim()); 
                            pstmt.setString(16,objpes.getRg().trim()); 
                            pstmt.setString(17,objpes.getEscolaridade().trim()); 
                            pstmt.setString(18,objpes.getSus().trim()); 
                            pstmt.setString(19,objpes.getAdicional().trim()); 
                            pstmt.setString(20,objpes.getCpf().trim()); 
                            
                            registros = pstmt.executeUpdate(); 
                }
                
               if (registros ==1){
                   return true;  }

               
               else {     
               return false; 
               }
               
    
        }
    
    
    }

 