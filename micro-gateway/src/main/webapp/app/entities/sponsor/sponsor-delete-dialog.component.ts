import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { Sponsor } from './sponsor.model';
import { SponsorPopupService } from './sponsor-popup.service';
import { SponsorService } from './sponsor.service';

@Component({
    selector: 'jhi-sponsor-delete-dialog',
    templateUrl: './sponsor-delete-dialog.component.html'
})
export class SponsorDeleteDialogComponent {

    sponsor: Sponsor;

    constructor(
        private sponsorService: SponsorService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.sponsorService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'sponsorListModification',
                content: 'Deleted an sponsor'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-sponsor-delete-popup',
    template: ''
})
export class SponsorDeletePopupComponent implements OnInit, OnDestroy {

    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private sponsorPopupService: SponsorPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.sponsorPopupService
                .open(SponsorDeleteDialogComponent as Component, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
