/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;



/**
 *
 * @author uande
 */
public class telaFarmaciaPrincipal extends javax.swing.JFrame {

    public static boolean almpedirProdutos;
    public static boolean farcadastroProdutos;
    public static boolean farexibirProdutos;
    public static boolean farpedirProdutos;
    public static boolean farsolicitacaoProdutos;

    /**
     * Creates new form pjtPrincipal
     */
    public telaFarmaciaPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        telaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        pedirprodutos = new javax.swing.JMenuItem();
        farmacia = new javax.swing.JMenu();
        farcadastrarprodutos = new javax.swing.JMenuItem();
        farexibirprodutos = new javax.swing.JMenuItem();
        farpedirprodutos = new javax.swing.JMenuItem();
        farprodutossolicitados = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout telaPrincipalLayout = new javax.swing.GroupLayout(telaPrincipal);
        telaPrincipal.setLayout(telaPrincipalLayout);
        telaPrincipalLayout.setHorizontalGroup(
            telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        telaPrincipalLayout.setVerticalGroup(
            telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Almoxarifado");

        pedirprodutos.setText("Pedir Produtos");
        pedirprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirprodutosActionPerformed(evt);
            }
        });
        jMenu1.add(pedirprodutos);

        jMenuBar1.add(jMenu1);

        farmacia.setText("Farmacia");

        farcadastrarprodutos.setText("Cadastrar Produtos");
        farcadastrarprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farcadastrarprodutosActionPerformed(evt);
            }
        });
        farmacia.add(farcadastrarprodutos);

        farexibirprodutos.setText("Exibir Produtos");
        farexibirprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farexibirprodutosActionPerformed(evt);
            }
        });
        farmacia.add(farexibirprodutos);

        farpedirprodutos.setText("Pedir Produtos");
        farpedirprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farpedirprodutosActionPerformed(evt);
            }
        });
        farmacia.add(farpedirprodutos);

        farprodutossolicitados.setText("Produtos Solicitados");
        farprodutossolicitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farprodutossolicitadosActionPerformed(evt);
            }
        });
        farmacia.add(farprodutossolicitados);

        jMenuBar1.add(farmacia);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);

      
        telaFarmaciaPrincipal.almpedirProdutos=false;   
        telaFarmaciaPrincipal.farexibirProdutos=false;
        telaFarmaciaPrincipal.farpedirProdutos=false;
        telaFarmaciaPrincipal.farcadastroProdutos=false;
        telaFarmaciaPrincipal.farsolicitacaoProdutos=false;

        

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void pedirprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirprodutosActionPerformed
        if(almpedirProdutos==false){ 
        telaFarmaciaAlmoxarifadoPedir obj = new telaFarmaciaAlmoxarifadoPedir();
        telaPrincipal.add(obj);
        obj.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pedirprodutosActionPerformed

    private void farcadastrarprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farcadastrarprodutosActionPerformed
        if(farcadastroProdutos==false){ 
        telaFarmaciaFarmaciaCadastro obj = new telaFarmaciaFarmaciaCadastro();
        telaPrincipal.add(obj);
        obj.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_farcadastrarprodutosActionPerformed

    private void farexibirprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farexibirprodutosActionPerformed
        if(farexibirProdutos==false){ 
        telaFarmaciaFarmaciaConsulta obj = new telaFarmaciaFarmaciaConsulta();
        telaPrincipal.add(obj);
        obj.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_farexibirprodutosActionPerformed

    private void farpedirprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farpedirprodutosActionPerformed
        if(farpedirProdutos==false){ 
        telaFarmaciaFarmaciaPedir obj = new telaFarmaciaFarmaciaPedir();
        telaPrincipal.add(obj);
        obj.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_farpedirprodutosActionPerformed

    private void farprodutossolicitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farprodutossolicitadosActionPerformed
        if(farsolicitacaoProdutos==false){ 
        telaFarmaciaFarmaciaPedidos obj = new telaFarmaciaFarmaciaPedidos();
        telaPrincipal.add(obj);
        obj.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_farprodutossolicitadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem farcadastrarprodutos;
    private javax.swing.JMenuItem farexibirprodutos;
    private javax.swing.JMenu farmacia;
    private javax.swing.JMenuItem farpedirprodutos;
    private javax.swing.JMenuItem farprodutossolicitados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem pedirprodutos;
    public static javax.swing.JDesktopPane telaPrincipal;
    // End of variables declaration//GEN-END:variables

}