package org.koreait.member.repositories;

import org.koreait.member.entities.TempToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface TempTokenRepository extends JpaRepository<TempToken, String>, QuerydslPredicateExecutor<TempToken> {

}
