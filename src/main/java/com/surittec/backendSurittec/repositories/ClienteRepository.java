package com.surittec.backendSurittec.repositories;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.surittec.backendSurittec.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{

}
