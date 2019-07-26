import { Component, OnInit } from '@angular/core';
import { Performance } from '../shared/performance.model';
import { Stage } from '../shared/stage.model';
import { EventDay } from '../shared/day.model';


// let d = new Date();
// let a = new Date();
// d.setDate(24);


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
  d: Date;
  a: Date;
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
