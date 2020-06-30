package com.ftn.carDiagnostic.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ftn.carDiagnostic.dto.AppointmentDTO;
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
}
