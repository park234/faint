package com.faint.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import com.faint.domain.PostVO;
import com.faint.persistence.PostDAO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	private PostDAO dao;
	
	@Override
	public void regist(PostVO Post) throws Exception {
		dao.create(Post);
	}
	
	@Override
	public PostVO read(Integer ID) throws Exception {
		return dao.read(ID);
	}
	
	@Override
	public void modify(PostVO Post) throws Exception {
		dao.update(Post);
	}
	
	@Override
	public void remove(Integer ID)throws Exception {
		dao.delete(ID);
	}
	
	@Override
	public List<PostVO> listAll() throws Exception {
		return dao.listAll();
	}
	

}
