package prueba1_labprogramacion;

import java.awt.Color;
import javax.swing.JOptionPane;

public class IngresarPalabraFija extends javax.swing.JFrame {

    AdminPalabrasSecretas admin;

    public IngresarPalabraFija(Main main, AdminPalabrasSecretas admin) {
        initComponents();
        this.admin = admin;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Color backgroundColor = new Color(193, 222, 164);
        getContentPane().setBackground(backgroundColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPalabraFija = new javax.swing.JTextField();
        btnEstablecerPalabraFija = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la palabra para jugar Modo Fijo:");

        btnEstablecerPalabraFija.setText("Establecer");
        btnEstablecerPalabraFija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerPalabraFijaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtPalabraFija, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstablecerPalabraFija)
                    .addComponent(jLabel1))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtPalabraFija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEstablecerPalabraFija, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstablecerPalabraFijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstablecerPalabraFijaActionPerformed
        String tipo = txtPalabraFija.getText();

        if (txtPalabraFija.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene todos los campos");
        } else {
            admin.agregarPalabraSecreta(tipo);

            JOptionPane.showMessageDialog(null, "¡Palabra agregada! ");
            this.dispose();
        }
    }//GEN-LAST:event_btnEstablecerPalabraFijaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstablecerPalabraFija;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtPalabraFija;
    // End of variables declaration//GEN-END:variables
}