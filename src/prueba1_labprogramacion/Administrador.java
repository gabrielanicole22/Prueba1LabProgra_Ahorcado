/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba1_labprogramacion;

/**
 *
 * @author Gabriela Mejía
 */
public class Administrador extends javax.swing.JFrame {

    public static boolean EsModoFijo = true;
    public static boolean EsModoAleatorio = false;
    /**
     * Creates new form Administrador
     */
    public Main main;
    AdminPalabrasSecretas admin;

    public Administrador(Main main, AdminPalabrasSecretas admin) {
        initComponents();
        this.admin = admin;
        this.main = main;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModoFijo = new javax.swing.JButton();
        btnModoAleatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnModoFijo.setText("Modo Fijo");
        btnModoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoFijoActionPerformed(evt);
            }
        });

        btnModoAleatorio.setText("Modo Aleatorio");
        btnModoAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoAleatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModoAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnModoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnModoAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoFijoActionPerformed
        // TODO add your handling code here:
        EsModoFijo = true;
        EsModoAleatorio = false;
        IngresarPalabraFija dificultad = new IngresarPalabraFija(main, admin);
        dificultad.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnModoFijoActionPerformed

    private void btnModoAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoAleatorioActionPerformed
        // TODO add your handling code here:
        EsModoAleatorio = true;
        EsModoFijo = false;
        admin.seleccionarPalabraAzar();
        this.dispose();
    }//GEN-LAST:event_btnModoAleatorioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModoAleatorio;
    private javax.swing.JButton btnModoFijo;
    // End of variables declaration//GEN-END:variables
}
