package com.example.mybatislearningCRUD.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatislearningCRUD.mapper.DeviceMapper;
import com.example.mybatislearningCRUD.model.Devices;

@RestController
@RequestMapping("/device")
public class DeviceResource {
    private DeviceMapper deviceMapper;

    public DeviceResource(DeviceMapper deviceMapper) {
        this.deviceMapper = deviceMapper;
    }

    @GetMapping("/all")
    public List<Devices> getAll() {
        return deviceMapper.findAll();
    }

    @PostMapping("/addDeviceData")
    public void addDeviceData(@RequestBody Devices devices) {
        deviceMapper.insertDevice(devices);
    }
    

}
