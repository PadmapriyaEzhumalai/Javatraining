package jkk;

import java.io.IOException;

public interface EmployeeInterface {
	public void addEmployee();
	public void viewEmployee() ;
	public void serial() throws IOException;
	public void deserial();
	public void sortByEid();
	public void sortByEname();
}
