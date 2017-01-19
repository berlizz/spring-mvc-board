package com.berlizz.service;

import java.util.List;

import com.berlizz.domain.ReplyVO;

public interface ReplyService {

	public List<ReplyVO> listReply(Integer bno) throws Exception;
	
	public void addReply(ReplyVO vo) throws Exception;
	
	public void modifyReply(ReplyVO vo) throws Exception;
	
	public void removeReply(Integer rno) throws Exception;
	
}
