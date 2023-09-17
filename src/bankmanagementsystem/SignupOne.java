package bankmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

public class SignupOne extends JFrame implements ActionListener{
        JTextField tf1,tf2,tf3,tf4,tf5;
        JButton b1;
        JRadioButton male,female;
        long random;
    SignupOne(){
        
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L)+ 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Osward",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel pers_detail = new JLabel("Page1 : Personal Details");
        pers_detail.setFont(new Font("Railway",Font.BOLD,22));
        pers_detail.setBounds(290,80,300,30);
        add(pers_detail);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Railway",Font.BOLD,18));
        name.setBounds(100,140,100,30);
        add(name);
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Railway",Font.BOLD,14));
        tf1.setBounds(300, 140,400,30);
        add(tf1);
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Railway",Font.BOLD,18));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        tf2 = new JTextField();
        tf2.setFont(new Font("Railway",Font.BOLD,14));
        tf2.setBounds(300, 190,400,30);
        add(tf2);
        
        JLabel Mname = new JLabel("Mother's Name :");
        Mname.setFont(new Font("Railway",Font.BOLD,18));
        Mname.setBounds(100,240,200,30);
        add(Mname);
        
        tf5 = new JTextField();
        tf5.setFont(new Font("Railway",Font.BOLD,14));
        tf5.setBounds(300, 240,400,30);
        add(tf5);
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Railway",Font.BOLD,18));
        gender.setBounds(100,290,300,30);
        add(gender);
        
        male = new JRadioButton("MALE");
        male.setBounds(300, 290, 60, 30);
        add(male);
        female = new JRadioButton("FEMALE");
        female.setBounds(450,290,100,30);
        add(female);
        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);
        
        JLabel email = new JLabel("Email :");
        email.setFont(new Font("Railway",Font.BOLD,18));
        email.setBounds(100,340,200,30);
        add(email);
        
        tf3 = new JTextField();
        tf3.setFont(new Font("Railway",Font.BOLD,14));
        tf3.setBounds(300, 340,400,30);
        add(tf3);
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Railway",Font.BOLD,18));
        city.setBounds(100,390,200,30);
        add(city);
        
        tf4 = new JTextField();
        tf4.setFont(new Font("Railway",Font.BOLD,14));
        tf4.setBounds(300, 390,400,30);
        add(tf4);
        
        
        b1 = new JButton("Next");
        b1.setBounds(600, 470, 100, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
                
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,600);
        setLayout(null);
        setLocation(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ac){
        String formn = "" + random;
        String name = tf1.getText();
        String fname = tf2.getText();
        String Mname = tf5.getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if (female.isSelected()){
            gender = "Female";
        }
        String email = tf3.getText();
        String city = tf4.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Fill Your Name");
            }else{
                Conn c1 = new Conn();
                String cmnd = "insert into signup values('"+formn+"','"+name+"','"+fname+"','"+Mname+"','"+gender+"','"+email+"','"+city+"')";
                c1.s.executeUpdate(cmnd);
            }
            
            
        }catch(HeadlessException | SQLException e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]){
        new SignupOne();
    }
}
