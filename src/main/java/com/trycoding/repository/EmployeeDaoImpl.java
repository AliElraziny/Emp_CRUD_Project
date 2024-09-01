package com.trycoding.repository;

import java.util.List;


import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trycoding.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public EmployeeDaoImpl(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	@Override
	public int saveEmp(Employee emp) {
		return (Integer) hibernateTemplate.save(emp);
	}

	@Override
	public Employee getEmpployeeById(int id) {
		return hibernateTemplate.get(Employee.class, id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Transactional
	@Override
	public void updateEmployee(Employee emp) {
		hibernateTemplate.update(emp);

	}

	@Transactional
	@Override
	public void deleteEmployee(int id) {
		Employee emp = hibernateTemplate.get(Employee.class, id);
		hibernateTemplate.delete(emp);
	}

}
