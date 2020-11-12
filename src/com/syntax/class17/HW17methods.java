package com.syntax.class17;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class HW17methods {

    public void Employee(String emplID, double salary){
        System.out.println(emplID+" salary: "+ salary+ " CEO to Sumair");

    }
    static int numberOfStudent=1;
public void students(String studentName, String studentID){

    System.out.println(studentName+ " id: "+studentID+" numberOfStudent "+ (numberOfStudent++));

        }


}