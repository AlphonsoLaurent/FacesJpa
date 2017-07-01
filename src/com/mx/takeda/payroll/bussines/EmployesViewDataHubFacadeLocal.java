package com.mx.takeda.payroll.bussines;

import java.util.List;

import javax.ejb.Local;

import com.mx.takeda.payroll.entity.ViewDataHub;

@Local
public interface EmployesViewDataHubFacadeLocal {
	List<ViewDataHub>getListDataHub();	
}
