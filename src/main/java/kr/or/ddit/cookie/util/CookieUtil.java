package kr.or.ddit.cookie.util;

import static org.junit.Assert.assertEquals;

public class CookieUtil {

	/**
	 * 
	 * Method : getCooie
	 * 최초작성일 : 2018. 7. 6.
	 * 작성자 : PC23
	 * 변경이력 :
	 * @param cookie
	 * @param name
	 * @return
	 * Method 설명 : 쿠키 조회
	 */
	public String getCookie(String cookie, String name) {
		//cookie : userId=brown; rememberMe=y; checkYn=n
		String[] cookies = cookie.split("; ");
		String cookieResult = "";
		
		
		//cookieStr : userId=brown, remember=y, checkYn=n
		for(String cookieStr : cookies){
			String[] cookieNameValue = cookieStr.split("=");
			
			String cookieName = cookieNameValue[0];
			String cookieValue = cookieNameValue[1];
			
			if (name.equals(cookieName)) {
				cookieResult = cookieValue;
				break;
			}
		}
		
		return cookieResult;
	}
	
}
