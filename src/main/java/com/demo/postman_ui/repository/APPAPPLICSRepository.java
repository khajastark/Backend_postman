// APPAPPLICSRepository.java
package com.demo.postman_ui.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.postman_ui.entity.APPAPPLICS;

public interface APPAPPLICSRepository extends JpaRepository<APPAPPLICS, Long> {
    List<APPAPPLICS> findByIdRefnum(String idRefnum);
}
