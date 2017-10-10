package views;
/**
 *
 * @author Azael_Mendoza
 */
public class ViewMayor3Numeros extends javax.swing.JPanel {

    /**
     * Creates new form ViewMayor3Numeros
     */
    public ViewMayor3Numeros() {
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

        jlb_numero_1 = new javax.swing.JLabel();
        jlb_numero_2 = new javax.swing.JLabel();
        jlb_numero_3 = new javax.swing.JLabel();
        jlb_numero_mayor = new javax.swing.JLabel();
        jtf_numero_1 = new javax.swing.JTextField();
        jtf_numero_2 = new javax.swing.JTextField();
        jtf_numero_3 = new javax.swing.JTextField();
        jbtn_calcular = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jlb_numero_1.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jlb_numero_1.setForeground(new java.awt.Color(204, 204, 204));
        jlb_numero_1.setText("Numero 1:");

        jlb_numero_2.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jlb_numero_2.setForeground(new java.awt.Color(204, 204, 204));
        jlb_numero_2.setText("Numero 2:");

        jlb_numero_3.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jlb_numero_3.setForeground(new java.awt.Color(204, 204, 204));
        jlb_numero_3.setText("Numero 3:");

        jlb_numero_mayor.setFont(new java.awt.Font("PakType Naskh Basic", 1, 18)); // NOI18N
        jlb_numero_mayor.setForeground(new java.awt.Color(204, 204, 204));
        jlb_numero_mayor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_numero_mayor.setText("...");

        jtf_numero_1.setBackground(new java.awt.Color(51, 51, 51));
        jtf_numero_1.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jtf_numero_1.setForeground(new java.awt.Color(204, 204, 204));

        jtf_numero_2.setBackground(new java.awt.Color(51, 51, 51));
        jtf_numero_2.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jtf_numero_2.setForeground(new java.awt.Color(204, 204, 204));

        jtf_numero_3.setBackground(new java.awt.Color(51, 51, 51));
        jtf_numero_3.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jtf_numero_3.setForeground(new java.awt.Color(204, 204, 204));

        jbtn_calcular.setBackground(new java.awt.Color(0, 102, 102));
        jbtn_calcular.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_calcular.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_calcular.setText("Calcular Mayor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlb_numero_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_numero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlb_numero_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_numero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlb_numero_2)
                        .addGap(35, 35, 35)
                        .addComponent(jtf_numero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtn_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_numero_mayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_numero_1)
                    .addComponent(jtf_numero_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_numero_2)
                    .addComponent(jtf_numero_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_numero_3)
                    .addComponent(jtf_numero_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtn_calcular)
                .addGap(18, 18, 18)
                .addComponent(jlb_numero_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton jbtn_calcular;
    public javax.swing.JLabel jlb_numero_1;
    public javax.swing.JLabel jlb_numero_2;
    public javax.swing.JLabel jlb_numero_3;
    public javax.swing.JLabel jlb_numero_mayor;
    public javax.swing.JTextField jtf_numero_1;
    public javax.swing.JTextField jtf_numero_2;
    public javax.swing.JTextField jtf_numero_3;
    // End of variables declaration//GEN-END:variables
}
