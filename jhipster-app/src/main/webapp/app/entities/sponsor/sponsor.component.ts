import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager, JhiParseLinks, JhiAlertService } from 'ng-jhipster';

import { Sponsor } from './sponsor.model';
import { SponsorService } from './sponsor.service';
import { ITEMS_PER_PAGE, Principal, ResponseWrapper } from '../../shared';

@Component({
    selector: 'jhi-sponsor',
    templateUrl: './sponsor.component.html'
})
export class SponsorComponent implements OnInit, OnDestroy {
sponsors: Sponsor[];
    currentAccount: any;
    eventSubscriber: Subscription;

    constructor(
        private sponsorService: SponsorService,
        private jhiAlertService: JhiAlertService,
        private eventManager: JhiEventManager,
        private principal: Principal
    ) {
    }

    loadAll() {
        this.sponsorService.query().subscribe(
            (res: ResponseWrapper) => {
                this.sponsors = res.json;
            },
            (res: ResponseWrapper) => this.onError(res.json)
        );
    }
    ngOnInit() {
        this.loadAll();
        this.principal.identity().then((account) => {
            this.currentAccount = account;
        });
        this.registerChangeInSponsors();
    }

    ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

    trackId(index: number, item: Sponsor) {
        return item.id;
    }
    registerChangeInSponsors() {
        this.eventSubscriber = this.eventManager.subscribe('sponsorListModification', (response) => this.loadAll());
    }

    private onError(error) {
        this.jhiAlertService.error(error.message, null, null);
    }
}
