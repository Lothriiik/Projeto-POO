/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;


import Controller.dadosFarmaciaPedidos;
import Model.addEdit;
import Model.delete;
import Model.query;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uande
 */
public class telaFarmaciaFarmaciaPedidos extends javax.swing.JInternalFrame {
    dadosFarmaciaPedidos objpes= new dadosFarmaciaPedidos();
    addEdit  AE;
    delete Del;
    /**
     * Creates new form telaConsulta
     */
    public telaFarmaciaFarmaciaPedidos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        farTabela = new javax.swing.JTable();
        conSair = new javax.swing.JButton();
        pedidoentregue = new javax.swing.JButton();

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

        farTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produtos", "Quantidade", "Setor"
            }
        ));
        jScrollPane1.setViewportView(farTabela);
        if (farTabela.getColumnModel().getColumnCount() > 0) {
            farTabela.getColumnModel().getColumn(0).setMinWidth(100);
            farTabela.getColumnModel().getColumn(0).setMaxWidth(100);
            farTabela.getColumnModel().getColumn(1).setPreferredWidth(40);
            farTabela.getColumnModel().getColumn(2).setMinWidth(100);
            farTabela.getColumnModel().getColumn(2).setMaxWidth(100);
            farTabela.getColumnModel().getColumn(3).setMinWidth(150);
            farTabela.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        conSair.setText("Sair");
        conSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conSairActionPerformed(evt);
            }
        });

        pedidoentregue.setText("Pedido Entregue");
        pedidoentregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoentregueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pedidoentregue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conSair, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pedidoentregue, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setBounds(0, 0, 907, 468);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        

        DefaultTableModel mp1  = (DefaultTableModel) farTabela.getModel();
        int l=mp1.getRowCount();
        
            if(l>0){
                    while(l>0){
                ((DefaultTableModel) farTabela.getModel()).removeRow(l-1);
                              l--;
            }
            }
            try{
                ResultSet   rs=  query.loadTableFarmaciaPedidos();
                DefaultTableModel mp  = (DefaultTableModel) farTabela.getModel();
                while(rs.next()){
                    String   Coluna0=rs.getString("cod").toString();
                    String   Coluna1=rs.getString("produto").toString().trim();
                    String   Coluna2=rs.getString("quantidade").toString().trim();
                    String   Coluna3=rs.getString("setor").toString().trim();
      
                    mp.addRow(new String[]{Coluna0,Coluna1,Coluna2,Coluna3});
                    
                }
            }
                catch(SQLException erro){
                        JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+erro,"Preencher Item",2);
                        }
                tamanhocolunas();
                farTabela.setAutoCreateRowSorter(true);
            
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
         
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void conSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conSairActionPerformed
        
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_conSairActionPerformed

    private void pedidoentregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoentregueActionPerformed
        int row =  farTabela.getSelectedRow();  
       objpes.setCod(Integer.parseInt((String) farTabela.getValueAt(row,0)));
       objpes.setProduto((String) farTabela.getValueAt(row,1));
       objpes.setQuantidade((String) farTabela.getValueAt(row,2));
       objpes.setSetor((String) farTabela.getValueAt(row,3));
       int cod=objpes.getCod();
       String produto=objpes.getProduto();
       String quantidade=objpes.getQuantidade();
       String setor=objpes.getSetor();

            
            Del  = new delete();
            try{
                
                    if(Del.DeleteFarmaciaPedidos(cod,produto,quantidade,setor)){
                        JOptionPane.showMessageDialog(this,"Pedido entregue ! ");
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Erro ao excluir o cadastro ");
                    }
                    
                
                
            
        }catch( SQLException  error){
            JOptionPane.showMessageDialog(this,"Erro: Exclusão não realizada !" +error.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pedidoentregueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conSair;
    private javax.swing.JTable farTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pedidoentregue;
    // End of variables declaration//GEN-END:variables
public void tamanhocolunas(){
farTabela.getColumnModel().getColumn(0).setMinWidth(100);
farTabela.getColumnModel().getColumn(1).setMinWidth(250);
}


        
    }





