(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./$$_lazy_route_resource lazy recursive":
/*!******************************************************!*\
  !*** ./$$_lazy_route_resource lazy namespace object ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./node_modules/raw-loader/index.js!./src/app/app.component.html":
/*!**************************************************************!*\
  !*** ./node_modules/raw-loader!./src/app/app.component.html ***!
  \**************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- <app-create-event></app-create-event> -->\r\n<!-- <app-home></app-home> -->\r\n<app-navbar></app-navbar>\r\n<!-- <app-stage-schedule></app-stage-schedule> -->\r\n<router-outlet></router-outlet>\r\n"

/***/ }),

/***/ "./node_modules/raw-loader/index.js!./src/app/create-event/create-event.component.html":
/*!************************************************************************************!*\
  !*** ./node_modules/raw-loader!./src/app/create-event/create-event.component.html ***!
  \************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- <p>create-event works!</p> -->\r\n<br>\r\n<ul class=\"steps is-balanced\">\r\n    <li class=\"steps-segment is-active\">\r\n      <span class=\"steps-marker\"></span>\r\n      <div class=\"steps-content\">\r\n        <p class=\"is-size-4\">Step 1</p>\r\n        <p>Create your Event</p>\r\n      </div>\r\n    </li>\r\n    <li class=\"steps-segment\">\r\n      <span class=\"steps-marker\"></span>\r\n      <div class=\"steps-content\">\r\n        <p class=\"is-size-4\">Step 2</p>\r\n        <p>This is the second step. Once you complete the first step, you will end up here.</p>\r\n      </div>\r\n    </li>\r\n    <li class=\"steps-segment is-active\">\r\n      <span class=\"steps-marker\"></span>\r\n      <div class=\"steps-content\">\r\n        <p class=\"is-size-4\">Step 3</p>\r\n        <p>This is the third step. This is halfway between the start and the end.</p>\r\n      </div>\r\n    </li>\r\n    <li class=\"steps-segment\">\r\n        <span class=\"steps-marker\"></span>\r\n        <div class=\"steps-content\">\r\n          <p class=\"is-size-4\">Step 4</p>\r\n          <p>Success!</p>\r\n        </div>\r\n    </li>\r\n    \r\n  </ul>\r\n\r\n\r\n\r\n<form> \r\n\r\n    <div class=\"field\">\r\n      <label class=\"label\">Event Name</label>\r\n      <div class=\"control\">\r\n        <input class=\"input\" type=\"text\" placeholder=\"Your Event's Name Here\">\r\n      </div>\r\n    </div>\r\n \r\n    <br>\r\n \r\n    <div class=\"field is-horizontal\">\r\n    \r\n      <div class=\"field-body\">\r\n\r\n        <div class=\"field has-addons\">\r\n          <div class=\"control\">\r\n            <a class=\"button is-static\">\r\n              Start Date\r\n            </a>\r\n          </div>\r\n          <div class=\"control is-expanded\">\r\n            <input class=\"input \" placeholder=\"Please choose a date from calender\" type=\"date\">\r\n          </div>\r\n        </div>\r\n    \r\n        <div class=\"field has-addons\">\r\n          <div class=\"control \">\r\n            <a class=\"button is-static\">\r\n              End Date\r\n            </a>\r\n          </div>\r\n          <div class=\"control is-expanded\">\r\n            <input class=\"input \" placeholder=\"Leave blank if one day event\" type=\"date\">\r\n            <p class=\"help\">Your Event will be one day(s)</p>\r\n          </div>\r\n        </div>\r\n    \r\n      </div>\r\n\r\n    </div>\r\n    \r\n    \r\n    \r\n    <div class=\"field\">\r\n      <label class=\"label\">Location</label>\r\n      <div class=\"control\">\r\n        <input class=\"input\" type=\"text\" placeholder=\"This will be displayed to customers\">\r\n      </div>\r\n    </div>\r\n    \r\n    \r\n    \r\n    \r\n    <div class=\"field\">\r\n      <label class=\"label\">Event Description</label>\r\n      <div class=\"control\">\r\n        <textarea class=\"textarea\" placeholder=\"Make it good!\"></textarea>\r\n      </div>\r\n    </div>\r\n  \r\n    \r\n    <br>\r\n\r\n    <div class=\"field is-horizontal\">\r\n    \r\n      <div class=\"field-body\">\r\n        \r\n        <div class=\"field has-addons\">\r\n          <div class=\"control\">\r\n            <a class=\"button is-static\">\r\n              Audience Capacity\r\n            </a>\r\n          </div>\r\n          <div class=\"control \">\r\n            <input class=\"input \" placeholder=\"Enter max capacity\" type=\"text\">\r\n          </div>\r\n        </div>\r\n    \r\n        <div class=\"field is-grouped\">\r\n          <div class=\"control\">\r\n            <a class=\"button is-info\">\r\n              Previous\r\n            </a>\r\n          </div>\r\n          <div class=\"control\">\r\n            <a class=\"button is-info\">\r\n              Next\r\n            </a>\r\n          </div>\r\n          <div class=\"control\">\r\n            <a class=\"button is-primary\">\r\n              Save Changes\r\n            </a>\r\n          </div>\r\n          <div class=\"control\">\r\n            <a class=\"button is-danger\">\r\n              Cancel\r\n            </a>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n    \r\n</form> \r\n\r\n\r\n\r\n\r\n\r\n\r\n<!-- <div class=\"container\">\r\n    <input type=\"date\">\r\n</div> -->\r\n\r\n<!-- <div class=\"container\">\r\n    <div id=\"quickviewDefault\" class=\"quickview\">\r\n        <header class=\"quickview-header\">\r\n          <p class=\"title\">Quickview title</p>\r\n          <span class=\"delete\" data-dismiss=\"quickview\"></span>\r\n        </header>\r\n      \r\n        <div class=\"quickview-body\">\r\n          <div class=\"quickview-block\">\r\n            <table class=\"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\">\r\n                <thead>\r\n                  <tr>\r\n                    <th>Event Name</th>\r\n                    <th>Event Role</th>\r\n                  </tr>\r\n                </thead>\r\n                <tbody>\r\n                  <tr>\r\n                    <td>Three</td>\r\n                    <td>Four</td>\r\n                  </tr>\r\n                  <tr>\r\n                    <td>Five</td>\r\n                    <td>Six</td>\r\n                  </tr>\r\n                  <tr>\r\n                    <td>Seven</td>\r\n                    <td>Eight</td>\r\n                  </tr>\r\n                  <tr>\r\n                    <td>Nine</td>\r\n                    <td>Ten</td>\r\n                  </tr>\r\n                  <tr>\r\n                    <td>Eleven</td>\r\n                    <td>Twelve</td>\r\n                  </tr>\r\n                </tbody>\r\n              </table>\r\n          </div>\r\n        </div>\r\n      \r\n        <footer class=\"quickview-footer\">\r\n      \r\n        </footer>\r\n    </div>\r\n      \r\n      <button class=\"button is-primary\" data-show=\"quickview\" data-target=\"quickviewDefault\">Show quickview</button>\r\n</div> -->\r\n\r\n<!-- <div class=\"calendar\">\r\n    <div class=\"calendar-nav\">\r\n      <div class=\"calendar-nav-previous-month\">\r\n        <button class=\"button is-text\">\r\n          <i class=\"fa fa-chevron-left\"></i>\r\n        </button>\r\n      </div>\r\n      <div>March 2017</div>\r\n      <div class=\"calendar-nav-next-month\">\r\n        <button class=\"button is-text\">\r\n          <i class=\"fa fa-chevron-right\"></i>\r\n        </button>\r\n      </div>\r\n    </div>\r\n    <div class=\"calendar-container\">\r\n      <div class=\"calendar-header\">\r\n        <div class=\"calendar-date\">Sun</div>\r\n        <div class=\"calendar-date\">Mon</div>\r\n        <div class=\"calendar-date\">Tue</div>\r\n        <div class=\"calendar-date\">Wed</div>\r\n        <div class=\"calendar-date\">Thu</div>\r\n        <div class=\"calendar-date\">Fri</div>\r\n        <div class=\"calendar-date\">Sat</div>\r\n      </div>\r\n      <div class=\"calendar-body\">\r\n        <div class=\"calendar-date is-disabled\"><button class=\"date-item\">26</button></div>\r\n        <div class=\"calendar-date is-disabled\"><button class=\"date-item\">27</button></div>\r\n        <div class=\"calendar-date is-disabled\"><button class=\"date-item\">28</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">1</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">2</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">3</button></div>\r\n        <div class=\"calendar-date tooltip\" data-tooltip=\"Today\"><button class=\"date-item is-today\">4</button></div>\r\n        <div class=\"calendar-date tooltip\" data-tooltip=\"Not available\" disabled=\"\"><button class=\"date-item\">5</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">6</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">7</button></div>\r\n        <div class=\"calendar-date tooltip\" data-tooltip=\"You have appointments\"><button class=\"date-item\">8</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">9</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">10</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">11</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">12</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">13</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">14</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">15</button></div>\r\n        <div class=\"calendar-date calendar-range calendar-range-start\"><button class=\"date-item is-active\">16</button></div>\r\n        <div class=\"calendar-date calendar-range\"><button class=\"date-item\">17</button></div>\r\n        <div class=\"calendar-date calendar-range\"><button class=\"date-item\">18</button></div>\r\n        <div class=\"calendar-date calendar-range\"><button class=\"date-item\">19</button></div>\r\n        <div class=\"calendar-date calendar-range calendar-range-end\"><button class=\"date-item is-active\">20</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">21</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">22</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">23</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">24</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">25</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">26</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">27</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">28</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">29</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">30</button></div>\r\n        <div class=\"calendar-date\"><button class=\"date-item\">31</button></div>\r\n        <div class=\"calendar-date is-disabled\"><button class=\"date-item\">1</button></div>\r\n      </div>\r\n    </div>\r\n  </div> -->"

/***/ }),

