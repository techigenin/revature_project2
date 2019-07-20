import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Event } from '../shared/event.model';

import bulmaCarousel from '../../../node_modules/bulma-carousel/dist/js/bulma-carousel.min.js';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  title = 'Festival App';
  loggedIn = false;
  events: Event[] = [
    new Event('Lollapalooza', 'Tampa, Fl', '8/7/19', '8/10/19', 'consectetur adipisicing elit. Dolorum sapiente explicabo, corporis totam! Labore reprehenderit beatae'),
    new Event('Bonnaroo', 'Zimbabwe', '11/7/19', '12/10/19', 'quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!'),
    new Event('Camp Bisco', 'Philadelphia', '10/30/19', '11/13/14', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae.')
  ];

  constructor(private http: HttpClient) {}

  // angular http client will take our object (data) and automatically convert to JSON data
  // must subscribe to request, otherwise angular assumes no one is interested in response and
  // not bother sending it
  // don't need to unsubscribe for observables provided by angular
  onClickSubmit(data) {
    // sending http request
    this.http.post('url', data).subscribe(responseData => {
      // if response is false, alert user invalid login
      console.log(responseData);
    });
    alert('Entered Email id : ' + data.emailid);
    alert('Entered Password : ' + data.passwd);
 }

  ngOnInit() {
  }

}

