/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.29).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.accenture.pacvivofinancestatus.api;

import com.accenture.pacvivofinancestatus.model.CustomerBill;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-12-17T13:51:37.299Z")

@Validated
@Api(value = "customerBill", description = "the customerBill API")
@RequestMapping(value = "/customerBillManagement/")
public interface CustomerBillApi {

    @ApiOperation(value = "List or find CustomerBill objects", nickname = "listCustomerBill", notes = "This operation list or find CustomerBill entities", response = CustomerBill.class, responseContainer = "List", tags={ "customerBill", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerBill.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/customerBill",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<List<CustomerBill>> listCustomerBill(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields, @ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset, @ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit);

    @ApiOperation(value = "Retrieves a CustomerBill by ID", nickname = "retrieveCustomerBill", notes = "This operation retrieves a CustomerBill entity. Attribute selection is enabled for all first level attributes.", response = CustomerBill.class, tags={ "customerBill", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerBill.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/customerBill/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<CustomerBill> retrieveCustomerBill(@ApiParam(value = "Identifier of the CustomerBill",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields);

}