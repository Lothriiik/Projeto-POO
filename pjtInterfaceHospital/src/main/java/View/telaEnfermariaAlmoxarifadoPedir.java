/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.dadosAlmoxarifadoPedidos;
import Model.addEdit;
import Model.query;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uande
 */
public class telaEnfermariaAlmoxarifadoPedir extends javax.swing.JInternalFrame {
    dadosAlmoxarifadoPedidos objpes= new dadosAlmoxarifadoPedidos();
    addEdit  AE;
    /**
     * Creates new form telaConsulta
     */
    public telaEnfermariaAlmoxarifadoPedir() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        almTabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        almSair = new javax.swing.JButton();
        fazerpedido = new javax.swing.JButton();
        almQuantidade = new javax.swing.JTextField();
        almSetor = new javax.swing.JComboBox<>();

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

        jLabel1.setText("Quantidade:");

        almTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produtos"
            }
        ));
        jScrollPane1.setViewportView(almTabela);
        if (almTabela.getColumnModel().getColumnCount() > 0) {
            almTabela.getColumnModel().getColumn(0).setMinWidth(100);
            almTabela.getColumnModel().getColumn(0).setPreferredWidth(40);
            almTabela.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jLabel2.setText("Setor:");

        almSair.setText("Sair");
        almSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almSairActionPerformed(evt);
            }
        });

        fazerpedido.setText("Fazer pedido");
        fazerpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazerpedidoActionPerformed(evt);
            }
        });

        almSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Enfermaria" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)
                        .addGap(462, 502, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(almQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(almSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fazerpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(almSair, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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
                    .addComponent(almQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(almSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fazerpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(almSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setBounds(0, 0, 907, 468);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        

        DefaultTableModel mp1  = (DefaultTableModel) almTabela.getModel();
        int l=mp1.getRowCount();
        
            if(l>0){
                    while(l>0){
                ((DefaultTableModel) almTabela.getModel()).removeRow(l-1);
                              l--;
            }
            }
            try{
                ResultSet   rs=  query.loadTableAlmoxarifado();
                DefaultTableModel mp  = (DefaultTableModel) almTabela.getModel();
                while(rs.next()){
                    String   Coluna0=rs.getString("cod").toString().trim();
                    String   Coluna1=rs.getString("produto").toString().trim();
      
                    mp.addRow(new String[]{Coluna0,Coluna1});
                    
                }
            }
                catch(SQLException erro){
                        JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+erro,"Preencher Item",2);
                        }
                tamanhocolunas();
                almTabela.setAutoCreateRowSorter(true);
            
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
         
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void almSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almSairActionPerformed
        
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_almSairActionPerformed

    private void fazerpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazerpedidoActionPerformed

        preencher_objetos();
        try {
            AE = new addEdit();
            AE.IncluirAlmoxarifadoPedido(objpes);
            JOptionPane.showMessageDialog(this, "Pedido feito com sucesso !");
         }catch(SQLException error){
           JOptionPane.showMessageDialog (this,"Operação Não Realizada."+error.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_fazerpedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almQuantidade;
    private javax.swing.JButton almSair;
    private javax.swing.JComboBox<String> almSetor;
    private javax.swing.JTable almTabela;
    private javax.swing.JButton fazerpedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public void tamanhocolunas(){
almTabela.getColumnModel().getColumn(0).setMinWidth(100);
almTabela.getColumnModel().getColumn(1).setMinWidth(250);
}
public void preencher_objetos(){
            int row =  almTabela.getSelectedRow();        
            objpes.setProduto((String) almTabela.getValueAt(row,1));
            objpes.setQuantidade(almQuantidade.getText());
            objpes.setSetor((String) almSetor.getSelectedItem());

        }

        
    }





