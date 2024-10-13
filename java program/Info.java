import java.awt.*;
import javax.swing.*;
public class Info extends JFrame{
JMenuBar mb;
JMenu Train;
JMenuItem  Search,ByPNR,ByName;
TextField t1,t2;
Label l1,l2;
Button b1;
void Info(){
 mb=new JMenuBar
JMenu mb=new JMenu("Train");
JMenuItem mb= new JMenuItem("Search");
add(Train);
Train.add(Search);
Search.add(ByName);
Search.add(ByPNR);
setBounds(80,100,200,300);
mb=new JMenuBar
JMenu Fight;
JMenuItem ByName,ByTicket;
 mb= JMenu("Flight");
JMenuItem mb=new JMenuItem("Search");
add(Flight);
Flight.add(Search);
Search.add(ByName);
Search.add(ByTicket);
setBounds(90,100,300,400);
mb=new JMenuBar
JMenu Bus;
JMenuItem ByName,ByList;
mb= JMenu("Bus");
JMenuItem mb=new JMenuItem("Search");
add(Bus);
Train.add(Search);
Search.add(ByName);
Search.add(ByList);
setBounds(60,100,300,400);
}
public static void main(Stirng[]args){
Info obj=new Info();
setSize(600,600);
setLayout(null);
setVisible(true);
}
}