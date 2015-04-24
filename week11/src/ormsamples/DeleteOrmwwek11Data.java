/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteOrmwwek11Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession().beginTransaction();
		try {
			ormweek11.ormtest.Employee lormweek11ormtestEmployee = ormweek11.ormtest.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Delete the persistent object
			ormweek11.ormtest.EmployeeDAO.delete(lormweek11ormtestEmployee);
			ormweek11.ormtest.Sales lormweek11ormtestSales = ormweek11.ormtest.SalesDAO.loadSalesByQuery(null, null);
			// Delete the persistent object
			ormweek11.ormtest.SalesDAO.delete(lormweek11ormtestSales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteOrmwwek11Data deleteOrmwwek11Data = new DeleteOrmwwek11Data();
			try {
				deleteOrmwwek11Data.deleteTestData();
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
