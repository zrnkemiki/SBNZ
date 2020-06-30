package com.ftn.carDiagnostic.model;

import java.util.Date;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;
import org.springframework.data.annotation.Id;

@Role(Role.Type.EVENT)
@Timestamp("executionTime")
@Expires("2h30m")
public class Log {

	@Id
	private int id;
	private String message;

	private Date executionTime;
	

	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Log(int id, String message, Date executionTime) {
		super();
		this.id = id;
		this.message = message;
		this.executionTime = executionTime;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}
	
	
	
}