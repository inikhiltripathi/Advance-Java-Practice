package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Dao {
	
	public boolean getDao(Dto dto) {
		boolean b = false;
		Connection con=ConnectionPro.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("insert into user (name,mobile,email,username,password) values(?,?,?,?,?)");
		    ps.setString(1, dto.getName());
		    ps.setString(2, dto.getMobile());
		    ps.setString(3, dto.getEmail());
		    ps.setString(4, dto.getUname());
		    ps.setString(5, dto.getPass());
		    
		    int i=ps.executeUpdate();
		    if (i>0) {
				b=true;
			}
		} catch (Exception e) {System.out.println(e);}
		return b;
	}

}
