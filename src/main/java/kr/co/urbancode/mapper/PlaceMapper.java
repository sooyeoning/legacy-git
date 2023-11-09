package kr.co.urbancode.mapper;

import kr.co.urbancode.dto.PlaceDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

//mapper -> sqlSession(sql 쿼리 실행)

@Repository
@RequiredArgsConstructor
public class PlaceMapper {

   private final SqlSession sqlSession;

   public PlaceDTO getOnePlace(int contentId){
      //mapper.xml namespace에서 풀클래스명 사용시 쿼리문 id만 사용해도 됨
      //return sqlSession.selectOne("selectOnePlace", contentId);

      //mapper에 이름(namespace)를 따로 지정했다면 namespace.쿼리문 id
      return sqlSession.selectOne("mapper.PlaceMapper.selectOnePlace", contentId);
   }

}
