package servicesPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.DbUtilityPackage.Dbutility;
import com.customerInfo.CustomerInfo;

public class CustomerService {

	public CustomerInfo getCustomerById(String id) throws Exception {

		Connection con = Dbutility.getConnection();

		Statement str = con.createStatement();

		String sql = "select * from Customer where id=" + id;

		ResultSet rs = str.executeQuery(sql);

		CustomerInfo coi = new CustomerInfo();

		while (rs.next()) {
			int custId = rs.getInt("id");
			coi.setName(rs.getString("name"));
			coi.setAddress(rs.getString("address"));
			coi.setPhoneno(rs.getString("phoneno"));
			coi.setAppointmentno(rs.getString("appointmentno"));
			coi.setEmailaddress(rs.getString("emailaddress"));

		}
		return coi;
	}
}
