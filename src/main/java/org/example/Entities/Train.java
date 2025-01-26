package org.example.Entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Train {

    private  String trainId;

    private String trainNumber;


    private  List<List<Integer>>Seats;

    private Map<String, Time> stationTimes;

    private List<String> station;


}
