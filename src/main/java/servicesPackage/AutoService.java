package servicesPackage;

import java.sql.Connection;
import java.sql.Statement;

import com.DbUtilityPackage.Dbutility;
import com.customerInfo.CustomerInfo;

public class AutoService {
	public void saveCustomerInfo(CustomerInfo c) throws Exception {

		Connection con = Dbutility.getConnection();

		Statement stm = con.createStatement();

		String sql = "insert into Customer(name, address, phoneno, appointmentno, emailaddress) values('" + c.getName()
				+ "','" + c.getAddress() + "','" + c.getPhoneno() + "','" + c.getAppointmentno() + "','"
				+ c.getEmailaddress() + "')";

		stm.executeUpdate(sql);
	

	return;
}}