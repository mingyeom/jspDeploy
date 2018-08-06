package kr.or.ddit.lprod.dao;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVo;

import org.junit.Before;
import org.junit.Test;

public class lprodDaoTest {
	
	private LprodDaoInf lprodDaoInf;
	
	@Before
	public void setup() {
		lprodDaoInf = new LprodDao();
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
		List<LprodVo> lprodList = lprodDaoInf.selectAllLprod();
		
		for (LprodVo vo : lprodList) {
			System.out.println(vo);
		}

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

		
		/***When***/
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("page", 2);
		map.put("pageSize", 5);
		
		List<LprodVo> lprodList = lprodDaoInf.getLprodPageList(map);
		
		for (LprodVo vo : lprodList) {
			System.out.println(vo);
		}

		/***Then***/
		assertEquals(4, lprodList.size());

	}
	
	/**
	 * 
	 * Method : getLprodTotCnt
	 * 최초작성일 : 2018. 7. 11.
	 * 작성자 : PC23
	 * 변경이력 :
	 * @return
	 * Method 설명 : 상품분류 건수 조회
	 */
	@Test
	public void getLprodTotCntTest(){
		/***Given***/
		

		/***When***/
		int totCnt = lprodDaoInf.getLprodTotCnt();
		System.out.println(totCnt);

		/***Then***/
		assertEquals(9, totCnt);

	}

}
