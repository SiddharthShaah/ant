package com.goair.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.goair.bo.PassengerBo;
import com.goair.dao.PassengerDao;

public class GoAirTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		PassengerDao dao = new PassengerDao();
		List<PassengerBo> passengerBos = dao.getPassengers();
		passengerBos.stream().forEach(System.out::println);
	}
}
