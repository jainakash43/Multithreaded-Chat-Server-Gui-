import javax.swing.*;
public class ServerFrame {
    static JFrame jframe;
    static JTextArea jtextarea;
    static JPanel jp1,jp2;
    static JScrollPane scroll;
    static BoxLayout jboxlayout;
    static JLabel jlabel;
    
    public ServerFrame()
    {
        jframe=new JFrame();
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setSize(500,500);
        jframe.setResizable(false);
        jtextarea=new JTextArea();
        jlabel=new JLabel("Server");
        jlabel.setBounds(220,15,40,40);
        scroll=new JScrollPane(jtextarea);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        scroll.setBounds(55,50,380,350);
        jframe.add(scroll);
        jframe.add(jlabel);
      }
    
    
  
}
