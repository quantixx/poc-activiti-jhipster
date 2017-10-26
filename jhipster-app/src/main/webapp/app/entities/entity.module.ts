import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { SponsorSponsorModule } from './sponsor/sponsor.module';
import { SponsorInvoiceModule } from './invoice/invoice.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        SponsorSponsorModule,
        SponsorInvoiceModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SponsorEntityModule {}
