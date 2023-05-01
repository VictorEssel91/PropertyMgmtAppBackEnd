package com.victor.SpringProject.Controller;


import com.victor.SpringProject.DTO.PropertySaveDTO;
import com.victor.SpringProject.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    //used to create RESTful web services using Spring MVC. Takes care of mapping request data to the defined request handler method.
                   // Once response body is generated from the handler method, it converts it to JSON or XML response.

@CrossOrigin      //enables cross-origin resource sharing only for this specific method.
@RequestMapping("api/v1/property")

public class PropertyController {

    @Autowired   //for automatic dependency injection. Spring framework is built on dependency injection. Inject the class dependencies through spring bean configuration file.
    private PropertyService propertyService;

    public String saveProperty(@RequestBody PropertySaveDTO propertySaveDTO)

    {
        String id = propertyService.addProperty(propertySaveDTO);
        return id;

    }

}
