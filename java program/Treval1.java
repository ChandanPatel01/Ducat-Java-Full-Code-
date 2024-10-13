import java.awt.*;
import javax.swing.*;
public class Treval extends JFrame{
JMenuBar mb;
JMenu Train ,Flight,Bus;
JMenuItem  Search,ByPNR,ByName,ByTicket,ByList;
TextField t1,t2;
Label l1,l2;
Button b1;
void Treval(){
mb=new JMenuBar();
add(mb);
JMenu mb=new JMenu("Train");
JMenuItem mb1=new JMenuItem("Search");
JMenuItem mb2=new JMenuItem("By Name");
JMenuItem mb3=new JMenuItem("ByPNR");
add(Train);
mb.add(Search);
mb1.add(ByName);
mb1.add(ByPNR);



setSize(400,400);
setVisible(true);
setLayout(null);  


}
public static void main(String[]args){
Treval obj=new Treval();

}
}
