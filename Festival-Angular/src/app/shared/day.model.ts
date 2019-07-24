import { Stage } from './stage.model';

export class EventDay {
    constructor(public day: Date, public stages: Stage[]) {}
}