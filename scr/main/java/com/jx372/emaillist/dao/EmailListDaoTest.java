package com.jx372.emaillist.dao;

import java.util.List;

import com.jx372.emaillist.vo.EmailListVo;

public class EmailListDaoTest {

	public static void main(String[] args) {
		insertTests();
		getListTest();
		
	}
	
	public static void insertTests(){
		EmailListVo vo = new EmailListVo();
		vo.setLastName("허");
		vo.setFirstName("규준");
		vo.setEmail("herojoon1378@naver.com");
		EmailListDao dao = new EmailListDao();
		dao.insert(vo);
		
		
	}
	
	public static void getListTest(){
		EmailListDao dao = new EmailListDao();
		List<EmailListVo> list = dao.getList();
		
		for(EmailListVo vo : list){
			System.out.println(vo.toString());
		}
	}

}
