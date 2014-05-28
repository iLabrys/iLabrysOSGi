package es.itecban.deployment.environmentmanager.services;

import javax.xml.datatype.XMLGregorianCalendar;

public interface DBCleaner {
	
	public int clean(XMLGregorianCalendar minDate, XMLGregorianCalendar maxDate) throws Exception;

}
