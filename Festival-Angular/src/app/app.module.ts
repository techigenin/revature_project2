import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AngularFontAwesomeModule } from 'angular-font-awesome';
import { CreateEventComponent } from './create-event/create-event.component';
import { StageScheduleComponent } from './stage-schedule/stage-schedule.component';
import { NavbarComponent } from './navbar/navbar.component';
import { EditEventComponent } from './edit-event/edit-event.component';
import { RegisterComponent } from './register/register.component';
import { ManagerDashboardComponent } from './manager-dashboard/manager-dashboard.component';
import { UserEventsService } from './user-events.service';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CreateEventComponent,
    StageScheduleComponent,
    NavbarComponent,
    EditEventComponent,
    RegisterComponent,
    ManagerDashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    AngularFontAwesomeModule
  ],
  providers: [UserEventsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
