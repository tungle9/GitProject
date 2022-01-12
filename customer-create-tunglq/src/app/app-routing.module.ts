import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CustomerCreateComponent} from './component/customer-create/customer-create.component';
import {CustomerDetailComponent} from './component/customer-detail/customer-detail.component';


const routes: Routes = [{
  path: 'customer/create',
  component: CustomerCreateComponent
}, {
  path: 'customer/detail/:id',
  component: CustomerDetailComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
