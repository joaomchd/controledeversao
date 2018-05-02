/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeversao;

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author João Victor Machado
 */

public class HomeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeJFrame
     */
    public int fontsize = 18;
    
    public HomeJFrame() {
        this.setUndecorated(true);
        
        initComponents();
        
        Resultado.setMargin( new Insets(15,0,15,0) );
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));

        ScrollPane.setOpaque(false);
        ScrollPane.getViewport().setOpaque(false);
        ScrollPane.setBorder(null);
        ScrollPane.setViewportBorder(null);
        
        ScrollPane.getHorizontalScrollBar().addAdjustmentListener(new AdjustmentListener(){
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            repaint();
        }
        });
        ScrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener(){
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            repaint();
        }
        });
        Resultado.addCaretListener(new CaretListener() {
                    @Override
                    public void caretUpdate(CaretEvent e) {
                        repaint();
                    }
                });
        Resultado.setBackground(new Color(50,50,50,240));
        LabelTexto1.setBackground(new Color(50,50,50,240));
        LabelTexto1.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                repaint();
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        LabelTexto2.setBackground(new Color(50,50,50,240));

        TextLineNumber tln = new TextLineNumber(Resultado);
        ScrollPane.setRowHeaderView(tln);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoTexto1 = new javax.swing.JButton();
        LabelTexto1 = new javax.swing.JLabel();
        BotaoTexto2 = new javax.swing.JButton();
        LabelTexto2 = new javax.swing.JLabel();
        DiminuirTexto = new javax.swing.JButton();
        copybutton = new javax.swing.JButton();
        AumentarTexto = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Versões");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoTexto1.setBackground(new java.awt.Color(0, 0, 0));
        BotaoTexto1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        BotaoTexto1.setForeground(new java.awt.Color(250, 250, 250));
        BotaoTexto1.setText("ANTIGO");
        BotaoTexto1.setFocusPainted(false);
        BotaoTexto1.setOpaque(false);
        BotaoTexto1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/controledeversao/buttonold.png"))); // NOI18N
        BotaoTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTexto1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 140, 40));

        LabelTexto1.setBackground(new java.awt.Color(80, 80, 80));
        LabelTexto1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LabelTexto1.setForeground(new java.awt.Color(250, 250, 250));
        LabelTexto1.setToolTipText("Caminho do arquivo antigo");
        LabelTexto1.setFocusable(false);
        LabelTexto1.setOpaque(true);
        LabelTexto1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LabelTexto1InputMethodTextChanged(evt);
            }
        });
        getContentPane().add(LabelTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 800, 40));

        BotaoTexto2.setBackground(new java.awt.Color(0, 0, 0));
        BotaoTexto2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        BotaoTexto2.setForeground(new java.awt.Color(250, 250, 250));
        BotaoTexto2.setText("ATUAL");
        BotaoTexto2.setFocusPainted(false);
        BotaoTexto2.setOpaque(false);
        BotaoTexto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTexto2ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 140, 40));

        LabelTexto2.setBackground(new java.awt.Color(80, 80, 80));
        LabelTexto2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LabelTexto2.setForeground(new java.awt.Color(250, 250, 250));
        LabelTexto2.setToolTipText("Caminho do arquivo atual");
        LabelTexto2.setOpaque(true);
        getContentPane().add(LabelTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 800, 40));

        DiminuirTexto.setBackground(new java.awt.Color(0, 0, 0));
        DiminuirTexto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DiminuirTexto.setForeground(new java.awt.Color(250, 250, 250));
        DiminuirTexto.setText("-");
        DiminuirTexto.setToolTipText("Diminuir tamanho da letra");
        DiminuirTexto.setFocusPainted(false);
        DiminuirTexto.setOpaque(false);
        DiminuirTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiminuirTextoActionPerformed(evt);
            }
        });
        getContentPane().add(DiminuirTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 45, 30));

        copybutton.setBackground(new java.awt.Color(0, 0, 0));
        copybutton.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        copybutton.setForeground(new java.awt.Color(250, 250, 250));
        copybutton.setText("COPIAR");
        copybutton.setToolTipText("Copiar tudo");
        copybutton.setFocusPainted(false);
        copybutton.setOpaque(false);
        copybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copybuttonActionPerformed(evt);
            }
        });
        getContentPane().add(copybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 400, 110, 30));

        AumentarTexto.setBackground(new java.awt.Color(0, 0, 0));
        AumentarTexto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AumentarTexto.setForeground(new java.awt.Color(250, 250, 250));
        AumentarTexto.setText("+");
        AumentarTexto.setToolTipText("Aumentar tamanho da letra");
        AumentarTexto.setFocusPainted(false);
        AumentarTexto.setOpaque(false);
        AumentarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AumentarTextoActionPerformed(evt);
            }
        });
        getContentPane().add(AumentarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 45, 30));

        Resultado.setEditable(false);
        Resultado.setBackground(new java.awt.Color(200, 200, 200));
        Resultado.setColumns(20);
        Resultado.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        Resultado.setForeground(new java.awt.Color(255, 255, 255));
        Resultado.setRows(5);
        Resultado.setToolTipText("Resultado da comparação");
        Resultado.setAutoscrolls(false);
        Resultado.setCaretColor(new java.awt.Color(51, 255, 102));
        Resultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Resultado.setDisabledTextColor(new java.awt.Color(0, 204, 51));
        Resultado.setSelectionColor(new java.awt.Color(102, 255, 102));
        ScrollPane.setViewportView(Resultado);

        getContentPane().add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 950, 440));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(250, 250, 250));
        jButton1.setText("ANALISAR");
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 170, 170, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(250, 250, 250));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controledeversao/minimizebutton.png"))); // NOI18N
        jButton2.setToolTipText("Minimizar");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/controledeversao/minimizebuttonpressed.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/controledeversao/minimizebuttonhover.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 110, 40, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(250, 250, 250));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controledeversao/closebutton.png"))); // NOI18N
        jButton3.setToolTipText("Encerrar programa");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setOpaque(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/controledeversao/closebuttonselected.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/controledeversao/closebuttonhover.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 110, 40, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controledeversao/title.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 620, 70));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Selecione os arquivos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 250, 40));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controledeversao/hehehexd.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 690));

        fundo.setBackground(new java.awt.Color(250, 250, 250));
        fundo.setForeground(new java.awt.Color(250, 250, 250));
        fundo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fundo.setOpaque(true);
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 1090, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(LabelTexto1.getText().equals("") || LabelTexto2.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios.", "Escolha os arquivos para analisar", JOptionPane.WARNING_MESSAGE);
    }else{
       
    if(LabelTexto1.getText().equals(LabelTexto2.getText())){
        JOptionPane.showMessageDialog(null, "Um arquivo não pode ser comparado com ele mesmo.", "Escolha arquivos diferentes", JOptionPane.WARNING_MESSAGE);
    }
        
    String substring1 = LabelTexto1.getText().length() > 3 ? LabelTexto1.getText().substring(LabelTexto1.getText().length() - 3) : LabelTexto1.getText();
    String substring2 = LabelTexto2.getText().length() > 3 ? LabelTexto2.getText().substring(LabelTexto2.getText().length() - 3) : LabelTexto2.getText();
       
   String home = System.getProperty("user.home");
   
    if(substring1.equals("png") || substring2.equals("png")){
       if(substring1.equals(substring2)){
           //Processo de diff de imagem inserir aqui
           String imagediff = "powershell & " + "\"" + home + "\\Documents\\NetBeansProjects\\ControleDeVersao\\libs\\node_modules\\.bin\\pixelmatch.cmd" + "\"" + " \"" + LabelTexto1.getText() + "\" " + "\"" + LabelTexto2.getText() + "\" " + "\"" + "C:\\Users\\joaov\\Documents\\output.png" + "\" " + "0.1";
           String opendiff = "cmd /c " + "\"" + home + "\\Documents\\output.png" + "\""; 
            try{
               //System.out.println(imagediff);
               Process p = Runtime.getRuntime().exec(imagediff);
               StringBuffer cmd_out = new StringBuffer("");
    if(p != null){
        BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String buf = "";
        try{
            while((buf = is.readLine()) != null){
                cmd_out.append(buf);
                cmd_out.append("\n");
            }
        is.close();
        is = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        while((buf = is.readLine()) != null){
            cmd_out.append(buf);
            cmd_out.append("\n");
        }
        is.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
    String resultado =  cmd_out.toString();
               System.out.println(resultado);
               System.out.println("O diff foi realizado com sucesso");
               //Abre a imagem de output do diff
               Process open = Runtime.getRuntime().exec(opendiff);
               
           }catch(Exception e){
               System.out.println("Deu alguma coisa errada e caiu no catch do processo indo pro CLI");
               System.out.println(imagediff);
           }
       }else{
           JOptionPane.showMessageDialog(null, "Não se pode comparar arquivos de imagem com arquivos de texto.",
                   "Arquivos não compatíveis", JOptionPane.WARNING_MESSAGE);
       }
        
    }else{
        
    String gitdiff = "git diff --no-index "+ "\"" +LabelTexto1.getText() + "\"" + " " + "\"" + 
                LabelTexto2.getText() + "\"";
    
                
    if(substring1.equals(substring2)){
    try {
            
            
         Process p = Runtime.getRuntime().exec(gitdiff);
            
            
    StringBuffer cmd_out = new StringBuffer("");
    if(p != null){
        BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String buf = "";
        try{
            while((buf = is.readLine()) != null){
                cmd_out.append(buf);
                cmd_out.append("\n");
            }
        is.close();
        is = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        while((buf = is.readLine()) != null){
            cmd_out.append(buf);
            cmd_out.append("\n");
        }
        is.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
    String resultado =  cmd_out.toString();
    
    
    String s1 = resultado.substring(resultado.indexOf("@@")+1);
    s1.trim();

            
        s1 = s1.replaceAll("^@(.*)@@\n", "");
        s1 = s1.replace("\\ No newline at end of file\n", "");
        s1 = Pattern.compile("^([$+-])(.*)", Pattern.MULTILINE).matcher(s1).replaceAll("$1 $2");
    

        Resultado.setText(s1);
        
    
        } catch (IOException ex) {
            Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else{
        JOptionPane.showMessageDialog(null, "As versões devem ser do mesmo formato", "Formatos diferentes", JOptionPane.WARNING_MESSAGE);
    }
    }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotaoTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTexto1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser1 = new JFileChooser();
        chooser1.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Texto(Plain) ou imagem(PNG)(*.txt, *.php, *.png, *.java, *.html, *.js, *.py, *.c, *.cpp)","php","txt","png","java","html","js","py","c","cpp");
        chooser1.setFileFilter(fnef);
        javax.swing.Action details = chooser1.getActionMap().get("viewTypeDetails");
        details.actionPerformed(null);
        chooser1.showOpenDialog(null);
        try{
            File f1 = chooser1.getSelectedFile();
            String filename1 = f1.getAbsolutePath();
            LabelTexto1.setText(filename1);
        }catch(Exception e){
            System.out.println("Nenhum arquivo antigo foi escolhido na seleção.");
        }
    }//GEN-LAST:event_BotaoTexto1ActionPerformed

    private void BotaoTexto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTexto2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser2 = new JFileChooser();
        chooser2.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Texto(Plain) ou imagem(PNG)(*.txt, *.php, *.png, *.java, *.html, *.js, *.py, *.c, *.cpp)","php","txt","png","java","html","js","py","c","cpp");
        chooser2.setFileFilter(fnef);
        javax.swing.Action details = chooser2.getActionMap().get("viewTypeDetails");
        details.actionPerformed(null);
        chooser2.showOpenDialog(null);
        try{
            File f2 = chooser2.getSelectedFile();
            String filename2 = f2.getAbsolutePath();
            LabelTexto2.setText(filename2);
        }catch(Exception e){
            System.out.println("Nenhum arquivo atualizado foi escolhido na seleção.");
        }
        
    }//GEN-LAST:event_BotaoTexto2ActionPerformed

    private void LabelTexto1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LabelTexto1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelTexto1InputMethodTextChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void AumentarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AumentarTextoActionPerformed
        // TODO add your handling code here:
        if(fontsize < 28){
            fontsize+=2;
        
            if(fontsize > 10){
                DiminuirTexto.setEnabled(true);
            }
        
            if(fontsize >= 28){
                AumentarTexto.setEnabled(false);
            }
            
            Resultado.setFont(new Font("Consolas", Font.PLAIN, fontsize));
            this.repaint();
        }
    }//GEN-LAST:event_AumentarTextoActionPerformed

    private void DiminuirTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiminuirTextoActionPerformed
        // TODO add your handling code here:
        if(fontsize > 10){
            fontsize-=2;
            
            if(fontsize <= 10){
                DiminuirTexto.setEnabled(false);
            }
            
            if(fontsize < 28){
                AumentarTexto.setEnabled(true);
            }
            
            Resultado.setFont(new Font("Consolas", Font.PLAIN, fontsize));
            this.repaint();
        }
    }//GEN-LAST:event_DiminuirTextoActionPerformed

    private void copybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copybuttonActionPerformed
        // TODO add your handling code here:
        String copia = Resultado.getText();
        StringSelection stringSelection = new StringSelection(copia);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_copybuttonActionPerformed

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
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AumentarTexto;
    private javax.swing.JButton BotaoTexto1;
    private javax.swing.JButton BotaoTexto2;
    private javax.swing.JButton DiminuirTexto;
    private javax.swing.JLabel LabelTexto1;
    private javax.swing.JLabel LabelTexto2;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton copybutton;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