/***/ "./node_modules/raw-loader/index.js!./src/app/edit-event/edit-event.component.html":
/*!********************************************************************************!*\
  !*** ./node_modules/raw-loader!./src/app/edit-event/edit-event.component.html ***!
  \********************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<br>\r\n\r\n<form>\r\n    <div class=\"field is-horizontal \">\r\n        <!-- <div class=\"field-label is-normal\">\r\n            <label class=\"label\">Stage Name</label>\r\n        </div> -->\r\n        <div class=\"field-body\">\r\n            <div class=\"field\">\r\n            <p class=\"control\">\r\n                <input class=\"input is-rounded\" type=\"text\" placeholder=\"Enter Stage Name\">\r\n    \r\n            </p>\r\n            </div>\r\n            <div class=\"field\">\r\n                <div class=\"control\">\r\n                    <button class=\"button is-primary is-rounded\">\r\n                    AddStage\r\n                    </button>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</form>\r\n<br>\r\n\r\n\r\n\r\n<form>\r\n        <div class=\"field is-horizontal \">\r\n            \r\n            <!-- <div class=\"field-label is-normal\">\r\n                <label class=\"label\">Add Stage</label>\r\n            </div> -->\r\n            <div class=\"field-body\">\r\n                    <div class=\"field\">\r\n                            <p class=\"control is-expanded has-icons-left\">\r\n                              <input class=\"input is-rounded\" type=\"text\" placeholder=\"example@email.com\">\r\n                              <span class=\"icon is-small is-left\">\r\n                                <i class=\"fas fa-at\"></i>\r\n                              </span>\r\n                            </p>\r\n                          </div>\r\n                <div class=\"field\">\r\n                <p class=\"control\">\r\n                    <input class=\"input is-rounded\" type=\"text\" placeholder=\"Enter Role Type\">\r\n        \r\n                </p>\r\n                </div>\r\n                <div class=\"field\">\r\n                    <div class=\"control\">\r\n                        <button class=\"button is-primary is-rounded\">\r\n                        Add Role\r\n                        </button>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </form>\r\n<br>\r\n<table class=\"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\">\r\n    <thead>\r\n        \r\n        <tr>\r\n        <th>Name</th>\r\n        <th>Role</th>\r\n        </tr>\r\n\r\n    </thead>\r\n    <tbody>\r\n        <tr> \r\n        <td >Name</td>\r\n        <td >Role</td>          \r\n        </tr>   \r\n    </tbody>\r\n</table>\r\n\r\n\r\n<br>\r\n<button (click)=\"onEditCell()\" class=\"button\">I is button</button>\r\n<div class=\"columns is-gapless is-marginless is-mobile is-vcentered is-multiline\">\r\n    <div class=\"column is-12\" *ngFor=\"let day of eventDays\"> <div class=\"box has-background-black has-text-white has-text-centered is-marginless\"><p class=\"is-size-7\">{{day.day | date:'shortDate'}}</p></div> \r\n    <!-- <div class=\"column\"> -->\r\n        <div class=\"columns is-gapless is-marginless is-mobile is-outlined is-vcentered is-multiline\">\r\n        <!---------------------first for loop within a for loop below---------->\r\n            <div class=\"column\" *ngFor=\"let stage of day.stages\">\r\n\r\n                <div class=\"columns is-gapless is-marginless is-mobile is-outlined is-vcentered\">\r\n                    <div class=\"column\">\r\n                        <div class=\"box has-background-link has-text-black has-text-centered\"><input type=\"text\" class=\"input is-rounded is-static is-link has-text-black has-text-centered\" [(ngModel)]=\"stage.name\" placeholder=\"{{stage.name}}\"></div>\r\n                    </div>\r\n                </div>   \r\n                \r\n                    \r\n                    \r\n                <div class=\"columns is-gapless is-mobile is-marginless is-outlined is-vcentered\">\r\n                \r\n                    <div class=\"column \">\r\n                        <div class=\"box has-background-info has-text-centered has-text-black\"><p class=\"is-size-7\">Start</p></div>\r\n                    </div>\r\n                    \r\n                    <div class=\"column \">\r\n                        <div class=\"box has-background-info has-text-centered has-text-black\"><p class=\"is-size-7\">End</p></div>\r\n                    </div>  \r\n                \r\n                    <div class=\"column \" >\r\n                        <div class=\"box has-background-info has-text-centered has-text-black\"><p class=\"is-size-7\">Artist</p></div>\r\n                    </div>\r\n                </div>   \r\n\r\n\r\n\r\n                                <!-----------------------------------------------for loop within a for loop below---------->\r\n                <div class=\"columns is-gapless is-mobile is-marginless is-outlined\" *ngFor=\"let performance of stage.performances\">\r\n\r\n                    <div class=\"column \">\r\n                    <div class=\"box has-background-success has-text-centered has-text-black\"><input type=\"text\" class=\"input is-rounded is-static is-link has-text-black has-text-centered\" [(ngModel)]=\"performance.start\" placeholder=\"{{performance.start}}\"></div>\r\n                    </div>\r\n                    \r\n                    \r\n                    <div class=\"column \">\r\n                    <div class=\"box has-background-warning has-text-centered has-text-black\"><input type=\"text\" class=\"input is-rounded is-static is-link has-text-black has-text-centered\" [(ngModel)]=\"performance.end\" placeholder=\"{{performance.end}}\"></div>\r\n                    </div>  \r\n                    \r\n                    <div class=\"column \" >\r\n                    \r\n                        <div class=\"box has-background-danger has-text-centered \"><input type=\"text\" class=\"input is-rounded is-static is-link has-text-black has-text-centered\" [(ngModel)]=\"performance.artist\" placeholder=\"{{performance.artist}}\"></div>\r\n                        \r\n                    </div>\r\n                </div> \r\n\r\n            </div>\r\n        </div>\r\n        <br>\r\n    </div>\r\n</div>"

/***/ }),

