import { Injectable, EventEmitter } from '@angular/core';
import { AssignedEvent } from './shared/assigned-event.model';

@Injectable({
  providedIn: 'root'
})
export class UserEventsService {
  assignedEventSelected = new EventEmitter<AssignedEvent>();
  private assignedEvent: AssignedEvent;

  onSelectAssignedEvent(assignedEvent: AssignedEvent) {
    this.assignedEvent = assignedEvent;
    this.assignedEventSelected.emit(assignedEvent);
    // console.log(assignedEvent);
    // console.log(this.assignedEvent);
  }

  retrieveSelectedEvent() {
    this.assignedEventSelected.emit(this.assignedEvent);
    //return 42342;
    // console.log(this.assignedEvent);
    // alert(this.assignedEvent);
    // return this.assignedEvent;
  }

  constructor() { }
}
