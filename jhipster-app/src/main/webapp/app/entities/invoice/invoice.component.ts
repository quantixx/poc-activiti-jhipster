import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager, JhiParseLinks, JhiAlertService } from 'ng-jhipster';

import { Invoice } from './invoice.model';
import { InvoiceService } from './invoice.service';
import { ITEMS_PER_PAGE, Principal, ResponseWrapper } from '../../shared';

@Component({
    selector: 'jhi-invoice',
    templateUrl: './invoice.component.html'
})
export class InvoiceComponent implements OnInit, OnDestroy {
invoices: Invoice[];
    currentAccount: any;
    eventSubscriber: Subscription;

    constructor(
        private invoiceService: InvoiceService,
        private jhiAlertService: JhiAlertService,
        private eventManager: JhiEventManager,
        private principal: Principal
    ) {
    }

    loadAll() {
        this.invoiceService.query().subscribe(
            (res: ResponseWrapper) => {
                this.invoices = res.json;
            },
            (res: ResponseWrapper) => this.onError(res.json)
        );
    }
    ngOnInit() {
        this.loadAll();
        this.principal.identity().then((account) => {
            this.currentAccount = account;
        });
        this.registerChangeInInvoices();
    }

    ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

    trackId(index: number, item: Invoice) {
        return item.id;
    }
    registerChangeInInvoices() {
        this.eventSubscriber = this.eventManager.subscribe('invoiceListModification', (response) => this.loadAll());
    }

    private onError(error) {
        this.jhiAlertService.error(error.message, null, null);
    }
}
