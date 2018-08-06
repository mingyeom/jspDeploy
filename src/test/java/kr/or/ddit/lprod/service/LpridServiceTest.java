package kr.or.ddit.lprod.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVo;

import org.junit.Before;
import org.junit.Test;

public class LpridServiceTest {
	
	private LprodService lprodService;
	
	@Before
	public void setup() {
		lprodService = new LprodService();
	}

	/**
	 * 
	 * Method : selectAllLprod
	 * 최초작성일 : 2018. 7. 9.
	 * 작성자 : PC23
	 * 변경이력 :
	 * @return
	 * Method 설명 : 상품분류에 대한 모든 정보를 불러온다.
	 */
	@Test
	public void selectAllLprodTest() {
		
		/***Given***/

		/***When***/
		List<LprodVo> lprodList = lprodService.selectAllLprod();

		/***Then***/
		assertEquals(9, lprodList.size());
	}

	/**
	 * 
	 * Method : getLprodPageList
	 * 최초작성일 : 2018. 7. 11.
	 * 작성자 : PC23
	 * 변경이력 :
	 * @return
	 * Method 설명 : 상품분류 리스트 조회
	 */
	@Test
	public void getLprodPageListTest(){
		
		/***Given***/
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("page", 2);
		map.put("pageSize", 5);

		/***When***/
		Map<String, Object> resultMap = lprodService.getLprodPageList(map);
		
		// lprod전체
		List<LprodVo> lprodList = (List<LprodVo>) resultMap.get("pageList");
		
		// lprod건수
		int totCnt = (int) resultMap.get("totCnt");

		/***Then***/
		assertEquals(4, lprodList.size());
		assertEquals(9, totCnt);
	}
	
	

}
