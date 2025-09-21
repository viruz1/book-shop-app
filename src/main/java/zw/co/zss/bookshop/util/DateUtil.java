package zw.co.zss.bookshop.util;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

    public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {
        if (date == null) {
            return null;
        }
        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Error while converting Date to XMLGregorianCalendar", e);
        }
    }

}
