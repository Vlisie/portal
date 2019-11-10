package demo.portal.controllers;

import demo.portal.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import portal.db.gen.tables.pojos.*;

import java.util.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 9-11-19.
 */
@RestController
@RequestMapping("/portal/user")
public class UserController {

	@Autowired
	UserService m_userService;

	@GetMapping(value = "/user")
	@ResponseBody
	public List<User> getUsers() {
		return m_userService.getUsers();
	}
}
