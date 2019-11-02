/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import com.aspose.slides.exceptions.IOException;
import convertidordocumentos.ConvertidorDocumentos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Godoy
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Jpatch = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        icono1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        comboExten = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        icono2 = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Todos los derechos reservados Ⓡ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ufps1.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Convertidor de Documentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Himalaya", 1, 36))); // NOI18N
        jPanel5.setMaximumSize(new java.awt.Dimension(700, 400));
        jPanel5.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanel5.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel5.setLayout(new java.awt.GridLayout(3, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        Jpatch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jpatch.setText("Seleccione el docuemnto a convertir");
        jPanel1.add(Jpatch);

        jButton1.setText("Selecionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jPanel5.add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        icono1.setForeground(new java.awt.Color(255, 255, 255));
        icono1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/archivo.png"))); // NOI18N
        jPanel2.add(icono1);

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        comboExten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboExten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboExtenActionPerformed(evt);
            }
        });
        jPanel4.add(comboExten);

        jButton2.setText("Convertir y Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);

        jPanel2.add(jPanel4);

        icono2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/archivo.png"))); // NOI18N
        jPanel2.add(icono2);

        jPanel5.add(jPanel2);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String aux="";
  try
  {
   /**llamamos el metodo que permite cargar la ventana*/
   JFileChooser file=new JFileChooser();
   file.showOpenDialog(this);
   
   /**abrimos el archivo seleccionado*/
   File abre=file.getSelectedFile();
   aux=abre.getPath();
   this.Jpatch.setText(aux);
      System.out.println(aux);
 
   
   if(abre!=null)
   {     
       int indexPosicion = abre.getName().indexOf(".");
       int length = abre.getName().length();
       String ext =abre.getName().substring(indexPosicion, length);
       String ext2="";
    
       if (ext.equalsIgnoreCase(".docx")||ext.equalsIgnoreCase(".doc")) {
           this.comboExten.removeAllItems();
           this.comboExten.addItem(".odt");
          this.icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/word.png")));
           this.icono1.setVisible(true);
            this.icono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/word1.png")));
           this.icono2.setVisible(true);
       }else {
           if (ext.equalsIgnoreCase(".odt")) {
           this.comboExten.removeAllItems();
           this.comboExten.addItem(".doc");
           this.comboExten.addItem(".docx");
          this.icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/word1.png")));
           this.icono1.setVisible(true);
            this.icono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/word.png")));
           this.icono2.setVisible(true);
       }
       }
       if (ext.equalsIgnoreCase(".xlsx")||ext.equalsIgnoreCase(".xls")) {
           this.comboExten.removeAllItems();
           this.comboExten.addItem(".ods");
          this.icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/excel.png")));
           this.icono1.setVisible(true);
            this.icono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/excel1.png")));
           this.icono2.setVisible(true);
       }else {
           if (ext.equalsIgnoreCase(".ods")) {
           this.comboExten.removeAllItems();
           this.comboExten.addItem(".xlsx");
           this.comboExten.addItem(".xls");
          this.icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/excel1.png")));
           this.icono1.setVisible(true);
            this.icono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/excel.png")));
           this.icono2.setVisible(true);
       }
       }
       if (ext.equalsIgnoreCase(".pptx")||ext.equalsIgnoreCase(".ppt")) {
           this.comboExten.removeAllItems();
           this.comboExten.addItem(".odp");
          this.icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/powerpoint.png")));
           this.icono1.setVisible(true);
            this.icono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/powerpoint1.png")));
           this.icono2.setVisible(true);
       }else {
           if (ext.equalsIgnoreCase(".odp")) {
           this.comboExten.removeAllItems();
           this.comboExten.addItem(".pptx");
           this.comboExten.addItem(".ppt");
          this.icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/powerpoint1.png")));
           this.icono1.setVisible(true);
            this.icono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/powerpoint.png")));
           this.icono2.setVisible(true);
       }
       }
      
    }    
   }
   catch(IOException ex)
   {
     JOptionPane.showMessageDialog(null,ex+"" +
           "\nNo se ha encontrado el archivo",
                 "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboExtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboExtenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboExtenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         convertidordocumentos.ConvertidorDocumentos c= new ConvertidorDocumentos();
            String[] aux= new String[1];
            String combo=comboExten.getSelectedItem().toString();
            String txtFile=this.Jpatch.getText();
            aux=txtFile.split("\\.");
                        
            try { 
            if(aux[1].equalsIgnoreCase("pptx")|| aux[1].equalsIgnoreCase("ppt")){
                c.PptxToOdp(txtFile);
                JOptionPane.showMessageDialog(null,"Se convirtio exitosamente el archivo a odp.");
            }else if(aux[1].equalsIgnoreCase("odp")){
                
                if (combo.equalsIgnoreCase(".pptx")) {
                     c.OdpToPptx(txtFile);
                JOptionPane.showMessageDialog(null,"Se convirtio exitosamente el archivo a pptx.");
                }else{
                     c.OdpToPpt(txtFile);
                JOptionPane.showMessageDialog(null,"Se convirtio exitosamente el archivo a ppt.");
                }
               
            }else if(aux[1].equalsIgnoreCase("ods")){
                if (combo.equalsIgnoreCase(".xlsx")) {
                     c.OdsToXlsx(txtFile);
                 JOptionPane.showMessageDialog(null,"Se convirtio exitosamente el archivo a xlsx.");
                }else{
                     c.OdsToXls(txtFile);
                 JOptionPane.showMessageDialog(null,"Se convirtio exitosamente el archivo a xls.");
                }
               
            }else if(aux[1].equalsIgnoreCase("xlsx")||aux[1].equalsIgnoreCase("xls")){
                c.XlsxToOds(txtFile);
                 JOptionPane.showMessageDialog(null,"Se convirtio exitosamente el archivo a ods.");
            }else if(aux[1].equalsIgnoreCase("docx")||aux[1].equalsIgnoreCase("doc")){
                
                c.DocxToOdt(txtFile);
                JOptionPane.showMessageDialog(null,"Se convirtio exitosamente el archivo a odt.");
            }else if(aux[1].equalsIgnoreCase("odt")){
                
                if (combo.equalsIgnoreCase(".doc")) {
                    
                  c.OdtToDoc(txtFile);
                 JOptionPane.showMessageDialog(null,"Se convirtio exitosamente el archivo a doc.");
                }else{
                    c.OdtToDocx(txtFile);
                 JOptionPane.showMessageDialog(null,"Se convirtio exitosamente el archivo a docx.");
                }
                
            }
            } catch (Exception ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Vista().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jpatch;
    private javax.swing.JComboBox<String> comboExten;
    private javax.swing.JLabel icono1;
    private javax.swing.JLabel icono2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
