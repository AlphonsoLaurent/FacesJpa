package com.mx.takeda.payroll.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mx.takeda.payroll.dao.EmployesViewDataHubDao;
import com.mx.takeda.payroll.entity.ViewDataHub;

public class LazyEmployeeDhDataModel extends LazyDataModel<ViewDataHub>{
 
	private static final long serialVersionUID = -8570109063459800951L;
	
	private List<ViewDataHub> listOfViewDataHub;
	
	public LazyEmployeeDhDataModel(List<ViewDataHub> listOfView) {
		super();
		this.listOfViewDataHub = listOfView;
	}
	@Override
    public ViewDataHub getRowData(String rowKey) {
        for(ViewDataHub empDH : listOfViewDataHub) {
            if(empDH.getEmployee_id().equals(rowKey))
                return empDH;
        }
        return null;
    }
	@Override
    public Object getRowKey(ViewDataHub empDH) {
        return empDH.getEmployee_id();
    }
	 @Override
    public List<ViewDataHub> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String,Object> filters) {
        List<ViewDataHub> data = new ArrayList<ViewDataHub>();
 
        //filter
        for(ViewDataHub ViewDataHub : listOfViewDataHub) {
            boolean match = true;
 
            if (filters != null) {
                for (Iterator<String> it = filters.keySet().iterator(); it.hasNext();) {
                    try {
                        String filterProperty = it.next();
                        Object filterValue = filters.get(filterProperty);
                        String fieldValue = String.valueOf(ViewDataHub.getClass().getField(filterProperty).get(ViewDataHub));
 
                        if(filterValue == null || fieldValue.startsWith(filterValue.toString())) {
                            match = true;
                    }
                    else {
                            match = false;
                            break;
                        }
                    } catch(Exception e) {
                        match = false;
                    }
                }
            }
 
            if(match) {
                data.add(ViewDataHub);
            }
        }
 
        //sort
        if(sortField != null) {
            Collections.sort(data, new LazyEmployeeDhSorter(sortField, sortOrder));
        }
 
        //rowCount
        int dataSize = data.size();
        this.setRowCount(dataSize);
 
        //paginate
        if(dataSize > pageSize) {
            try {
                return data.subList(first, first + pageSize);
            }
            catch(IndexOutOfBoundsException e) {
                return data.subList(first, first + (dataSize % pageSize));
            }
        }
        else {
            return data;
        }
    }
}
