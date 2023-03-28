# SCADAPI_MyBatis_API_GET_POST_MySQL

CREATE TABLE `devices` (

  `id` int(11) NOT NULL,
  
  `datetime` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  
  `device` varchar(255) NOT NULL,
  
  `status` int(11) NOT NULL,
  
  `level` int(11) NOT NULL,
  
  `inletpressure` double NOT NULL,
  
  `outletpressure` double NOT NULL
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `devices` (`id`, `datetime`, `device`, `status`, `level`, `inletpressure`, `outletpressure`) VALUES

(1, '2023-03-28 02:38:22', 'Service tank', 0, 50, 234.560000000027, 0),

(2, '2023-03-28 02:38:22', 'Service tank', 0, 50, 234.560000000027, 0),

(3, '2023-03-28 02:38:22', 'Service tank', 1, 25, 0, 0),

(4, '2023-03-28 02:38:22', 'Suction tank', 1, 25, 0, 0);



Get Request

http://localhost:9999/device/all

Return

[{"datetime":"2023-03-28T02:38:22.000+00:00","device":"Suction tank","status":1,"level":25,"inletpressure":0.0,"outletpressure":0.0}]



Post Request 

http://localhost:9999/device/addDeviceData

JSON data

{"datetime":"2023-03-28T02:38:22.000+00:00","device":"Suction tank","status":1,"level":25,"inletpressure":0.0,"outletpressure":0.0}

Return

200

![image](https://user-images.githubusercontent.com/58724748/228146717-53d89880-3d70-4248-9fee-dc9525613cd6.png)

