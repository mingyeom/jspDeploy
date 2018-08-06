package kr.or.ddit.lprod.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVo;

public interface LprodServiceInf {
	
	/**
	 * 
	 * Method : selectAllLprod
	 * 최초작성일 : 2018. 7. 9.
	 * 작성자 : PC23
	 * 변경이력 :
	 * @return
	 * Method 설명 : 상품분류에 대한 모든 정보를 불러온다.
	 */
	List<LprodVo> selectAllLprod();
	
	/**
	 * 
	 * Method : getLprodPageList
	 * 최초작성일 : 2018. 7. 11.
	 * 작성자 : PC23
	 * 변경이력 :
	 * @return
	 * Method 설명 : 상품분류 리스트 조회
	 */
	Map<String, Object> getLprodPageList(Map<String, Integer> map);
	
}
