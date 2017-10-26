import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SponsorSharedModule } from '../../shared';
import {
    SponsorService,
    SponsorPopupService,
    SponsorComponent,
    SponsorDetailComponent,
    SponsorDialogComponent,
    SponsorPopupComponent,
    SponsorDeletePopupComponent,
    SponsorDeleteDialogComponent,
    sponsorRoute,
    sponsorPopupRoute,
} from './';

const ENTITY_STATES = [
    ...sponsorRoute,
    ...sponsorPopupRoute,
];

@NgModule({
    imports: [
        SponsorSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        SponsorComponent,
        SponsorDetailComponent,
        SponsorDialogComponent,
        SponsorDeleteDialogComponent,
        SponsorPopupComponent,
        SponsorDeletePopupComponent,
    ],
    entryComponents: [
        SponsorComponent,
        SponsorDialogComponent,
        SponsorPopupComponent,
        SponsorDeleteDialogComponent,
        SponsorDeletePopupComponent,
    ],
    providers: [
        SponsorService,
        SponsorPopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SponsorSponsorModule {}
