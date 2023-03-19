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

public class Success extends JFrame implements ActionListener{
    
    private JLabel lbl3 ;
    private JButton btn3 ;
    private JFrame Success ;

    public Success(){
    
        Success = new JFrame();
        setTitle("Logged");
        setSize(500, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        lbl3 = new JLabel("Anda Telah Login");
        lbl3.setBounds(100, 130, 300, 50);
        lbl3.setHorizontalAlignment(SwingConstants.CENTER);
        
        btn3 = new JButton("Logout");
        btn3.setBounds(100, 180, 300, 50);
        btn3.setHorizontalAlignment(SwingConstants.CENTER);
        btn3.setBackground(Color.gray);
        btn3.setForeground(Color.white);
        
        add(lbl3);
        add(btn3) ;
        
        setVisible(true);
        
        btn3.addActionListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if( e.getSource() == btn3 ){
            
            JOptionPane.showMessageDialog(null, "Logout berhasil");
            
            new loginform();
            
            dispose() ;
            
        }
        
    }
    
}