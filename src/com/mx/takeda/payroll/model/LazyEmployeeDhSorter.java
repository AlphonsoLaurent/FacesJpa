package com.mx.takeda.payroll.model;

import java.util.Comparator;

import org.primefaces.model.SortOrder;

import com.mx.takeda.payroll.entity.ViewDataHub;

public class LazyEmployeeDhSorter implements Comparator<ViewDataHub	>{
	private String sortField;
    
    private SortOrder sortOrder;
	@Override
	public int compare(ViewDataHub o1, ViewDataHub o2) {
		try {
            Object value1 = ViewDataHub.class.getField(this.sortField).get(o1);
            Object value2 = ViewDataHub.class.getField(this.sortField).get(o2);
 
            int value = ((Comparable)value1).compareTo(value2);
             
            return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;
        }
        catch(Exception e) {
            throw new RuntimeException();
        }
	}
	public LazyEmployeeDhSorter(String sortField, SortOrder sortOrder) {
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }
}
