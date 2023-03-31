package com.example.mybatislearningCRUD.resource;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatislearningCRUD.Service.DeviceService;
import com.example.mybatislearningCRUD.mapper.DeviceMapper;
import com.example.mybatislearningCRUD.model.Devices;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/device")
public class DeviceResource {
    private DeviceMapper deviceMapper;

    @Autowired
    private DeviceService deviceService;


    
    public DeviceResource(DeviceMapper deviceMapper) {
        this.deviceMapper = deviceMapper;
    }

    @GetMapping("/all")
    public List<Devices> getAll() {
        return deviceMapper.findAll();
    }

  //  @PostMapping("/addDeviceData")
   // public void addDeviceData(@RequestBody Devices devices) {
     //   deviceMapper.insertDevice(devices);
   // }


    @PostMapping(value = "/submitForm", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String submitForm(@RequestBody MultiValueMap<String, String> formData) {
        // Process the form data here
        // ...

        try{
       //     deviceMapper.insertDevice(formData);
            //System.out.println(formData);
            MultiValueMap<String, String> data = formData;
            System.out.println(data);
            String device = formData.getFirst("device");
            System.out.println(device);

            //

            String jsonData = data.toString();
            String subJson = jsonData.substring(1);

            ObjectMapper objectMapper = new ObjectMapper();
String jsonString = "{\"device\":\"Suction tank\",\"status\":\"Hi\",\"level\":25,\"inletpressure\":0.0,\"outletpressure\":0.0}=[]";
Map<String, Object> jsonMap = objectMapper.readValue(subJson, new TypeReference<Map<String, Object>>(){});

final String device2 = (String) jsonMap.get("device");
String status = (String) jsonMap.get("status");
int level = (int) jsonMap.get("level");
double inletpressure = (double) jsonMap.get("inletpressure");
double outletpressure = (double) jsonMap.get("outletpressure");
System.out.println(device2 + " " + status +  " " + Integer.toString(level)+ " " + Double.toString(inletpressure) + " " + Double.toString(outletpressure) );
            //deviceDataService.saveDeviceData(formData);
            LocalDateTime localDateTime = LocalDateTime.now();
            // void saveDeviceData
           // device.savedDeviceData(localDateTime, device2, status, level, inletpressure, outletpressure);
           try{
            deviceMapper.saveDeviceData(localDateTime, device2, level, level, inletpressure, outletpressure);
            System.out.println("saving");
           }catch(Exception e){
                System.out.println(e);
           }
            return "Form submitted successfully!";

            
        }catch(Exception e){
            System.out.println(e);
            return "Fail to submit";
        }
    }
    
    @PostMapping("/addDeviceData")
public void saveDeviceData(@ModelAttribute Devices form) {
    Devices data = new Devices();
    try{

    
    }catch(Exception e){
        System.out.println(e);
    }

    // Your code to save the data here
    // ...
}



 

@PostMapping("/addDevice")
public ResponseEntity<?> addDeviceData(@RequestBody Devices data) {
    deviceService.saveDeviceData(data);
    return ResponseEntity.ok().build();
}
}


