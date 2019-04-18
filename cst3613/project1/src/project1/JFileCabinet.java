package project1;


	
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFileCabinet extends JFrame implements ActionListener{

JButton jButtons[];
JLabel jLable;
JPanel jPanel[];
private final int FIRST_CHAR=65;
private final int BUTTONS_FOR_PANEL=6;

public JFileCabinet(){
init();
}
private void init(){
int i=0;
int j=0;

jPanel = new JPanel[5];
jButtons = new JButton[26];
jLable = new JLabel("");
Character labelText = null;
for(i=0;i<jPanel.length-1;i++){

jPanel[i] = new JPanel();

for( j=(i*BUTTONS_FOR_PANEL);j<((i+1)*BUTTONS_FOR_PANEL);j++){


System.out.println((j)+"");
System.out.println(Character.toChars(FIRST_CHAR+j)[0]+"");
jButtons[j] = new JButton(Character.toChars(FIRST_CHAR+j)[0]+"");
jButtons[j].addActionListener(this);
jPanel[i].add(jButtons[j]);
}

}

jPanel[i] = new JPanel();
jButtons[j] = new JButton(Character.toChars(FIRST_CHAR+j)[0]+"");
jButtons[j].addActionListener(this);
jPanel[i].add(jButtons[j]);
j++;

jButtons[j] = new JButton(Character.toChars(FIRST_CHAR+j)[0]+"");
jPanel[i].add(jButtons[j]);
jButtons[j].addActionListener(this);
jPanel[i].add(jLable);

for(i=0;i<jPanel.length;i++){
this.add(jPanel[i]);
}
this.setVisible(true);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setLayout(new GridLayout(5,1));
this.setSize(600, 200);
this.setResizable(false);

}



public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
jLable.setText("FOLDER "+e.getActionCommand()+" :");
System.out.println("EAC::"+e.getActionCommand());
System.out.println("LGT::"+jLable.getText());
}
public static void main(String[] args) {
new JFileCabinet();
}


}