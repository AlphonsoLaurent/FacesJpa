package com.mx.takeda.payroll.controller;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.UnselectEvent;
import org.primefaces.model.LazyDataModel;

import com.mx.takeda.payroll.dao.EmployeeOracleDao;
import com.mx.takeda.payroll.dao.EmployesViewDataHubDao;
import com.mx.takeda.payroll.entity.EmployeeOracle;
import com.mx.takeda.payroll.entity.ViewDataHub;
import com.mx.takeda.payroll.model.LazyEmployeeDhDataModel;

@ManagedBean(name = "viewEmployee")
@RequestScoped
public class EmployeeBean implements Serializable {

	private static final long serialVersionUID = -7345888967680726234L;
	private String fecha;
	private String fechaMax;
	private String fechaMin;
	private LazyDataModel<ViewDataHub> listEmployee;
	private List<ViewDataHub> listChang;
	private ViewDataHub selectedEmployee;
	
	@EJB	
	private EmployesViewDataHubDao employesViewDataHubDao;
	
	@EJB
	private EmployeeOracleDao employeeOracleDao;
	
	public EmployeeBean() {	

	}  
	@PostConstruct
    public void init() {
		this.listEmployee = new LazyEmployeeDhDataModel(employesViewDataHubDao.getListDataHub(fecha));
    } 
	
	 
	public void setFecha(String fecha) throws ParseException {

		// String dateStr = "Mon Jun 18 00:00:00 IST 2012";
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss CDT yyyy");
		Date date = (Date) formatter.parse(fecha);
		System.out.println(date);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/"
				+ cal.get(Calendar.YEAR);
		System.out.println("formatedDate : " + formatedDate);

		this.fecha = fecha;
	} 
	  
//	public void onRowSelect(SelectEvent event) {
//		listChang = new ArrayList<>();
//		listChang.add(selectedEmployee);
//		listChang.add(selectedEmployee); 
//		
//		FacesMessage msg = new FacesMessage("Empleado seleccionado", ((ViewDataHub) event.getObject()).getEmployee_id()); 
//		FacesContext.getCurrentInstance().addMessage(null, msg);
//	}

	public void onRowUnselect(UnselectEvent event) {
		FacesMessage msg = new FacesMessage("Empleado Selected", ((ViewDataHub) event.getObject()).getEmployee_id());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}


	public List<ViewDataHub> queryEmployee(){
		listChang = new ArrayList<>();
		listChang.add(selectedEmployee);
		listChang.add(selectedEmployee); 
		
		List<EmployeeOracle> listHistoryco = employeeOracleDao.findEmployeeById("50046481");
		
		return listChang;
	}
	
	public String getFechaMax() {
		return fechaMax;
	}


	public void setFechaMax(String fechaMax) {
		this.fechaMax = fechaMax;
	}


	public String getFechaMin() {
		return fechaMin;
	}


	public void setFechaMin(String fechaMin) {
		this.fechaMin = fechaMin;
	}


	public LazyDataModel<ViewDataHub> getListEmployee() {
		return listEmployee;
	}


	public void setListEmployee(LazyDataModel<ViewDataHub> listEmployee) {
		this.listEmployee = listEmployee;
	} 

	public List<ViewDataHub> getListChang() {
		return listChang;
	}


	public void setListChang(List<ViewDataHub> listChang) {
		this.listChang = listChang;
	}


	public ViewDataHub getSelectedEmployee() {
		return selectedEmployee;
	}


	public void setSelectedEmployee(ViewDataHub selectedEmployee) {
		this.selectedEmployee = selectedEmployee;
	}


	public String getFecha() {
		return fecha;
	}
	
	
	
}
