import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Customer} from '../model/customer';
// tslint:disable-next-line:import-blacklist
import {Observable} from 'rxjs';


// @ts-ignore
@Injectable(
)
export class CustomerService {
  private API_URL = 'http://localhost:9090/api/customer';

  constructor(private httpClient: HttpClient) {
  }

  getCustomerById(id): Observable<any> {
    console.log('fdklgjdklfg');
    return this.httpClient.get(this.API_URL + '/' + id);
  }

  saveCustomer(customer: Customer): Observable<Customer> {
    return this.httpClient.post<Customer>(this.API_URL, customer);
  }
}
