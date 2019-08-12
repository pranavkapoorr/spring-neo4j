package com.pranavkapoorr.myneo4j.model;

import org.neo4j.ogm.annotation.*;

import lombok.*;

@NodeEntity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class User {
	@Id @GeneratedValue
	private long id;
	private String name;
	private String address;
	private Integer age;
}
