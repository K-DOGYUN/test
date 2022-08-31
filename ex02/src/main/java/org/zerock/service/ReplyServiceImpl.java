package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.mapper.ReplyMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ReplyServiceImpl implements ReplyService {
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;

	@Override
	public int register(ReplyVO vo) {
		System.out.println("register : " + vo);
		return mapper.insert(vo);
	}

	@Override
	public ReplyVO get(Long rno) {
		System.out.println("get : " + rno);
		return mapper.read(rno);
	}

	@Override
	public int modify(ReplyVO vo) {
		System.out.println("modify : " + vo);
		return mapper.update(vo);
	}

	@Override
	public int remove(Long rno) {
		System.out.println("remove : " + rno);
		return mapper.delete(rno);
	}

	@Override
	public List<ReplyVO> getlList(Criteria cri, Long bno) {
		System.out.println("List of bno : " + bno);
		return mapper.getListWithPaging(cri, bno);
	}

}
