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

    public ResponseEntity<FinancialAccount> createFinancialAccount(
            @ApiParam(value = "The FinancialAccount to be created" ,required=true )
            @Valid @RequestBody FinancialAccountCreate financialAccountCreate
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//            FinancialAccountRef account = new FinancialAccountRef();
//            account.setId(java.util.UUID.randomUUID().toString());
//            account.setHref("ref"); // qual href vai colocar aqui...
//            account.setName(financialAccountCreate.getName());
//            account.setAccountBalance(financialAccountCreate.getAccountBalance().get(0)); //aqui e uma lista....
//            account.setBaseType(financialAccountCreate.getBaseType());
//            account.setSchemaLocation(financialAccountCreate.getSchemaLocation());
//            account.setType(financialAccountCreate.getType());
//            account.setReferredType("ReferredType"); // dentro do final tem RelatedParty que uma lista que entro tem referredType

            var response = financialAccountDao.createFinancialAccount(financialAccountCreate);

            return new ResponseEntity<FinancialAccount>(response, HttpStatus.CREATED);

        }
        return new ResponseEntity<FinancialAccount>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteFinancialAccount(
            @ApiParam(value = "Identifier of the FinancialAccount",required=true)
            @PathVariable("id") String id
    ) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<FinancialAccount>> listFinancialAccount(
            @ApiParam(value = "Comma-separated properties to be provided in response")
            @Valid @RequestParam(value = "fields", required = false) String fields,
            @ApiParam(value = "Requested index for start of resources to be provided in response")
            @Valid @RequestParam(value = "offset", required = false) Integer offset,
            @ApiParam(value = "Requested number of resources to be provided in response")
            @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<FinancialAccount>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<FinancialAccount>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<FinancialAccount>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FinancialAccount> patchFinancialAccount(
            @ApiParam(value = "Identifier of the FinancialAccount",required=true)
            @PathVariable("id") String id,
            @ApiParam(value = "The FinancialAccount to be updated" ,required=true )
            @Valid @RequestBody FinancialAccountUpdate financialAccount
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FinancialAccount>(objectMapper.readValue("{\"empty\": false}", FinancialAccount.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FinancialAccount>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FinancialAccount>(HttpStatus.NOT_IMPLEMENTED);
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
