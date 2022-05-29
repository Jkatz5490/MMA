package com.MMA.fighter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.MMA.fighter.entity.Fighter;
import com.MMA.fighter.service.FighterService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/fighters")
@Slf4j
public class FighterController {
	
	@Autowired
	private FighterService fighterService;

	@PostMapping("/")
	public Fighter saveFighter(@RequestBody Fighter fighter) {
		log.info("inside saveFighter method of FighterController class");
		return fighterService.saveFighter(fighter);
	}
	
	@GetMapping("/{id}")
	public Fighter findFighterById(@PathVariable("id") Long fighterId) {
		log.info("inside findFighterById method of FighterController class");
		return fighterService.findFighterById(fighterId);
	}
}
