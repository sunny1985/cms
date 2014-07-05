package com.xinxinyu.framework.utils;

import org.hibernate.cfg.ImprovedNamingStrategy;

public class MyNamingStrategy extends ImprovedNamingStrategy{

	private static final long serialVersionUID = -4368366910869585778L;
	
	private String currentTablePrefix;
	
	private static final String S_TABLE_PREFIX = "T";
	private static final String S_TABLE_BOUND_SYMBOL = "_";
	
	public MyNamingStrategy() {
	}
	
	@Override
	public String tableName(String tableName) {
		return addUnderscores(tableName).toUpperCase();
	}
	
	
	@Override
	public String classToTableName(String className) {
		currentTablePrefix = className.toUpperCase() + S_TABLE_BOUND_SYMBOL;
		return S_TABLE_PREFIX + S_TABLE_BOUND_SYMBOL + tableName(className);
	}

	@Override
	public String columnName(String columnName) {
		return addUnderscores(columnName).toUpperCase();
	}

	@Override
	public String propertyToColumnName(String propertyName) {
		return ("id".equals(propertyName)?currentTablePrefix:"")+addUnderscores(propertyName).toUpperCase();
	}
}
