import { Component } from '@angular/core';
import { UserEventsService } from './user-events.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [UserEventsService]
})
export class AppComponent {
  constructor(private userEventsService: UserEventsService) {
  }
  title = 'Festival-App';
}

