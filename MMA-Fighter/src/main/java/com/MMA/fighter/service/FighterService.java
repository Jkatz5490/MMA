package com.MMA.fighter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MMA.fighter.entity.Fighter;
import com.MMA.fighter.repository.FighterRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FighterService {
	
	@Autowired
	private FighterRepository fighterRepository;

	public Fighter saveFighter(Fighter fighter) {
		log.info("inside saveFighter method of FighterService class");
		return fighterRepository.save(fighter);
	}

	public Fighter findFighterById(Long fighterId) {
		log.info("inside findFighterById method of FighterService class");
		return fighterRepository.findByFighterId(fighterId);
	}
	

	
}
