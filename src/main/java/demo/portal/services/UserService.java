package demo.portal.services;

import org.jooq.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import portal.db.gen.*;
import portal.db.gen.tables.pojos.User;

import java.util.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 9-11-19.
 */
@Service
public class UserService {

	//@Autowired
	//private ModelMapper m_mapper;

	@Autowired DSLContext m_dsl;

	public List<User> getUsers() {
		return m_dsl.selectFrom(Tables.USERS).fetchInto(User.class);
	}

	public void createUser(){
	//	m_dsl.in
	}
}
