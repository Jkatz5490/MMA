package com.MMA.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MMA.organization.entity.Organization;
import com.MMA.organization.service.OrganizationService;

@RestController
@RequestMapping("/Organization")
public class OrganizationController {
	
	@Autowired
	private OrganizationService organizationService;
	
	@PostMapping("/")
	public Organization saveOrganization(@RequestBody Organization organization) {
		return organizationService.save(organization);
	}
	/*
	@GetMapping("/{id}")
	public Organization findOrganizationById(@PathVariable("id") Long organizationId) {
		return organizationService.findOrganizationById(organizationId);
	}
	*/
	@GetMapping("/{id}")
	public Organization findByOrganizationId(@PathVariable("id") Long organizationId) {
		return organizationService.findByOrganizationId(organizationId);
	}
	// added other comment

}
