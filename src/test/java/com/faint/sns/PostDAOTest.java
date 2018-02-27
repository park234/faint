package com.faint.sns;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.faint.domain.PostVO;
import com.faint.persistence.PostDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class PostDAOTest {

	@Inject
	private PostDAO dao;
	
	@Test
	public void testTime()throws Exception{
		
		System.out.println(dao.getTime());
		
	}
	
	@Test
	public void testInsertMember()throws Exception{
		
		PostVO vo = new PostVO();
		
		vo.setUSERID(1);
		vo.setCATEID(5);
		vo.setCAPTION("Test");
		
		
		dao.insertMember(vo);
		
	}	

}


