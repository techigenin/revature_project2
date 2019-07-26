import { Component, OnInit, Output } from '@angular/core';
import { Time } from '@angular/common';

@Component({
  selector: 'app-manager-dashboard',
  templateUrl: './manager-dashboard.component.html',
  styleUrls: ['./manager-dashboard.component.css']
})
export class ManagerDashboardComponent implements OnInit {


  onAddStage(data) {
    console.log(data);
  }

  onAddRole(data) {
    console.log(data);
  }
  onAddPerformance(perf: { stageName: string, artistName: string, startTime: string, endTime: string, date: string }) {
    let start = new Date(perf.date); 
    start.setHours(Number.parseInt(perf.startTime.slice(0, 2)));
    start.setMinutes(Number.parseInt(perf.startTime.slice(3)))
    let end = new Date(perf.date);
    end.setHours(Number.parseInt(perf.endTime.slice(0, 2)));
    end.setMinutes(Number.parseInt(perf.endTime.slice(3)))
   // perf.startTime = d;

   // console.log(start);
    perf.startTime = start.toISOString();
    perf.endTime = end.toISOString();
    delete perf.date;


    console.log(perf);
   // let resp: object = {startTime=startTime, endTime, data.artistName, data};
    //console.log({startTime, endTime, data.artistName, data});

  // if (Date.length==7) {
      // const month = Number.parseInt(perf.date.slice(0, 1));
      // const day = Number.parseInt(perf.date.slice(2, 4));
      // const year = Number.parseInt(perf.date.slice(5));
      // perf.startTime.setMonth(month);
      // perf.startTime.setDate(day);
      // perf.startTime.setFullYear(year);
      // perf.endTime.setMonth(month);
      // perf.endTime.setDate(day);
      // perf.endTime.setFullYear(year);
   // }
    //console.log(month);
    // const month = Number.parseInt(perf.date.slice(0, 3));
    // const day = Number.parseInt(perf.date.slice(3, 5));
    // const year = Number.parseInt(perf.date.slice(3, 5));

    // delete data.date;
    // console.log(data);
  }

  constructor() { }

  ngOnInit() {
  }

}
