package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.DogKindVO;

//마이바티즈연결 DAO 인터페이스
@Mapper
public interface DogDAO {
	public DogKindVO getDog(DogKindVO vo);
}
