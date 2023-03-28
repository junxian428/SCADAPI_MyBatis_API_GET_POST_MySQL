package com.example.mybatislearningCRUD.mapper;
import java.sql.Timestamp;
import java.util.List;

import com.example.mybatislearningCRUD.model.Devices;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DeviceMapper {
    @Select("SELECT * FROM devices WHERE id = (SELECT MAX(id) FROM devices);")
    List<Devices> findAll();

    @Insert("INSERT INTO devices (datetime, device, status, level, inletpressure, outletpressure) VALUES (#{datetime}, #{device}, #{status}, #{level}, #{inletpressure}, #{outletpressure})")
    void insertDevice(Devices device);
    //private Integer id;
    //private Timestamp datetime;
    //private String device;
    //private int status;
    //private int level;
    //private double inletpressure;
    //private double outletpressure;

    //void insertDevice(Devices devices);

    //void insertUser(@Param("name") String name, @Param("email") String email);

}
