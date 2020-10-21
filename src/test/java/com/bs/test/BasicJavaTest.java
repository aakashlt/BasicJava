/**
 * 
 */
package com.bs.test;

import java.sql.SQLException;

import com.bs.dao.EmpDao;

/**
 * @author aakash
 *
 */
public class BasicJavaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException{
		EmpDao dao = new EmpDao();
		dao.showDetails();
	}

}
