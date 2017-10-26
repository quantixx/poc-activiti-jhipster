import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';

import { UserRouteAccessService } from '../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { InvoiceComponent } from './invoice.component';
import { InvoiceDetailComponent } from './invoice-detail.component';
import { InvoicePopupComponent } from './invoice-dialog.component';
import { InvoiceDeletePopupComponent } from './invoice-delete-dialog.component';

export const invoiceRoute: Routes = [
    {
        path: 'invoice',
        component: InvoiceComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Invoices'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'invoice/:id',
        component: InvoiceDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Invoices'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const invoicePopupRoute: Routes = [
    {
        path: 'invoice-new',
        component: InvoicePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Invoices'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'invoice/:id/edit',
        component: InvoicePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Invoices'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'invoice/:id/delete',
        component: InvoiceDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Invoices'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
