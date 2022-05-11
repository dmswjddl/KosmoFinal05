package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class testVO {
	
	@Id
	private String id;
	private String pass;
}
