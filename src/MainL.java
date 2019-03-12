/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DR.Tamer
 */
public class MainL extends JFrame implements ActionListener { 
    // label to diaplay text 
    static JLabel l; 
    static String [] a= new String[5];
    

    // default constructor 
    MainL() 
    { 
    } 

    static JButton draw = new JButton("Withdraw");
    static JButton dep = new JButton("Deposit");
    static JButton bal = new JButton("Balance");
    
    
    public  void main()
    {
        
        // create a label to display text 
        l = new JLabel(" "); 
        
        //creating main frame
        JFrame mainF = new JFrame("ATM machine");
        mainF.setSize(600,400);
        mainF.setLocationRelativeTo(null);
        mainF.setLayout(new GridLayout(5,5));
        mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainF.setVisible(true);

        //creating Withdraw button

        draw.setToolTipText("Click to withdraw");
        draw.setSize(100,100);

        //creating Withdraw button

        dep.setToolTipText("Click to deposit");
        dep.setSize(100,100);

        //creating Withdraw button

        bal.setToolTipText("Click to inqure balance");
        bal.setSize(100,100);

        //creating Withdraw button
        JButton prev = new JButton("PREV");
        prev.setToolTipText("Clich to go to previous");
        prev.setSize(100,50);

        //creating Withdraw button
        JButton next = new JButton("NEXT");
        next.setToolTipText("Click to go to next");
        next.setSize(100,50);

        //adding buttons to frame
        mainF.add(draw);
        mainF.add(dep);
        mainF.add(prev);
        mainF.add(next);
        mainF.add(bal);

        //creatinng Panels
        JPanel up= new JPanel();
        JPanel dow= new JPanel();
        JPanel lab= new JPanel();

        //adding buttons to panels
        up.add(draw);
        up.add(dep);
        up.add(bal);
        dow.add(prev);
        dow.add(next);
        lab.add(l);

        //adding panels to frame
        mainF.add(up);
        mainF.add(dow);
        mainF.add(lab);

        draw.addActionListener((ActionEvent e) -> 
        {
            
            String amount =JOptionPane.showInputDialog(null,"Enter money to be withdrawn:");
            Transactions use =new Transactions(); 
            use.withdraw(amount);
            if(use.getBalance()>Double.valueOf(amount))
            a[0]=amount;
           
        });
       dep.addActionListener((ActionEvent e) -> 
        {
            String amount =JOptionPane.showInputDialog(null,"Enter money to be deposited:");
            Transactions use =new Transactions(); 
            use.dposite(amount);
            
        });
       bal.addActionListener((ActionEvent e) -> 
        {
            Transactions use =new Transactions(); 
            use.setBalance(use.getBalance());
            l.setText("Money in balance ="+Double.toString(use.getBalance())); 
        });
       next.addActionListener((ActionEvent e) -> 
        {
            Transactions use = new Transactions();
                    use.history(1);
            
        });
       prev.addActionListener((ActionEvent e) -> 
        {
            Transactions use = new Transactions();
            use.history(2);
        });

        }
      

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}
