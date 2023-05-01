package com.victor.SpringProject.Service;

import com.victor.SpringProject.DTO.PropertySaveDTO;
import com.victor.SpringProject.DTO.PropertyDTO;
import com.victor.SpringProject.DTO.PropertyUpdateDTO;

import java.util.List;

public interface PropertyService {
    String addProperty(PropertySaveDTO propertySaveDTO);

    List<PropertyDTO> getAllProperties();

    String updateProperty(PropertyUpdateDTO propertyUpdateDTO);

    boolean deleteEmployee(int id);
}
