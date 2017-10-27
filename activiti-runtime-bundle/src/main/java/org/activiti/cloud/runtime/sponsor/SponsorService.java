package org.activiti.cloud.runtime.sponsor;

import org.activiti.client.sponsor.api.ApiApiClient;
import org.activiti.client.sponsor.model.Invoice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SponsorService {

	private final Logger log = LoggerFactory.getLogger(SponsorService.class);

	@Autowired
	ApiApiClient sponsorService;

	public void createInvoice(Map<String, Object> variables) {
		log.debug("Request to save create an invoice : {}");
		// Activiti call: Start process
		Invoice invoice = new Invoice();
		invoice.setSponsorName("Dummy Sponsor name");
		invoice.setInvoiceNumber("Dummy invoice number");
		sponsorService.createInvoiceUsingPOST(invoice);
	}
}
