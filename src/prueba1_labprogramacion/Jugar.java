package prueba1_labprogramacion;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Jugar extends javax.swing.JFrame {

    Main main;
    static JuegoAhorcadoAzar azar;
    static JuegoAhorcadoBase base;
    AdminPalabrasSecretas adminPalabrasSecretas;
    int IntentosRestantes = 6;

    public Jugar(Main main, AdminPalabrasSecretas admin) {
        initComponents();
        this.adminPalabrasSecretas = admin;
        this.main = main;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        String PalabraInicial = adminPalabrasSecretas.palabraSecreta();
        jTextArea1.setText("_".repeat(PalabraInicial.length()));
        Color backgroundColor = new Color(216, 150, 255);
        getContentPane().setBackground(backgroundColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdivinar = new javax.swing.JButton();
        txtLetra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdivinar.setText("Adivinar");
        btnAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLetra)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdivinar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdivinar)
                    .addComponent(btnVolver))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinarActionPerformed
        char letra = txtLetra.getText().toLowerCase().charAt(0);

        String palabraSecreta = jTextArea1.getText();

        String actualizarPalabra = adminPalabrasSecretas.actualizarPalabraActual(letra, adminPalabrasSecretas.palabraSecreta(), palabraSecreta);
        jTextArea1.setText(actualizarPalabra);
        txtLetra.setText("");

        if (actualizarPalabra.equals(adminPalabrasSecretas.palabraSecreta())) {
            JOptionPane.showMessageDialog(this, "¡Has ganado!", "Ganador", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else if (!actualizarPalabra.contains(String.valueOf(letra))) {

            IntentosRestantes--;
            if (IntentosRestantes == 0) {
                JOptionPane.showMessageDialog(this, "¡Has perdido! La palabra era: " + adminPalabrasSecretas.palabraSecreta(), "Perdedor", JOptionPane.ERROR_MESSAGE);
                this.dispose();
            }
        }

    }//GEN-LAST:event_btnAdivinarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Main back = new Main();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtLetra;
    // End of variables declaration//GEN-END:variables
}
