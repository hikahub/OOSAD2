/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;
import java.util.Scanner;
import org.orm.*;
public class CreateOrmweek10Data {
	public void createTestData() throws PersistentException {
 		Scanner sc = new Scanner(System.in);

		PersistentTransaction t = ormtest.Ormweek10PersistentManager.instance().getSession().beginTransaction();
	
		try {
			ormtest.Employee lormtestEmployee = ormtest.Employee.createEmployee();
			// Initialize the properties of the persistent object here
			lormtestEmployee.setName(sc.next());
			sc.nextLine();
			lormtestEmployee.setAddress(sc.next());
			sc.nextLine();
			lormtestEmployee.setPps(sc.next());
			sc.nextLine();
			lormtestEmployee.setMobile(sc.next());
			sc.nextLine();
			
			lormtestEmployee.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmweek10Data createOrmweek10Data = new CreateOrmweek10Data();
			try {
				createOrmweek10Data.createTestData();
			}
			finally {
				ormtest.Ormweek10PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
