package vista;

//librerias de conexion
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
public class Login extends javax.swing.JFrame {

     //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    
    public Login() {
        initComponents();
        //para constructor
        this.setTitle("Bievenido a Sistema Libreria Flores");// pone titulo
        this.setLocationRelativeTo(null);//centra la ventana
    }

    //Metodo para conectar a base de datos
    public void conectarBase(){
        try{ //inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bdfloresproyectofinalis","root","");
            JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nFLORES");
            stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1: \n"+ ex);
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:"+ e);
    }
}//termina metodo conectar
      
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpRol = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblbienvenido = new javax.swing.JLabel();
        lblIniciaSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnEntrarSistema = new javax.swing.JButton();
        btnSalirSistema = new javax.swing.JButton();
        optAdministrador = new javax.swing.JRadioButton();
        optEmpleado = new javax.swing.JRadioButton();
        txtUsuario = new javax.swing.JTextField();
        lblImgLogo = new javax.swing.JLabel();
        txtPPassword = new javax.swing.JPasswordField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 100, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 30, 410));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 370, 20));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 30, 410));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 20));

        lblbienvenido.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        lblbienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblbienvenido.setText("¡Bienvenido!");
        jPanel1.add(lblbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 270, -1));

        lblIniciaSesion.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblIniciaSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciaSesion.setText("Inicia Sesión");
        jPanel1.add(lblIniciaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        lblPassword.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        btnEntrarSistema.setBackground(new java.awt.Color(255, 255, 0));
        btnEntrarSistema.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnEntrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Entrar_Icono.png"))); // NOI18N
        btnEntrarSistema.setText("Entrar a Sistema");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrarSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        btnSalirSistema.setBackground(new java.awt.Color(204, 0, 0));
        btnSalirSistema.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnSalirSistema.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Salir_Icono.png"))); // NOI18N
        btnSalirSistema.setText("Salir de Sistema");
        btnSalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirSistemaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalirSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        btnGrpRol.add(optAdministrador);
        optAdministrador.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        optAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        optAdministrador.setText("Administrador");
        jPanel1.add(optAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        btnGrpRol.add(optEmpleado);
        optEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        optEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        optEmpleado.setText("Empleado");
        jPanel1.add(optEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));

        lblImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LogoReporte.png"))); // NOI18N
        jPanel1.add(lblImgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, 100));

        txtPPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jPanel1.add(txtPPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 150, -1));

        lblBackground.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Background.png"))); // NOI18N
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
        conectarBase(); //Lamada a la conexion
        if (optAdministrador.isSelected())//if para usuario administrador
        {
            try {
                String usuarioAcceso=txtUsuario.getText();
                String passwordAcceso=txtPPassword.getText();
                
                boolean error=true;
                rs=stmt.executeQuery("SELECT * from tusuariosadmin");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("usuarioadmin"))&&passwordAcceso.equals(rs.getString("passwordadmin"))){
                        error=false;
                        
                         ConsultaLlaves ventanaCRUDProyecto = new ConsultaLlaves();
                                JOptionPane.showMessageDialog(null, "Bienvenido a sistema Administrador\n"+usuarioAcceso);
                                ventanaCRUDProyecto.setVisible(true);
                                this.hide();
                       
                    }//termina if
                }//termina while
                if(error ==true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar usuario\nVerifica!!!");
                    txtUsuario.setText(usuarioAcceso);
                    txtPPassword.setText(null);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de BD verifica"+ e);
            }
        } else if (optEmpleado.isSelected())//if para usuario empleado
        {
             try {
                String usuarioAcceso=txtUsuario.getText();
                String passwordAcceso=txtPPassword.getText();
                
                boolean error=true;
                rs=stmt.executeQuery("SELECT * from tusuariosempleados");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("usuarioempleado"))&&passwordAcceso.equals(rs.getString("passwordempleado"))){
                        error=false;
                        
                         ConsultaLlavesEmpleado ventanaConsultaLlave = new ConsultaLlavesEmpleado();
                                JOptionPane.showMessageDialog(null, "Bienvenido a sistema Empleado\n"+usuarioAcceso);
                                ventanaConsultaLlave.setVisible(true);
                                this.hide();
                       
                    }//termina if
                }//termina while
                if(error ==true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar usuario\nVerifica!!!");
                    txtUsuario.setText(usuarioAcceso);
                    txtPPassword.setText(null);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de BD verifica"+ e);
            }
        } //Termina if para usuario empleado
    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

    private void btnSalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirSistemaActionPerformed
        int confirmaSalida=JOptionPane.showConfirmDialog(null,"¿Quieres salir?","Mensaje Importante",JOptionPane.YES_NO_OPTION);
        if (confirmaSalida==0) {
            System.exit(0);//cierra ventana
        } 
    }//GEN-LAST:event_btnSalirSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.ButtonGroup btnGrpRol;
    private javax.swing.JButton btnSalirSistema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblIniciaSesion;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblbienvenido;
    private javax.swing.JRadioButton optAdministrador;
    private javax.swing.JRadioButton optEmpleado;
    private javax.swing.JPasswordField txtPPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
