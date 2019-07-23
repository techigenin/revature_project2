import { Performance } from './performance.model';

export class Stage {
    constructor(public name: string, public performances: Performance[]) {}
}