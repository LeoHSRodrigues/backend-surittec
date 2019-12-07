package com.surittec.backendSurittec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surittec.backendSurittec.domain.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer>{

}
