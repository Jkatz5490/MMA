package com.MMA.organization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MMA.organization.entity.Organization;
import com.MMA.organization.repository.OrganizationRepository;

@Service
public class OrganizationService {
	
	@Autowired
	private OrganizationRepository organizationRepository;

	public Organization save(Organization organization) {
		// TODO Auto-generated method stub
		return organizationRepository.save(organization);
	}

	public Organization findByOrganizationId(Long organizationId) {
		return organizationRepository.findByOrganizationId(organizationId);
	}
	
	
	

}
