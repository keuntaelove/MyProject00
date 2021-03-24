package org.keuntae.mapper;

import java.util.List;
import java.util.Map;

import org.keuntae.domain.BoardVO;
import org.keuntae.domain.Criteria;

public interface BoardMapper {
	
	
	List<BoardVO> getList();
	
	void insert(BoardVO board);
	
	void insertSelectKey(BoardVO board);
	
	BoardVO read(Long bno);
	
	int delete(Long bno);
	
	int update(BoardVO board);
	
	List<BoardVO> getListWithPaging(Criteria cri);
	
	int getTotalCount(Criteria cri);
	
	List<BoardVO> searchTest(Map<String, Map<String,String>> map);
	
}
