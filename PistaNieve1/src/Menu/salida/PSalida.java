/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.salida;

/**
 *
 * @author David
 */
public class PSalida extends javax.swing.JPanel {

    /**
     * Creates new form PSalida
     */
    public PSalida() {
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

        eConfirmacion = new javax.swing.JLabel();
        bSi = new javax.swing.JButton();
        bNo = new javax.swing.JButton();

        eConfirmacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eConfirmacion.setText("¿Estás seguro de que quieres salir?");
        eConfirmacion.setToolTipText("");

        bSi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bSi.setText("Sí");

        bNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bNo.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eConfirmacion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bNo)))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(eConfirmacion)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSi)
                    .addComponent(bNo))
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bNo;
    private javax.swing.JButton bSi;
    private javax.swing.JLabel eConfirmacion;
    // End of variables declaration//GEN-END:variables
}