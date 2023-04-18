package Day8;
import jkk.employee;
public interface EmployeeDao {

	public void insertEmployee(employee emp);
	public void showEmployee();
	public void updateEmployee(employee emp);
	public void deleteEmployee(int eid);
}
