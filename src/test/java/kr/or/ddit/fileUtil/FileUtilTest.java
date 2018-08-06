package kr.or.ddit.fileUtil;

import static org.junit.Assert.*;
import kr.or.ddit.file.FileUtil;

import org.junit.Test;


public class FileUtilTest {

	@Test
	public void test() {
		
		/***Given***/
		String contentDisposition = "form-data; name=\"uploadFile\"; filename=\"sally.png\"";
		
		/***When***/
		String fileName = FileUtil.getFileName(contentDisposition);

		/***Then***/
		assertEquals("sally.png", fileName);
	}

}
