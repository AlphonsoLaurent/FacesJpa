package com.mx.takeda.payroll.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mx.takeda.payroll.entity.EmployeeOracle;
@Stateless
@LocalBean
public class EmployeeOracleDao {
	@PersistenceContext(unitName = "datahub")
	private EntityManager em;
	private static final Logger LOG = Logger.getLogger(EmployeeOracleDao.class.getName()); 
	public List<EmployeeOracle> findEmployeeById(String idEmployee) {
		System.out.println(":::::::::::::::::::::::::::HISTORY CONSULTING OF EMPLOYEE:::::::::::::::::::::::::::::");
		List<EmployeeOracle> listEmpleados = null;
        try {  
            Query query = em.createNativeQuery( "SELECT * FROM VW_MX_EMPLOYEE_TBL WHERE (EMPLOYEE_ID = "+idEmployee+") ORDER BY LAST_UPDATE_ENTRY_DT DESC", EmployeeOracle.class);
            listEmpleados = query.getResultList();
            System.out.println("Empleados Oracle EBS.... "+listEmpleados.size());
            
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
        return listEmpleados;
	}
}
