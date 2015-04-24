/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormweek11.ormtest;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class SalesDAO {
	public static Sales loadSalesByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return loadSalesByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales getSalesByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return getSalesByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales loadSalesByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return loadSalesByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales getSalesByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return getSalesByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales loadSalesByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Sales) session.load(ormweek11.ormtest.Sales.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales getSalesByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Sales) session.get(ormweek11.ormtest.Sales.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales loadSalesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sales) session.load(ormweek11.ormtest.Sales.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales getSalesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sales) session.get(ormweek11.ormtest.Sales.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySales(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return querySales(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySales(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return querySales(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales[] listSalesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return listSalesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales[] listSalesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return listSalesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySales(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ormweek11.ormtest.Sales as Sales");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySales(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ormweek11.ormtest.Sales as Sales");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sales", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales[] listSalesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySales(session, condition, orderBy);
			return (Sales[]) list.toArray(new Sales[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales[] listSalesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySales(session, condition, orderBy, lockMode);
			return (Sales[]) list.toArray(new Sales[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales loadSalesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return loadSalesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales loadSalesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return loadSalesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales loadSalesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sales[] saleses = listSalesByQuery(session, condition, orderBy);
		if (saleses != null && saleses.length > 0)
			return saleses[0];
		else
			return null;
	}
	
	public static Sales loadSalesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sales[] saleses = listSalesByQuery(session, condition, orderBy, lockMode);
		if (saleses != null && saleses.length > 0)
			return saleses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSalesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return iterateSalesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSalesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession();
			return iterateSalesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSalesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ormweek11.ormtest.Sales as Sales");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSalesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ormweek11.ormtest.Sales as Sales");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sales", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales createSales() {
		return new ormweek11.ormtest.Sales();
	}
	
	public static boolean save(ormweek11.ormtest.Sales sales) throws PersistentException {
		try {
			ormweek11.ormtest.Ormwwek11PersistentManager.instance().saveObject(sales);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ormweek11.ormtest.Sales sales) throws PersistentException {
		try {
			ormweek11.ormtest.Ormwwek11PersistentManager.instance().deleteObject(sales);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ormweek11.ormtest.Sales sales) throws PersistentException {
		try {
			ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession().refresh(sales);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ormweek11.ormtest.Sales sales) throws PersistentException {
		try {
			ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession().evict(sales);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sales loadSalesByCriteria(SalesCriteria salesCriteria) {
		Sales[] saleses = listSalesByCriteria(salesCriteria);
		if(saleses == null || saleses.length == 0) {
			return null;
		}
		return saleses[0];
	}
	
	public static Sales[] listSalesByCriteria(SalesCriteria salesCriteria) {
		return salesCriteria.listSales();
	}
}
