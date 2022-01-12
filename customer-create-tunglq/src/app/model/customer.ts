import {AppUser} from './app-user';
import {Image} from './image';

export interface Customer {
  id?: string;
  address?: string;
  dateOfBirth?: string;
  email?: string;
  gender?: string;
  name?: string;
  idCard?: string;
  phoneNumber?: string;
  appUser?: AppUser;
  image?: Image;
}
