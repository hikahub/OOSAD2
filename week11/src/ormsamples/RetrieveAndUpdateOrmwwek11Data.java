/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateOrmwwek11Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession().beginTransaction();
		try {
			ormweek11.ormtest.Employee lormweek11ormtestEmployee = ormweek11.ormtest.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			ormweek11.ormtest.EmployeeDAO.save(lormweek11ormtestEmployee);
			ormweek11.ormtest.Sales lormweek11ormtestSales = ormweek11.ormtest.SalesDAO.loadSalesByQuery(null, null);
			// Update the properties of the persistent object
			ormweek11.ormtest.SalesDAO.save(lormweek11ormtestSales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		ormweek11.ormtest.EmployeeCriteria lormweek11ormtestEmployeeCriteria = new ormweek11.ormtest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormweek11ormtestEmployeeCriteria.ID.eq();
		System.out.println(lormweek11ormtestEmployeeCriteria.uniqueEmployee());
		
		System.out.println("Retrieving Sales by SalesCriteria");
		ormweek11.ormtest.SalesCriteria lormweek11ormtestSalesCriteria = new ormweek11.ormtest.SalesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormweek11ormtestSalesCriteria.ID.eq();
		System.out.println(lormweek11ormtestSalesCriteria.uniqueSales());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOrmwwek11Data retrieveAndUpdateOrmwwek11Data = new RetrieveAndUpdateOrmwwek11Data();
			try {
				retrieveAndUpdateOrmwwek11Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateOrmwwek11Data.retrieveByCriteria();
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
