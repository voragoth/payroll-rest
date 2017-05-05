package com.everis.rest.web.controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.rest.service.facades.WageFacade;
import com.everis.rest.service.vo.LoginVO;
import com.everis.rest.service.vo.WageVO;
import com.everis.rest.web.dto.Credentials;

@RestController
@RequestMapping("/api")
public class WageController {

    @Autowired
    private WageFacade facade;

    @PostMapping("/login")
    public LoginVO doLogin(@RequestBody Credentials credentials) {
        return facade.doLogin(credentials.getUser(), credentials.getPassword());
    }

    @GetMapping("/wages")
    public List<WageVO> getWages(@RequestHeader("user") String user) {
        return facade.getWages(user);
    }

    @RequestMapping(value = "/wages/pdf/{dateId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
    public @ResponseBody HttpEntity<byte[]> downloadPDF(@PathVariable String dateId, @RequestHeader("user") String user) throws IOException {
        File file = new File(facade.saveFileInTmpFolder(user, dateId));
        byte[] document = FileCopyUtils.copyToByteArray(file);
        HttpHeaders header = new HttpHeaders();
        header.setContentType(new MediaType("application", "pdf"));
        header.set("Content-Disposition", "inline; filename=" + file.getName());
        header.setContentLength(document.length);
        return new HttpEntity<byte[]>(document, header);
    }

}
