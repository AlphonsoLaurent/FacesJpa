package com.mx.takeda.payroll.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.mx.takeda.payroll.entity.EmployeeOracle;
@Stateless
@LocalBean
public class EmployeeOracleDao {
	@PersistenceContext(unitName = "datahub")
	private EntityManager em;
	private static final Logger LOG = Logger.getLogger(EmployeeOracleDao.class.getName()); 
	public List<EmployeeOracle> findEmployeeById(String idEmployee) {
		List<EmployeeOracle> listEmpleados = null;
        try { 
        	
            TypedQuery<EmployeeOracle> searchQuery = em.createNamedQuery("EmpOracle.findByIdOracle", EmployeeOracle.class);
            searchQuery.setParameter("condition", idEmployee);
            listEmpleados = searchQuery.getResultList();
            
            System.out.println("Empleados Oracle EBS.... "+listEmpleados.size());
            
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
        return listEmpleados;
	}
}
