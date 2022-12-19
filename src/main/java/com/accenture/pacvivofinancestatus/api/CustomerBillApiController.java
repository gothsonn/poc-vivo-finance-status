package com.accenture.pacvivofinancestatus.api;

import com.accenture.pacvivofinancestatus.dao.CustomerBillDao;
import com.accenture.pacvivofinancestatus.model.*;
import com.accenture.pacvivofinancestatus.repository.CustomerBillRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-12-17T13:51:37.299Z")

@Controller
public class CustomerBillApiController implements CustomerBillApi {

    private static final Logger log = LoggerFactory.getLogger(CustomerBillApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final CustomerBillDao customerBillDao;

    private final CustomerBillRepository customerBillRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerBillApiController(ObjectMapper objectMapper, HttpServletRequest request, CustomerBillDao customerBillDao, CustomerBillDao customerBillDao1, CustomerBillRepository customerBillRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.customerBillDao = customerBillDao;
        this.customerBillRepository = customerBillRepository;
    }


    public ResponseEntity<CustomerBill> retrieveCustomerBill(
            @ApiParam(value = "Identifier of the CustomerBill",required=true)
            @PathVariable("id") String id,
            @ApiParam(value = "Comma-separated properties to provide in response")
            @Valid @RequestParam(value = "fields", required = false) String fields
    ) {
        if (request.getHeader("Accept") != null && (request.getHeader("Accept").contains("application/json") || request.getContentType().contains("application/json"))) {
            var response = customerBillDao.getFinancialAccount(id, fields);
            CustomerBill customerBill = customerBillRepository.createCustomerBill(response);
            return new ResponseEntity<CustomerBill>(customerBill, HttpStatus.OK);
        }
        return new ResponseEntity<CustomerBill>(HttpStatus.NOT_IMPLEMENTED);
    }

}
