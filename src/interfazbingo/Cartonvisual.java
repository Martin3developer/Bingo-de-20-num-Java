/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazbingo;

/**
 *
 * @author EAG
 */
public class Cartonvisual extends javax.swing.JDialog {

 
    
    /**
     * Creates new form Cartonvisual
     */
    public Cartonvisual(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
               
        //Creamos el carton y añadimos los números a cada casilla
        initComponents();
        
        
        a = new Carton();
        jTextField1.setText(a.numeros[0][0]+"");
        jTextField2.setText(a.numeros[0][1]+"");
        jTextField3.setText(a.numeros[0][2]+"");
        jTextField4.setText(a.numeros[0][3]+"");
        jTextField5.setText(a.numeros[1][0]+"");
        jTextField7.setText(a.numeros[1][1]+"");
        jTextField8.setText(a.numeros[1][2]+"");
        jTextField9.setText(a.numeros[1][3]+"");
        jTextField10.setText(a.numeros[2][0]+"");
        jTextField11.setText(a.numeros[2][2]+"");
        jTextField12.setText(a.numeros[2][3]+"");
        jTextField13.setText(a.numeros[2][1]+"");
       
        
    }
    
    public void actualizarCarton (Cartonvisual b,int bola){
        
       //Recorremos todo el carton en busca de coincidencias con la bola
       //En caso de que se encuentre se sustituye por -1
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                 if(bola==b.a.numeros[i][j]){
                    b.a.numeros[i][j]=-1;
                 } 
            } 
        }
        
        //Recolocamos todos los números
        if(b.a.numeros[0][0]>0){
        jTextField1.setText(b.a.numeros[0][0]+"");
        }else{jTextField1.setText("X");}
        if(b.a.numeros[0][1]>0){
        jTextField2.setText(b.a.numeros[0][1]+"");
        }else{jTextField2.setText("X");}
        if(b.a.numeros[0][2]>0){
        jTextField3.setText(b.a.numeros[0][2]+"");
        }else{jTextField3.setText("X");}
        if(b.a.numeros[0][3]>0){
        jTextField4.setText(b.a.numeros[0][3]+"");
        }else{jTextField4.setText("X");}
        if(b.a.numeros[1][0]>0){
        jTextField5.setText(b.a.numeros[1][0]+"");
        }else{jTextField5.setText("X");}
        if(b.a.numeros[1][1]>0){
        jTextField7.setText(b.a.numeros[1][1]+"");
        }else{jTextField7.setText("X");}
        if(b.a.numeros[1][2]>0){
        jTextField8.setText(b.a.numeros[1][2]+"");
        }else{jTextField8.setText("X");}
        if(b.a.numeros[1][3]>0){
        jTextField9.setText(b.a.numeros[1][3]+"");
        }else{jTextField9.setText("X");}
        if(b.a.numeros[2][0]>0){
        jTextField10.setText(b.a.numeros[2][0]+"");
        }else{jTextField10.setText("X");}
        if(b.a.numeros[2][1]>0){
        jTextField13.setText(b.a.numeros[2][1]+"");
        }else{jTextField13.setText("X");}
        if(b.a.numeros[2][2]>0){
        jTextField11.setText(b.a.numeros[2][2]+"");
        }else{jTextField11.setText("X");}
        if(b.a.numeros[2][3]>0){
        jTextField12.setText(b.a.numeros[2][3]+"");
        }else{jTextField12.setText("X");}
        
       
       
        
    }
    
    public boolean comprobarlineaCarton (Cartonvisual b){
        //Convertimos los números a enteros para comprobar si hay linea
        boolean linea=false;
        String t1=jTextField1.getText();
        String t3=jTextField3.getText();
        String t2=jTextField2.getText();
        String t4=jTextField4.getText();
        String t10=jTextField10.getText();
        String t9=jTextField9.getText();
        String t8=jTextField8.getText();
        String t7=jTextField7.getText();
        String t5=jTextField5.getText();
        String t13=jTextField13.getText();
        String t12=jTextField12.getText();
        String t11=jTextField11.getText();
        
        
        //Comparamos linea por línea si son iguales
        if(t1.equals(t3) && t3.equals(t2) && t2.equals(t4)){
            
            linea=true;
        }
        if(t10.equals(t9) && t9.equals(t8) && t8.equals(t7)){
           
            linea=true;
        }
        if(t5.equals(t13) && t13.equals(t12) && t12.equals(t11)){
           
            linea=true;
        }
     //Devolvemos un true en caso de que alguno lo cumpla
      return linea;
    }
    
    public boolean comprobarBingoCarton (Cartonvisual b){
        //similar al comprobarlineaCarton
        boolean bingo=false;
        String t1=jTextField1.getText();
        String t3=jTextField3.getText();
        String t2=jTextField2.getText();
        String t4=jTextField4.getText();
        String t10=jTextField10.getText();
        String t9=jTextField9.getText();
        String t8=jTextField8.getText();
        String t7=jTextField7.getText();
        String t5=jTextField5.getText();
        String t13=jTextField13.getText();
        String t12=jTextField12.getText();
        String t11=jTextField11.getText();
        
        
        if(t1.equals(t3) && t3.equals(t2) && t2.equals(t4) && t10.equals(t9) && t9.equals(t8) && t8.equals(t7) && t5.equals(t13) && t13.equals(t12) && t12.equals(t11)){
            
            bingo=true;
        }
        return bingo;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(370, 250));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("jTextField1");
        jTextField1.setToolTipText("");
        jTextField1.setAutoscrolls(false);
        jTextField1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextField1.setRequestFocusEnabled(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 43, 70, 50);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("jTextField1");
        jTextField2.setAutoscrolls(false);
        jTextField2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 43, 70, 50);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("jTextField2");
        jTextField3.setAutoscrolls(false);
        jTextField3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(75, 43, 70, 50);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("jTextField1");
        jTextField4.setAutoscrolls(false);
        jTextField4.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextField4.setMaximumSize(new java.awt.Dimension(59, 20));
        jTextField4.setMinimumSize(new java.awt.Dimension(59, 20));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(207, 43, 70, 50);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("jTextField1");
        jTextField5.setAutoscrolls(false);
        jTextField5.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(10, 157, 70, 50);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("jTextField1");
        jTextField7.setAutoscrolls(false);
        jTextField7.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(208, 100, 70, 50);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("jTextField1");
        jTextField8.setAutoscrolls(false);
        jTextField8.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField8);
        jTextField8.setBounds(142, 100, 70, 50);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("jTextField1");
        jTextField9.setAutoscrolls(false);
        jTextField9.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField9);
        jTextField9.setBounds(76, 100, 70, 50);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("jTextField1");
        jTextField10.setAutoscrolls(false);
        jTextField10.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField10);
        jTextField10.setBounds(10, 100, 70, 50);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("jTextField1");
        jTextField11.setAutoscrolls(false);
        jTextField11.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField11);
        jTextField11.setBounds(208, 157, 70, 50);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("jTextField1");
        jTextField12.setAutoscrolls(false);
        jTextField12.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField12);
        jTextField12.setBounds(142, 157, 70, 50);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("jTextField1");
        jTextField13.setAutoscrolls(false);
        jTextField13.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(jTextField13);
        jTextField13.setBounds(76, 157, 70, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazbingo/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 390, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Cartonvisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartonvisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartonvisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartonvisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cartonvisual dialog = new Cartonvisual(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                   
                    
                    
                    
                    
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    public Carton a;
   
}
