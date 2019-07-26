import { Component, OnInit } from '@angular/core';
import { Performance } from '../shared/performance.model';
import { Stage } from '../shared/stage.model';
import { EventDay } from '../shared/day.model';


let d = new Date();
d.setDate(24);
@Component({
  selector: 'app-edit-event',
  templateUrl: './edit-event.component.html',
  styleUrls: ['./edit-event.component.css']
})
export class EditEventComponent implements OnInit {
  eventDays: EventDay[];
  perfNumber = 0;

  onEditCell() {
    console.log(this.eventDays);
  }

  constructor() { }

  ngOnInit() {
    this.eventDays = [
      new EventDay(new Date(), [
        new Stage('Stage One', [
          new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
        ]),
        new Stage('Stage Two', [
          new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
        ]),
        new Stage('Stage Three', [
          new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
        ]),
      ]),
      new EventDay(d, [
        new Stage('Stage 1', [
          new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
        ]),
        new Stage('Stage 2', [
          new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
        ]),
        new Stage('Stage 3', [
          new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
          new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
          new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
          new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
          new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
          new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
          new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
          new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
        ]),
      ])
    ];
  }

}
