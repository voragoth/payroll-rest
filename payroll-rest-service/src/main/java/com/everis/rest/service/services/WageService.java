package com.everis.rest.service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.payroll.PayrollClient;
import com.everis.payroll.imp.PayrollClientJsoup;
import com.everis.payroll.jsoup.domain.WageResume;
import com.everis.rest.persistence.providers.PayrollProvider;
import com.everis.rest.service.vo.LoginVO;
import com.everis.rest.service.vo.WageVO;

@Component
public class WageService {

    @Autowired
    private Mapper mapper;
    
    public LoginVO doLogin(String user, String password){
        LoginVO login = new LoginVO();
        PayrollProvider.getPayrollClients().put(user, new PayrollClientJsoup());
        PayrollClient client = PayrollProvider.getPayrollClients().get(user);
        if (client.doLogin(user, password)) {
            login.setUser(user);
        }
        return login;
    }
    
    public List<WageVO> getWages(String user){
        PayrollClient client = PayrollProvider.getPayrollClients().get(user);
        return client.getAllWageResumes().stream().map(from -> mapper.map(from, WageVO.class)).collect(Collectors.toList());
    }
    
    public String savePdfWageToTmp(String user, String dateId) {
        PayrollClient client = PayrollProvider.getPayrollClients().get(user);
        String destination = System.getProperty("java.io.tmpdir");
        WageResume resume = new WageResume();
        resume.setDate(dateId);
        return client.saveWagePDF(resume, destination);
    }
    
}
