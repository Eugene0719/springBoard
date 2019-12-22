package org.zerock.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
@Primary
public class BoardServiceImpl implements BoardService{

	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) {
		log.info("register.."+board);
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		// TODO Auto-generated method stub
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		// TODO Auto-generated method stub
		return mapper.update(board)==1;
	}

	@Override
	public boolean remove(Long bno) {
		// TODO Auto-generated method stub
		return mapper.delete(bno)==1;
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}
}
