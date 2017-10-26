import { BaseEntity } from './../../shared';

export class Invoice implements BaseEntity {
    constructor(
        public id?: number,
        public invoiceNumber?: string,
        public limitPaymentDate?: any,
        public subTotal?: number,
        public vatRate?: number,
        public vat?: number,
        public total?: number,
    ) {
    }
}
