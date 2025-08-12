import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Fun extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3, b4, b5, b6, b7;

    Fun() {
        super("Fun");
        setLayout(null);
        setSize(500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Name:");
        l2 = new JLabel("Age?");
        l3 = new JLabel("Then");
        l4 = new JLabel("Are you Single?");
        l5 = new JLabel("Then");
        l6 = new JLabel("Number of EX?");
        l7 = new JLabel("Then");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();

        b1 = new JButton("<18");
        b2 = new JButton(">=18");
        b3 = new JButton("YES");
        b4 = new JButton("NO");
        b5 = new JButton("0");
        b6 = new JButton("<=2");
        b7 = new JButton(">2");

        l1.setBounds(50, 50, 150, 20);
        t1.setBounds(220, 50, 100, 20);
        l2.setBounds(50, 90, 150, 20);
        b1.setBounds(50, 130, 100, 30);
        b2.setBounds(170, 130, 100, 30);
        l3.setBounds(50, 180, 150, 20);
        t2.setBounds(220, 180, 250, 20);
        l4.setBounds(50, 220, 150, 20);
        b3.setBounds(50, 260, 100, 30);
        b4.setBounds(170, 260, 100, 30);
        l5.setBounds(50, 300, 150, 20);
        t3.setBounds(220, 300, 250, 20);
        l6.setBounds(50, 340, 150, 20);
        b5.setBounds(50, 380, 100, 30);
        b6.setBounds(120, 380, 100, 30);
        b7.setBounds(190, 380, 100, 30);
        l7.setBounds(50, 420, 150, 20);
        t4.setBounds(220, 420, 250, 20);

        add(l1);
        add(t1);
        add(l2);
        add(b1);
        add(b2);
        add(l3);
        add(t2);
        add(l4);
        add(b3);
        add(b4);
        add(l5);
        add(t3);
        add(l6);
        add(b5);
        add(b6);
        add(b7);
        add(l7);
        add(t4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == b1) {
            t2.setText("I will call your MOM!");
        } else if (ae.getSource() == b2) {
            t2.setText("Call ME!");
        } else if (ae.getSource() == b3) {
            t3.setText("Date?");
        } else if (ae.getSource() == b4) {
            t3.setText("GoodBye.");
        } else if (ae.getSource() == b5) {
            t4.setText("Certified GREEN Flag.");
        } else if (ae.getSource() == b6) {
            t4.setText("I will THINK!");
        } else if (ae.getSource() == b7) {
            t4.setText("WALKING RED FLAG!");
        }
    }

    public static void main(String[] args) {
        new Fun();
    }
}
