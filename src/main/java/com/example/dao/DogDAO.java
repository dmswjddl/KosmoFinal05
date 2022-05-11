package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.DogKindVO;

@Mapper
public interface DogDAO {
	public DogKindVO getDog(DogKindVO vo);
}
