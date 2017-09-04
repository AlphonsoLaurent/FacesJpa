package com.mx.takeda.payroll.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Constante {
	public static String CONSULTING_DATE;
	public static String getFechaActual( int numeroRestar){
		Date myDate = new Date();
    	//Aquí obtienes el formato que deseas
		String fecha;
		String dia = "";
    	fecha = new SimpleDateFormat("dd/MM/yyyy").format(myDate);
    	if(Integer.parseInt(fecha.split("/")[0]) < 10){
    		dia = "0"+(Integer.parseInt(fecha.split("/")[0])-numeroRestar);
    	}else{
    		dia = (Integer.parseInt(fecha.split("/")[0])-numeroRestar)+"";
    	}
    	fecha = dia+"/"+fecha.split("/")[1]+"/"+fecha.split("/")[2];
    	
     	System.out.println(fecha);
		return fecha;
	}
	
	public static String obtieneFechaDia(){
		Date today;
		String dateOut;
		DateFormat dateFormatter;
		Locale currentLocale = new Locale ("es", "ES") ;
		dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
		today = new Date();
		dateOut = dateFormatter.format(today);
		
		System.out.println(today.toString().split(" ")[0]+ " " +dateOut + " " + currentLocale.toString());
		return today.toString().split(" ")[0];
	}
}
