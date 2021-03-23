package org.keuntae.service;

import java.util.List;

import org.keuntae.domain.BoardVO;

public interface BoardService {
	
	Long register(BoardVO board);
	
	BoardVO get(Long bno);
	
	int modify(BoardVO board);
	
	int remove(Long bno);
	
	List<BoardVO> getList();
	

}
