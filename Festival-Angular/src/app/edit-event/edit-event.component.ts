import { Component, OnInit } from '@angular/core';
import { Performance } from '../shared/performance.model';
import { Stage } from '../shared/stage.model';
import { EventDay } from '../shared/day.model';
import { UserEventsService } from '../user-events.service';
import { AssignedEvent } from '../shared/assigned-event.model';


let d = new Date();
d.setDate(24);
@Component({
  selector: 'app-edit-event',
  templateUrl: './edit-event.component.html',
  styleUrls: ['./edit-event.component.css']
})
export class EditEventComponent implements OnInit {
  a: Date;
  d: Date;
  assignedEvent: AssignedEvent;
  eventDays: EventDay[];
  perfNumber = 0;

  onEditCell() {
    console.log(this.eventDays);
  }

  constructor(private userEventsService: UserEventsService) { }

  ngOnInit() {
    this.userEventsService.assignedEventSelected.subscribe(event => {
      this.assignedEvent = event;
      console.log(event);
    });
    // console.log(this.assignedEvent);
    // console.log(this.userEventsService.retrieveSelectedEvent().event);
    this.d = new Date();
    this.a = new Date();
    this.a.setDate(25)
    this.eventDays = [
      new EventDay(this.a, [
        new Stage('Skull Candy Stage', [
          new Performance('5:00 PM', '6:45 PM', 'Tsunami Bomb', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'In This Moment', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'The Dollyrots', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Garbage', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Elastica', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Otep', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Amon Amarth', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Bad Religion', this.perfNumber++)
        ]),
        new Stage('Matchstick', [
          new Performance('5:00 PM', '6:45 PM', 'Kendrick Lamar', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Odesza', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Big Grizmatik', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Troyboi', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Excision', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'RL Grime', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Zeds Dead', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Hippie Sabotage', this.perfNumber++)
        ]),
        new Stage('Clash', [
          new Performance('5:00 PM', '6:45 PM', ' Lacuna Coil', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Scarlxrd', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Alice In Chains', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Tech N9ne', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Slipknot', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Sevendust', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Flume', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'SOPHIE', this.perfNumber++)
        ]),
      ]),
      new EventDay(new Date(), [
        new Stage('Skull Candy Stage', [
          new Performance('5:00 PM', '6:45 PM', 'Tsunami Bomb', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'In This Moment', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'The Dollyrots', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Garbage', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Elastica', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Otep', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Amon Amarth', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Bad Religion', this.perfNumber++)
        ]),
        new Stage('No John Raw', [
          new Performance('5:00 PM', '6:45 PM', 'Kendrick Lamar', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Odesza', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Big Grizmatik', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Troyboi', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Excision', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'RL Grime', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Zeds Dead', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Hippie Sabotage', this.perfNumber++)
        ]),
        new Stage('Clash', [
          new Performance('5:00 PM', '6:45 PM', ' Lacuna Coil', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Scarlxrd', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Alice In Chains', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Tech N9ne', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Slipknot', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Sevendust', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Flume', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'SOPHIE', this.perfNumber++)
        ]),
      ])
    ];
  }

}
