import { Component, OnInit} from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Event } from '../shared/event.model';
import { AssignedEvent } from '../shared/assigned-event.model';


import bulmaCarousel from '../../../node_modules/bulma-carousel/dist/js/bulma-carousel.min.js';
import bulmaQuickview from '../../../node_modules/bulma-quickview/dist/js/bulma-quickview.js';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  title = 'Festival App';

  events: Event[] = [
    new Event(1, 2, 'Lollapalooza', 'Tampa, Fl', '8/7/19', '8/10/19', 'consectetur adipisicing elit. Dolorum sapiente explicabo, corporis totam! Labore reprehenderit beatae'),
    new Event(1, 2, 'Bonnaroo', 'Zimbabwe', '11/7/19', '12/10/19', 'quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!'),
    new Event(1, 2, 'Camp Bisco', 'Philadelphia', '10/30/19', '11/13/14', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae.')
  ];


  onSelectEvent(selectedEvent: HTMLCollection) {
    console.log(selectedEvent[0].firstChild.firstChild.textContent);
    console.log(selectedEvent[0].children[2].firstChild.textContent);
    console.log(selectedEvent[0].children[3].firstChild.textContent);
    console.log(selectedEvent[0].children[3].lastChild.textContent);

  }
  constructor(private http: HttpClient) {}




  ngOnInit() {
    this.http.get<Event[]>('').subscribe(events => {
      this.events = events;
    });
  }

}

