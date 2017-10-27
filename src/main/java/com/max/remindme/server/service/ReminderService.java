package com.max.remindme.server.service;

import com.max.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {


    List<Remind> getAll();
    Remind getByID(long remindID);
    Remind save(Remind remind);
    void remove(long id);
}
