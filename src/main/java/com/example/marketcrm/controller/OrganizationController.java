package com.example.marketcrm.controller;

import com.example.marketcrm.dto.organization.OrganizationCreateDTO;
import com.example.marketcrm.dto.organization.OrganizationDTO;
import com.example.marketcrm.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/organization")
public class OrganizationController  {
    @Autowired
    private OrganizationService service;

    @GetMapping
    public Set<OrganizationDTO> getAllOrganizations() {
        System.out.println(service.getAllOrganizations());
        return service.getAllOrganizations();
    }

    @GetMapping("/{id}")
    public OrganizationDTO getOrganization(@PathVariable Long id) {
        return service.getOrganization(id);
    }

    @PostMapping
    public OrganizationDTO createOrganization(@RequestBody OrganizationCreateDTO createDTO) {
        return service.createOrganization(createDTO);
    }

    @PutMapping("/{id}")
    public OrganizationDTO updateOrganization(Long id, OrganizationCreateDTO createDTO) {
        return service.updateOrganization(id,createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteOrganization(@PathVariable Long id) {
        service.deleteOrganization(id);
    }
}
