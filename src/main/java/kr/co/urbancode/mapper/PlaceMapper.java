package kr.co.urbancode.mapper;

import kr.co.urbancode.dto.PlaceDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

//mapper -> sqlSession(sql 쿼리 실행)

@Repository
@RequiredArgsConstructor
public class PlaceMapper {

   //해당 빈이 생성자를 통해 주입되는 시점에 불변성 보장하도록 final 키워드 추가
   private final SqlSession sqlSession;

   public PlaceDTO selectOnePlace(int contentId){
      //mapper.xml namespace에서 풀클래스명 사용시 쿼리문 id만 사용해도 됨
      //return sqlSession.selectOne("selectOnePlace", contentId);

      //mapper에 이름(namespace)를 따로 지정했다면 namespace.쿼리문 id
      return sqlSession.selectOne("mapper.PlaceMapper.selectOnePlace", contentId);
   }

   public void deletePlace(int contentId){
       sqlSession.delete("mapper.PlaceMapper.deletePlace", contentId);
   }

   public void updatePlace(PlaceDTO placeDTO){
      sqlSession.update("mapper.PlaceMapper.updatePlace", placeDTO);
   }

   public void insertPlace(PlaceDTO placeDTO) {
      sqlSession.insert("mapper.PlaceMapper.insertPlace", placeDTO);
   }

   public List<PlaceDTO> selectPlaceList() {
      return sqlSession.selectList("mapper.PlaceMapper.selectPlaceList");
   }
}

/*
 * @RequiredArgsConstructor
 *  : final/@NonNull 키워드가 붙은 필드를 파라미터로 갖는 생성자를 만들고 주입해준다. (아래 코드와 같은 의미)
 *  : (주의) 생성자의 파라미터 순서는 클래스 내부에 선언된 필드의 순서와 동일해야 한다
 * @Autowired
 * User(String username, String password){
 *     this.username = username;
 *     this.password = password;
 * } 이 코드를 생략할 수 있다
 */

