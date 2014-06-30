package com.xinxinyu.framework.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.xinxinyu.framework.pojo.BasePojo;

public abstract class BaseDao<T extends BasePojo> extends HibernateDaoSupport{
	public Serializable saveEntity(T entity) {
		return super.getHibernateTemplate().save(entity);
	}
	
	public void save(T entity) {
		super.getHibernateTemplate().save(entity);
	}

	public void update(T entity) {
		super.getHibernateTemplate().update(entity);
	}

	public void delete(T entity) {
		super.getHibernateTemplate().delete(entity);
	}

	public void deleteById(Serializable id) {
		super.getHibernateTemplate().delete(load(id));
	}

	public T load(Serializable id) {
		return super.getHibernateTemplate().load(entityClass, id);
	}
	
	public T get(Serializable id) {
		return super.getHibernateTemplate().get(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(DetachedCriteria criteria) {
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@SuppressWarnings("unchecked")
	public BaseDao() {
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		entityClass = (Class<T>) params[0];
	}

	private Class<T> entityClass;
}
