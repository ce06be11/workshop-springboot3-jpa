package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

// Responsavel pelas operacoes CRUD do banco
public interface UserRepository extends JpaRepository<User, Long>{

}
