package com.channim.boardprac.repository;

import com.channim.boardprac.domain.mango_board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<mango_board, Integer> {
}
