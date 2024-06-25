package com.mysite.tayo.vote;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepository extends JpaRepository<Voter, Long>{

}
