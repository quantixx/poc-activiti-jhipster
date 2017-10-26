/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, async } from '@angular/core/testing';
import { DatePipe } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils, JhiDataUtils, JhiEventManager } from 'ng-jhipster';
import { SponsorTestModule } from '../../../test.module';
import { MockActivatedRoute } from '../../../helpers/mock-route.service';
import { SponsorDetailComponent } from '../../../../../../main/webapp/app/entities/sponsor/sponsor-detail.component';
import { SponsorService } from '../../../../../../main/webapp/app/entities/sponsor/sponsor.service';
import { Sponsor } from '../../../../../../main/webapp/app/entities/sponsor/sponsor.model';

describe('Component Tests', () => {

    describe('Sponsor Management Detail Component', () => {
        let comp: SponsorDetailComponent;
        let fixture: ComponentFixture<SponsorDetailComponent>;
        let service: SponsorService;

        beforeEach(async(() => {
            TestBed.configureTestingModule({
                imports: [SponsorTestModule],
                declarations: [SponsorDetailComponent],
                providers: [
                    JhiDateUtils,
                    JhiDataUtils,
                    DatePipe,
                    {
                        provide: ActivatedRoute,
                        useValue: new MockActivatedRoute({id: 123})
                    },
                    SponsorService,
                    JhiEventManager
                ]
            }).overrideTemplate(SponsorDetailComponent, '')
            .compileComponents();
        }));

        beforeEach(() => {
            fixture = TestBed.createComponent(SponsorDetailComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(SponsorService);
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
            // GIVEN

            spyOn(service, 'find').and.returnValue(Observable.of(new Sponsor(10)));

            // WHEN
            comp.ngOnInit();

            // THEN
            expect(service.find).toHaveBeenCalledWith(123);
            expect(comp.sponsor).toEqual(jasmine.objectContaining({id: 10}));
            });
        });
    });

});