/***/ "./node_modules/raw-loader/index.js!./src/app/home/home.component.html":
/*!********************************************************************!*\
  !*** ./node_modules/raw-loader!./src/app/home/home.component.html ***!
  \********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n\r\n\r\n<!-- \r\n<section class=\"section\">\r\n        <div class=\"container\">\r\n             Start Carousel -->\r\n            <!-- <div id=\"carousel-demo\" class=\"carousel\">\r\n                <div class=\"item-1\">\r\n                        <div class=\"column\">\r\n                                <div class=\"card large\">\r\n                                    <div class=\"card-image\">\r\n                                        <figure class=\"image\">\r\n                                            <img src=\"https://i.imgsafe.org/a5/a5e978ce20.jpeg\" alt=\"Image\">\r\n                                        </figure>\r\n                                    </div>\r\n                                    <div class=\"card-content\">\r\n                                        <div class=\"media\">\r\n                                            <div class=\"media-left\">\r\n                                                <figure class=\"image is-96x96\">\r\n                                                    <img src=\"http://www.radfaces.com/images/avatars/alex-mack.jpg\" alt=\"Image\">\r\n                                                </figure>\r\n                                            </div>\r\n                                            <div class=\"media-content\">\r\n                                                <p class=\"title is-4\">Prototyp3</p>\r\n                                                <p class=\"subtitle is-6\">Moderator</p>\r\n                                            </div>\r\n                                        </div>\r\n                                        <div class=\"content\">\r\n                                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                            </div>\r\n                </div>\r\n                <div class=\"item-2\">\r\n                        <div class=\"column\">\r\n                                <div class=\"card large\">\r\n                                    <div class=\"card-image\">\r\n                                        <figure class=\"image\">\r\n                                            <img src=\"https://i.imgsafe.org/a5/a5e978ce20.jpeg\" alt=\"Image\">\r\n                                        </figure>\r\n                                    </div>\r\n                                    <div class=\"card-content\">\r\n                                        <div class=\"media\">\r\n                                            <div class=\"media-left\">\r\n                                                <figure class=\"image is-96x96\">\r\n                                                    <img src=\"http://www.radfaces.com/images/avatars/alex-mack.jpg\" alt=\"Image\">\r\n                                                </figure>\r\n                                            </div>\r\n                                            <div class=\"media-content\">\r\n                                                <p class=\"title is-4\">Prototyp3</p>\r\n                                                <p class=\"subtitle is-6\">Moderator</p>\r\n                                            </div>\r\n                                        </div>\r\n                                        <div class=\"content\">\r\n                                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                            </div>\r\n                </div>\r\n                <div class=\"item-3\">\r\n                        <div class=\"column\">\r\n                                <div class=\"card large\">\r\n                                    <div class=\"card-image\">\r\n                                        <figure class=\"image\">\r\n                                            <img src=\"https://i.imgsafe.org/a5/a5e978ce20.jpeg\" alt=\"Image\">\r\n                                        </figure>\r\n                                    </div>\r\n                                    <div class=\"card-content\">\r\n                                        <div class=\"media\">\r\n                                            <div class=\"media-left\">\r\n                                                <figure class=\"image is-96x96\">\r\n                                                    <img src=\"http://www.radfaces.com/images/avatars/alex-mack.jpg\" alt=\"Image\">\r\n                                                </figure>\r\n                                            </div>\r\n                                            <div class=\"media-content\">\r\n                                                <p class=\"title is-4\">Prototyp3</p>\r\n                                                <p class=\"subtitle is-6\">Moderator</p>\r\n                                            </div>\r\n                                        </div>\r\n                                        <div class=\"content\">\r\n                                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                            </div>\r\n                </div>\r\n            </div>\r\n             End Carousel --> \r\n        <!-- </div>\r\n    </section> --> \r\n\r\n\r\n\r\n\r\n\r\n\r\n<!-- <div class=\"column is-one-third\" *ngFor=\"let event of events\">\r\n        <div class=\"card large round\">\r\n            <header class=\"card-header\">\r\n                <p class=\"card-header-title is-centered\">\r\n                        {{event.name}}\r\n                </p>\r\n            </header>\r\n            <div class=\"card-image \">\r\n                <figure class=\"image\">\r\n                    <img src=\"https://source.unsplash.com/Jy6luiLBsrk\" alt=\"Image\">\r\n                </figure>\r\n            </div>\r\n            <div class=\"card-content\">\r\n               <div class=\"columns\">\r\n                    <div class=\"column \">\r\n                        <p>{{event.start + ' - ' + event.end}}</p>   \r\n                    </div>\r\n                    <div class=\"column\">\r\n                    </div>\r\n                    <div class=\"column is-pulled-right\">\r\n                        <p class=\"column is-pulled-right\">{{event.location}}</p>\r\n                    </div>\r\n               </div>\r\n                \r\n                <div class=\"content\">\r\n                    {{event.desc}}\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div> -->\r\n\r\n\r\n\r\n\r\n<!--FDSSDFKLJSDKLFJSDLKFJKLSDJFKLJSDKLFJLKSDFJLKSDJFLKSJDLFjkl-->\r\n\r\n\r\n    <div class=\"row columns is-multiline\">\r\n\r\n\r\n            <div class=\"column is-one-third\" #selectedEvent (click)=\"onSelectEvent(selectedEvent.children)\" *ngFor=\"let event of events\">\r\n                <div class=\"card large round\">\r\n                    <header class=\"card-header\">\r\n                        <p class=\"card-header-title is-centered\">\r\n                                {{event.eventName}}\r\n                        </p>\r\n                    </header>\r\n                    <div class=\"card-image \">\r\n                        <figure class=\"image\">\r\n                            <img src=\"https://source.unsplash.com/Jy6luiLBsrk\" alt=\"Image\">\r\n                        </figure>\r\n                    </div>\r\n                    <div class=\"card-content\">\r\n                       \r\n                        \r\n                        <div class=\"content\">\r\n                            {{event.eventDescription}}\r\n                        </div>\r\n                    </div>\r\n                    <footer class=\"card-footer\">\r\n                        <p class=\"card-footer-item is-pulled-left\">{{event.startDate + ' - ' + event.endDate}}</p>  \r\n                        <p class=\"card-footer-item is-pulled-right\">{{event.eventDescription}}</p>\r\n                    </footer>\r\n                </div>\r\n            </div>\r\n        \r\n\r\n\r\n\r\n\r\n            <div class=\"column is-one-third\">\r\n                <div class=\"card large\">\r\n                    <div class=\"card-image\">\r\n                        <figure class=\"image\">\r\n                            <img src=\"https://source.unsplash.com//Rfflri94rs8\" alt=\"Image\">\r\n                        </figure>\r\n                    </div>\r\n                    <div class=\"card-content\">\r\n                        <div class=\"media\">\r\n                            <div class=\"media-left\">\r\n                                <figure class=\"image is-96x96\">\r\n                                    <img src=\"http://www.radfaces.com/images/avatars/richard-wang.jpg\" alt=\"Image\">\r\n                                </figure>\r\n                            </div>\r\n                            <div class=\"media-content\">\r\n                                <p class=\"title is-4 no-padding\">Sphirou Sapphirou</p>\r\n                                <p><span class=\"title is-6\"><a href=\"http://twitter.com/#\">@twitterid</a></span></p>\r\n                                <p class=\"subtitle is-6\">Moderator</p>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"content\">\r\n                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"column is-one-third\">\r\n                <div class=\"card large\">\r\n                    <div class=\"card-image\">\r\n                        <figure class=\"image\">\r\n                            <img src=\"https://source.unsplash.com/b6VzeoRZiS0\" alt=\"Image\">\r\n                        </figure>\r\n                    </div>\r\n                    <div class=\"card-content\">\r\n                        <div class=\"media\">\r\n                            <div class=\"media-left\">\r\n                                <figure class=\"image is-96x96\">\r\n                                    <img src=\"http://www.radfaces.com/images/avatars/jeffrey-douglas.jpg\" alt=\"Image\">\r\n                                </figure>\r\n                            </div>\r\n                            <div class=\"media-content\">\r\n                                <p class=\"title is-4 no-padding\">PlayTheFallen</p>\r\n                                <p><span class=\"title is-6\"><a href=\"http://twitter.com/#\">@twitterid</a></span></p>\r\n                                <p class=\"subtitle is-6\">Moderator</p>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"content\">\r\n                            Sometimes I dip my nose into my cereals. I do it coz it's funny.\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"column is-one-third\">\r\n                <div class=\"card large\">\r\n                    <div class=\"card-image\">\r\n                        <figure class=\"image\">\r\n                            <img src=\"https://i.imgsafe.org/a4/a4bda71ae4.jpeg\" alt=\"Image\">\r\n                        </figure>\r\n                    </div>\r\n                    <div class=\"card-content\">\r\n                        <div class=\"media\">\r\n                            <div class=\"media-left\">\r\n                                <figure class=\"image is-96x96\">\r\n                                    <img src=\"http://www.radfaces.com/images/avatars/scrappy-doo.jpg\" alt=\"Image\">\r\n                                </figure>\r\n                            </div>\r\n                            <div class=\"media-content\">\r\n                                <p class=\"title is-4 no-padding\">FelixCAT</p>\r\n                                <p><span class=\"title is-6\"><a href=\"http://twitter.com/#\">@twitterid</a></span></p>\r\n                                <p class=\"subtitle is-6\">Moderator</p>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"content\">\r\n                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"column is-one-third\">\r\n                <div class=\"card large\">\r\n                    <div class=\"card-image\">\r\n                        <figure class=\"image\">\r\n                            <img src=\"https://source.unsplash.com/ogYIzsNGu3Y\" alt=\"Image\">\r\n                        </figure>\r\n                    </div>\r\n                    <div class=\"card-content\">\r\n                        <div class=\"media\">\r\n                            <div class=\"media-left\">\r\n                                <figure class=\"image is-96x96\">\r\n                                    <img src=\"http://www.radfaces.com/images/avatars/scrappy-doo.jpg\" alt=\"Image\">\r\n                                </figure>\r\n                            </div>\r\n                            <div class=\"media-content\">\r\n                                <p class=\"title is-4 no-padding\">ScoobyDOG</p>\r\n                                <p><span class=\"title is-6\"><a href=\"http://twitter.com/#\">@twitterid</a></span></p>\r\n                                <p class=\"subtitle is-6\">Moderator</p>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"content\">\r\n                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"column is-one-third\">\r\n                <div class=\"card large\">\r\n                    <div class=\"card-image\">\r\n                        <figure class=\"image\">\r\n                            <img src=\"https://source.unsplash.com/KgjcndVr7tU\" alt=\"Image\">\r\n                        </figure>\r\n                    </div>\r\n                    <div class=\"card-content\">\r\n                        <div class=\"media\">\r\n                            <div class=\"media-left\">\r\n                                <figure class=\"image is-96x96\">\r\n                                    <img src=\"http://www.radfaces.com/images/avatars/scrappy-doo.jpg\" alt=\"Image\">\r\n                                </figure>\r\n                            </div>\r\n                            <div class=\"media-content\">\r\n                                    <p class=\"title is-4 no-padding\">Scrappy Doo</p>\r\n                                    <p><span class=\"title is-6\"><a href=\"http://twitter.com/#\">@twitterid</a></span></p>\r\n                                    <p class=\"subtitle is-6\">Moderator</p>\r\n                                </div>\r\n                        </div>\r\n                        <div class=\"content\">\r\n                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"column is-one-third\">\r\n                <div class=\"card large\">\r\n                    <div class=\"card-image\">\r\n                        <figure class=\"image\">\r\n                            <img src=\"https://i.imgsafe.org/a5/a5e978ce20.jpeg\" alt=\"Image\">\r\n                        </figure>\r\n                    </div>\r\n                    <div class=\"card-content\">\r\n                        <div class=\"media\">\r\n                            <div class=\"media-left\">\r\n                                <figure class=\"image is-96x96\">\r\n                                    <img src=\"http://www.radfaces.com/images/avatars/alex-mack.jpg\" alt=\"Image\">\r\n                                </figure>\r\n                            </div>\r\n                            <div class=\"media-content\">\r\n                                <p class=\"title is-4\">Prototyp3</p>\r\n                                <p class=\"subtitle is-6\">Moderator</p>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"content\">\r\n                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"column is-one-third\">\r\n                <div class=\"card large\">\r\n                    <div class=\"card-image\">\r\n                        <figure class=\"image\">\r\n                            <img src=\"https://source.unsplash.com/Gnxquq4oYQc\" alt=\"Image\">\r\n                        </figure>\r\n                    </div>\r\n                    <div class=\"card-content\">\r\n                        <div class=\"media\">\r\n                            <div class=\"media-left\">\r\n                                <figure class=\"image is-96x96\">\r\n                                    <img src=\"http://www.radfaces.com/images/avatars/alex-mack.jpg\" alt=\"Image\">\r\n                                </figure>\r\n                            </div>\r\n                            <div class=\"media-content\">\r\n                                <p class=\"title is-4 no-padding\">Alex Mack</p>\r\n                                <p><span class=\"title is-6\"><a href=\"http://twitter.com/#\">@twitterid</a></span></p>\r\n                                <p class=\"subtitle is-6\">Moderator</p>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"content\">\r\n                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"column is-one-third\">\r\n                <div class=\"card large\">\r\n                    <div class=\"card-image\">\r\n                        <figure class=\"image\">\r\n                            <img src=\"https://source.unsplash.com/qbtyUQtqJ8k\" alt=\"Image\">\r\n                        </figure>\r\n                    </div>\r\n                    <div class=\"card-content\">\r\n                        <div class=\"media\">\r\n                            <div class=\"media-left\">\r\n                                <figure class=\"image is-96x96\">\r\n                                    <img src=\"http://www.radfaces.com/images/avatars/alex-mack.jpg\" alt=\"Image\">\r\n                                </figure>\r\n                            </div>\r\n                            <div class=\"media-content\">\r\n                                <p class=\"title is-4\">Alex Mack</p>\r\n                                <p class=\"subtitle is-6\">Moderator</p>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"content\">\r\n                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae, quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>"

/***/ }),

