package com.stantonviaduc.springbootvue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface TodoRepository extends JpaRepository<Todo, Long>
{
/*
    All the methods needed for a REST API will be automatically generated here.
    Custom methods could be defined here.
 */
}
