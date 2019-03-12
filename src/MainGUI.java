import java.awt.event.*; 
import java.awt.*; 
import java.util.Objects;
import javax.swing.*;


class text extends JFrame implements ActionListener { 
    // JTextField 
    static JTextField t; 
  
    // JPasswodField 
    static JTextField pass; 
  
    // JFrame 
    static JFrame f; 
  
    // JButton 
    static JButton sb; 
  
    // label to diaplay text 
    static JLabel l; 
  
    // default constructor 
    text() 
    { 
    } 

    public static void main(String[] args) 
    {    
        // create frame  
        f = new JFrame("User Validation"); 
        f.setSize(600, 300);
        f.setVisible(true);
  
        // create a label 
        l = new JLabel(" "); 
  
        // create a submit button 
        sb = new JButton("submit"); 
   
        // create JTextField  
        t = new JTextField("Enter card number", 16);
        pass = new JTextField("Enter pssword", 16); 
  
  
        // create panel to  
        JPanel p = new JPanel(); 
  
        // add buttons and textfield to panel 
        p.add(t); 
        p.add(pass); 
        p.add(sb); 
        p.add(l); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
         
  
        
     
        String id="123456";
        String passc="1232";
        // if the button is pressed 
        sb.addActionListener((ActionEvent e) -> 
        {
            if( Objects.equals(id,t.getText()) && Objects.equals(passc,pass.getText()))
            {
                MainL use =new MainL();
                use.main();
                f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
            }
            else
            {
                l.setText("Wrong card number or password please write again");
            }
        });

        } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    } 
