package io.quantixx.sponsor.client.activiti.api;

import io.quantixx.sponsor.client.activiti.model.ResourceTask;
import io.quantixx.sponsor.client.activiti.model.CompleteTaskCmd;
import io.quantixx.sponsor.client.activiti.model.Resource;
import io.quantixx.sponsor.client.activiti.model.ProcessDefinitionMetaResource;
import io.quantixx.sponsor.client.activiti.model.ProcessDefinitionResource;
import io.quantixx.sponsor.client.activiti.model.PagedResourcesProcessDefinitionResource;
import io.quantixx.sponsor.client.activiti.model.ResourceProcessInstance;
import io.quantixx.sponsor.client.activiti.model.PagedResourcesProcessInstanceResource;
import io.quantixx.sponsor.client.activiti.model.PagedResourcesTaskResource;
import io.quantixx.sponsor.client.activiti.model.ResourceMapstringobject;
import io.quantixx.sponsor.client.activiti.model.SignalProcessInstancesCmd;
import io.quantixx.sponsor.client.activiti.model.SetTaskVariablesCmd;
import io.quantixx.sponsor.client.activiti.model.StartProcessInstanceCmd;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

@Api(value = "v1", description = "the v1 API")
public interface V1Api {

    @ApiOperation(value = "activate", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/activate",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> activateUsingDELETE(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "activate", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/activate",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<Void> activateUsingGET(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "activate", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/activate",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.HEAD)
    ResponseEntity<Void> activateUsingHEAD(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "activate", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/activate",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.OPTIONS)
    ResponseEntity<Void> activateUsingOPTIONS(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "activate", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/activate",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> activateUsingPATCH(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "activate", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/activate",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> activateUsingPOST(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "activate", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/activate",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Void> activateUsingPUT(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "claimTask", notes = "", response = ResourceTask.class, tags={ "task-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResourceTask.class),
        @ApiResponse(code = 201, message = "Created", response = ResourceTask.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ResourceTask.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ResourceTask.class),
        @ApiResponse(code = 404, message = "Not Found", response = ResourceTask.class) })
    @RequestMapping(value = "/v1/tasks/{taskId}/claim",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ResourceTask> claimTaskUsingPOST(@ApiParam(value = "taskId",required=true ) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "completeTask", notes = "", response = Void.class, tags={ "task-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/tasks/{taskId}/complete",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> completeTaskUsingPOST(@ApiParam(value = "taskId",required=true ) @PathVariable("taskId") String taskId,
        @ApiParam(value = "completeTaskCmd"  ) @RequestBody CompleteTaskCmd completeTaskCmd);


    @ApiOperation(value = "getBpmnModel", notes = "", response = String.class, tags={ "process-definition-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/v1/process-definitions/{id}/json",
        produces = "application/json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<String> getBpmnModelUsingGET(@ApiParam(value = "id",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "getHomeInfo", notes = "", response = Resource.class, tags={ "home-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Resource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Resource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Resource.class),
        @ApiResponse(code = 404, message = "Not Found", response = Resource.class) })
    @RequestMapping(value = "/v1/",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<Resource> getHomeInfoUsingGET();


    @ApiOperation(value = "getProcessDefinitionMetadata", notes = "", response = ProcessDefinitionMetaResource.class, tags={ "process-definition-meta-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProcessDefinitionMetaResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ProcessDefinitionMetaResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProcessDefinitionMetaResource.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProcessDefinitionMetaResource.class) })
    @RequestMapping(value = "/v1/process-definitions/{id}/meta",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ProcessDefinitionMetaResource> getProcessDefinitionMetadataUsingGET(@ApiParam(value = "id",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "getProcessDefinition", notes = "", response = ProcessDefinitionResource.class, tags={ "process-definition-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProcessDefinitionResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ProcessDefinitionResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProcessDefinitionResource.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProcessDefinitionResource.class) })
    @RequestMapping(value = "/v1/process-definitions/{id}",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ProcessDefinitionResource> getProcessDefinitionUsingGET(@ApiParam(value = "id",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "getProcessDefinitions", notes = "", response = PagedResourcesProcessDefinitionResource.class, tags={ "process-definition-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesProcessDefinitionResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesProcessDefinitionResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesProcessDefinitionResource.class),
        @ApiResponse(code = 404, message = "Not Found", response = PagedResourcesProcessDefinitionResource.class) })
    @RequestMapping(value = "/v1/process-definitions",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<PagedResourcesProcessDefinitionResource> getProcessDefinitionsUsingGET();


    @ApiOperation(value = "getProcessDiagram", notes = "", response = String.class, tags={ "process-definition-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/v1/process-definitions/{id}/svg",
        produces = "image/svg+xml",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<String> getProcessDiagramUsingGET(@ApiParam(value = "id",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "getProcessDiagram", notes = "", response = String.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/svg",
        produces = "image/svg+xml",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<String> getProcessDiagramUsingGET1(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getProcessInstanceById", notes = "", response = ResourceProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResourceProcessInstance.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ResourceProcessInstance.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ResourceProcessInstance.class),
        @ApiResponse(code = 404, message = "Not Found", response = ResourceProcessInstance.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ResourceProcessInstance> getProcessInstanceByIdUsingGET(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getProcessInstances", notes = "", response = PagedResourcesProcessInstanceResource.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesProcessInstanceResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesProcessInstanceResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesProcessInstanceResource.class),
        @ApiResponse(code = 404, message = "Not Found", response = PagedResourcesProcessInstanceResource.class) })
    @RequestMapping(value = "/v1/process-instances",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<PagedResourcesProcessInstanceResource> getProcessInstancesUsingGET();


    @ApiOperation(value = "getProcessModel", notes = "", response = String.class, tags={ "process-definition-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/v1/process-definitions/{id}/xml",
        produces = "application/xml",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<String> getProcessModelUsingGET(@ApiParam(value = "id",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "getTaskById", notes = "", response = ResourceTask.class, tags={ "task-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResourceTask.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ResourceTask.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ResourceTask.class),
        @ApiResponse(code = 404, message = "Not Found", response = ResourceTask.class) })
    @RequestMapping(value = "/v1/tasks/{taskId}",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ResourceTask> getTaskByIdUsingGET(@ApiParam(value = "taskId",required=true ) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "getTasks", notes = "", response = PagedResourcesTaskResource.class, tags={ "process-instance-tasks-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 204, message = "No Content", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesTaskResource.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/tasks",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.DELETE)
    ResponseEntity<PagedResourcesTaskResource> getTasksUsingDELETE(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getTasks", notes = "", response = PagedResourcesTaskResource.class, tags={ "process-instance-tasks-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 404, message = "Not Found", response = PagedResourcesTaskResource.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/tasks",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<PagedResourcesTaskResource> getTasksUsingGET(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getTasks", notes = "", response = PagedResourcesTaskResource.class, tags={ "task-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 404, message = "Not Found", response = PagedResourcesTaskResource.class) })
    @RequestMapping(value = "/v1/tasks",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<PagedResourcesTaskResource> getTasksUsingGET1();


    @ApiOperation(value = "getTasks", notes = "", response = PagedResourcesTaskResource.class, tags={ "process-instance-tasks-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 204, message = "No Content", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesTaskResource.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/tasks",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.HEAD)
    ResponseEntity<PagedResourcesTaskResource> getTasksUsingHEAD(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getTasks", notes = "", response = PagedResourcesTaskResource.class, tags={ "process-instance-tasks-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 204, message = "No Content", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesTaskResource.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/tasks",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.OPTIONS)
    ResponseEntity<PagedResourcesTaskResource> getTasksUsingOPTIONS(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getTasks", notes = "", response = PagedResourcesTaskResource.class, tags={ "process-instance-tasks-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 204, message = "No Content", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesTaskResource.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/tasks",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.PATCH)
    ResponseEntity<PagedResourcesTaskResource> getTasksUsingPATCH(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getTasks", notes = "", response = PagedResourcesTaskResource.class, tags={ "process-instance-tasks-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 201, message = "Created", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 404, message = "Not Found", response = PagedResourcesTaskResource.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/tasks",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PagedResourcesTaskResource> getTasksUsingPOST(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getTasks", notes = "", response = PagedResourcesTaskResource.class, tags={ "process-instance-tasks-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 201, message = "Created", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PagedResourcesTaskResource.class),
        @ApiResponse(code = 404, message = "Not Found", response = PagedResourcesTaskResource.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/tasks",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<PagedResourcesTaskResource> getTasksUsingPUT(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getVariablesLocal", notes = "", response = ResourceMapstringobject.class, tags={ "task-variable-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResourceMapstringobject.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ResourceMapstringobject.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ResourceMapstringobject.class),
        @ApiResponse(code = 404, message = "Not Found", response = ResourceMapstringobject.class) })
    @RequestMapping(value = "/v1/tasks/{taskId}/variables/local",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ResourceMapstringobject> getVariablesLocalUsingGET(@ApiParam(value = "taskId",required=true ) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "getVariables", notes = "", response = ResourceMapstringobject.class, tags={ "process-instance-variable-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResourceMapstringobject.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ResourceMapstringobject.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ResourceMapstringobject.class),
        @ApiResponse(code = 404, message = "Not Found", response = ResourceMapstringobject.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/variables",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ResourceMapstringobject> getVariablesUsingGET(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getVariables", notes = "", response = ResourceMapstringobject.class, tags={ "task-variable-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResourceMapstringobject.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ResourceMapstringobject.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ResourceMapstringobject.class),
        @ApiResponse(code = 404, message = "Not Found", response = ResourceMapstringobject.class) })
    @RequestMapping(value = "/v1/tasks/{taskId}/variables/",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ResourceMapstringobject> getVariablesUsingGET1(@ApiParam(value = "taskId",required=true ) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "releaseTask", notes = "", response = ResourceTask.class, tags={ "task-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResourceTask.class),
        @ApiResponse(code = 201, message = "Created", response = ResourceTask.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ResourceTask.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ResourceTask.class),
        @ApiResponse(code = 404, message = "Not Found", response = ResourceTask.class) })
    @RequestMapping(value = "/v1/tasks/{taskId}/release",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ResourceTask> releaseTaskUsingPOST(@ApiParam(value = "taskId",required=true ) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "sendSignal", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/signal",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> sendSignalUsingDELETE(@ApiParam(value = "cmd" ,required=true ) @RequestBody SignalProcessInstancesCmd cmd);


    @ApiOperation(value = "sendSignal", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/signal",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<Void> sendSignalUsingGET(@ApiParam(value = "cmd" ,required=true ) @RequestBody SignalProcessInstancesCmd cmd);


    @ApiOperation(value = "sendSignal", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/signal",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.HEAD)
    ResponseEntity<Void> sendSignalUsingHEAD(@ApiParam(value = "cmd" ,required=true ) @RequestBody SignalProcessInstancesCmd cmd);


    @ApiOperation(value = "sendSignal", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/signal",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.OPTIONS)
    ResponseEntity<Void> sendSignalUsingOPTIONS(@ApiParam(value = "cmd" ,required=true ) @RequestBody SignalProcessInstancesCmd cmd);


    @ApiOperation(value = "sendSignal", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/signal",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> sendSignalUsingPATCH(@ApiParam(value = "cmd" ,required=true ) @RequestBody SignalProcessInstancesCmd cmd);


    @ApiOperation(value = "sendSignal", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/signal",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> sendSignalUsingPOST(@ApiParam(value = "cmd" ,required=true ) @RequestBody SignalProcessInstancesCmd cmd);


    @ApiOperation(value = "sendSignal", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/signal",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Void> sendSignalUsingPUT(@ApiParam(value = "cmd" ,required=true ) @RequestBody SignalProcessInstancesCmd cmd);


    @ApiOperation(value = "setVariablesLocal", notes = "", response = Void.class, tags={ "task-variable-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/tasks/{taskId}/variables/local",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> setVariablesLocalUsingPOST(@ApiParam(value = "taskId",required=true ) @PathVariable("taskId") String taskId,
        @ApiParam(value = "setTaskVariablesCmd" ,required=true ) @RequestBody SetTaskVariablesCmd setTaskVariablesCmd);


    @ApiOperation(value = "setVariables", notes = "", response = Void.class, tags={ "task-variable-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/tasks/{taskId}/variables/",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> setVariablesUsingPOST(@ApiParam(value = "taskId",required=true ) @PathVariable("taskId") String taskId,
        @ApiParam(value = "setTaskVariablesCmd" ,required=true ) @RequestBody SetTaskVariablesCmd setTaskVariablesCmd);


    @ApiOperation(value = "startProcess", notes = "", response = ResourceProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResourceProcessInstance.class),
        @ApiResponse(code = 201, message = "Created", response = ResourceProcessInstance.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ResourceProcessInstance.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ResourceProcessInstance.class),
        @ApiResponse(code = 404, message = "Not Found", response = ResourceProcessInstance.class) })
    @RequestMapping(value = "/v1/process-instances",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ResourceProcessInstance> startProcessUsingPOST(@ApiParam(value = "cmd" ,required=true ) @RequestBody StartProcessInstanceCmd cmd);


    @ApiOperation(value = "suspend", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/suspend",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> suspendUsingDELETE(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "suspend", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/suspend",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<Void> suspendUsingGET(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "suspend", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/suspend",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.HEAD)
    ResponseEntity<Void> suspendUsingHEAD(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "suspend", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/suspend",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.OPTIONS)
    ResponseEntity<Void> suspendUsingOPTIONS(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "suspend", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/suspend",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> suspendUsingPATCH(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "suspend", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/suspend",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> suspendUsingPOST(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "suspend", notes = "", response = Void.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/suspend",
        produces = "application/hal+json",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Void> suspendUsingPUT(@ApiParam(value = "processInstanceId",required=true ) @PathVariable("processInstanceId") String processInstanceId);

}
