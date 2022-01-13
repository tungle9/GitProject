import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {EmployeeRoutingModule} from './employee-routing.module';
import {EmployeeCreateComponent} from './employee-create/employee-create.component';
import {EmployeeDeleteComponent} from './employee-delete/employee-delete.component';
import {EmployeeEditComponent} from './employee-edit/employee-edit.component';
import {EmployeeListComponent} from './employee-list/employee-list.component';


@NgModule({
  declarations: [
    EmployeeCreateComponent,
    EmployeeDeleteComponent,
    EmployeeEditComponent,
    EmployeeListComponent,
  ],
  imports: [
    CommonModule,
    EmployeeRoutingModule
  ]
})
export class EmployeeModule {
}
