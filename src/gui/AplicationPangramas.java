package gui;

import classes.Pangramas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author allan wanderley alves
 * aps programação orientada a objeto - 2018.1
 * ultima modificação 03/06/2018
 */
public class AplicationPangramas extends javax.swing.JDialog {
//Tela 'Visualização de Pangramas' Para verificar todos os existentes no programa
    
    private Pangramas pangramas;
    DefaultTableModel model;
    private int atividade;
    public static String pangramaSelecionado;
    public static int resetGame;
      
    public AplicationPangramas(java.awt.Frame parent, boolean modal,int data) {
        super(parent, modal);
        initComponents();
        pangramas = new Pangramas();
        model = (DefaultTableModel) tabela.getModel();
        atividade=data;
        resetGame = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPangramas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pangramaPortugues = new javax.swing.JRadioButton();
        pangramaIngles = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnSelectPangrama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualização Pangramas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(null);
        setMaximumSize(new java.awt.Dimension(240, 480));
        setMinimumSize(new java.awt.Dimension(240, 480));
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("Selecione uma linguagem");

        btnGroupPangramas.add(pangramaPortugues);
        pangramaPortugues.setText("Português");
        pangramaPortugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pangramaPortuguesActionPerformed(evt);
            }
        });

        btnGroupPangramas.add(pangramaIngles);
        pangramaIngles.setText("Inglês");
        pangramaIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pangramaInglesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pangramaPortugues)
                        .addGap(18, 18, 18)
                        .addComponent(pangramaIngles)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pangramaPortugues)
                    .addComponent(pangramaIngles))
                .addContainerGap())
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Pangrama"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(25);
            tabela.getColumnModel().getColumn(0).setMaxWidth(25);
        }

        btnSelectPangrama.setText("Selecionar");
        btnSelectPangrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPangramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectPangrama))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnSelectPangrama)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pangramaPortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangramaPortuguesActionPerformed
        int test=0;
        model.setNumRows(0);
        for (Object obj : pangramas.listarPangramas(1)){
            model.addRow(new Object[]{
                ++test,
                obj
            });
        }

    }//GEN-LAST:event_pangramaPortuguesActionPerformed

    private void pangramaInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangramaInglesActionPerformed
        int test=0;
        model.setNumRows(0);
        for (Object obj : pangramas.listarPangramas(0)){
            model.addRow(new Object[]{
                ++test,
                obj
            });
        }
    }//GEN-LAST:event_pangramaInglesActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnSelectPangramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPangramaActionPerformed
       if(atividade==1){
            int n = JOptionPane.showConfirmDialog(this, "O próximo pangrama será o escolhido", "Tem certeza?", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if(n==0){
                pangramaSelecionado = (String) tabela.getValueAt(tabela.getSelectedRow(), 1);
                resetGame=1;
                JOptionPane.showMessageDialog(this, "Pangrama confirmado com sucesso\n Clique em Novo jogo para iniciar a rodada",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            }else{
                resetGame=0;
            }
        }
    }//GEN-LAST:event_btnSelectPangramaActionPerformed
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupPangramas;
    private javax.swing.JButton btnSelectPangrama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton pangramaIngles;
    private javax.swing.JRadioButton pangramaPortugues;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
