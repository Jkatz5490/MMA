package com.MMA.fighter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MMA.fighter.entity.Fighter;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Long>{

	// method naming is sensitive for some reason
	Fighter findByFighterId (Long fighterId);

}
