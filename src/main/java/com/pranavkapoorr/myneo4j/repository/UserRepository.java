package com.pranavkapoorr.myneo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.pranavkapoorr.myneo4j.model.User;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long>{
	Long deleteByName(String name);
}
