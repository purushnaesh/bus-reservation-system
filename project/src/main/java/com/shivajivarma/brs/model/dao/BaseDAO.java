package com.shivajivarma.brs.model.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public abstract class BaseDAO extends JdbcDaoSupport{
	
	public String table;
	
	public void deleteById(long id){
		String query = "delete from "+table+" WHERE id=?";
		
		int out = getJdbcTemplate().update(query, id);
		if(out !=0){
			System.out.println("item deleted from "+table+" table with id="+id);
		}else{
			System.out.println("item not deleted in "+table+" table with id="+id);
		}
	}
}