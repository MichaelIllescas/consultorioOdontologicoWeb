/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateDV;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jonii
 */
public class Utilitaria {
    
     public static Date convertirStringADateSql(String fechaTexto) {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaUtil = null;
        Date fechaSql = null;
        
        try {
            fechaUtil = formato.parse(fechaTexto);
            fechaSql = new java.sql.Date(fechaUtil.getTime());
        } catch (ParseException ex) {
            System.out.println("Error al convertir fecha: " + ex.getMessage());
        }

        return fechaSql;
    }
    
}
