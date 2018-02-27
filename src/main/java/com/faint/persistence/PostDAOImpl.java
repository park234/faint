package com.faint.persistence;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.faint.domain.PostVO;

@Repository
public class PostDAOImpl implements PostDAO {
	
	@Inject
	private SqlSession sqlSession;

	private static final String namespace =
			"com.faint.mapper.MemberMapper";

	@Override
	public String getTime() {

		return sqlSession.selectOne(namespace+".getTime");
	}

	
	@Override
	public void insertMember(PostVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
	}
	
	@Override
	public void create(PostVO vo) throws Exception {
		sqlSession.insert(namespace+".create",vo);
	}
	
	@Override
	public PostVO read(Integer ID) throws Exception {
		return sqlSession.selectOne(namespace+".read", ID);
	}
	
	@Override
	public void update(PostVO vo) throws Exception {
		sqlSession.update(namespace+".update",vo);
	}
	
	@Override
	public void delete(Integer ID) throws Exception {
		sqlSession.delete(namespace+".delete", ID);
	}
	
	@Override
	public List<PostVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}
	

}