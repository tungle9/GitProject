import {Component, OnInit} from '@angular/core';
import {Subscription} from 'rxjs/Subscription';
import {Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  private subscription: Subscription;
  createCustomer: any;

  constructor(private formBuilder: FormBuilder,
              private customerService: CustomerService,
              private router: Router) {
    this.createCustomer = formBuilder.group({
      name: ['', Validators.required, Validators.minLength(7)],
      password: ['', [Validators.required, Validators.minLength(7)]],
      confirmPassword: ['', [Validators.required]],
    }, {
      validator: this.checkPassword('password', 'confirmPassword')
    });
  }

  ngOnInit() {
  }
  submit() {
    if (this.createCustomer.valid) {
      this.customerService.saveCustomer(this.createCustomer.value).subscribe(
        data => {
          alert('đã đăng nhập thành công');
        }, error => {
          console.log(error);
        }
      );
    }
  }

  checkPassword(controlName: any, matchingControlName: any) {
    return (formGroup: FormGroup) => {
      const control = formGroup.controls[controlName];
      const matchingControl = formGroup.controls[matchingControlName];
      if (matchingControl.errors && !matchingControl.errors.checkPassword) {
        return;
      }
      if (control.value !== matchingControl.value) {
        matchingControl.setErrors({checkPassword: true});
      } else {
        matchingControl.setErrors(null);
      }
    };
  }
}
