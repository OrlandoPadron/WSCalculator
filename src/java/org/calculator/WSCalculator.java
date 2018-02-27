/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Orlando Daniel
 */
@WebService(serviceName = "WSCalculator")
@Stateless()
public class WSCalculator {

/**
 * OPERACIONES DEL WEBSERVICE
 * @param int1
 * @param int2
 * @return 
 */    
    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "int1") int int1, @WebParam(name = "int2") int int2){
        return int1 + int2; 
    }
    
    @WebMethod(operationName = "restar")
    public int restar(@WebParam(name = "int1") int int1, @WebParam(name = "int2") int int2){
        return int1 - int2; 
    }
    
    
    @WebMethod(operationName = "multiplicar")
    public int multiplicar(@WebParam(name = "int1") int int1, @WebParam(name = "int2") int int2){
        return int1 * int2; 
    }
    
    @WebMethod(operationName = "dividir")
    public int dividir(@WebParam(name = "int1") int int1, @WebParam(name = "int2") int int2){
        return int1 / int2; 
    }
}
