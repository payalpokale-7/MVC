package MVC;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class StudController implements ActionListener {
StudView fr;
StudModel sm;
Student s1;
public StudController(StudView fr) {
	this.fr=fr;
	s1=new Student();
	sm=new StudModel();
}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==fr.b1) {
			s1.setRoll(Integer.parseInt(fr.t1.getText()));
			s1.setName(fr.t2.getText());
			s1.setAddress(fr.t3.getText());
			sm.addr2(s1);
		}
		if(e.getSource()==fr.b2) {
			s1.setRoll(Integer.parseInt(fr.t1.getText()));
			s1.setName(fr.t2.getText());
			s1.setAddress(fr.t3.getText());
			sm.modify(s1);
		}
		if(e.getSource()==fr.b3) {
			s1.setRoll(Integer.parseInt(fr.t1.getText()));
			sm.del(s1);
		}
		if(e.getSource()==fr.b4)
		{
			s1.setRoll(Integer.parseInt(fr.t1.getText()));
			s1=sm.search(s1);
			fr.t2.setText(s1.getName());
			fr.t3.setText(s1.getAddress());
		}
		if(e.getSource()==fr.b5)
		{
			fr.t1.setText( " ");
			fr.t2.setText( " ");
			fr.t3.setText( " ");
			
		}

	}

}
