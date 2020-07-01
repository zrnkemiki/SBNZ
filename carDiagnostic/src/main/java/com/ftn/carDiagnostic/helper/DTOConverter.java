package com.ftn.carDiagnostic.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.ftn.carDiagnostic.dto.AppointmentDTO;
import com.ftn.carDiagnostic.dto.ReservationDTO;
import com.ftn.carDiagnostic.model.Appointment;

public class DTOConverter {

	public static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public static Appointment dtoToAppointment(AppointmentDTO dto) {
		Appointment ret = new Appointment();
		ret.setExecutionTime(new Date());
		ret.setUserId(Long.parseLong(dto.getUserId()));
		try {
			ret.setDate(FORMATTER.parse(dto.getDate()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public static Appointment resDtoToAPpointment(ReservationDTO dto) {
		Appointment ret = new Appointment();
		ret.setExecutionTime(new Date());
		// SETUJ USERA!
		ret.setDate(dto.getDate());
		return ret;
	}
	
	public static Date makeEndDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 21);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	
	public static Date makeStartDate(Date date) {
		Calendar nowCal = Calendar.getInstance();
		Calendar dateCal = Calendar.getInstance();
		nowCal.setTime(new Date());
		dateCal.setTime(date);
		
		Calendar retCal = Calendar.getInstance();
		
		// ako je zakazivanje za isti dan
		if (nowCal.get(Calendar.DAY_OF_YEAR) == dateCal.get(Calendar.DAY_OF_YEAR) &&
				nowCal.get(Calendar.YEAR) == dateCal.get(Calendar.YEAR)) {
			
			return nowCal.getTime();
		}
		
		// ako je za neki naredni dan:
		
		dateCal.set(Calendar.HOUR_OF_DAY, 7);
		dateCal.set(Calendar.MINUTE, 0);
		dateCal.set(Calendar.SECOND, 0);
		dateCal.set(Calendar.MILLISECOND, 0);
		
		
		return dateCal.getTime();
	}
	
	public static List<Date> availableTimesForDate(Date date) {
		List<Date> ret = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int addHour = 7;
		for (int i = 1; i < 16; i++) {
			cal.set(Calendar.HOUR_OF_DAY, addHour);
			addHour++;
			ret.add(cal.getTime());
		}
		
		return ret;
		
		
	}
}
