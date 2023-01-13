package com.goair.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.goair.bo.PassengerBo;

public class PassengerDao {

	public List<PassengerBo> getPassengers() throws IOException, SQLException, ClassNotFoundException {
		Properties dbProperties = null;
		List<PassengerBo> passengers = null;
		dbProperties = new Properties();

		dbProperties.load(this.getClass().getClassLoader().getResourceAsStream("db.properties"));
		Class.forName(dbProperties.getProperty("db.driverClassname"));

		try (Connection con = DriverManager.getConnection(dbProperties.getProperty("db.url"),
				dbProperties.getProperty("db.username"), dbProperties.getProperty("db.password"));
				Statement stmt = con.createStatement();) {
			ResultSet rs = stmt.executeQuery("select * from passenger");
			passengers = new ArrayList<>();
			while (rs.next()) {
				PassengerBo bo = new PassengerBo(rs.getInt("passenger_no"), rs.getString("fullname"), rs.getInt("age"),
						rs.getString("gender"));
				passengers.add(bo);
			}
		}

		return passengers;
	}
}
