import { Injectable, EventEmitter, Output } from '@angular/core';
import { AssignedEvent } from './shared/assigned-event.model';
import { BehaviorSubject } from 'rxjs';
import { Event } from '../app/shared/event.model';


@Injectable()
export class UserEventsService {
  @Output() assignedEvent: AssignedEvent[];
  assignedEventSelected = new EventEmitter<AssignedEvent>();

  onSelectAssignedEvent(assignedEvent: AssignedEvent) {
    this.assignedEvent.push(assignedEvent);
  }

  retrieveSelectedEvent() {
     return this.assignedEvent.pop();
  }

  constructor() {
    this.assignedEvent = [];
   }
}
