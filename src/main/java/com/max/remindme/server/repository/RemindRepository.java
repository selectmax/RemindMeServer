package com.max.remindme.server.repository;

import com.max.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository <Remind, Long> {

}