/***/ "./node_modules/raw-loader/index.js!./src/app/manager-dashboard/manager-dashboard.component.html":
/*!**********************************************************************************************!*\
  !*** ./node_modules/raw-loader!./src/app/manager-dashboard/manager-dashboard.component.html ***!
  \**********************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<br>\r\n\r\n<form #newStage= \"ngForm\" (ngSubmit) = \"onAddStage(newStage.value)\">\r\n    <div class=\"field is-horizontal \">\r\n        <!-- <div class=\"field-label is-normal\">\r\n            <label class=\"label\">Stage Name</label>\r\n        </div> -->\r\n        <div class=\"field-body\">\r\n            <div class=\"field\">\r\n            <p class=\"control\">\r\n                <input class=\"input is-rounded\" type=\"text\" name=\"stageName\" placeholder=\"Enter Stage Name\" ngModel>\r\n    \r\n            </p>\r\n            </div>\r\n            <div class=\"field\">\r\n                <div class=\"control\">\r\n                    <button class=\"button is-primary is-rounded\" type=\"submit\" value = \"submit\">\r\n                    AddStage\r\n                    </button>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</form>\r\n<br>\r\n\r\n\r\n\r\n<form #newRole= \"ngForm\" (ngSubmit) = \"onAddRole(newRole.value)\">\r\n        <div class=\"field is-horizontal \">\r\n            \r\n            <!-- <div class=\"field-label is-normal\">\r\n                <label class=\"label\">Add Stage</label>\r\n            </div> -->\r\n            <div class=\"field-body\">\r\n                <div class=\"field\">\r\n                    <p class=\"control is-expanded has-icons-left\">\r\n                        <input class=\"input is-rounded\" type=\"text\" name=\"email\" placeholder=\"example@email.com\" ngModel required email>\r\n                        <span class=\"icon is-small is-left\">\r\n                        <i class=\"fas fa-at\"></i>\r\n                        </span>\r\n                    </p>\r\n                </div>\r\n                <div class=\"field\">\r\n                    <p class=\"control\">\r\n                        <input class=\"input is-rounded\" type=\"text\" name=\"userRole\" placeholder=\"Enter Role Type\" ngModel>\r\n                    </p>\r\n                </div>\r\n                <div class=\"field\">\r\n                    <div class=\"control\">\r\n                        <button class=\"button is-primary is-rounded\" type=\"submit\" value = \"submit\">\r\n                        Add Role\r\n                        </button>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </form>\r\n<br>\r\n\r\n\r\n\r\n\r\n<form #newPerformance = \"ngForm\" (ngSubmit)=onAddPerformance(newPerformance.value)>\r\n    <div class=\"field is-horizontal \">\r\n        <div class=\"field-body\">\r\n            <div class=\"field\">\r\n                <div class=\"control\">\r\n                        <div class=\"select is-rounded\">\r\n                            <select name=\"stageName\" ngModel>\r\n                            <option>Select Stage</option>\r\n                            <option>Stage One</option>\r\n                            </select>\r\n                        </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"field\">\r\n                <p class=\"control has-icons-left\">\r\n                    <input class=\"input is-rounded\" name=\"artistName\" type=\"text\" placeholder=\"Enter Artist Name\" ngModel>\r\n                    <span class=\"icon  is-left\">\r\n                        <i class=\"fas fa-music\"></i>\r\n                    </span>\r\n                </p>\r\n                <p class=\"help\">Artist Name</p>\r\n            </div>\r\n        </div>\r\n    </div>\r\n\r\n\r\n    <div class=\"field is-horizontal \">\r\n        <div class=\"field-body\">        \r\n            <div class=\"field\">\r\n                <p class=\"control has-icons-left\">\r\n                    <input class=\"input is-rounded\" name=\"startTime\" type=\"time\" placeholder=\"\" ngModel>\r\n                    <span class=\"icon is-small is-left\">\r\n                        <i class=\"far fa-clock\"></i>\r\n                    </span>\r\n                </p>\r\n                <p class=\"help\">Start Time</p>\r\n            </div>\r\n            <div class=\"field\">\r\n                <p class=\"control has-icons-left\">\r\n                    <input class=\"input is-rounded\" name=\"endTime\" type=\"time\" placeholder=\"\" ngModel>\r\n                    <span class=\"icon is-small is-left\">\r\n                        <i class=\"far fa-clock\"></i>\r\n                    </span>\r\n                </p>\r\n                <p class=\"help\">End Time</p>\r\n            </div>\r\n        </div>\r\n    </div>\r\n\r\n    <div class=\"field is-horizontal \">\r\n        <div class=\"field-body\">  \r\n\r\n            <div class=\"field\">\r\n                <div class=\"control\">\r\n                    <div class=\"select is-rounded\">\r\n                        <select name=\"date\" ngModel>\r\n                            <option>Select Date</option>\r\n                            <option>{{date | date:'shortDate'}}</option>\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"field\">\r\n                <div class=\"control\">\r\n                    <button class=\"button is-primary is-rounded\" type=\"submit\" value = \"submit\">\r\n                    Add Performance\r\n                    </button>\r\n                </div>\r\n            </div>\r\n\r\n        </div>\r\n    </div>\r\n</form>\r\n\r\n<br>\r\n<br>\r\n\r\n\r\n\r\n\r\n\r\n<table class=\"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\">\r\n    <thead>\r\n        \r\n        <tr>\r\n        <th>Name</th>\r\n        <th>Role</th>\r\n        </tr>\r\n\r\n    </thead>\r\n    <tbody>\r\n        <tr> \r\n        <td >Name</td>\r\n        <td >Role</td>          \r\n        </tr>   \r\n    </tbody>\r\n</table>"

/***/ }),

/***/ "./node_modules/raw-loader/index.js!./src/app/navbar/navbar.component.html":
/*!************************************************************************!*\
  !*** ./node_modules/raw-loader!./src/app/navbar/navbar.component.html ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n<nav class=\"navbar\" role=\"navigation\" aria-label=\"main navigation\">\r\n      <div class=\"navbar-brand\">\r\n        <a class=\"navbar-item\" href=\"https://bulma.io\">\r\n          <span class=\"icon\">\r\n              <i class=\"fas fa-home\"></i>\r\n          </span>\r\n        </a>\r\n    \r\n        <a role=\"button\" class=\"navbar-burger burger\" aria-label=\"menu\" aria-expanded=\"false\" data-target=\"navbarBasicExample\">\r\n          <span aria-hidden=\"true\"></span>\r\n          <span aria-hidden=\"true\"></span>\r\n          <span aria-hidden=\"true\"></span>\r\n        </a>\r\n      </div>\r\n    \r\n      <div id=\"navbarBasicExample\" class=\"navbar-menu\">\r\n        <div class=\"navbar-start\">\r\n          <a class=\"navbar-item has-text-primary\" routerLink =\"/\" routerLinkActive=\"has-background-white\" [routerLinkActiveOptions]=\"{exact: true}\">\r\n            Home\r\n          </a>\r\n    \r\n          <a class=\"navbar-item has-text-primary\" routerLink =\"/createEvent\" routerLinkActive=\"has-background-white\">\r\n            Create Event\r\n          </a>\r\n          <a class=\"navbar-item has-text-primary\" data-show=\"quickview\" data-target=\"quickviewDefault\">\r\n            <p *ngIf=\"this.router.url=='/edit'; else viewEventsNav\">Edit Event</p>\r\n            <ng-template #viewEventsNav>\r\n                <p>View My Events</p>\r\n            </ng-template>\r\n                \r\n          </a>\r\n  \r\n          <div class=\"navbar-item has-dropdown is-hoverable\">\r\n            <a class=\"navbar-link has-text-primary\">\r\n              About App\r\n            </a>\r\n    \r\n            <div class=\"navbar-dropdown\">\r\n              <a class=\"navbar-item\" routerLink =\"/schedule\">\r\n                About\r\n              </a>\r\n              <a class=\"navbar-item\">\r\n                Jobs\r\n              </a>\r\n              <a class=\"navbar-item\">\r\n                Contact\r\n              </a>\r\n              <hr class=\"navbar-divider\">\r\n              <a class=\"navbar-item\">\r\n                Report an issue\r\n              </a>\r\n            </div>\r\n          </div>\r\n        </div>\r\n    \r\n        <div class=\"navbar-end\">\r\n  \r\n          <div *ngIf=\"!loggedIn; else logout\">\r\n              <form #login = \"ngForm\" (ngSubmit) = \"onClickSubmit(login.value)\" class=\"navbar-item\">\r\n  \r\n                  <div class=\"navbar-item\">\r\n                      <p class=\"control has-icons-left\">\r\n                              <input class=\"input is-rounded has-text-primary\" type=\"text\" name = \"username\" placeholder=\"username\" ngModel required email>\r\n                      <span class=\"icon is-small is-left\">\r\n                          <i class=\"fas fa-at\"></i>\r\n                      </span>\r\n                      </p>   \r\n                      <!-- <input class=\"input is-rounded\" type=\"text\" name = \"emailid\" placeholder=\"Email\" ngModel required email> -->\r\n                  </div>\r\n  \r\n                  <div class=\"navbar-item\">\r\n                                  <p class=\"control has-icons-left\">\r\n                                          <input class=\"input is-rounded has-text-primary\" type=\"password\" name = \"password\" placeholder=\"Password\" ngModel required>\r\n                                  <span class=\"icon is-small is-left\">\r\n                                      <i class=\"fas fa-lock\"></i>\r\n                                  </span>\r\n                                  </p>   \r\n                          <!-- <input class=\"input is-rounded\" type=\"password\" name = \"passwd\" placeholder=\"Password\" ngModel required> -->\r\n                  </div>\r\n  \r\n                  <div class=\"navbar-item\">\r\n                    <div class=\"buttons\">\r\n                      <!-- <a class=\"button is-primary\">\r\n                      <strong>Sign up</strong>\r\n                      </a> -->\r\n                      <button class=\"button is-primary is-rounded \" type=\"submit\" value = \"submit\" [disabled]=\"!login.valid\">\r\n                          <strong>Login</strong>\r\n                      </button>\r\n                      <a class=\"button is-primary is-rounded\" routerLink =\"/register\">\r\n                          <strong>Sign up</strong>\r\n                      </a>\r\n                    </div>\r\n                  </div>\r\n              </form>\r\n          </div>\r\n  \r\n          <ng-template #logout>\r\n              <div class=\"navbar-item\">\r\n                  <button type=\"button\" class=\"button is-primary is-rounded\">\r\n                      <strong>Logout</strong>\r\n                  </button>\r\n              </div>\r\n          </ng-template>\r\n  \r\n        </div>\r\n      </div>\r\n</nav>\r\n\r\n\r\n<!--HERO BANNER-->\r\n<section class=\"hero is-small is-primary is-bold\">\r\n    <div class=\"hero-body\">\r\n        <div class=\"container\">\r\n        <h1 class=\"title is-1 has-text-black\">\r\n            Festival App\r\n        </h1>\r\n        </div>\r\n    </div>\r\n</section>\r\n\r\n<div type=\"button\" class=\"button is-primary is-rounded\" (click)=\"onTestClick()\">\r\n    <strong>Testing(navbar.html) {{this.router.url}}</strong>\r\n</div>\r\n\r\n\r\n<!--The below is for the side panel that opens up when you click view my events-->\r\n<div class=\"container\">\r\n    <div id=\"quickviewDefault\" class=\"quickview\">\r\n        <header class=\"quickview-header\">\r\n          <p *ngIf=\"this.router.url=='/edit'; else viewEventsTitle\" class=\"title\">Edit Event</p>\r\n          <ng-template #viewEventsTitle>\r\n              <p class=\"title\">Your Events</p>\r\n          </ng-template>\r\n         \r\n          <span class=\"delete\" data-dismiss=\"quickview\"></span>\r\n        </header>\r\n      \r\n        <div class=\"quickview-body\">\r\n          <div class=\"quickview-block\">\r\n            <app-manager-dashboard *ngIf=\"this.router.url=='/edit'; else viewEvents\"></app-manager-dashboard>\r\n           \r\n          </div>\r\n      </div>\r\n      \r\n        <!-- <footer class=\"quickview-footer\">\r\n      \r\n        </footer> -->\r\n    </div>\r\n      \r\n\r\n    <ng-template #viewEvents>\r\n        <table class=\"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\">\r\n          <thead>\r\n            \r\n            <tr>\r\n              <th>Event Name</th>\r\n              <th>Event Role</th>\r\n              <th>Start/End Times</th>\r\n            </tr>\r\n        \r\n          </thead>\r\n          <tbody>\r\n            <tr *ngFor=\"let assignedEvent of this.assignedEvents\" (click)=\"onSelectRow(assignedEvent)\">\r\n                \r\n              <td >{{assignedEvent.event.eventName}}</td>\r\n              <td >{{assignedEvent.eventRole}}</td>\r\n              <td >{{assignedEvent.eventStartDate +' - '+ assignedEvent.eventEndDate}}</td>\r\n            \r\n            </tr>\r\n          \r\n              \r\n          </tbody>\r\n        </table>\r\n    </ng-template>\r\n      <!-- <button class=\"button is-primary\" data-show=\"quickview\" data-target=\"quickviewDefault\">View My Events</button> -->\r\n</div>"

/***/ }),

