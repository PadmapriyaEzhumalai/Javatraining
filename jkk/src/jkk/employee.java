package jkk;
import java.util.Comparator;
public class employee implements Comparable<employee>{

//POJO -= Plain Old Java Object


	private int eid;
	private String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	public int compareTo(employee e) {
		
		return this.eid - e.eid;
	
	}
	
	public static Comparator<employee> NameComparator = new Comparator<employee>() {

		@Override
		public int compare(employee e1, employee e2) {
			//return e1.getEid() -e2.getEid();
			return e1.getEname().compareTo(e2.getEname());
		}
	
	
	};
	

}
