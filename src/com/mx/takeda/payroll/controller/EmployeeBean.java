package com.mx.takeda.payroll.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mx.takeda.payroll.bussines.EmployesViewDataHubFacade;
import com.mx.takeda.payroll.entity.ViewDataHub;
@Named(value="empleadosBean")
@SessionScoped
public class EmployeeBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1791160301178809743L;
	
	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}
	@Inject
	private EmployesViewDataHubFacade empleadoViewDHF;
	
	public List<ViewDataHub> getListEmployee(){
		return empleadoViewDHF.getListDataHub();
	}
}
