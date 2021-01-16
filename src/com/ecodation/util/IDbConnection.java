package com.ecodation.util;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDbConnection<T> {
	
	// C-R-U-D
	void create(T t);
	void update(T t);
	void delete(long id);
	ArrayList<T> list();
	
	default Connection getConnection() {
		
		return DbConnection.dbConnectivy();
		
	}
}
