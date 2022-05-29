package com.MMA.organization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MMA.organization.entity.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long>{

	// sensitive naming of method here for some reason
	Organization findByOrganizationId(Long organizationId);

	
	//Organization findOrganizationById(Long organizationId);

}
