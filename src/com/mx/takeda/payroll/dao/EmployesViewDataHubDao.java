package com.mx.takeda.payroll.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mx.takeda.payroll.entity.ViewDataHub;
import com.mx.takeda.payroll.utils.Constante;
@Stateless
@LocalBean
public class EmployesViewDataHubDao {
	@PersistenceContext(unitName = "datahub")
	private EntityManager em;
	private static final Logger LOG = Logger.getLogger(EmployesViewDataHubDao.class.getName());
	public List<ViewDataHub> getListDataHub(String fecha) {
		List<ViewDataHub> listEmpleados = null;
        try { 
        	String lunes=Constante.obtieneFechaDia();
        	//Aquí colocas tu objeto tipo Date
        	if(lunes == "Mon"){
        		fecha = Constante.getFechaActual(3);
        	}else{
        		fecha = Constante.getFechaActual(1);
        	}
        	if("14/08/2017".equals(fecha)){        		
        		fecha = "08/08/2017";
        	} 
            Query searchQuery = em.createNativeQuery("SELECT T.* FROM Vw_Mx_Hris_Employee T where T.LAST_UPDATE_ENTRY_DT ='"+fecha+"' ORDER BY TO_DATE(T.LAST_UPDATE_ENTRY_DT) DESC", ViewDataHub.class);
            listEmpleados = searchQuery.getResultList();
            
            System.out.println("Total de empleados.... "+listEmpleados.size());
            
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
        return listEmpleados;
	} 
}
