package org.activiti.client.sponsor.api;


import io.swagger.annotations.*;
import org.activiti.client.sponsor.model.Invoice;
import org.activiti.client.sponsor.model.ProfileInfoVM;
import org.activiti.client.sponsor.model.Sponsor;
import org.activiti.client.sponsor.model.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-26T17:30:01.517+01:00")

@Api(value = "api", description = "the api API")
public interface ApiApi {

    @ApiOperation(value = "createInvoice", notes = "", response = Invoice.class, tags={ "invoice-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Invoice.class),
        @ApiResponse(code = 201, message = "Created", response = Invoice.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Invoice.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Invoice.class),
        @ApiResponse(code = 404, message = "Not Found", response = Invoice.class) })
    @RequestMapping(value = "/api/invoices",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Invoice> createInvoiceUsingPOST(@ApiParam(value = "invoice" ,required=true ) @RequestBody Invoice invoice);


    @ApiOperation(value = "createSponsor", notes = "", response = Sponsor.class, tags={ "sponsor-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Sponsor.class),
        @ApiResponse(code = 201, message = "Created", response = Sponsor.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Sponsor.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Sponsor.class),
        @ApiResponse(code = 404, message = "Not Found", response = Sponsor.class) })
    @RequestMapping(value = "/api/sponsors",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Sponsor> createSponsorUsingPOST(@ApiParam(value = "sponsor" ,required=true ) @RequestBody Sponsor sponsor);


    @ApiOperation(value = "deleteInvoice", notes = "", response = Void.class, tags={ "invoice-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/api/invoices/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteInvoiceUsingDELETE(@ApiParam(value = "id",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "deleteSponsor", notes = "", response = Void.class, tags={ "sponsor-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/api/sponsors/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSponsorUsingDELETE(@ApiParam(value = "id",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "getAccount", notes = "", response = UserDTO.class, tags={ "account-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = UserDTO.class),
        @ApiResponse(code = 403, message = "Forbidden", response = UserDTO.class),
        @ApiResponse(code = 404, message = "Not Found", response = UserDTO.class) })
    @RequestMapping(value = "/api/account",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<UserDTO> getAccountUsingGET();


    @ApiOperation(value = "getActiveProfiles", notes = "", response = ProfileInfoVM.class, tags={ "profile-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfileInfoVM.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ProfileInfoVM.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProfileInfoVM.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProfileInfoVM.class) })
    @RequestMapping(value = "/api/profile-info",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ProfileInfoVM> getActiveProfilesUsingGET();


    @ApiOperation(value = "getAllInvoices", notes = "", response = Invoice.class, responseContainer = "List", tags={ "invoice-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Invoice.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Invoice.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Invoice.class),
        @ApiResponse(code = 404, message = "Not Found", response = Invoice.class) })
    @RequestMapping(value = "/api/invoices",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<Invoice>> getAllInvoicesUsingGET();


    @ApiOperation(value = "getAllSponsors", notes = "", response = Sponsor.class, responseContainer = "List", tags={ "sponsor-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Sponsor.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Sponsor.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Sponsor.class),
        @ApiResponse(code = 404, message = "Not Found", response = Sponsor.class) })
    @RequestMapping(value = "/api/sponsors",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<Sponsor>> getAllSponsorsUsingGET();


    @ApiOperation(value = "getAllUsers", notes = "", response = UserDTO.class, responseContainer = "List", tags={ "user-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = UserDTO.class),
        @ApiResponse(code = 403, message = "Forbidden", response = UserDTO.class),
        @ApiResponse(code = 404, message = "Not Found", response = UserDTO.class) })
    @RequestMapping(value = "/api/users",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<UserDTO>> getAllUsersUsingGET(@ApiParam(value = "Page number of the requested page") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Size of a page") @RequestParam(value = "size", required = false) Integer size,
        @ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getAuthorities", notes = "", response = String.class, responseContainer = "List", tags={ "user-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/api/users/authorities",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<String>> getAuthoritiesUsingGET();


    @ApiOperation(value = "getInvoice", notes = "", response = Invoice.class, tags={ "invoice-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Invoice.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Invoice.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Invoice.class),
        @ApiResponse(code = 404, message = "Not Found", response = Invoice.class) })
    @RequestMapping(value = "/api/invoices/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<Invoice> getInvoiceUsingGET(@ApiParam(value = "id",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "getSponsor", notes = "", response = Sponsor.class, tags={ "sponsor-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Sponsor.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Sponsor.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Sponsor.class),
        @ApiResponse(code = 404, message = "Not Found", response = Sponsor.class) })
    @RequestMapping(value = "/api/sponsors/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<Sponsor> getSponsorUsingGET(@ApiParam(value = "id",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "getUser", notes = "", response = UserDTO.class, tags={ "user-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = UserDTO.class),
        @ApiResponse(code = 403, message = "Forbidden", response = UserDTO.class),
        @ApiResponse(code = 404, message = "Not Found", response = UserDTO.class) })
    @RequestMapping(value = "/api/users/{login}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<UserDTO> getUserUsingGET(@ApiParam(value = "login",required=true ) @PathVariable("login") String login);


    @ApiOperation(value = "isAuthenticated", notes = "", response = String.class, tags={ "account-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/api/authenticate",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<String> isAuthenticatedUsingGET();


    @ApiOperation(value = "updateInvoice", notes = "", response = Invoice.class, tags={ "invoice-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Invoice.class),
        @ApiResponse(code = 201, message = "Created", response = Invoice.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Invoice.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Invoice.class),
        @ApiResponse(code = 404, message = "Not Found", response = Invoice.class) })
    @RequestMapping(value = "/api/invoices",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Invoice> updateInvoiceUsingPUT(@ApiParam(value = "invoice" ,required=true ) @RequestBody Invoice invoice);


    @ApiOperation(value = "updateSponsor", notes = "", response = Sponsor.class, tags={ "sponsor-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Sponsor.class),
        @ApiResponse(code = 201, message = "Created", response = Sponsor.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Sponsor.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Sponsor.class),
        @ApiResponse(code = 404, message = "Not Found", response = Sponsor.class) })
    @RequestMapping(value = "/api/sponsors",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Sponsor> updateSponsorUsingPUT(@ApiParam(value = "sponsor" ,required=true ) @RequestBody Sponsor sponsor);

}