/***/ "./node_modules/raw-loader/index.js!./src/app/register/register.component.html":
/*!****************************************************************************!*\
  !*** ./node_modules/raw-loader!./src/app/register/register.component.html ***!
  \****************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"columns is-centered\">\r\n    <div class=\"column is-6\">\r\n\r\n        <form>\r\n            <div class=\"field\">\r\n                <div class=\"field\">\r\n                    <p class=\"control has-icons-left\">\r\n                        <input class=\"input is-rounded\" type=\"text\" placeholder=\"Name\">\r\n                        <span class=\"icon is-small is-left\">\r\n                        <i class=\"fas fa-user\"></i>\r\n                        </span>\r\n                    </p>\r\n                </div>\r\n                <div class=\"field\">\r\n                    <p class=\"control has-icons-left\">\r\n                        <input class=\"input is-rounded\" type=\"email\" placeholder=\"Email\">\r\n                        <span class=\"icon is-small is-left\">\r\n                        <i class=\"fas fa-envelope\"></i>\r\n                        </span>\r\n                    </p>\r\n                </div>\r\n                <div class=\"field\">\r\n                    <p class=\"control has-icons-left\">\r\n                        <input class=\"input is-rounded\" type=\"password\" placeholder=\"Password\">\r\n                        <span class=\"icon is-small is-left\">\r\n                        <i class=\"fas fa-lock\"></i>\r\n                        </span>\r\n                    </p>\r\n                </div>\r\n                <div class=\"field is-pulled-right\">\r\n                    <p class=\"control\">\r\n                        <button class=\"button is-success is-rounded\">\r\n                        Register\r\n                        </button>\r\n                    </p>\r\n                </div>\r\n            </div>\r\n        </form>\r\n\r\n    </div>\r\n</div>\r\n"

/***/ }),

/***/ "./node_modules/raw-loader/index.js!./src/app/stage-schedule/stage-schedule.component.html":
/*!****************************************************************************************!*\
  !*** ./node_modules/raw-loader!./src/app/stage-schedule/stage-schedule.component.html ***!
  \****************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- <div class=\"has-background-black\">\r\n<div class=\"container is-centered\">\r\n    <div class=\"columns is-gapless is-mobile\">\r\n\r\n        <div class=\"column is-{{this.columnSize}}\"  *ngFor=\"let performance of performances\">\r\n    <div class=\"box has-background-primary has-text-centered has-text-white\"><p class=\"is-size-7\">{{performance.start}} <br>  -  <br> {{performance.end}}</p></div>\r\n        </div>\r\n    </div>\r\n\r\n    <div class=\"columns is-gapless is-marginless is-mobile\" *ngFor=\"let performance of performances\">\r\n        <div ngClass=\"column is-{{this.columnSize}} is-offset-{{this.columnSize * performance.number}}\">\r\n        \r\n        <div class=\"box has-background-info has-text-centered has-text-white\"><p class=\"is-size-7\">{{performance.artist}}</p></div>\r\n        \r\n        </div>\r\n    </div> \r\n</div>\r\n</div> -->\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<!-- \r\n\r\n<div class=\"columns is-gapless is-marginless is-mobile is-outlined is-vcentered\">\r\n\r\n        <div class=\"column is-3\">\r\n      <div class=\"box has-background-black has-text-white has-text-centered\"><p class=\"is-size-7\">Stage One</p></div>\r\n        </div>\r\n      </div>   \r\n      \r\n      \r\n      \r\n      <div class=\"columns is-gapless is-mobile is-marginless is-outlined is-vcentered\">\r\n      \r\n        <div class=\"column is-1\">\r\n      <div class=\"box has-background-info has-text-white\"><p class=\"is-size-7\">Start</p></div>\r\n        </div>\r\n        \r\n        <div class=\"column is-1\">\r\n      <div class=\"box has-background-info has-text-white\"><p class=\"is-size-7\">End</p></div>\r\n        </div>  \r\n      \r\n       <div class=\"column is-1\" >\r\n        \r\n          <div class=\"box has-background-info has-text-centered \"><p class=\"is-size-7\">Artist</p></div>\r\n          \r\n        </div>\r\n      </div>   \r\n\r\n\r\n\r\n\r\n<div class=\"columns is-gapless is-mobile is-marginless is-outlined\" *ngFor=\"let performance of performances\">\r\n\r\n    <div class=\"column is-1\">\r\n    <div class=\"box has-background-success has-text-white\"><p class=\"is-size-7\">{{performance.start}}</p></div>\r\n    </div>\r\n    \r\n    \r\n    <div class=\"column is-1\">\r\n    <div class=\"box has-background-warning has-text-white\"><p class=\"is-size-7\">{{performance.end}}</p></div>\r\n    </div>  \r\n    \r\n    <div class=\"column is-1\" >\r\n    \r\n        <div class=\"box has-background-danger has-text-centered \"><p class=\"is-size-7\">{{performance.artist}}</p></div>\r\n        \r\n    </div>\r\n</div>   -->\r\n\r\n\r\n\r\n\r\n\r\n\r\n<!--below is multi-stages next to each other; is-6 means 2 stages fit together (12/6)-->\r\n\r\n\r\n<!-- <div class=\"columns is-gapless is-marginless is-mobile is-outlined is-vcentered is-multiline\">\r\n    <div class=\"column is-6\" *ngFor=\"let stage of stages\">\r\n\r\n        <div class=\"columns is-gapless is-marginless is-mobile is-outlined is-vcentered\">\r\n            <div class=\"column\">\r\n                <div class=\"box has-background-black has-text-white has-text-centered\"><p class=\"is-size-7\">{{stage.name}}</p></div>\r\n            </div>\r\n        </div>   \r\n        \r\n            \r\n            \r\n        <div class=\"columns is-gapless is-mobile is-marginless is-outlined is-vcentered\">\r\n        \r\n            <div class=\"column \">\r\n                <div class=\"box has-background-info has-text-centered has-text-black\"><p class=\"is-size-7\">Start</p></div>\r\n            </div>\r\n            \r\n            <div class=\"column \">\r\n                <div class=\"box has-background-info has-text-centered has-text-black\"><p class=\"is-size-7\">End</p></div>\r\n            </div>  \r\n        \r\n            <div class=\"column \" >\r\n                <div class=\"box has-background-info has-text-centered has-text-black\"><p class=\"is-size-7\">Artist</p></div>\r\n            </div>\r\n        </div>   \r\n\r\n\r\n\r\n        <div class=\"columns is-gapless is-mobile is-marginless is-outlined\" *ngFor=\"let performance of stage.performances\">\r\n\r\n            <div class=\"column \">\r\n            <div class=\"box has-background-success has-text-centered has-text-black\"><p class=\"is-size-7\">{{performance.start}}</p></div>\r\n            </div>\r\n            \r\n            \r\n            <div class=\"column \">\r\n            <div class=\"box has-background-warning has-text-centered has-text-black\"><p class=\"is-size-7\">{{performance.end}}</p></div>\r\n            </div>  \r\n            \r\n            <div class=\"column \" >\r\n            \r\n                <div class=\"box has-background-danger has-text-centered \"><p class=\"is-size-7\">{{performance.artist}}</p></div>\r\n                \r\n            </div>\r\n        </div> \r\n\r\n    </div>\r\n</div> -->\r\n\r\n\r\n\r\n\r\n<!--DOWN BELOW IS DAYS SEPERATED INTO STAGES SEPERATED INTO PERFORMANCES-->\r\n\r\n<br>\r\n<div class=\"columns is-gapless is-marginless is-mobile is-vcentered is-multiline\">\r\n    <div class=\"column is-12\" *ngFor=\"let day of eventDays\"> <div class=\"box has-background-black has-text-white has-text-centered is-marginless\"><p class=\"is-size-7\">{{day.day | date:'shortDate'}}</p></div> \r\n    <!-- <div class=\"column\"> -->\r\n        <div class=\"columns is-gapless is-marginless is-mobile is-outlined is-vcentered is-multiline\">\r\n        <!---------------------first for loop within a for loop below---------->\r\n            <div class=\"column\" *ngFor=\"let stage of day.stages\">\r\n\r\n                <div class=\"columns is-gapless is-marginless is-mobile is-outlined is-vcentered\">\r\n                    <div class=\"column\">\r\n                        <div class=\"box has-background-link has-text-black has-text-centered\"><p class=\"is-size-7\">{{stage.name}}</p></div>\r\n                    </div>\r\n                </div>   \r\n                \r\n                    \r\n                    \r\n                <div class=\"columns is-gapless is-mobile is-marginless is-outlined is-vcentered\">\r\n                \r\n                    <div class=\"column \">\r\n                        <div class=\"box has-background-info has-text-centered has-text-black\"><p class=\"is-size-7\">Start</p></div>\r\n                    </div>\r\n                    \r\n                    <div class=\"column \">\r\n                        <div class=\"box has-background-info has-text-centered has-text-black\"><p class=\"is-size-7\">End</p></div>\r\n                    </div>  \r\n                \r\n                    <div class=\"column \" >\r\n                        <div class=\"box has-background-info has-text-centered has-text-black\"><p class=\"is-size-7\">Artist</p></div>\r\n                    </div>\r\n                </div>   \r\n\r\n\r\n\r\n                                <!-----------------------------------------------for loop within a for loop below---------->\r\n                <div class=\"columns is-gapless is-mobile is-marginless is-outlined\" *ngFor=\"let performance of stage.performances\">\r\n\r\n                    <div class=\"column \">\r\n                    <div class=\"box has-background-success has-text-centered has-text-black\"><p class=\"is-size-7\">{{performance.start}}</p></div>\r\n                    </div>\r\n                    \r\n                    \r\n                    <div class=\"column \">\r\n                    <div class=\"box has-background-warning has-text-centered has-text-black\"><p class=\"is-size-7\">{{performance.end}}</p></div>\r\n                    </div>  \r\n                    \r\n                    <div class=\"column \" >\r\n                    \r\n                        <div class=\"box has-background-danger has-text-centered \"><p class=\"is-size-7\">{{performance.artist}}</p></div>\r\n                        \r\n                    </div>\r\n                </div> \r\n\r\n            </div>\r\n        </div>\r\n        <br>\r\n    </div>\r\n</div>\r\n\r\n\r\n<!--TESTING DAY SEPERATION-->\r\n<!-- <div class=\"columns>\r\n<div class=\"column>\r\n     <div class=\"box has-background-black has-text-white has-text-centered\"><p class=\"is-size-7\">Day 1</p></div>\r\n</div>\r\n<div class=\"column> -->\r\n\r\n\r\n"

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _home_home_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./home/home.component */ "./src/app/home/home.component.ts");
/* harmony import */ var _create_event_create_event_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./create-event/create-event.component */ "./src/app/create-event/create-event.component.ts");
/* harmony import */ var _stage_schedule_stage_schedule_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./stage-schedule/stage-schedule.component */ "./src/app/stage-schedule/stage-schedule.component.ts");
/* harmony import */ var _edit_event_edit_event_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./edit-event/edit-event.component */ "./src/app/edit-event/edit-event.component.ts");
/* harmony import */ var _register_register_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./register/register.component */ "./src/app/register/register.component.ts");








