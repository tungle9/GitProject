import {Component, OnInit} from '@angular/core';
import {Customer} from '../../model/customer';
import {Subscription} from 'rxjs/Subscription';
import {CustomerService} from '../../service/customer.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.css']
})
export class CustomerDetailComponent implements OnInit {
  public customer: Customer;
  private subscription: Subscription;
  id: any;

  constructor(private customerService: CustomerService,
              private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('KH-0001');
      console.log(this.id);
    });
    this.subscription = this.customerService.getCustomerById(this.id).subscribe(
      data => {
        this.customer = data;
      }, error => {
        console.log('error');
      }
    );
  }
}

