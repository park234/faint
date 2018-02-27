package com.faint.persistence;

import java.util.List;

import com.faint.domain.PostVO;



public interface PostDAO {

	public String getTime();

	public void insertMember(PostVO vo);
	
	public void create(PostVO vo)throws Exception;
	
	public PostVO read(Integer ID)throws Exception;
	
	public void update(PostVO vo)throws Exception;
	
	public void delete(Integer ID)throws Exception;
	
	public List<PostVO> listAll()throws Exception;

}
