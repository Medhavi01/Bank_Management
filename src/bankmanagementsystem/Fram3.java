
package bankmanagementsystem;

import java.awt.Font;
import javax.swing.*;



public class Fram3 extends JFrame{
    Fram3()
    {
       JLabel l1 = new JLabel("Hello");
       l1.setFont(new Font("serif",Font.BOLD,28));
       l1.setBounds(30,60,200,30);
       setSize(400,400);
       add(l1);
       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new Fram3();
    }
}
