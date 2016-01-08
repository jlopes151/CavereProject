/**
 * 
 */
package org.project.simple.db.repository;

import java.util.List;

import org.project.simple.domain.Customer_List;


/**
 * @author jamesmlopes
 *
 */
public interface CustomerListRepository {

	public List<Customer_List> getCustomerList();
	
}
