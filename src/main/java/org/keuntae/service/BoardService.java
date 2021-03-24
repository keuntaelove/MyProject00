package org.keuntae.service;

import java.util.List;

import org.keuntae.domain.BoardVO;
import org.keuntae.domain.Criteria;

public interface BoardService {
	
	Long register(BoardVO board);
	
	BoardVO get(Long bno);
	
	int modify(BoardVO board);
	
	int remove(Long bno);
	
	List<BoardVO> getList();
	
	List<BoardVO> getList(Criteria cri);
	
	int getTotal(Criteria cri);
	

}
