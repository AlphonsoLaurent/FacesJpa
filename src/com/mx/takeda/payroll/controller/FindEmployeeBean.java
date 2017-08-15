package com.mx.takeda.payroll.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;

import com.mx.takeda.payroll.dao.EmployeeOracleDao;
import com.mx.takeda.payroll.entity.EmployeeOracle;
@ManagedBean(name = "findEmployee")
@ViewScoped
public class FindEmployeeBean implements Serializable {
 	private static final long serialVersionUID = -3337778927187650430L;
 	private String idEmployee;
 	private List<EmployeeOracle> listEmployee;
	 
	@EJB	
	private EmployeeOracleDao empOraEbs;
	
	@PostConstruct
    public void init() {
		
    }
	public String getIdEmployee() {
		this.idEmployee = "50046481";
		return idEmployee;
	}
	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	} 
	
	public void buttonAction(ActionEvent actionEvent) { 
		this.listEmployee = empOraEbs.findEmployeeById(idEmployee);
//		FacesMessage msg = new FacesMessage("Datos modificados", ((ViewDataHub) actionEvent.getObject()).getEmployee_id()); 
//		FacesContext.getCurrentInstance().addMessage(null, msg);
        addMessage("El empleado buscado es !! "+idEmployee);
    }
     
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	public List<EmployeeOracle> getListEmployee() {
		return listEmployee;
	}
	public void setListEmployee(List<EmployeeOracle> listEmployee) {
		this.listEmployee = listEmployee;
	}    
}
