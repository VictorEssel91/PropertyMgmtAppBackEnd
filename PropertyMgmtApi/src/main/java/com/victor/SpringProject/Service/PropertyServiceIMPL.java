package com.victor.SpringProject.Service;

import com.victor.SpringProject.DTO.PropertySaveDTO;
import com.victor.SpringProject.Entity.Property;
import com.victor.SpringProject.Repo.PropertyRepo;
import org.springframework.stereotype.Service;


@Service
public class PropertyServiceIMPL implements PropertyService {

    private PropertyRepo propertyRepo;

    @Override
    public String addProperty(PropertySaveDTO propertySaveDTO) {

        Property property = new Property  (
                propertySaveDTO.getPropertyAddress(),
                propertySaveDTO.getPropertyRentedStatus(),
                propertySaveDTO.getPropertyContactNumber()

        );
        propertyRepo.save(property);
        return property.getPropertyAddress();

    }
}
