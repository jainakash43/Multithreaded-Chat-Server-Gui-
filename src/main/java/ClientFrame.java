import javax.swing.*;
import java.awt.event.*;
 class ClientFrame  {
    static JFrame jframe;
    static JTextField userName,message;
    static JPanel jp1,jp2;
    static BoxLayout jboxlayout;
    static JLabel jlabel,jlabel1,jlabel2;
    static JButton jbutton1;
    static String str="";
    public ClientFrame()
    {
        jframe=new JFrame();
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setSize(500,500);
        jframe.setResizable(false);
        userName=new JTextField();
        message=new JTextField();
        jlabel=new JLabel("Client");
        jlabel1=new JLabel("Username");
        jlabel2=new JLabel("Message");
        userName.setEditable(false);
        jbutton1=new JButton("Disconnect");
        jlabel.setBounds(220,15,40,40);
        message.setBounds(100,50,230,30);
        userName.setBounds(100,80,230,30);
        jlabel1.setBounds(30,50,100,30);
        jlabel2.setBounds(30,80,100,30);
        jbutton1.setBounds(100,140,100,30);
        jframe.add(userName);
        jframe.add(message);
        jframe.add(jlabel1);
        jframe.add(jlabel2);
        jframe.add(jbutton1);
        jframe.add(jlabel);
      }
   
   
 }
