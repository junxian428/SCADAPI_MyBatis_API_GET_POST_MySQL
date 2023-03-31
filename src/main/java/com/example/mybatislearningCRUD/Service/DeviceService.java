package com.example.mybatislearningCRUD.Service;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.example.mybatislearningCRUD.mapper.DeviceMapper;
import com.example.mybatislearningCRUD.model.Devices;

@Service
public class DeviceService {

    @Autowired
    private DeviceMapper deviceDataMapper;

    public void saveDeviceData(Devices devices) {
        deviceDataMapper.insertDeviceData(devices);
    }

    
}