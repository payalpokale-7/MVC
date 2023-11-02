package MVC;
import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class StudView extends Frame {
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	StudView(){
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		l1=new Label("roll");
		l2=new Label("name");
		l3=new Label("address");
		t1=new TextField(30);
	
		t2=new TextField(30);
		t3=new TextField(30);
		b1=new Button("add");
		b2=new Button("modify");
		b3=new Button("delete");
		b4=new Button("search");
		b5=new Button("clear");
		b1.addActionListener(new StudController(this));
		b2.addActionListener(new StudController(this));
		b3.addActionListener(new StudController(this));
		b4.addActionListener(new StudController(this));
		b5.addActionListener(new StudController(this));
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);add(b3);add(b4);add(b5);
		addWindowListener(new WindowAdapter(){
			@SuppressWarnings("unused")
			public void windowclosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
		);
	}

	public static void main(String[] args) {
	 new StudView();

	}

}
