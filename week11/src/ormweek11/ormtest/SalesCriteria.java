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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SalesCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression product;
	public final StringExpression date;
	public final StringExpression quantity;
	
	public SalesCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		product = new StringExpression("product", this);
		date = new StringExpression("date", this);
		quantity = new StringExpression("quantity", this);
	}
	
	public SalesCriteria(PersistentSession session) {
		this(session.createCriteria(Sales.class));
	}
	
	public SalesCriteria() throws PersistentException {
		this(ormweek11.ormtest.Ormwwek11PersistentManager.instance().getSession());
	}
	
	public Sales uniqueSales() {
		return (Sales) super.uniqueResult();
	}
	
	public Sales[] listSales() {
		java.util.List list = super.list();
		return (Sales[]) list.toArray(new Sales[list.size()]);
	}
}

