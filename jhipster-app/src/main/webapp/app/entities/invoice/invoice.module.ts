import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SponsorSharedModule } from '../../shared';
import {
    InvoiceService,
    InvoicePopupService,
    InvoiceComponent,
    InvoiceDetailComponent,
    InvoiceDialogComponent,
    InvoicePopupComponent,
    InvoiceDeletePopupComponent,
    InvoiceDeleteDialogComponent,
    invoiceRoute,
    invoicePopupRoute,
} from './';

const ENTITY_STATES = [
    ...invoiceRoute,
    ...invoicePopupRoute,
];

@NgModule({
    imports: [
        SponsorSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        InvoiceComponent,
        InvoiceDetailComponent,
        InvoiceDialogComponent,
        InvoiceDeleteDialogComponent,
        InvoicePopupComponent,
        InvoiceDeletePopupComponent,
    ],
    entryComponents: [
        InvoiceComponent,
        InvoiceDialogComponent,
        InvoicePopupComponent,
        InvoiceDeleteDialogComponent,
        InvoiceDeletePopupComponent,
    ],
    providers: [
        InvoiceService,
        InvoicePopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SponsorInvoiceModule {}
