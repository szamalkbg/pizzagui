import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class PizzaGui extends javax.swing.JFrame {

    /**
     * Creates new form PizzaGui
     */
    public PizzaGui() {
        initComponents();
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon(getClass().getResource("pizzab.jpg")));
        add(background);
        background.setLayout(new FlowLayout());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        llLogo = new javax.swing.JPanel();
        llText = new javax.swing.JLabel();
        llDiceLogo = new javax.swing.JLabel();
        DataPanel = new javax.swing.JPanel();
        EmailcimField = new javax.swing.JTextField();
        rbTelefonszam = new javax.swing.JRadioButton();
        rbEmailcim = new javax.swing.JRadioButton();
        TelefonszamField = new javax.swing.JTextField();
        PizzatypeandpricePanel = new javax.swing.JPanel();
        Magyaros = new javax.swing.JLabel();
        SzalamisPrice = new javax.swing.JLabel();
        HawaiCount = new javax.swing.JSpinner();
        SzalamisCount = new javax.swing.JSpinner();
        HawaiPrice = new javax.swing.JLabel();
        MagyarosPrice = new javax.swing.JLabel();
        Szalamis = new javax.swing.JLabel();
        MagyarosCount = new javax.swing.JSpinner();
        Hawai = new javax.swing.JLabel();
        NamePanel = new javax.swing.JPanel();
        NameTextField = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        RendelésOrderButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        RandomTogglebutton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 400));
        setMinimumSize(new java.awt.Dimension(650, 400));
        setPreferredSize(new java.awt.Dimension(600, 329));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        llLogo.setBackground(new java.awt.Color(204, 204, 204));
        llLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        llText.setFont(new java.awt.Font("Harlow Solid Italic", 1, 40)); // NOI18N
        llText.setText("PizzaDice");

        llDiceLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzadice.png"))); // NOI18N

        javax.swing.GroupLayout llLogoLayout = new javax.swing.GroupLayout(llLogo);
        llLogo.setLayout(llLogoLayout);
        llLogoLayout.setHorizontalGroup(
            llLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(llLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(llText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llDiceLogo)
                .addContainerGap())
        );
        llLogoLayout.setVerticalGroup(
            llLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(llLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(llLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(llDiceLogo)
                    .addComponent(llText))
                .addContainerGap())
        );

        DataPanel.setBackground(new java.awt.Color(204, 204, 204));
        DataPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EmailcimField.setText("pizzadice@gmail.com...");

        buttonGroup1.add(rbTelefonszam);
        rbTelefonszam.setText("Telefonszám:");
        rbTelefonszam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTelefonszamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEmailcim);
        rbEmailcim.setText("Email cím:");

        TelefonszamField.setText("+3630...");
        TelefonszamField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonszamFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataPanelLayout = new javax.swing.GroupLayout(DataPanel);
        DataPanel.setLayout(DataPanelLayout);
        DataPanelLayout.setHorizontalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DataPanelLayout.createSequentialGroup()
                        .addComponent(rbEmailcim, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailcimField))
                    .addGroup(DataPanelLayout.createSequentialGroup()
                        .addComponent(rbTelefonszam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelefonszamField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        DataPanelLayout.setVerticalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTelefonszam)
                    .addComponent(TelefonszamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEmailcim)
                    .addComponent(EmailcimField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PizzatypeandpricePanel.setBackground(new java.awt.Color(204, 204, 204));
        PizzatypeandpricePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Magyaros.setText("Magyaros");

        SzalamisPrice.setText("Ár: 1900 Ft");

        HawaiPrice.setText("Ár: 1600 Ft");

        MagyarosPrice.setText("Ár: 1780 Ft");

        Szalamis.setText("Szalámis");

        Hawai.setText("Hawai");

        javax.swing.GroupLayout PizzatypeandpricePanelLayout = new javax.swing.GroupLayout(PizzatypeandpricePanel);
        PizzatypeandpricePanel.setLayout(PizzatypeandpricePanelLayout);
        PizzatypeandpricePanelLayout.setHorizontalGroup(
            PizzatypeandpricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzatypeandpricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PizzatypeandpricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HawaiCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MagyarosCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SzalamisCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PizzatypeandpricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Magyaros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Szalamis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hawai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PizzatypeandpricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HawaiPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MagyarosPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SzalamisPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PizzatypeandpricePanelLayout.setVerticalGroup(
            PizzatypeandpricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzatypeandpricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PizzatypeandpricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hawai)
                    .addComponent(HawaiCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HawaiPrice))
                .addGap(18, 18, 18)
                .addGroup(PizzatypeandpricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Magyaros)
                    .addComponent(MagyarosCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MagyarosPrice))
                .addGap(18, 18, 18)
                .addGroup(PizzatypeandpricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Szalamis)
                    .addComponent(SzalamisCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SzalamisPrice))
                .addContainerGap())
        );

        NamePanel.setBackground(new java.awt.Color(204, 204, 204));
        NamePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Name.setText("Név:");

        javax.swing.GroupLayout NamePanelLayout = new javax.swing.GroupLayout(NamePanel);
        NamePanel.setLayout(NamePanelLayout);
        NamePanelLayout.setHorizontalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameTextField)
                .addContainerGap())
        );
        NamePanelLayout.setVerticalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        RendelésOrderButton.setBackground(new java.awt.Color(0, 102, 51));
        RendelésOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        RendelésOrderButton.setText("Rendelés");
        RendelésOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendelésOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RendelésOrderButton)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RendelésOrderButton)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RandomTogglebutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RandomTogglebutton.setText("Fizetés kiszállításnál");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RandomTogglebutton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RandomTogglebutton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(llLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PizzatypeandpricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(llLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PizzatypeandpricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbTelefonszamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTelefonszamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTelefonszamActionPerformed

    private void TelefonszamFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonszamFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonszamFieldActionPerformed

    private void RendelésOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendelésOrderButtonActionPerformed

        String name = NameTextField.getText().trim();
        boolean isTelefonszamSelected = rbTelefonszam.isSelected();
        boolean isEmailcimSelected = rbEmailcim.isSelected();
        int hawaiCount = (Integer)HawaiCount.getValue();
        int magyarosCount = (Integer)MagyarosCount.getValue();
        int szalamisCount = (Integer)SzalamisCount.getValue();
        boolean isPaymentOnDelivery = RandomTogglebutton.isSelected();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Név megadása szükséges!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isTelefonszamSelected && !isEmailcimSelected) {
            JOptionPane.showMessageDialog(null, "Adjon meg egy elérhetőséget!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (hawaiCount < 0 || magyarosCount < 0 || szalamisCount < 0) {
            JOptionPane.showMessageDialog(null, "Negatív mennyiségű pizza nem lehet!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (hawaiCount == 0 && magyarosCount == 0 && szalamisCount == 0) {
            JOptionPane.showMessageDialog(null, "Nem rendelt pizzát!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            int total = hawaiCount * 1600 + magyarosCount * 1780 + szalamisCount * 1900;
            String contactInfo = isTelefonszamSelected ?
            "Hamarosan felhívjuk önt a " + TelefonszamField.getText() + " számon." :
            "Hamarosan értesítjük önt az " + EmailcimField.getText() + " email címen.";
            String paymentInfo = isPaymentOnDelivery ? "Az árut átvételkor kifizetheti!" : "";
            String message = String.format("Kedves %s,\n\n%s\n%s\n\n%d Hawai Pizza, %d Magyaros Pizza, %d Szalámis Pizza.\n\nVégösszeg: %d Ft",
                name, contactInfo, paymentInfo, hawaiCount, magyarosCount, szalamisCount, total);
            JOptionPane.showMessageDialog(null, message, "Order Summary", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_RendelésOrderButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataPanel;
    private javax.swing.JTextField EmailcimField;
    private javax.swing.JLabel Hawai;
    private javax.swing.JSpinner HawaiCount;
    private javax.swing.JLabel HawaiPrice;
    private javax.swing.JLabel Magyaros;
    private javax.swing.JSpinner MagyarosCount;
    private javax.swing.JLabel MagyarosPrice;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPanel PizzatypeandpricePanel;
    private javax.swing.JToggleButton RandomTogglebutton;
    private javax.swing.JButton RendelésOrderButton;
    private javax.swing.JLabel Szalamis;
    private javax.swing.JSpinner SzalamisCount;
    private javax.swing.JLabel SzalamisPrice;
    private javax.swing.JTextField TelefonszamField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel llDiceLogo;
    private javax.swing.JPanel llLogo;
    private javax.swing.JLabel llText;
    private javax.swing.JRadioButton rbEmailcim;
    private javax.swing.JRadioButton rbTelefonszam;
    // End of variables declaration//GEN-END:variables
}
