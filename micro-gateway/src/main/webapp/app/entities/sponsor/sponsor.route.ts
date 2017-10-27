import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';

import { UserRouteAccessService } from '../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { SponsorComponent } from './sponsor.component';
import { SponsorDetailComponent } from './sponsor-detail.component';
import { SponsorPopupComponent } from './sponsor-dialog.component';
import { SponsorDeletePopupComponent } from './sponsor-delete-dialog.component';

export const sponsorRoute: Routes = [
    {
        path: 'sponsor',
        component: SponsorComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Sponsors'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'sponsor/:id',
        component: SponsorDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Sponsors'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const sponsorPopupRoute: Routes = [
    {
        path: 'sponsor-new',
        component: SponsorPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Sponsors'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'sponsor/:id/edit',
        component: SponsorPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Sponsors'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'sponsor/:id/delete',
        component: SponsorDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Sponsors'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
