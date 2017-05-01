<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anmol
 */
import FileHandler.FileRead;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Toolkit tk=Toolkit.getDefaultToolkit();
    int ppi=tk.getScreenResolution();
    
    char[] pass=new char[30];
    private String username;
    private char[] password; 
    private String userDetailsString;
    File userDetails, currentUserIndex;
    int currentUser;
    
    public Login() {
        initComponents();
        setTitle("Shopping App");
        PasswordNMatch.setVisible(false);
        System.out.println(ppi);
        try {
            userDetails = new File("UserLoginDetails.txt");
            currentUserIndex = new File("CurrentUserIndex.txt");
            if(!currentUserIndex.exists())
                currentUserIndex.createNewFile();
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        getFileText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Uname = new javax.swing.JTextField();
        Pword = new javax.swing.JPasswordField();
        Submit = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        PasswordNMatch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1121, 721));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1121, 703));
        setSize(new java.awt.Dimension(540, 400));

        jLabel1.setFont(new java.awt.Font("TOMMY HILFIGER AF", 0, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shopping App");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Password  :");

        Uname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameActionPerformed(evt);
            }
        });

        Pword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwordActionPerformed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Register.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        PasswordNMatch.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PasswordNMatch.setForeground(new java.awt.Color(255, 0, 0));
        PasswordNMatch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordNMatch.setText("Username or password Invalid!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(411, 411, 411)
                                .addComponent(PasswordNMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pword, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(PasswordNMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pword, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnameActionPerformed

    private void PwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PwordActionPerformed
    
    
     public void getFileText() {
        try {
            userDetailsString = "";
            BufferedReader br = new BufferedReader(new FileReader(userDetails));
            String line;
            while((line = br.readLine()) != null) {
                userDetailsString += line +"\n";
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("userDetailsString: " + userDetailsString);
    }
    public void writeUserInfo() {
        System.out.println("WRITING USER INFO");
        try {
            StringBuffer sb = new StringBuffer(userDetailsString);
            int start = sb.indexOf("$", sb.indexOf("$", currentUser) + 1);
            int end = sb.indexOf("|", start);
            System.out.println("start " + start + " end " + end);
            String f = sb.substring(start, end);
            System.out.println("USER DETAILS: ");
            System.out.println(f);
            PrintWriter pw = new PrintWriter(new FileWriter("UserDetails.txt"));
            pw.println(f);
            pw.close();
        }
        catch (Exception e) {
            System.out.println("File error: " + e);
        }
    }
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        username=Uname.getText();
        pass=Pword.getPassword();
        System.out.println(pass);
        String p = "";
        for(char c : pass)
            p += c;
        
        
      try {
            if(!validateUser(username, p))
            {
                PasswordNMatch.setVisible(true);
            }
            
            else {
                PasswordNMatch.setVisible(false);
                ShopCart shopcart=new ShopCart();
                shopcart.setVisible(true);
                this.setVisible(false);
            }   
        }
        catch (Exception e) {
            System.out.println("File error " + e);
        }
        
        
    }//GEN-LAST:event_SubmitActionPerformed
 public boolean validateUser(String useText, String pasText) throws IOException { //Validates the username and password from registration file
        
        System.out.println("UseText: " + useText + " pasText: " + pasText);
        String userText,passText;
        System.out.println("userDetails: " + userDetailsString + ": userDetails");
        boolean val = false;
        StringBuffer sb = new StringBuffer(userDetailsString);
        System.out.println("String Buffer " + sb);
        int increment = 0;
        increment = sb.indexOf("*");
        System.out.println("increment before " + increment);
        if(increment != -1) {
            do {
                int userStart = increment;
                currentUser = userStart;
                int userEnd = sb.indexOf("*",userStart + 1);
                int passStart = sb.indexOf("$",userEnd + 1);
                int passEnd = sb.indexOf("$",passStart + 1);
                System.out.println("userStart: " + userStart + " userEnd " + userEnd + " passStart " + passStart + " passEnd " + passEnd);
                userText = sb.substring(userStart + 1,userEnd);
                passText = sb.substring(passStart + 1,passEnd);
                System.out.println("UserText: " + userText + " PassText: " + passText);
                if(useText.equals(userText)) {
                    if(pasText.equals(passText)) {
                        storeCurrentUserIndex();
                        return true;
                    }
                    val = false;
                }
                else
                    val = false;
                increment = sb.indexOf("*",passEnd);
            }while(increment != -1);
            return false;
        }
        return false;
    }
    
    public void storeCurrentUserIndex() { //Stores the current user data location in file to access user information
        try {
            PrintWriter pw = new PrintWriter(currentUserIndex);
            pw.println(currentUser);
            pw.close();
        }
        catch (Exception e) {
            System.out.println("File error: " + e);
        }
        
        
    }
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        Uname.setText("");
        Pword.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        RegistrationForm Registration=new RegistrationForm();
        Registration.setVisible(true);
    }//GEN-LAST:event_RegisterActionPerformed

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
    private javax.swing.JLabel PasswordNMatch;
    private javax.swing.JPasswordField Pword;
    private javax.swing.JButton Register;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField Uname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anmol
 */
import FileHandler.FileRead;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Toolkit tk=Toolkit.getDefaultToolkit();
    int ppi=tk.getScreenResolution();
    
    char[] pass=new char[30];
    private String username;
    private char[] password; 
    private String userDetailsString;
    File userDetails, currentUserIndex;
    int currentUser;
    
    public Login() {
        initComponents();
        setTitle("Shopping App");
        PasswordNMatch.setVisible(false);
        System.out.println(ppi);
        try {
            userDetails = new File("UserLoginDetails.txt");
            currentUserIndex = new File("CurrentUserIndex.txt");
            if(!currentUserIndex.exists())
                currentUserIndex.createNewFile();
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        getFileText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Uname = new javax.swing.JTextField();
        Pword = new javax.swing.JPasswordField();
        Submit = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        PasswordNMatch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1121, 721));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1121, 703));
        setSize(new java.awt.Dimension(540, 400));

        jLabel1.setFont(new java.awt.Font("TOMMY HILFIGER AF", 0, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shopping App");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Password  :");

        Uname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameActionPerformed(evt);
            }
        });

        Pword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwordActionPerformed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Register.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        PasswordNMatch.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PasswordNMatch.setForeground(new java.awt.Color(255, 0, 0));
        PasswordNMatch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordNMatch.setText("Username or password Invalid!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(411, 411, 411)
                                .addComponent(PasswordNMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pword, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(PasswordNMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pword, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnameActionPerformed

    private void PwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PwordActionPerformed
    
    
     public void getFileText() {
        try {
            userDetailsString = "";
            BufferedReader br = new BufferedReader(new FileReader(userDetails));
            String line;
            while((line = br.readLine()) != null) {
                userDetailsString += line +"\n";
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("userDetailsString: " + userDetailsString);
    }
    public void writeUserInfo() {
        System.out.println("WRITING USER INFO");
        try {
            StringBuffer sb = new StringBuffer(userDetailsString);
            int start = sb.indexOf("$", sb.indexOf("$", currentUser) + 1);
            int end = sb.indexOf("|", start);
            System.out.println("start " + start + " end " + end);
            String f = sb.substring(start, end);
            System.out.println("USER DETAILS: ");
            System.out.println(f);
            PrintWriter pw = new PrintWriter(new FileWriter("UserDetails.txt"));
            pw.println(f);
            pw.close();
        }
        catch (Exception e) {
            System.out.println("File error: " + e);
        }
    }
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        username=Uname.getText();
        pass=Pword.getPassword();
        System.out.println(pass);
        String p = "";
        for(char c : pass)
            p += c;
        
        
      try {
            if(!validateUser(username, p))
            {
                PasswordNMatch.setVisible(true);
            }
            
            else {
                PasswordNMatch.setVisible(false);
                ShopCart shopcart=new ShopCart();
                shopcart.setVisible(true);
                this.setVisible(false);
            }   
        }
        catch (Exception e) {
            System.out.println("File error " + e);
        }
        
        
    }//GEN-LAST:event_SubmitActionPerformed
 public boolean validateUser(String useText, String pasText) throws IOException { //Validates the username and password from registration file
        
        System.out.println("UseText: " + useText + " pasText: " + pasText);
        String userText,passText;
        System.out.println("userDetails: " + userDetailsString + ": userDetails");
        boolean val = false;
        StringBuffer sb = new StringBuffer(userDetailsString);
        System.out.println("String Buffer " + sb);
        int increment = 0;
        increment = sb.indexOf("*");
        System.out.println("increment before " + increment);
        if(increment != -1) {
            do {
                int userStart = increment;
                currentUser = userStart;
                int userEnd = sb.indexOf("*",userStart + 1);
                int passStart = sb.indexOf("$",userEnd + 1);
                int passEnd = sb.indexOf("$",passStart + 1);
                System.out.println("userStart: " + userStart + " userEnd " + userEnd + " passStart " + passStart + " passEnd " + passEnd);
                userText = sb.substring(userStart + 1,userEnd);
                passText = sb.substring(passStart + 1,passEnd);
                System.out.println("UserText: " + userText + " PassText: " + passText);
                if(useText.equals(userText)) {
                    if(pasText.equals(passText)) {
                        storeCurrentUserIndex();
                        return true;
                    }
                    val = false;
                }
                else
                    val = false;
                increment = sb.indexOf("*",passEnd);
            }while(increment != -1);
            return false;
        }
        return false;
    }
    
    public void storeCurrentUserIndex() { //Stores the current user data location in file to access user information
        try {
            PrintWriter pw = new PrintWriter(currentUserIndex);
            pw.println(currentUser);
            pw.close();
        }
        catch (Exception e) {
            System.out.println("File error: " + e);
        }
        
        
    }
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        Uname.setText("");
        Pword.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        RegistrationForm Registration=new RegistrationForm();
        Registration.setVisible(true);
    }//GEN-LAST:event_RegisterActionPerformed

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
    private javax.swing.JLabel PasswordNMatch;
    private javax.swing.JPasswordField Pword;
    private javax.swing.JButton Register;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField Uname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> d721c2e2c9cdab5a3dfc5d9a9765ce9a63e25ab2
