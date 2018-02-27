package com.faint.service;

import java.util.List;

import com.faint.domain.PostVO;

public interface BoardService {
	public void regist(PostVO Post)throws Exception;
	
	public PostVO read(Integer ID)throws Exception;
	
	public void modify(PostVO Post)throws Exception;
	
	public void remove(Integer ID)throws Exception;
	
	public List<PostVO> listAll() throws Exception;

}
