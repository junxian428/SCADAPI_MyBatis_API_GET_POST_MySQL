# SCADAPI_MyBatis_API_GET_POST_MySQL

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
