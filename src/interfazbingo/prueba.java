/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazbingo;

import java.net.URL;
import javax.swing.ImageIcon;

public class prueba extends javax.swing.JFrame {

    public prueba() {
        initComponents();
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bolaSaliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TLinea = new javax.swing.JLabel();
        TLinea1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        numPantalla = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        futureMenuItem = new javax.swing.JMenuItem();
        westMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BINGO");
        setPreferredSize(new java.awt.Dimension(670, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        bolaSaliente.setFont(new java.awt.Font("Arial Black", 1, 70)); // NOI18N
        bolaSaliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bolaSaliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(bolaSaliente);
        bolaSaliente.setBounds(450, 210, 210, 170);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazbingo/bola.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 220, 210, 170);

        TLinea.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        getContentPane().add(TLinea);
        TLinea.setBounds(30, 280, 230, 80);

        TLinea1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        getContentPane().add(TLinea1);
        TLinea1.setBounds(30, 210, 230, 80);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("EL...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 200, 62, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sacar una bola");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 320, 150, 22);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazbingo/bombo.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(250, 160, 160, 170);

        jButton1.setText("Comprar Carton");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 390, 130, 23);

        numPantalla.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        numPantalla.setForeground(new java.awt.Color(255, 255, 255));
        numPantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numPantalla.setText("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20");
        getContentPane().add(numPantalla);
        numPantalla.setBounds(0, 110, 670, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazbingo/Sin título-1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 448);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Juego");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Nuevo");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Aspecto");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        futureMenuItem.setMnemonic('d');
        futureMenuItem.setText("Futurista");
        futureMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                futureMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(futureMenuItem);

        westMenuItem1.setMnemonic('d');
        westMenuItem1.setText("Oeste");
        westMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                westMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(westMenuItem1);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Creador");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
    int cont=0;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Creamos el carton y lo guardamos en un array
        Cartonvisual Carton1=new Cartonvisual(this,false);
        Carton1.setTitle("Carton numero "+(cont+1));
        Cartones[cont]=Carton1;
        Cartones[cont].setVisible(rootPaneCheckingEnabled);
        
        //Al crear un nuevo carton tenemos que agrandar el array. 
        //Utilizamos aumento como base para aumentar su tamaño
        Cartonvisual[] aumento=new Cartonvisual[Cartones.length+1];
        for (int i = 0; i < Cartones.length; i++) {
            aumento[i]=Cartones[i];
        }
        Cartones=aumento;
        cont++;
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
           
    //Inicializamos variables para la partida
    int bolas=0;    
    int[] repetidas=new int[20];
    String []numerospantalla={"1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","11 ","12 ","13 ","14 ","15 ","16 ","17 ","18 ","19 ","20"};
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
            if(cont<=0){
                //sin cartones no se puede jugar
            }else{
                 //Sacamos una bola
                    boolean repetida=false;
                    int bola=0;
                    do{
                        repetida=false;
                        bola=(int)(Math.random()*20+1);
                        for (int i = 0; i < 20; i++) {
                            if(bola==repetidas[i]){repetida=true;}      
                        }            
                    }while(repetida==true);

                    //me gustaría que desapareciese el número
                    bolaSaliente.setText("");
                    //Esperamos para crear tension 
                    try{
                                Thread.sleep(500);
                            }catch(InterruptedException e){
                                System.out.println("Uy!!");
                            }


                    repetidas[bolas]=bola;//Guardamos la bola para que no salga repetida
                    bolas++;
                    bolaSaliente.setText(bola+"");
                    numerospantalla[bola-1]="X ";//El numero que sale se sustituye por una X
                    String pantalla="";

                    //Pintamos los números en la pantalla
                    for (int i = 0; i < numerospantalla.length; i++) {
                    pantalla=pantalla+numerospantalla[i];
                     }
                    numPantalla.setText(pantalla);
                    //Comprobación de linea
                    for (int i = 0; i < Cartones.length-1; i++) {
                    Cartones[i].actualizarCarton(Cartones[i], bola);
                        if(Cartones[i].comprobarlineaCarton(Cartones[i])==true && linea !=true){
                            linea=true;
                            TLinea1.setText("El carton "+(i+1)+" Linea!!!");
                        }
                    }
                    //Comprobación de bingo
                    for (int i = 0; i < Cartones.length-1; i++) {
                    Cartones[i].actualizarCarton(Cartones[i], bola);
                        if(Cartones[i].comprobarBingoCarton(Cartones[i])==true){

                            bingo=true;
                            TLinea.setText("El carton "+(i+1)+" Bingo!!!");
                            jButton3.setEnabled(false);

                        }
                    }

                    jButton1.setEnabled(false);

            }
           
    }//GEN-LAST:event_jButton3ActionPerformed


    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        for (int i = 0; i < Cartones.length-1; i++) {
             Cartones[i].setVisible(false);  
        }
    cont=0;
    bolas=0;    
    repetidas=new int[20];
    
    numerospantalla=nuevosnumeros;
    String pantalla="";
    for (int i = 0; i < numerospantalla.length; i++) {
            pantalla=pantalla+numerospantalla[i];
             }
             
            numPantalla.setText(pantalla);   
        
     Cartones=new Cartonvisual[1];   
     linea=false;
     bingo=false;
     jButton1.setEnabled(true);
     bolaSaliente.setText("");
     jButton3.setEnabled(true);
 
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
    
    }//GEN-LAST:event_editMenuActionPerformed

    private void futureMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_futureMenuItemActionPerformed
        String path="/interfazbingo/Sin título-1.png";
        path="/interfazbingo/Sin título-2.png";
        URL url = this.getClass().getResource(path);
        ImageIcon icon=new ImageIcon(url);
        
       icon=new ImageIcon(url);
       this.jLabel1.setIcon(icon);
    }//GEN-LAST:event_futureMenuItemActionPerformed

    private void westMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_westMenuItem1ActionPerformed
        String path="/interfazbingo/Sin título-2.png";
        path="/interfazbingo/Sin título-1.png";
        URL url = this.getClass().getResource(path);
        ImageIcon icon=new ImageIcon(url);
        
       icon=new ImageIcon(url);
       this.jLabel1.setIcon(icon);
    }//GEN-LAST:event_westMenuItem1ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
             sobreMi enlace =new sobreMi(this,false);
             enlace.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TLinea;
    private javax.swing.JLabel TLinea1;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel bolaSaliente;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem futureMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel numPantalla;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem westMenuItem1;
    // End of variables declaration//GEN-END:variables
    private final String [] nuevosnumeros={"1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","11 ","12 ","13 ","14 ","15 ","16 ","17 ","18 ","19 ","20"};
    public Cartonvisual[] Cartones=new Cartonvisual[1];   
    public boolean linea=false;
    public boolean bingo=false;
    
     
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
                
            }
        });
    }            
}

                             
