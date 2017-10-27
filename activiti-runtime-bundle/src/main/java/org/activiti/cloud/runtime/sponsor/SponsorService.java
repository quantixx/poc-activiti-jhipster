package org.activiti.cloud.runtime.sponsor;

import java.util.Map;

import org.activiti.client.sponsor.api.ApiApiClient;
import org.activiti.client.sponsor.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SponsorService {

	@Autowired
	private ApiApiClient client;
	
	public void createInvoice(Map<String, Object> variables) {
		Invoice invoice = new Invoice();
		invoice.setSponsorName(String.valueOf(variables.get("sponsorName")));
		client.createInvoiceUsingPOST(invoice);
	}
}
