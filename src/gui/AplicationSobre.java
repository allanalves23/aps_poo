package gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allan wanderley alves
 * aps programação orientada a objeto - 2018.1
 * ultima modificação 03/06/2018
 */
public class AplicationSobre extends javax.swing.JDialog {
//Tela (JDialog) 'About' do sistema ao acessar o button 'ajuda' 
   
    public AplicationSobre(java.awt.Frame parent, boolean modal,String version) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.version.setText(version);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblVersion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        lblMsg2 = new javax.swing.JLabel();
        lblMsg1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(128, 128));
        setResizable(false);
        setSize(new java.awt.Dimension(128, 128));
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(37, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblVersion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVersion.setForeground(new java.awt.Color(255, 255, 255));
        lblVersion.setText("Versão");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Desenvolvido por Allan Wanderley Alves");

        version.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        version.setForeground(new java.awt.Color(255, 255, 255));

        lblMsg2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMsg2.setForeground(new java.awt.Color(255, 255, 255));
        lblMsg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsg2.setText("Orientada a Objetos");

        lblMsg1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMsg1.setForeground(new java.awt.Color(255, 255, 255));
        lblMsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsg1.setText("Atividade Prática Supervisionada de Programação");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Notas de atualização");

        jButton1.setText("<html><a href=\"\">https://github.com/allanalves23/aps_poo</a></html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVersion)
                .addGap(38, 38, 38)
                .addComponent(version, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMsg1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMsg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblMsg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsg2)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(version, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVersion))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            URI uri = new URI("https://github.com/allanalves23/aps_poo");
            if(Desktop.isDesktopSupported()){
                Desktop.getDesktop().browse(uri);
                dispose();
            }
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(AplicationSobre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMsg1;
    private javax.swing.JLabel lblMsg2;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
