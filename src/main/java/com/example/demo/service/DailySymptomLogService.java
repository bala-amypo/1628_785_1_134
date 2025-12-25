package com.example.demo.service;

import com.example.demo.model.DailySymptomLog;
import java.util.List;

public interface DailySymptomLogService {

    DailySymptomLog save(DailySymptomLog log);

    List<DailySymptomLog> getAll();

}
