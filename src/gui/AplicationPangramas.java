package gui;

import classes.Pangramas;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingWorker;
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
    private DefaultTableModel model;
    public static String pangramaSelecionado;
    public static int resetGame;
    private SwingWorker loadIn;
       
    public AplicationPangramas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        btnSelectPangrama.setVisible(true);
        pangramas = new Pangramas();
        model = (DefaultTableModel) tabela.getModel();
        resetGame = 0;
    }
    
    public AplicationPangramas(java.awt.Frame parent, boolean modal,boolean removeBtnSelect) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        btnSelectPangrama.setVisible(true);
        pangramas = new Pangramas();
        model = (DefaultTableModel) tabela.getModel();
        resetGame = 0;
        btnSelectPangrama.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPangramas = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pangramaPortugues = new javax.swing.JRadioButton();
        pangramaIngles = new javax.swing.JRadioButton();
        pb = new javax.swing.JProgressBar();
        btnSelectPangrama = new javax.swing.JButton();
        btnSelectPangrama.setVisible(false);
        pbLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pangramas do sistema");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(null);
        setMaximumSize(new java.awt.Dimension(481, 400));
        setMinimumSize(new java.awt.Dimension(481, 400));
        setPreferredSize(new java.awt.Dimension(481, 400));
        setType(java.awt.Window.Type.UTILITY);

        jPanel2.setBackground(new java.awt.Color(37, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        tabela.setColumnSelectionAllowed(true);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(25);
            tabela.getColumnModel().getColumn(0).setMaxWidth(25);
        }

        jPanel1.setBackground(new java.awt.Color(37, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linguagem dos pangramas");

        pangramaPortugues.setBackground(new java.awt.Color(37, 51, 51));
        btnGroupPangramas.add(pangramaPortugues);
        pangramaPortugues.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pangramaPortugues.setForeground(new java.awt.Color(255, 255, 255));
        pangramaPortugues.setText("Português");
        pangramaPortugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pangramaPortuguesActionPerformed(evt);
            }
        });

        pangramaIngles.setBackground(new java.awt.Color(37, 51, 51));
        btnGroupPangramas.add(pangramaIngles);
        pangramaIngles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pangramaIngles.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pangramaPortugues)
                        .addGap(18, 18, 18)
                        .addComponent(pangramaIngles)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        pb.setBackground(new java.awt.Color(255, 255, 255));
        pb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pb.setForeground(new java.awt.Color(0, 0, 0));
        pb.setVisible(false);  pb.setStringPainted(true);  pb.setBackground(Color.BLUE);

        btnSelectPangrama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSelectPangrama.setText("Selecionar");
        btnSelectPangrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPangramaActionPerformed(evt);
            }
        });

        pbLabel.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnSelectPangrama, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pb, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectPangrama, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pbLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if((pangramaPortugues.isSelected()||pangramaIngles.isSelected())&& tabela.getSelectedRow()!=-1){
            int n = JOptionPane.showConfirmDialog(this, "O próximo jogo será com o pangrama definido", "Tem certeza?", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if(n==0){
                 loadIn = new SwingWorker() {
                    @Override
                    protected Object doInBackground() throws Exception {
                        if(!pb.isVisible()){
                            pb.setVisible(true);
                        }

                        pbLabel.setText("Confirmando pangrama...");
                        for (int i = 1; i <= 100; i++) {
                            pb.setValue(i);
                            pb.setString(i + "%");
                            Thread.sleep(1);
                        }
                        JOptionPane.showMessageDialog(null, "Pangrama confirmado com sucesso!\nInicie um Novo jogo para aplicar as mudanças",
                            "Pangrama alterado com êxito!", JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                        return 0;
                    }
                };
                loadIn.execute();
                pangramaSelecionado = (String) tabela.getValueAt(tabela.getSelectedRow(), 1);
                resetGame=1;
            }
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um tipo de pangrama", "Nenhum pangrama selecionado", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnSelectPangramaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupPangramas;
    private javax.swing.JButton btnSelectPangrama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton pangramaIngles;
    private javax.swing.JRadioButton pangramaPortugues;
    private javax.swing.JProgressBar pb;
    private javax.swing.JLabel pbLabel;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
