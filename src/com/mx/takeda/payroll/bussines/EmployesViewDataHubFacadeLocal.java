package com.mx.takeda.payroll.bussines;

import javax.ejb.Local;

import com.mx.takeda.payroll.entity.ViewDataHub;

@Local
public interface EmployesViewDataHubFacadeLocal {
	ViewDataHub[]getListDataHub();	
}