var routes = [
    { path: '', component: _home_home_component__WEBPACK_IMPORTED_MODULE_3__["HomeComponent"] },
    { path: 'createEvent', component: _create_event_create_event_component__WEBPACK_IMPORTED_MODULE_4__["CreateEventComponent"] },
    { path: 'schedule', component: _stage_schedule_stage_schedule_component__WEBPACK_IMPORTED_MODULE_5__["StageScheduleComponent"] },
    { path: 'edit', component: _edit_event_edit_event_component__WEBPACK_IMPORTED_MODULE_6__["EditEventComponent"] },
    { path: 'register', component: _register_register_component__WEBPACK_IMPORTED_MODULE_7__["RegisterComponent"] }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _user_events_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./user-events.service */ "./src/app/user-events.service.ts");



var AppComponent = /** @class */ (function () {
    function AppComponent(userEventsService) {
        this.userEventsService = userEventsService;
        this.title = 'Festival-App';
    }
    AppComponent.ctorParameters = function () { return [
        { type: _user_events_service__WEBPACK_IMPORTED_MODULE_2__["UserEventsService"] }
    ]; };
    AppComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! raw-loader!./app.component.html */ "./node_modules/raw-loader/index.js!./src/app/app.component.html"),
            providers: [_user_events_service__WEBPACK_IMPORTED_MODULE_2__["UserEventsService"]],
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _home_home_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./home/home.component */ "./src/app/home/home.component.ts");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var angular_font_awesome__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! angular-font-awesome */ "./node_modules/angular-font-awesome/dist/angular-font-awesome.es5.js");
/* harmony import */ var _create_event_create_event_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./create-event/create-event.component */ "./src/app/create-event/create-event.component.ts");
/* harmony import */ var _stage_schedule_stage_schedule_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./stage-schedule/stage-schedule.component */ "./src/app/stage-schedule/stage-schedule.component.ts");
/* harmony import */ var _navbar_navbar_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./navbar/navbar.component */ "./src/app/navbar/navbar.component.ts");
/* harmony import */ var _edit_event_edit_event_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./edit-event/edit-event.component */ "./src/app/edit-event/edit-event.component.ts");
/* harmony import */ var _register_register_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./register/register.component */ "./src/app/register/register.component.ts");
/* harmony import */ var _manager_dashboard_manager_dashboard_component__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./manager-dashboard/manager-dashboard.component */ "./src/app/manager-dashboard/manager-dashboard.component.ts");
/* harmony import */ var _user_events_service__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! ./user-events.service */ "./src/app/user-events.service.ts");
















var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_2__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"],
                _home_home_component__WEBPACK_IMPORTED_MODULE_5__["HomeComponent"],
                _create_event_create_event_component__WEBPACK_IMPORTED_MODULE_9__["CreateEventComponent"],
                _stage_schedule_stage_schedule_component__WEBPACK_IMPORTED_MODULE_10__["StageScheduleComponent"],
                _navbar_navbar_component__WEBPACK_IMPORTED_MODULE_11__["NavbarComponent"],
                _edit_event_edit_event_component__WEBPACK_IMPORTED_MODULE_12__["EditEventComponent"],
                _register_register_component__WEBPACK_IMPORTED_MODULE_13__["RegisterComponent"],
                _manager_dashboard_manager_dashboard_component__WEBPACK_IMPORTED_MODULE_14__["ManagerDashboardComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__["BrowserModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_3__["AppRoutingModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_6__["FormsModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_7__["HttpClientModule"],
                angular_font_awesome__WEBPACK_IMPORTED_MODULE_8__["AngularFontAwesomeModule"]
            ],
            providers: [_user_events_service__WEBPACK_IMPORTED_MODULE_15__["UserEventsService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/create-event/create-event.component.css":
/*!*********************************************************!*\
  !*** ./src/app/create-event/create-event.component.css ***!
  \*********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NyZWF0ZS1ldmVudC9jcmVhdGUtZXZlbnQuY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/create-event/create-event.component.ts":
/*!********************************************************!*\
  !*** ./src/app/create-event/create-event.component.ts ***!
  \********************************************************/
/*! exports provided: CreateEventComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CreateEventComponent", function() { return CreateEventComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _node_modules_bulma_calendar_dist_js_bulma_calendar_js__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../../node_modules/bulma-calendar/dist/js/bulma-calendar.js */ "./node_modules/bulma-calendar/dist/js/bulma-calendar.js");
/* harmony import */ var _node_modules_bulma_calendar_dist_js_bulma_calendar_js__WEBPACK_IMPORTED_MODULE_2___default = /*#__PURE__*/__webpack_require__.n(_node_modules_bulma_calendar_dist_js_bulma_calendar_js__WEBPACK_IMPORTED_MODULE_2__);
/* harmony import */ var _node_modules_bulma_quickview_dist_js_bulma_quickview_js__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../../node_modules/bulma-quickview/dist/js/bulma-quickview.js */ "./node_modules/bulma-quickview/dist/js/bulma-quickview.js");
/* harmony import */ var _node_modules_bulma_quickview_dist_js_bulma_quickview_js__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(_node_modules_bulma_quickview_dist_js_bulma_quickview_js__WEBPACK_IMPORTED_MODULE_3__);




// Initialize all input of date type.
// const calendars = bulmaCalendar.attach('[type="date"]');
// const quickviews = bulmaQuickview.attach();
// Loop on each calendar initialized
// calendars.forEach(calendar => {
// 	// Add listener to date:selected event
// 	calendar.on('date:selected', date => {
// 		console.log(date);
// 	});
// });
// // To access to bulmaCalendar instance of an element
// const element = document.querySelector('#my-element');
// if (element) {
// 	// bulmaCalendar instance is available as element.bulmaCalendar
// 	element.bulmaCalendar.on('select', datepicker => {
// 		console.log(datepicker.data.value());
// 	});
// }
var CreateEventComponent = /** @class */ (function () {
    function CreateEventComponent() {
    }
    CreateEventComponent.prototype.ngOnInit = function () {
        var quickviews = _node_modules_bulma_quickview_dist_js_bulma_quickview_js__WEBPACK_IMPORTED_MODULE_3___default.a.attach();
        var calendars = _node_modules_bulma_calendar_dist_js_bulma_calendar_js__WEBPACK_IMPORTED_MODULE_2___default.a.attach('[type="date"]');
    };
    CreateEventComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-create-event',
            template: __webpack_require__(/*! raw-loader!./create-event.component.html */ "./node_modules/raw-loader/index.js!./src/app/create-event/create-event.component.html"),
            styles: [__webpack_require__(/*! ./create-event.component.css */ "./src/app/create-event/create-event.component.css")]
        })
    ], CreateEventComponent);
    return CreateEventComponent;
}());



/***/ }),

/***/ "./src/app/edit-event/edit-event.component.css":
/*!*****************************************************!*\
  !*** ./src/app/edit-event/edit-event.component.css ***!
  \*****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "th {\r\n    text-align: center\r\n}\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvZWRpdC1ldmVudC9lZGl0LWV2ZW50LmNvbXBvbmVudC5jc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUE7SUFDSTtBQUNKIiwiZmlsZSI6InNyYy9hcHAvZWRpdC1ldmVudC9lZGl0LWV2ZW50LmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyJ0aCB7XHJcbiAgICB0ZXh0LWFsaWduOiBjZW50ZXJcclxufSJdfQ== */"

/***/ }),

/***/ "./src/app/edit-event/edit-event.component.ts":
/*!****************************************************!*\
  !*** ./src/app/edit-event/edit-event.component.ts ***!
  \****************************************************/
/*! exports provided: EditEventComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "EditEventComponent", function() { return EditEventComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../shared/performance.model */ "./src/app/shared/performance.model.ts");
/* harmony import */ var _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../shared/stage.model */ "./src/app/shared/stage.model.ts");
/* harmony import */ var _shared_day_model__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/day.model */ "./src/app/shared/day.model.ts");
/* harmony import */ var _user_events_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../user-events.service */ "./src/app/user-events.service.ts");






var d = new Date();
d.setDate(24);
var EditEventComponent = /** @class */ (function () {
    function EditEventComponent(userEventsService) {
        this.userEventsService = userEventsService;
        this.perfNumber = 0;
    }
    EditEventComponent.prototype.onEditCell = function () {
        console.log(this.eventDays);
    };
    EditEventComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.userEventsService.assignedEventSelected.subscribe(function (event) {
            _this.assignedEvent = event;
            console.log(event);
        });
        // console.log(this.assignedEvent);
        // console.log(this.userEventsService.retrieveSelectedEvent().event);
        this.eventDays = [
            new _shared_day_model__WEBPACK_IMPORTED_MODULE_4__["EventDay"](new Date(), [
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage One', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage Two', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage Three', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
            ]),
            new _shared_day_model__WEBPACK_IMPORTED_MODULE_4__["EventDay"](d, [
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage 1', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage 2', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage 3', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
            ])
        ];
    };
    EditEventComponent.ctorParameters = function () { return [
        { type: _user_events_service__WEBPACK_IMPORTED_MODULE_5__["UserEventsService"] }
    ]; };
    EditEventComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-edit-event',
            template: __webpack_require__(/*! raw-loader!./edit-event.component.html */ "./node_modules/raw-loader/index.js!./src/app/edit-event/edit-event.component.html"),
            styles: [__webpack_require__(/*! ./edit-event.component.css */ "./src/app/edit-event/edit-event.component.css")]
        })
    ], EditEventComponent);
    return EditEventComponent;
}());



/***/ }),

/***/ "./src/app/home/home.component.css":
/*!*****************************************!*\
  !*** ./src/app/home/home.component.css ***!
  \*****************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n\r\n\r\n\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2hvbWUvaG9tZS5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/home/home.component.ts":
/*!****************************************!*\
  !*** ./src/app/home/home.component.ts ***!
  \****************************************/
/*! exports provided: HomeComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomeComponent", function() { return HomeComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _shared_event_model__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../shared/event.model */ "./src/app/shared/event.model.ts");




