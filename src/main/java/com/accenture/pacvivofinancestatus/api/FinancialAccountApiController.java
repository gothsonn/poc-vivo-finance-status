package com.accenture.pacvivofinancestatus.api;

import com.accenture.pacvivofinancestatus.dao.FinancialAccountDao;
import com.accenture.pacvivofinancestatus.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")

@Controller
public class FinancialAccountApiController implements FinancialAccountApi {

    private static final Logger log = LoggerFactory.getLogger(FinancialAccountApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final FinancialAccountDao financialAccountDao;

    @org.springframework.beans.factory.annotation.Autowired
    public FinancialAccountApiController(ObjectMapper objectMapper, HttpServletRequest request, FinancialAccountDao financialAccountDao) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.financialAccountDao = financialAccountDao;
    }
    public ResponseEntity<FinancialAccount> retrieveFinancialAccount(
            @ApiParam(value = "Identifier of the FinancialAccount",required=true)
            @PathVariable("id") String id,
            @ApiParam(value = "Comma-separated properties to provide in response")
            @Valid @RequestParam(value = "fields", required = false) String fields
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            var response = financialAccountDao.getFinancialAccount(id, fields);
            return new ResponseEntity<FinancialAccount>(response, HttpStatus.OK);
        }

        return new ResponseEntity<FinancialAccount>(HttpStatus.NOT_IMPLEMENTED);
    }

}
