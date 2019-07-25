import { Component, OnInit } from '@angular/core';
import { Performance } from '../shared/performance.model';
import { Stage } from '../shared/stage.model';
import { EventDay } from '../shared/day.model';


let d = new Date();
d.setDate(24);


@Component({
  selector: 'app-stage-schedule',
  templateUrl: './stage-schedule.component.html',
  styleUrls: ['./stage-schedule.component.css']
})
export class StageScheduleComponent implements OnInit {
  // first get: gets an array of stage names or numbers
  // Routing: pass in a parameter on the end to diff url with stage name or number
  // for every request getting back schedule
  perfNumber = 0;
  columnSize: number;
  eventDays: EventDay[];
  // eventDays: EventDay[] = [
  //   new EventDay(new Date(), [
  //     new Stage('Stage One', [
  //       new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //       new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //       new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //       new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //       new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //       new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //       new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //       new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //     ]),
  //     new Stage('Stage Two', [
  //       new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //       new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //       new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //       new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //       new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //       new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //       new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //       new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //     ]),
  //     new Stage('Stage Three', [
  //       new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //       new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //       new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //       new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //       new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //       new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //       new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //       new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //     ]),
  //   ]),
  //   new EventDay(d, [
  //     new Stage('Stage 1', [
  //       new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //       new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //       new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //       new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //       new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //       new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //       new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //       new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //     ]),
  //     new Stage('Stage 2', [
  //       new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //       new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //       new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //       new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //       new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //       new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //       new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //       new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //     ]),
  //     new Stage('Stage 3', [
  //       new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //       new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //       new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //       new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //       new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //       new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //       new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //       new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //     ]),
  //   ])
  // ];



  // stages: Stage[] = [
  //   new Stage('Stage One', [
  //     new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //     new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //     new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //     new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //     new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //     new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //     new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //     new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //   ]),
  //   new Stage('Stage Two', [
  //     new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //     new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //     new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //     new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //     new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //     new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //     new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //     new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //   ]),
  //   new Stage('Stage Three', [
  //     new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //     new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //     new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //     new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //     new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //     new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //     new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //     new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //   ]),
  //   new Stage('Stage Four', [
  //     new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //     new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //     new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //     new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //     new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //     new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //     new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //     new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  //   ])
  // ];



  // performances: Performance[] = [
  //   new Performance('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
  //   new Performance('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
  //   new Performance('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
  //   new Performance('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
  //   new Performance('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
  //   new Performance('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
  //   new Performance('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
  //   new Performance('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
  // ];

  constructor() { }

  ngOnInit() {
   // const size: number = this.performances.length;
    // this.columnSize: number;
   // this.columnSize = Math.floor(12/size);
    // if (12 % size === 0) {
    //   columnSize = 12/size;
    // } else {
    //   columnSize = Math.floor(12/size);
    // }
    //console.log(size);
    console.log(this.columnSize);
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
