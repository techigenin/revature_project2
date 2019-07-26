import { Component, OnInit, ViewChild, ElementRef, Output, EventEmitter } from '@angular/core';
import bulmaQuickview from '../../../node_modules/bulma-quickview/dist/js/bulma-quickview.js';
import { HttpClient } from '@angular/common/http';
import { AssignedEvent } from '../shared/assigned-event.model';
import { Router } from '@angular/router';
import { map } from 'rxjs/operators';
import { Event } from '../shared/event.model';
import { UserEventsService } from '../user-events.service.js';


  // assignedEvents: AssignedEvent[] = [
  //   new AssignedEvent('Lollapalooza', 'Manager', '8/7/19', '8/10/19'),
  //   new AssignedEvent('Bonnaroo', 'Artist', '11/7/19', '12/10/19')
  // ];

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  loggedIn = false;
  edit = false;
 // @Output() rowClicked = new EventEmitter<AssignedEvent>();

//@viewChild('serverContentInput', {static: true}) serverContentInput: ElementRef;
//If you DON'T access the selected element in ngOnInit (but anywhere else in your component),
// set static: false instead!
//  @ViewChild('assignedName', {static: false}) assignedName: ElementRef;
 // call this.assignedName.nativeElement to get underlying element
  // private assignedEvent:AssignedEvent;
  // private assignedEvents: AssignedEvent[] = [
  //   new AssignedEvent('Lollapalooza', 'Manager', '8/7/19', '8/10/19'),
  //   new AssignedEvent('Bonnaroo', 'Artist', '11/7/19', '12/10/19')
  // ];
  assignedEvents: AssignedEvent[];

  constructor(private http: HttpClient, public router: Router, private userEventsService: UserEventsService ) {

  }

  // angular http client will take our object (data) and automatically convert to JSON data
  // must subscribe to request, otherwise angular assumes no one is interested in response and
  // not bother sending it
  // don't need to unsubscribe for observables provided by angular 
  onClickSubmit(data: { username: string; password: string }) {
    // sending http request
    this.http.post('/festivalApp/login', data).subscribe(responseData => {
      if (responseData === 'true') {
        this.fetchUserEvents();
      } else {
        alert('invalid login');
      }
      // angular will give you the response body 
      // if response is false, alert user invalid login
      // bool: Boolean = responseData;
      // if(responseData===bool) {

      // }
      console.log(responseData);
    });
    console.log(data);
    alert('Entered Password : ' + data.password);
 }

 //testing click event binding as well as .navigate() method
 onTestClick() {
   this.router.navigate(['/createEvent']);
   alert(""+this.router.url);
   alert('the click event works');
 }

 onSelectRow(assignedEvent: AssignedEvent) {
   //console.log(assignedEvent);
   this.userEventsService.assignedEventSelected.emit(assignedEvent);
   this.userEventsService.onSelectAssignedEvent(assignedEvent);
   this.router.navigate(['/edit']);
  // this.rowClicked.emit(assignedEvent);
  // console.log(selectedRow[0].innerHTML);
  // console.log(selectedRow[1].innerHTML);
  // console.log(selectedRow[2].innerHTML);
  //this.http.get('/manage_event');

 // let d = e.children;
 // alert(d.children[0].innerText);
 }

 private fetchUserEvents() {
  this.http.get<AssignedEvent[]>('/festivalApp/details').subscribe(assignedEvents => {
    this.assignedEvents = assignedEvents;
  });
   //     angle brackets<> tell ts what kind of object you're getting back; avoids Type errors
  //  this.http.get<AssignedEvent[]>('/').pipe(map(responseData => {
  //    const postsArray: AssignedEvent[] = [];
  //    for (const key in responseData) {
  //      postsArray.push({ ...responseData[key]});
  //    }
  //    return postsArray;
  //  })).subscribe(events => {
  //    console.log(events);
  //    this.assignedEvents = events;
  //  });
 }

  ngOnInit() {
    const quickviews = bulmaQuickview.attach();
    //const assignedEvents: AssignedEvent[];
    let event = new Event(1, 2, 'Lollapalooza', 'Tampa, Fl', '8/7/19', '8/10/19', 'consectetur adipisicing elit. Dolorum sapiente explicabo, corporis totam! Labore reprehenderit beatae');
    let eventTwo = new Event(55, 2, 'Lollapalooza', 'Tampa, Fl', '8/7/19', '8/10/19', 'consectetur adipisicing elit. Dolorum sapiente explicabo, corporis totam! Labore reprehenderit beatae');
    this.assignedEvents = [
      new AssignedEvent('Manager', event, '8/7/19', '8/10/19'),
      new AssignedEvent('Artist', eventTwo, '11/7/19', '12/10/19')
    ];
  }

}
