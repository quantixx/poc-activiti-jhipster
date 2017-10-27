package io.quantixx.sponsor.service;

import io.quantixx.sponsor.client.activiti.api.V1ApiClient;
import io.quantixx.sponsor.client.activiti.model.StartProcessInstanceCmd;
import io.quantixx.sponsor.domain.Sponsor;
import io.quantixx.sponsor.repository.SponsorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service Implementation for managing Sponsor.
 */
@Service
@Transactional
public class SponsorService {

    private final Logger log = LoggerFactory.getLogger(SponsorService.class);

    private final SponsorRepository sponsorRepository;

    public SponsorService(SponsorRepository sponsorRepository) {
        this.sponsorRepository = sponsorRepository;
    }

    @Autowired
    V1ApiClient activitiService;

    public Sponsor save(Sponsor sponsor) {
        log.debug("Request to save Sponsor : {}", sponsor);
        // Activiti call: Start process
        StartProcessInstanceCmd process = new StartProcessInstanceCmd();
        process.setProcessDefinitionId("SponsorPrcoess:1:db008162-bb15-11e7-bdea-9e7ccbc1d3ea");
        process.setCommandType("StartProcessInstanceCmd");
        process.setVariables(null);
        log.debug("startProcessUsingPOST : {}", process);
        activitiService.startProcessUsingPOST(process);
        return sponsorRepository.save(sponsor);
    }

    /**
     *  Get all the sponsors.
     *
     *  @return the list of entities
     */
    @Transactional(readOnly = true)
    public List<Sponsor> findAll() {
        log.debug("Request to get all Sponsors");
        return sponsorRepository.findAll();
    }

    /**
     *  Get one sponsor by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Transactional(readOnly = true)
    public Sponsor findOne(Long id) {
        log.debug("Request to get Sponsor : {}", id);
        return sponsorRepository.findOne(id);
    }

    /**
     *  Delete the  sponsor by id.
     *
     *  @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete Sponsor : {}", id);
        sponsorRepository.delete(id);
    }
}
