import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstApplets extends Applet implements ActionListener{

	Button B1,B2;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		B1=new Button("Red");
		B2=new Button("Blue");
		add(B1);
		add(B2);
		B1.addActionListener(this);	
		B2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==B1){
			setBackground(Color.RED);
		}else{
			setBackground(Color.BLUE);
		}
	}
}