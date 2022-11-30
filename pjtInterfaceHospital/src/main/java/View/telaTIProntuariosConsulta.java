/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.dadosProntuario;
import Model.query;
import static View.telaEnfermariaPrincipal.telaPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uande
 */
public class telaTIProntuariosConsulta extends javax.swing.JInternalFrame {
    dadosProntuario objpes= new dadosProntuario();
    public static boolean prontuario;
    /**
     * Creates new form telaConsulta
     */
    public telaTIProntuariosConsulta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conVariavel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        conArgumento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        conTabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        conSair = new javax.swing.JButton();
        pooProntuarionovo = new javax.swing.JButton();
        proProntuarioeditar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        conVariavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "Mês", "Ano" }));

        jLabel1.setText("Consultar por :");

        conArgumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                conArgumentoKeyReleased(evt);
            }
        });

        conTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Hora", "Dia", "Mês", "Ano"
            }
        ));
        jScrollPane1.setViewportView(conTabela);
        if (conTabela.getColumnModel().getColumnCount() > 0) {
            conTabela.getColumnModel().getColumn(0).setPreferredWidth(40);
            conTabela.getColumnModel().getColumn(1).setMinWidth(110);
            conTabela.getColumnModel().getColumn(1).setMaxWidth(110);
            conTabela.getColumnModel().getColumn(2).setMinWidth(80);
            conTabela.getColumnModel().getColumn(2).setMaxWidth(80);
            conTabela.getColumnModel().getColumn(3).setMinWidth(50);
            conTabela.getColumnModel().getColumn(3).setMaxWidth(50);
            conTabela.getColumnModel().getColumn(4).setMinWidth(50);
            conTabela.getColumnModel().getColumn(4).setMaxWidth(50);
            conTabela.getColumnModel().getColumn(5).setMinWidth(80);
            conTabela.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jLabel2.setText("Argumento:");

        conSair.setText("Sair");
        conSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conSairActionPerformed(evt);
            }
        });

        pooProntuarionovo.setText(" Novo Prontuario");
        pooProntuarionovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pooProntuarionovoActionPerformed(evt);
            }
        });

        proProntuarioeditar.setText("Editar Prontuario");
        proProntuarioeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proProntuarioeditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conVariavel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(conArgumento, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pooProntuarionovo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conSair, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proProntuarioeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conVariavel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conArgumento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(proProntuarioeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pooProntuarionovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1300, 468);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        telaTIProntuariosConsulta.prontuario= false;
        DefaultTableModel mp1  = (DefaultTableModel) conTabela.getModel();
        int l=mp1.getRowCount();
        
            if(l>0){
                    while(l>0){
                ((DefaultTableModel) conTabela.getModel()).removeRow(l-1);
                              l--;
            }
            }
            try{
                ResultSet   rs=  query.loadTableProntuario();
                DefaultTableModel mp  = (DefaultTableModel) conTabela.getModel();
                while(rs.next()){
                    String   Coluna0=rs.getString("nome").toString().trim();
                    String   Coluna1=rs.getString("cpf").toString().trim();
                    String   Coluna2=rs.getString("hora").toString().trim();
                    String   Coluna3=rs.getString("dia").toString().trim();
                    String   Coluna4=rs.getString("mes").toString().trim();
                    String   Coluna5=rs.getString("ano").toString().trim();

                    
                    mp.addRow(new String[]{Coluna0,Coluna1,Coluna2,Coluna3,Coluna4,Coluna5});
                    
                }
            }
                catch(SQLException erro){
                        JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+erro,"Preencher Item",2);
                        }
                tamanhocolunas();
                conTabela.setAutoCreateRowSorter(true);
            
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
         
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void conSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conSairActionPerformed
        
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_conSairActionPerformed

    private void conArgumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conArgumentoKeyReleased
       String tipo=" ";
       String tipo2=" ";
       String tipo3=" ";
       String escolha=conVariavel.getSelectedItem().toString().trim();
       

       if(escolha.equals("Nome")){
           tipo="  "+"nome";
       }
       if(escolha.equals("CPF")){
           tipo="  "+"cpf";
       }
       if(escolha.equals("Mês")){
           tipo="  "+"mes";           
       }
       if(escolha.equals("Ano")){
           tipo="  "+"ano";           
       }
       
       String arg=conArgumento.getText().toUpperCase();
       
        DefaultTableModel mp1  = (DefaultTableModel) conTabela.getModel();
        int l=mp1.getRowCount();
       
       if(l>0){
                    while(l>0){
                ((DefaultTableModel) conTabela.getModel()).removeRow(l-1);
                              l--;
            }
            }
       
            try{
                ResultSet   rs=  query.loadTableProntuario(tipo,  arg);
                DefaultTableModel mp  = (DefaultTableModel) conTabela.getModel();
                while(rs.next()){
                    String   Coluna0=rs.getString("nome").toString().trim();
                    String   Coluna1=rs.getString("cpf").toString().trim();
                    String   Coluna2=rs.getString("hora").toString().trim();
                    String   Coluna3=rs.getString("dia").toString().trim();
                    String   Coluna4=rs.getString("mes").toString().trim();
                    String   Coluna5=rs.getString("ano").toString().trim();

                    
                    mp.addRow(new String[]{Coluna0,Coluna1,Coluna2,Coluna3,Coluna4,Coluna5});
                    
                }
            }
                catch(SQLException erro){
                        JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+erro,"Preencher Item",2);
                        }
                tamanhocolunas();
                conTabela.setAutoCreateRowSorter(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_conArgumentoKeyReleased

    private void pooProntuarionovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pooProntuarionovoActionPerformed
        if(prontuario==false){ 
        telaTIProntuario obj = new telaTIProntuario();
        telaTIPrincipal.telaPrincipal.add(obj);
        obj.setVisible(true);
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pooProntuarionovoActionPerformed

    private void proProntuarioeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proProntuarioeditarActionPerformed
        if(prontuario==false){ 
        telaTIProntuario obj = new telaTIProntuario();
        telaTIPrincipal.telaPrincipal.add(obj);
        obj.setVisible(true);
        
        }
         int row =  conTabela.getSelectedRow();
        objpes.setCpf((String) conTabela.getValueAt(row,1));
        objpes.setDia((String) conTabela.getValueAt(row,3));
        objpes.setMes((String) conTabela.getValueAt(row,4));
        objpes.setAno((String) conTabela.getValueAt(row,5));
        telaEnfermariaProntuario.recebecpf(objpes);
        // TODO add your handling code here:
    }//GEN-LAST:event_proProntuarioeditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField conArgumento;
    private javax.swing.JButton conSair;
    private javax.swing.JTable conTabela;
    private javax.swing.JComboBox<String> conVariavel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pooProntuarionovo;
    private javax.swing.JButton proProntuarioeditar;
    // End of variables declaration//GEN-END:variables
public void tamanhocolunas(){
conTabela.getColumnModel().getColumn(0).setMinWidth(100);
conTabela.getColumnModel().getColumn(1).setMinWidth(250);
}


}



