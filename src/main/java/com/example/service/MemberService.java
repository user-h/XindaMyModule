package com.example.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.model.Member;
@Service
public interface MemberService {
	/*通过id查找用户*/
	public Member selectMemberById(String MemberId);
	/*保存头像*/
	public int saveImg(Member member) throws Exception; 
	/*修改信息*/
	public int updateMemberByExample(Member member);
	
	Member memberLogin(Map<String,Object> map);
	/*按手机号查找*/
	public Member selectByCellPhone(String cellphone);
	public int insertSelective(Member insertMember);
}
