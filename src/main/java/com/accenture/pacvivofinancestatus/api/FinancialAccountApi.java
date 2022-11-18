/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.28).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.accenture.pacvivofinancestatus.api;

import com.accenture.pacvivofinancestatus.model.FinancialAccount;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")

@Validated
@Api(value = "financialAccount", description = "The financialAccount API")
@RequestMapping(value = "/accountManagement")
public interface FinancialAccountApi {

    @ApiOperation(value = "Retrieves a FinancialAccount by ID", nickname = "retrieveFinancialAccount", notes = "This operation retrieves a FinancialAccount entity. Attribute selection is enabled for all first level attributes.", response = FinancialAccount.class, tags={ "financialAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = FinancialAccount.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/financialAccount/{id}",
        method = RequestMethod.GET)
    ResponseEntity<FinancialAccount> retrieveFinancialAccount(
            @ApiParam(value = "Identifier of the FinancialAccount",required=true)
            @PathVariable("id") String id,
            @ApiParam(value = "Comma-separated properties to provide in response")
            @Valid @RequestParam(value = "fields", required = false) String fields
    );
}
