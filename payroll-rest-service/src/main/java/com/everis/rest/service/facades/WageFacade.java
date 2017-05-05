package com.everis.rest.service.facades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.rest.service.services.WageService;
import com.everis.rest.service.vo.LoginVO;
import com.everis.rest.service.vo.WageVO;

@Component
public class WageFacade {

    @Autowired
    private WageService service;
    
    public LoginVO doLogin(String user, String password){
        return service.doLogin(user, password);
    }
    
    public List<WageVO> getWages(String user){
        return service.getWages(user);
    }
    
    public String saveFileInTmpFolder(String user, String dateId){
        return service.savePdfWageToTmp(user, dateId);
    }
    
}
