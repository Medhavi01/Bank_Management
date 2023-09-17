package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;

import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    JTextField tf1;
    JPasswordField tf2;
    Login(){
       
       JLabel text = new JLabel("Welcome to AGC ATM"); 
       text.setFont(new Font("Osward",Font.BOLD,38));
       text.setBounds(200, 40, 500, 40);
       setSize(800,480); 
       add(text);
       
       JLabel cardno = new JLabel("Card No. :"); 
       cardno.setFont(new Font("Railway",Font.BOLD,38));
       cardno.setBounds(120, 150, 300, 30);
       add(cardno);
       
       tf1 = new JTextField();
       tf1.setBounds(320,150,250,30);
       add(tf1);
       
       JLabel pin  = new JLabel("PIN :"); 
       pin.setFont(new Font("Railway",Font.BOLD,38));
       pin.setBounds(120, 220, 150, 30); 
       add(pin);
       
       tf2 = new JPasswordField();
       tf2.setBounds(320,220,250,30);
       add(tf2);
       
       b1 = new JButton("SIGN IN");
       b1.setBounds(320, 300, 100, 30);
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.WHITE);
       b1.addActionListener(this);
       add(b1);
       
       b2 = new JButton("CLEAR");
       b2.setBounds(450, 300, 100, 30);
       b2.setBackground(Color.BLACK);
       b2.setForeground(Color.WHITE);
       b2.addActionListener(this);
       add(b2);
       
       b3 = new JButton("SIGN UP");
       b3.setBounds(320, 350, 230, 30);
       b3.setBackground(Color.BLACK);
       b3.setForeground(Color.WHITE);
       b3.addActionListener(this);
       add(b3);
       
       getContentPane().setBackground(Color.WHITE);
       
       setTitle("Bank Management System");
       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ac){
        if(ac.getSource() == b2){
            tf1.setText("");
            tf2.setText("");
        }else if(ac.getSource() == b1){
            
        }else if(ac.getSource() == b3){
            
        }
    }
    public static void main(String args[]){
        new Login();
    }
}
