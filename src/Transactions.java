/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DR.Tamer
 */
public class Transactions {
    private static double balance=0;
    static int i;
    static String [] t= new String[5];
    
    public void callGUI(boolean type){
        JFrame fDraw= new JFrame("Error");
        fDraw.setSize(600,400);
        fDraw.setLocationRelativeTo(null);
        fDraw.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fDraw.setVisible(true);
        
        //creating panel 
        JPanel jp =new JPanel();
        
        
        //adding panel to frame
        fDraw.add(jp);
        if(!type)
        {
            //creating JLabel
            JLabel wl= new JLabel("amount entered is invalid.....");
            
            //adding lable to panel
             jp.add(wl);
        }
        
        
    }
    
    public void dposite(String amount) {
        try{
       double deposit = Double.valueOf(amount);
       if(deposit>0)
        {
            balance = balance + deposit;
           for(i=3;i>=0;i--)
           {
              t[i+1]=t[i];
           }
           i=-1;
           t[0]="Deposited: "+amount;
        }
        else 
           callGUI(false);
        }catch(Exception e)
        {
            callGUI(false);
        }
    }
    
   public void withdraw(String amount) {
       try{
       double withdraw = Double.valueOf(amount);
        if(balance >= withdraw && withdraw>0)
        {
            balance = balance - withdraw;
            for(i=3;i>=0;i--)
            {
                t[i+1]=t[i];
            }
            i=-1;
            t[0]="Withdrew: "+amount; 
        }
        else
            callGUI(false);
       }catch(Exception e)
        {
            callGUI(false);
        }
      
    }

    public double getBalance() {
        
        return balance;
    }

    public void setBalance(double balance) {
        for(i=3;i>=0;i--)
            {
                t[i+1]=t[i];
            }
            i=-1;
           t[0]="Inquired balance and it equaled "+Double.toString(getBalance());
          
    }
    
    public void history(int type)
    {
        //creating frame 
        JFrame fDraw= new JFrame("History");
        fDraw.setSize(600,400);
        fDraw.setLocationRelativeTo(null);
        fDraw.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fDraw.setVisible(true);
        
        //creating panel 
        JPanel jp =new JPanel();
        
        //creating lable
        JLabel hl = new JLabel(" ");
        
        //adding lable to panel
        jp.add(hl);
        
        //adding panel to frame
        fDraw.add(jp);
        
        if(type ==1)
        {
            jp.setName("next");
            if(i>0)
            {
                hl.setText(t[--i]);
            }
            else
                hl.setText("You need to click previous first");
                
        }
        else
        {
            jp.setName("Previous");
            i++;
            {
            hl.setText(t[i]);    
            }
             
        }
    }    
 }
   
