package com.tayoNew.tayopr.member;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>{
	Optional<Member> findByEmail(String email);
	Optional<Member> findByName(String name);
	List<Member> findByCompanyCompanyIdx(Long companyIdx);
}
