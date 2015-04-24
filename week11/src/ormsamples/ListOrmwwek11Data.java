/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListOrmwwek11Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Employee...");
		ormweek11.ormtest.Employee[] ormweek11ormtestEmployees = ormweek11.ormtest.EmployeeDAO.listEmployeeByQuery(null, null);
		int length = Math.min(ormweek11ormtestEmployees.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormweek11ormtestEmployees[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sales...");
		ormweek11.ormtest.Sales[] ormweek11ormtestSaleses = ormweek11.ormtest.SalesDAO.listSalesByQuery(null, null);
		length = Math.min(ormweek11ormtestSaleses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormweek11ormtestSaleses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Employee by Criteria...");
		ormweek11.ormtest.EmployeeCriteria lormweek11ormtestEmployeeCriteria = new ormweek11.ormtest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormweek11ormtestEmployeeCriteria.ID.eq();
		lormweek11ormtestEmployeeCriteria.setMaxResults(ROW_COUNT);
		ormweek11.ormtest.Employee[] ormweek11ormtestEmployees = lormweek11ormtestEmployeeCriteria.listEmployee();
		int length =ormweek11ormtestEmployees== null ? 0 : Math.min(ormweek11ormtestEmployees.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormweek11ormtestEmployees[i]);
		}
		System.out.println(length + " Employee record(s) retrieved."); 
		
		System.out.println("Listing Sales by Criteria...");
		ormweek11.ormtest.SalesCriteria lormweek11ormtestSalesCriteria = new ormweek11.ormtest.SalesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormweek11ormtestSalesCriteria.ID.eq();
		lormweek11ormtestSalesCriteria.setMaxResults(ROW_COUNT);
		ormweek11.ormtest.Sales[] ormweek11ormtestSaleses = lormweek11ormtestSalesCriteria.listSales();
		length =ormweek11ormtestSaleses== null ? 0 : Math.min(ormweek11ormtestSaleses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormweek11ormtestSaleses[i]);
		}
		System.out.println(length + " Sales record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListOrmwwek11Data listOrmwwek11Data = new ListOrmwwek11Data();
			try {
				listOrmwwek11Data.listTestData();
				//listOrmwwek11Data.listByCriteria();
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
