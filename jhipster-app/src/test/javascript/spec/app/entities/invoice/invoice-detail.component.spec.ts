/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, async } from '@angular/core/testing';
import { DatePipe } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils, JhiDataUtils, JhiEventManager } from 'ng-jhipster';
import { SponsorTestModule } from '../../../test.module';
import { MockActivatedRoute } from '../../../helpers/mock-route.service';
import { InvoiceDetailComponent } from '../../../../../../main/webapp/app/entities/invoice/invoice-detail.component';
import { InvoiceService } from '../../../../../../main/webapp/app/entities/invoice/invoice.service';
import { Invoice } from '../../../../../../main/webapp/app/entities/invoice/invoice.model';

describe('Component Tests', () => {

    describe('Invoice Management Detail Component', () => {
        let comp: InvoiceDetailComponent;
        let fixture: ComponentFixture<InvoiceDetailComponent>;
        let service: InvoiceService;

        beforeEach(async(() => {
            TestBed.configureTestingModule({
                imports: [SponsorTestModule],
                declarations: [InvoiceDetailComponent],
                providers: [
                    JhiDateUtils,
                    JhiDataUtils,
                    DatePipe,
                    {
                        provide: ActivatedRoute,
                        useValue: new MockActivatedRoute({id: 123})
                    },
                    InvoiceService,
                    JhiEventManager
                ]
            }).overrideTemplate(InvoiceDetailComponent, '')
            .compileComponents();
        }));

        beforeEach(() => {
            fixture = TestBed.createComponent(InvoiceDetailComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(InvoiceService);
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
            // GIVEN

            spyOn(service, 'find').and.returnValue(Observable.of(new Invoice(10)));

            // WHEN
            comp.ngOnInit();

            // THEN
            expect(service.find).toHaveBeenCalledWith(123);
            expect(comp.invoice).toEqual(jasmine.objectContaining({id: 10}));
            });
        });
    });

});
