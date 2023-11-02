package MVC;
import java.sql.*;

public class StudModel {
MyConnection mycon;
	public void addr2(Student s1) {
		mycon=new MyConnection();
		try {
			PreparedStatement st=mycon.con.prepareStatement("insert into student values(?,?,?)");
			st.setInt(1, s1.getRoll());
			st.setString(2, s1.getName());
			st.setString(3,s1.getAddress());
			int i =st.executeUpdate();
			System.out.println("inserted"+ i);
			mycon.con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void modify(Student s1) {
		
		try {
			mycon=new MyConnection();
			PreparedStatement st=mycon.con.prepareStatement("update student set name=?,address=? where roll=?");
			st.setString(1, s1.getName());
			st.setString(2, s1.getAddress());
			st.setInt(3, s1.getRoll());
			
			int i=st.executeUpdate();
			System.out.println("updated,"+i);
			mycon.con.close();
			
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
	}

	public Student search(Student s1) {
		try {
			mycon = new MyConnection();
			PreparedStatement st=mycon.con.prepareStatement("select * from student where roll=?");
			st.setInt(1, s1.getRoll());
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				s1.setName(rs.getString(2));
				s1.setAddress(rs.getString(3));
			}
			System.out.println("Searched,");
			mycon.con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return s1;
	}

	public void del(Student s1) {
		try {
			mycon=new MyConnection();
			PreparedStatement st=mycon.con.prepareStatement("delete from student where roll=?");
			st.setInt(1, s1.getRoll());
			int i=st.executeUpdate();
			System.out.println("deleted,"+i);
			mycon.con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
