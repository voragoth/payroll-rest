package com.everis.rest.persistence.providers;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.everis.payroll.PayrollClient;

public class PayrollProvider implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private static final Map<String, PayrollClient> clients = new HashMap<>();

    public static Map<String, PayrollClient> getPayrollClients(){
        return clients;
    }

}
