import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CreateEventComponent } from './create-event/create-event.component';
import { StageScheduleComponent } from './stage-schedule/stage-schedule.component';
import { EditEventComponent } from './edit-event/edit-event.component';
import { RegisterComponent } from './register/register.component';




const routes: Routes = [
  { path: '', component: HomeComponent},
  { path: 'createEvent', component: CreateEventComponent},
  { path: 'schedule', component: StageScheduleComponent},
  { path: 'edit', component: EditEventComponent},
  { path: 'register', component: RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
