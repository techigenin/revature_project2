import { Event } from './event.model';

export class AssignedEvent {
    constructor(public eventRole: string, public event: Event,
                public eventStartDate: string, public eventEndDate: string) {}
}