var HomeComponent = /** @class */ (function () {
    function HomeComponent(http) {
        this.http = http;
        this.title = 'Festival App';
        this.events = [
            new _shared_event_model__WEBPACK_IMPORTED_MODULE_3__["Event"](1, 2, 'Lollapalooza', 'Tampa, Fl', '8/7/19', '8/10/19', 'consectetur adipisicing elit. Dolorum sapiente explicabo, corporis totam! Labore reprehenderit beatae'),
            new _shared_event_model__WEBPACK_IMPORTED_MODULE_3__["Event"](1, 2, 'Bonnaroo', 'Zimbabwe', '11/7/19', '12/10/19', 'quas accusantium perferendis sapiente explicabo, corporis totam! Labore reprehenderit beatae magnam animi!'),
            new _shared_event_model__WEBPACK_IMPORTED_MODULE_3__["Event"](1, 2, 'Camp Bisco', 'Philadelphia', '10/30/19', '11/13/14', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum consequatur numquam aliquam tenetur ad amet inventore hic beatae.')
        ];
    }
    HomeComponent.prototype.onSelectEvent = function (selectedEvent) {
        console.log(selectedEvent[0].firstChild.firstChild.textContent);
        console.log(selectedEvent[0].children[2].firstChild.textContent);
        console.log(selectedEvent[0].children[3].firstChild.textContent);
        console.log(selectedEvent[0].children[3].lastChild.textContent);
    };
    HomeComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.http.get('').subscribe(function (events) {
            _this.events = events;
        });
    };
    HomeComponent.ctorParameters = function () { return [
        { type: _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"] }
    ]; };
    HomeComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-home',
            template: __webpack_require__(/*! raw-loader!./home.component.html */ "./node_modules/raw-loader/index.js!./src/app/home/home.component.html"),
            styles: [__webpack_require__(/*! ./home.component.css */ "./src/app/home/home.component.css")]
        })
    ], HomeComponent);
    return HomeComponent;
}());



/***/ }),

/***/ "./src/app/manager-dashboard/manager-dashboard.component.css":
/*!*******************************************************************!*\
  !*** ./src/app/manager-dashboard/manager-dashboard.component.css ***!
  \*******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL21hbmFnZXItZGFzaGJvYXJkL21hbmFnZXItZGFzaGJvYXJkLmNvbXBvbmVudC5jc3MifQ== */"

/***/ }),

/***/ "./src/app/manager-dashboard/manager-dashboard.component.ts":
/*!******************************************************************!*\
  !*** ./src/app/manager-dashboard/manager-dashboard.component.ts ***!
  \******************************************************************/
/*! exports provided: ManagerDashboardComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ManagerDashboardComponent", function() { return ManagerDashboardComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var ManagerDashboardComponent = /** @class */ (function () {
    function ManagerDashboardComponent() {
    }
    ManagerDashboardComponent.prototype.onAddStage = function (data) {
        console.log(data);
    };
    ManagerDashboardComponent.prototype.onAddRole = function (data) {
        console.log(data);
    };
    ManagerDashboardComponent.prototype.onAddPerformance = function (perf) {
        var start = new Date(perf.date);
        start.setHours(Number.parseInt(perf.startTime.slice(0, 2)));
        start.setMinutes(Number.parseInt(perf.startTime.slice(3)));
        var end = new Date(perf.date);
        end.setHours(Number.parseInt(perf.endTime.slice(0, 2)));
        end.setMinutes(Number.parseInt(perf.endTime.slice(3)));
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
    };
    ManagerDashboardComponent.prototype.ngOnInit = function () {
        this.date = new Date();
    };
    ManagerDashboardComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-manager-dashboard',
            template: __webpack_require__(/*! raw-loader!./manager-dashboard.component.html */ "./node_modules/raw-loader/index.js!./src/app/manager-dashboard/manager-dashboard.component.html"),
            styles: [__webpack_require__(/*! ./manager-dashboard.component.css */ "./src/app/manager-dashboard/manager-dashboard.component.css")]
        })
    ], ManagerDashboardComponent);
    return ManagerDashboardComponent;
}());



/***/ }),

/***/ "./src/app/navbar/navbar.component.css":
/*!*********************************************!*\
  !*** ./src/app/navbar/navbar.component.css ***!
  \*********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "input.ng-invalid.ng-touched {\r\n    border: 1px solid red;\r\n}\r\n\r\n.navbar {\r\n    background-color: black;\r\n}\r\n\r\n.active {\r\n    background-color: green;\r\n}\r\n\r\n.title {\r\n    text-align: center;\r\n}\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvbmF2YmFyL25hdmJhci5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0lBQ0kscUJBQXFCO0FBQ3pCOztBQUVBO0lBQ0ksdUJBQXVCO0FBQzNCOztBQUVBO0lBQ0ksdUJBQXVCO0FBQzNCOztBQUVBO0lBQ0ksa0JBQWtCO0FBQ3RCIiwiZmlsZSI6InNyYy9hcHAvbmF2YmFyL25hdmJhci5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiaW5wdXQubmctaW52YWxpZC5uZy10b3VjaGVkIHtcclxuICAgIGJvcmRlcjogMXB4IHNvbGlkIHJlZDtcclxufVxyXG5cclxuLm5hdmJhciB7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiBibGFjaztcclxufVxyXG5cclxuLmFjdGl2ZSB7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiBncmVlbjtcclxufVxyXG5cclxuLnRpdGxlIHtcclxuICAgIHRleHQtYWxpZ246IGNlbnRlcjtcclxufSJdfQ== */"

/***/ }),

/***/ "./src/app/navbar/navbar.component.ts":
/*!********************************************!*\
  !*** ./src/app/navbar/navbar.component.ts ***!
  \********************************************/
/*! exports provided: NavbarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavbarComponent", function() { return NavbarComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _node_modules_bulma_quickview_dist_js_bulma_quickview_js__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../../node_modules/bulma-quickview/dist/js/bulma-quickview.js */ "./node_modules/bulma-quickview/dist/js/bulma-quickview.js");
/* harmony import */ var _node_modules_bulma_quickview_dist_js_bulma_quickview_js__WEBPACK_IMPORTED_MODULE_2___default = /*#__PURE__*/__webpack_require__.n(_node_modules_bulma_quickview_dist_js_bulma_quickview_js__WEBPACK_IMPORTED_MODULE_2__);
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _shared_assigned_event_model__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/assigned-event.model */ "./src/app/shared/assigned-event.model.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shared_event_model__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../shared/event.model */ "./src/app/shared/event.model.ts");
/* harmony import */ var _user_events_service_js__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ../user-events.service.js */ "./src/app/user-events.service.js");








// assignedEvents: AssignedEvent[] = [
//   new AssignedEvent('Lollapalooza', 'Manager', '8/7/19', '8/10/19'),
//   new AssignedEvent('Bonnaroo', 'Artist', '11/7/19', '12/10/19')
// ];
var NavbarComponent = /** @class */ (function () {
    function NavbarComponent(http, router, userEventsService) {
        this.http = http;
        this.router = router;
        this.userEventsService = userEventsService;
        this.loggedIn = false;
        this.edit = false;
    }
    // angular http client will take our object (data) and automatically convert to JSON data
    // must subscribe to request, otherwise angular assumes no one is interested in response and
    // not bother sending it
    // don't need to unsubscribe for observables provided by angular 
    NavbarComponent.prototype.onClickSubmit = function (data) {
        var _this = this;
        // sending http request
        this.http.post('/festivalApp/login', data).subscribe(function (responseData) {
            if (responseData === 'true') {
                _this.fetchUserEvents();
            }
            else {
                alert('invalid login');
            }
            // angular will give you the response body 
            // if response is false, alert user invalid login
            // bool: Boolean = responseData;
            // if(responseData===bool) {
            // }
            console.log(responseData);
        });
        console.log(data);
        alert('Entered Password : ' + data.password);
    };
    //testing click event binding as well as .navigate() method
    NavbarComponent.prototype.onTestClick = function () {
        this.router.navigate(['/createEvent']);
        alert("" + this.router.url);
        alert('the click event works');
    };
    NavbarComponent.prototype.onSelectRow = function (assignedEvent) {
        //console.log(assignedEvent);
        this.userEventsService.onSelectAssignedEvent(assignedEvent);
        this.router.navigate(['/edit']);
        // this.rowClicked.emit(assignedEvent);
        // console.log(selectedRow[0].innerHTML);
        // console.log(selectedRow[1].innerHTML);
        // console.log(selectedRow[2].innerHTML);
        //this.http.get('/manage_event');
        // let d = e.children;
        // alert(d.children[0].innerText);
    };
    NavbarComponent.prototype.fetchUserEvents = function () {
        var _this = this;
        this.http.get('/festivalApp/details').subscribe(function (assignedEvents) {
            _this.assignedEvents = assignedEvents;
        });
        //     angle brackets<> tell ts what kind of object you're getting back; avoids Type errors
        //  this.http.get<AssignedEvent[]>('/').pipe(map(responseData => {
        //    const postsArray: AssignedEvent[] = [];
        //    for (const key in responseData) {
        //      postsArray.push({ ...responseData[key]});
        //    }
        //    return postsArray;
        //  })).subscribe(events => {
        //    console.log(events);
        //    this.assignedEvents = events;
        //  });
    };
    NavbarComponent.prototype.ngOnInit = function () {
        var quickviews = _node_modules_bulma_quickview_dist_js_bulma_quickview_js__WEBPACK_IMPORTED_MODULE_2___default.a.attach();
        //const assignedEvents: AssignedEvent[];
        var event = new _shared_event_model__WEBPACK_IMPORTED_MODULE_6__["Event"](1, 2, 'Lollapalooza', 'Tampa, Fl', '8/7/19', '8/10/19', 'consectetur adipisicing elit. Dolorum sapiente explicabo, corporis totam! Labore reprehenderit beatae');
        var eventTwo = new _shared_event_model__WEBPACK_IMPORTED_MODULE_6__["Event"](55, 2, 'Lollapalooza', 'Tampa, Fl', '8/7/19', '8/10/19', 'consectetur adipisicing elit. Dolorum sapiente explicabo, corporis totam! Labore reprehenderit beatae');
        this.assignedEvents = [
            new _shared_assigned_event_model__WEBPACK_IMPORTED_MODULE_4__["AssignedEvent"]('Manager', event, '8/7/19', '8/10/19'),
            new _shared_assigned_event_model__WEBPACK_IMPORTED_MODULE_4__["AssignedEvent"]('Artist', eventTwo, '11/7/19', '12/10/19')
        ];
    };
    NavbarComponent.ctorParameters = function () { return [
        { type: _angular_common_http__WEBPACK_IMPORTED_MODULE_3__["HttpClient"] },
        { type: _angular_router__WEBPACK_IMPORTED_MODULE_5__["Router"] },
        { type: _user_events_service_js__WEBPACK_IMPORTED_MODULE_7__["UserEventsService"] }
    ]; };
    NavbarComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-navbar',
            template: __webpack_require__(/*! raw-loader!./navbar.component.html */ "./node_modules/raw-loader/index.js!./src/app/navbar/navbar.component.html"),
            styles: [__webpack_require__(/*! ./navbar.component.css */ "./src/app/navbar/navbar.component.css")]
        })
    ], NavbarComponent);
    return NavbarComponent;
}());



