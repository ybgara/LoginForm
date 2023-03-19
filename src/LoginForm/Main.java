package LoginForm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// NAMA : Tegar Wibisana
// NIM  : 123210024

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;       

class loginform extends JFrame implements ActionListener {
    
    private JTextField id ;
    private JPasswordField pw ;
    private JLabel lbl1, lbl2 ;
    private JButton btn1, btn2 ;
    private JFrame form ;
    
    private final JTextField ID = new JTextField("Gara") ;
    private final JPasswordField PW = new JPasswordField("1234") ;

    public loginform() {
        
        form = new JFrame();
        
        setTitle(" Login Form ");
        setSize(500, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        lbl1 = new JLabel("Masukkan Username");
        lbl1.setBounds(100, 60, 300, 50);
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        
        id = new JTextField() ;
        id.setBounds(100, 100, 300, 50);
        id.setVisible(true);
        id.setHorizontalAlignment(SwingConstants.CENTER);
        
        lbl2 = new JLabel("Masukkan Password");
        lbl2.setBounds(100, 160, 300, 50);
        lbl2.setHorizontalAlignment(SwingConstants.CENTER);
        
        pw = new JPasswordField() ;
        pw.setBounds(100, 200, 300, 50);
        pw.setVisible(true);
        pw.setHorizontalAlignment(SwingConstants.CENTER);
        
        btn1 = new JButton(" Login ");
        btn1.setBounds(110, 280, 125, 30);
        btn1.setVisible(true);
        btn1.setHorizontalAlignment(SwingConstants.CENTER);
        btn1.setBackground(Color.GRAY);
        btn1.setForeground(Color.WHITE);
        
        btn2 = new JButton(" Reset ");
        btn2.setBounds(260, 280, 125, 30);
        btn2.setVisible(true);
        btn2.setHorizontalAlignment(SwingConstants.CENTER);
        btn2.setBackground(Color.GRAY);
        btn2.setForeground(Color.WHITE);      
        
        add(lbl1);
        add(id) ;
        add(lbl2) ;
        add(pw) ;
        add(btn1) ;
        add(btn2) ;
        
        setVisible(true);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if( e.getSource() == btn1 ){
        
            if( id.getText().equals(ID.getText()) && pw.getText().equals(PW.getText()) ){
                
                JOptionPane.showMessageDialog(null, "Login Berhasil !") ;
                
                new Success();
                               
                dispose();
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Username atau Password Salah !") ;
                
            }
            
        }
        
        if( e.getSource() == btn2 ){
        
            JOptionPane.showMessageDialog(null, "Reset Berhasil") ;
            
            id.setText("");
            pw.setText("");
            
        }
        
    }

};

public class Main {

    public static void main(String[] args) {

        new loginform();

    }
}