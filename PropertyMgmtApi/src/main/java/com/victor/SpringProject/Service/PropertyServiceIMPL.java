package com.victor.SpringProject.Service;

import com.victor.SpringProject.DTO.PropertyDTO;
import com.victor.SpringProject.DTO.PropertySaveDTO;
import com.victor.SpringProject.DTO.PropertyUpdateDTO;
import com.victor.SpringProject.Entity.Property;
import com.victor.SpringProject.Repo.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PropertyServiceIMPL implements PropertyService {

    @Autowired
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

    @Override
    public List<PropertyDTO> getAllProperties() {

        List<Property> getProperties = propertyRepo.findAll();
        List<PropertyDTO> propertyDTOList = new ArrayList<>();

        for (Property p: getProperties)
        {
            PropertyDTO propertyDTO = new PropertyDTO(

                    p.getPropertyId(),
                    p.getPropertyAddress(),
                    p.getPropertyContactNumber(),
                    p.getPropertyRentedStatus()

            );

            propertyDTOList.add(propertyDTO);
        }

        return propertyDTOList;
    }

    @Override
    public String updateProperty(PropertyUpdateDTO propertyUpdateDTO) {

        if (propertyRepo.existsById(propertyUpdateDTO.getPropertyId()))
        {
            Property property = propertyRepo.getById(propertyUpdateDTO.getPropertyId());

            property.setPropertyAddress(propertyUpdateDTO.getPropertyAddress());
            property.setPropertyContactNumber(propertyUpdateDTO.getPropertyContactNumber());
            property.setPropertyRentedStatus(propertyUpdateDTO.getPropertyRentedStatus());
            
            propertyRepo.save(property);

            System.out.println("Update successful.");
            
        }
        else  {
            System.out.println("Property ID not found.");
        }



        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {
        if (propertyRepo.existsById(id))

        {
            propertyRepo.deleteById(id);

        }
        else  {
            System.out.println("Property ID not found.");
        }

        return true;
    }
}
