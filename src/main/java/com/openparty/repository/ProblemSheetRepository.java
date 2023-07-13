package com.openparty.repository;

import com.openparty.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemSheetRepository extends JpaRepository<Problem, Long> {
}
