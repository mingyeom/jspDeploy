package kr.or.ddit.user.service;

import kr.or.ddit.user.model.UserVo;

public interface UserServiceInf {

	/**
	 * 
	 * Method : getUser
	 * 최초작성일 : 2018. 7. 4.
	 * 작성자 : PC23
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 :
	 */
	UserVo getUser(String userId);
}
