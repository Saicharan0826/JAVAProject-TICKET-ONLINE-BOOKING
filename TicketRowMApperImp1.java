package com.jsp.jdbc.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.jdbc.entity.TicketBooking;

@Component 
public class TicketRowMApperImp1 implements RowMapper<TicketBooking>
{

	public TicketBooking mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		TicketBooking t = new TicketBooking();
		t.setTicketId(rs.getInt(1));
	    t.setPassengerName(rs.getString(2));
		t.setPassengerGender(rs.getString(3));
		t.setPassengerSeatNo(rs.getInt(4));
		t.setPassengerMobile(rs.getString(5));
		t.setServiceCategory(rs.getString(6));
		t.setFromCity(rs.getString(7));
		t.setToCity(rs.getString(8));
		t.setTicketPrice(rs.getDouble(9));
		t.setTravellingDate(rs.getDate(10));
		t.setStartTimeOrigin(rs.getTime(11));
		return t;
	}

}

