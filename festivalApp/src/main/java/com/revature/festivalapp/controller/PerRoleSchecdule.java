package com.revature.festivalapp.controller;

import com.revature.festivalapp.pojos.RoleScheduleDTO;

@Controller
public class PerRoleSchecdule {
	
	@GetMapping("/schedule")
	public @RequestBody Schedule[] getRoleSchedules(RoleScheduleDTO[] dto, )

}
