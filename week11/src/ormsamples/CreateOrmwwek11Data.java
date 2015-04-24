/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateOrmwwek11Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession().beginTransaction();
		try {
			ormweek11.ormtest.Employee lormweek11ormtestEmployee = ormweek11.ormtest.EmployeeDAO.createEmployee();
			// Initialize the properties of the persistent object here
			lormweek11ormtestEmployee.setName("Kean");
			lormweek11ormtestEmployee.setAddress("Old Bawn");
			lormweek11ormtestEmployee.setMobile("08541255");
			lormweek11ormtestEmployee.setPPS("24546");
			lormweek11ormtestEmployee.setYear("2004");
			lormweek11ormtestEmployee.setDepartment("HRM");
			lormweek11ormtestEmployee.setSalary("25000");
			ormweek11.ormtest.EmployeeDAO.save(lormweek11ormtestEmployee);

			ormweek11.ormtest.Sales lormweek11ormtestSales = ormweek11.ormtest.SalesDAO.createSales();
			// Initialize the properties of the persistent object here
			lormweek11ormtestSales.setProduct("Motorola");
			lormweek11ormtestSales.setDate("2008");
			lormweek11ormtestSales.setQuantity("52");
			ormweek11.ormtest.SalesDAO.save(lormweek11ormtestSales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmwwek11Data createOrmwwek11Data = new CreateOrmwwek11Data();
			try {
				createOrmwwek11Data.createTestData();
			}
			finally {
				ormweek11.ormtest.Ormwwek11PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