/***/ }),

/***/ "./src/app/register/register.component.css":
/*!*************************************************!*\
  !*** ./src/app/register/register.component.css ***!
  \*************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3JlZ2lzdGVyL3JlZ2lzdGVyLmNvbXBvbmVudC5jc3MifQ== */"

/***/ }),

/***/ "./src/app/register/register.component.ts":
/*!************************************************!*\
  !*** ./src/app/register/register.component.ts ***!
  \************************************************/
/*! exports provided: RegisterComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RegisterComponent", function() { return RegisterComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var RegisterComponent = /** @class */ (function () {
    function RegisterComponent() {
    }
    RegisterComponent.prototype.ngOnInit = function () {
    };
    RegisterComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-register',
            template: __webpack_require__(/*! raw-loader!./register.component.html */ "./node_modules/raw-loader/index.js!./src/app/register/register.component.html"),
            styles: [__webpack_require__(/*! ./register.component.css */ "./src/app/register/register.component.css")]
        })
    ], RegisterComponent);
    return RegisterComponent;
}());



/***/ }),

/***/ "./src/app/shared/assigned-event.model.ts":
/*!************************************************!*\
  !*** ./src/app/shared/assigned-event.model.ts ***!
  \************************************************/
/*! exports provided: AssignedEvent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AssignedEvent", function() { return AssignedEvent; });
/* harmony import */ var _event_model__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./event.model */ "./src/app/shared/event.model.ts");

var AssignedEvent = /** @class */ (function () {
    function AssignedEvent(eventRole, event, eventStartDate, eventEndDate) {
        this.eventRole = eventRole;
        this.event = event;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
    }
    AssignedEvent.ctorParameters = function () { return [
        { type: String },
        { type: _event_model__WEBPACK_IMPORTED_MODULE_0__["Event"] },
        { type: String },
        { type: String }
    ]; };
    return AssignedEvent;
}());



/***/ }),

/***/ "./src/app/shared/day.model.ts":
/*!*************************************!*\
  !*** ./src/app/shared/day.model.ts ***!
  \*************************************/
/*! exports provided: EventDay */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "EventDay", function() { return EventDay; });
var EventDay = /** @class */ (function () {
    function EventDay(day, stages) {
        this.day = day;
        this.stages = stages;
    }
    EventDay.ctorParameters = function () { return [
        { type: Date },
        { type: Array }
    ]; };
    return EventDay;
}());



/***/ }),

/***/ "./src/app/shared/event.model.ts":
/*!***************************************!*\
  !*** ./src/app/shared/event.model.ts ***!
  \***************************************/
/*! exports provided: Event */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Event", function() { return Event; });
var Event = /** @class */ (function () {
    function Event(eventNumer, audienceCapacity, eventName, eventLocation, startDate, endDate, eventDescription) {
        this.eventNumer = eventNumer;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventDescription = eventDescription;
    }
    Event.ctorParameters = function () { return [
        { type: Number },
        { type: Number },
        { type: String },
        { type: String },
        { type: String },
        { type: String },
        { type: String }
    ]; };
    return Event;
}());



/***/ }),

/***/ "./src/app/shared/performance.model.ts":
/*!*********************************************!*\
  !*** ./src/app/shared/performance.model.ts ***!
  \*********************************************/
/*! exports provided: Performance */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Performance", function() { return Performance; });
var Performance = /** @class */ (function () {
    function Performance(start, end, artist, number) {
        this.start = start;
        this.end = end;
        this.artist = artist;
        this.number = number;
    }
    Performance.ctorParameters = function () { return [
        { type: String },
        { type: String },
        { type: String },
        { type: Number }
    ]; };
    return Performance;
}());



/***/ }),

/***/ "./src/app/shared/stage.model.ts":
/*!***************************************!*\
  !*** ./src/app/shared/stage.model.ts ***!
  \***************************************/
/*! exports provided: Stage */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Stage", function() { return Stage; });
var Stage = /** @class */ (function () {
    function Stage(name, performances) {
        this.name = name;
        this.performances = performances;
    }
    Stage.ctorParameters = function () { return [
        { type: String },
        { type: Array }
    ]; };
    return Stage;
}());



/***/ }),

/***/ "./src/app/stage-schedule/stage-schedule.component.css":
/*!*************************************************************!*\
  !*** ./src/app/stage-schedule/stage-schedule.component.css ***!
  \*************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "html,body {\r\n    height:100%;\r\n}\r\np.is-size-7 {\r\n    height:100%;\r\n}\r\n.columns {\r\n    display: flex;\r\n    height: 100%;\r\n  }\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvc3RhZ2Utc2NoZWR1bGUvc3RhZ2Utc2NoZWR1bGUuY29tcG9uZW50LmNzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtJQUNJLFdBQVc7QUFDZjtBQUNBO0lBQ0ksV0FBVztBQUNmO0FBRUE7SUFDSSxhQUFhO0lBQ2IsWUFBWTtFQUNkIiwiZmlsZSI6InNyYy9hcHAvc3RhZ2Utc2NoZWR1bGUvc3RhZ2Utc2NoZWR1bGUuY29tcG9uZW50LmNzcyIsInNvdXJjZXNDb250ZW50IjpbImh0bWwsYm9keSB7XHJcbiAgICBoZWlnaHQ6MTAwJTtcclxufVxyXG5wLmlzLXNpemUtNyB7XHJcbiAgICBoZWlnaHQ6MTAwJTtcclxufVxyXG5cclxuLmNvbHVtbnMge1xyXG4gICAgZGlzcGxheTogZmxleDtcclxuICAgIGhlaWdodDogMTAwJTtcclxuICB9Il19 */"

/***/ }),

/***/ "./src/app/stage-schedule/stage-schedule.component.ts":
/*!************************************************************!*\
  !*** ./src/app/stage-schedule/stage-schedule.component.ts ***!
  \************************************************************/
/*! exports provided: StageScheduleComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "StageScheduleComponent", function() { return StageScheduleComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../shared/performance.model */ "./src/app/shared/performance.model.ts");
/* harmony import */ var _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../shared/stage.model */ "./src/app/shared/stage.model.ts");
/* harmony import */ var _shared_day_model__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/day.model */ "./src/app/shared/day.model.ts");





var d = new Date();
d.setDate(24);
var StageScheduleComponent = /** @class */ (function () {
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
    function StageScheduleComponent() {
        // first get: gets an array of stage names or numbers
        // Routing: pass in a parameter on the end to diff url with stage name or number
        // for every request getting back schedule
        this.perfNumber = 0;
    }
    StageScheduleComponent.prototype.ngOnInit = function () {
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
            new _shared_day_model__WEBPACK_IMPORTED_MODULE_4__["EventDay"](new Date(), [
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage One', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage Two', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage Three', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
            ]),
            new _shared_day_model__WEBPACK_IMPORTED_MODULE_4__["EventDay"](d, [
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage 1', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage 2', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
                new _shared_stage_model__WEBPACK_IMPORTED_MODULE_3__["Stage"]('Stage 3', [
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('5:00 PM', '6:45 PM', 'Sublime', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('6:45 PM', '8:00 PM', 'Zeds Dead', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('8:00 PM', '9:20 PM', 'Excision', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('9:20 PM', '10:30 PM', 'Big Gigantic', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('10:30 PM', '12:00 AM', 'Jay Z', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('12:00 AM', '1:00 AM', 'Kendrick Lamar', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('1:00 AM', '2:45 AM', 'Hippie Sabotage', this.perfNumber++),
                    new _shared_performance_model__WEBPACK_IMPORTED_MODULE_2__["Performance"]('2:45 AM', '4:00 AM', 'Griz', this.perfNumber++)
                ]),
            ])
        ];
    };
    StageScheduleComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-stage-schedule',
            template: __webpack_require__(/*! raw-loader!./stage-schedule.component.html */ "./node_modules/raw-loader/index.js!./src/app/stage-schedule/stage-schedule.component.html"),
            styles: [__webpack_require__(/*! ./stage-schedule.component.css */ "./src/app/stage-schedule/stage-schedule.component.css")]
        })
    ], StageScheduleComponent);
    return StageScheduleComponent;
}());



/***/ }),

/***/ "./src/app/user-events.service.js":
/*!****************************************!*\
  !*** ./src/app/user-events.service.js ***!
  \****************************************/
/*! exports provided: UserEventsService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserEventsService", function() { return UserEventsService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var UserEventsService = /** @class */ (function () {
    function UserEventsService() {
        this.assignedEventSelected = new _angular_core__WEBPACK_IMPORTED_MODULE_1__["EventEmitter"]();
    }
    UserEventsService.prototype.onSelectAssignedEvent = function (assignedEvent) {
        this.assignedEvent = assignedEvent;
        this.assignedEventSelected.emit(assignedEvent);
        // console.log(assignedEvent);
        // console.log(this.assignedEvent);
    };
    UserEventsService.prototype.retrieveSelectedEvent = function () {
        this.assignedEventSelected.emit(this.assignedEvent);
        //return 42342;
        // console.log(this.assignedEvent);
        // alert(this.assignedEvent);
        // return this.assignedEvent;
    };
    UserEventsService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        })
    ], UserEventsService);
    return UserEventsService;
}());

//# sourceMappingURL=user-events.service.js.map

/***/ }),

/***/ "./src/app/user-events.service.ts":
/*!****************************************!*\
  !*** ./src/app/user-events.service.ts ***!
  \****************************************/
/*! exports provided: UserEventsService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserEventsService", function() { return UserEventsService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var UserEventsService = /** @class */ (function () {
    function UserEventsService() {
        this.assignedEventSelected = new _angular_core__WEBPACK_IMPORTED_MODULE_1__["EventEmitter"]();
    }
    UserEventsService.prototype.onSelectAssignedEvent = function (assignedEvent) {
        this.assignedEvent = assignedEvent;
        this.assignedEventSelected.emit(assignedEvent);
        // console.log(assignedEvent);
        // console.log(this.assignedEvent);
    };
    UserEventsService.prototype.retrieveSelectedEvent = function () {
        this.assignedEventSelected.emit(this.assignedEvent);
        //return 42342;
        // console.log(this.assignedEvent);
        // alert(this.assignedEvent);
        // return this.assignedEvent;
    };
    UserEventsService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        })
    ], UserEventsService);
    return UserEventsService;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.error(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! E:\Users\techi\Storage\Revature\Project2\Festival-Angular\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main-es5.js.map