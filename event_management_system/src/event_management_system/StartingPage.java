/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_management_system;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author jubel
 */
public class StartingPage extends javax.swing.JPanel {

    /**
     * Creates new form StartingPage
     */
    public StartingPage() {
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

        imageLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(400, 247));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageLabel.setBackground(new java.awt.Color(153, 255, 153));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event_management_system/icon/startNew2.jpg"))); // NOI18N
        imageLabel.setText("jLabel1");
        imageLabel.setMaximumSize(new java.awt.Dimension(400, 247));
        imageLabel.setMinimumSize(new java.awt.Dimension(400, 247));
        imageLabel.setPreferredSize(new java.awt.Dimension(400, 247));
        add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));
    }// </editor-fold>//GEN-END:initComponents
    public void setImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\jubel\\OneDrive\\Documents\\NetBeansProjects\\event_management_system\\src\\event_management_system/start.jpg");
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);
        imageLabel.setIcon(newIcon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    // End of variables declaration//GEN-END:variables
}
