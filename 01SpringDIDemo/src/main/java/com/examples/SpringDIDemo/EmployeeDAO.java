package com.examples.SpringDIDemo;

public class EmployeeDAO {
	private String dbserver,dbport,dbuser,dbpassword;

	public EmployeeDAO(String dbserver, String dbport, String dbuser, String dbpassword) {
		super();
		this.dbserver = dbserver;
		this.dbport = dbport;
		this.dbuser = dbuser;
		this.dbpassword = dbpassword;
	}

	@Override
	public String toString() {
		return "EmployeeDAO [dbserver=" + dbserver + ", dbport=" + dbport + ", dbuser=" + dbuser + ", dbpassword="
				+ dbpassword + "]";
	}
	
}
