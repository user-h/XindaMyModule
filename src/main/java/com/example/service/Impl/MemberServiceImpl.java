package com.example.service.Impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.MemberMapper;
import com.example.model.Member;
import com.example.model.MemberExample;
import com.example.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService{
	@Resource
	MemberMapper memberMapper;

	@Override
	public Member selectMemberById(String MemberId) {
		return memberMapper.selectByPrimaryKey(MemberId);
	}

	@Override
	public int saveImg(Member member) throws Exception {
		int i = memberMapper.saveUserImg(member);
		if(i!=1) {
			throw new Exception("更新用户头像失败");
		}
		return i;
	}

	@Override
	public int updateMemberByExample(Member member) {
		MemberExample memberExample = new MemberExample();
		MemberExample.Criteria criteria = memberExample.createCriteria();
		criteria.andIdEqualTo(member.getId());
		return memberMapper.updateByExample(member, memberExample);
	}

	@Override
	public Member memberLogin(Map<String, Object> map) {
		return memberMapper.memberLogin(map);
	}

	@Override
	public Member selectByCellPhone(String cellphone) {
		return memberMapper.selectByCellPhone(cellphone);
	}

	@Override
	public int insertSelective(Member insertMember) {
		return memberMapper.insertSelective(insertMember);
	}

}
