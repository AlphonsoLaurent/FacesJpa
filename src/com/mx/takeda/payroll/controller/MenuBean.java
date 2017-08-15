package com.mx.takeda.payroll.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
@ManagedBean(name = "menuView")
public class MenuBean implements Serializable {
	private static final long serialVersionUID = 8953611057838563463L;
	private String url;
	 
	public MenuBean() {
	}
//	@PostConstruct
	public String changeUrl(Integer opcion){
		switch (opcion) {
		case 1:
			setUrl("busqueda.xhtml");
			break;
		case 2:
			setUrl("beans/busqueda-empleados.xhtml");
			break;
		default:
			setUrl("beans/empleadosdatahub.xhtml");
		}
		return url;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
