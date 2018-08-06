package kr.or.ddit.lprod.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.dao.LprodDao;
import kr.or.ddit.lprod.dao.LprodDaoInf;
import kr.or.ddit.lprod.model.LprodVo;

public class LprodService implements LprodServiceInf {
	private LprodDaoInf lprodDao = new LprodDao();

	/**
	 * 
	 * Method : selectAllLprod
	 * 최초작성일 : 2018. 7. 9.
	 * 작성자 : PC23
	 * 변경이력 :
	 * @return
	 * Method 설명 : 상품분류에 대한 모든 정보를 불러온다.
	 */
	@Override
	public List<LprodVo> selectAllLprod() {
		return lprodDao.selectAllLprod();
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
	@Override
	public Map<String, Object> getLprodPageList(Map<String, Integer> map) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		// 상품분류 페이지 리스트 조회
		List<LprodVo> pageList = lprodDao.getLprodPageList(map);
		resultMap.put("pageList", pageList);
		
		// 상품분류 전체건수 조회
		int totCnt = lprodDao.getLprodTotCnt();
		resultMap.put("totCnt", totCnt);
		
		// 페이지 네비게이션 html생성
		int page = map.get("page");
		int pageSize = map.get("pageSize");
		
		resultMap.put("pageNavi", makePageNavi(page, pageSize, totCnt));
		
		return resultMap;
	}
	
	private String makePageNavi(int page, int pageSize, int totCnt){
		int cnt = totCnt / pageSize;	//몫
		int mod = totCnt % pageSize;	//나머지
		
		if (mod > 0) {
			cnt++;
		}
		
		StringBuffer pageNaviStr = new StringBuffer();
		
		int prevPage = page == 1 ? 1 : page-1;
		int nextPage = page == cnt ? cnt : page+1;
		
		pageNaviStr.append("<li><a href=\"/lprodList?page=" + prevPage + "&pageSize=" + pageSize + "\" aria-label=\"Previous\"><span aria-hidden=\"true\">&laquo;</span></a></li>");
		
		for (int i = 1; i <= cnt; i++) {
			String activeClass = "";
			if (i == page) {
				activeClass = "class=\"active\"";
			}
			pageNaviStr.append("<li " + activeClass + "><a href=\"/lprodList?page=" + i +
					"&pageSize=" + pageSize + "\">" + i + "</a></li>");
		}
		
		pageNaviStr.append("<li><a href=\"/lprodList?page=" + nextPage + "&pageSize=" + pageSize + "\" aria-label=\"Next\"><span aria-hidden=\"true\">&raquo;</span></a></li>");
		
		return pageNaviStr.toString();
	}
}
