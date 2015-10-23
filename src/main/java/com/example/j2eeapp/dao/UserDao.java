package com.example.j2eeapp.dao;

import com.example.j2eeapp.commons.dao.GenericDao;
import com.example.j2eeapp.domain.UserEntity;

/**
 * DAO interface to work with User entity database operations.
 * 
 * @author eserbaniuc
 */
public interface UserDao extends GenericDao<UserEntity, Long>{

		/**
		 * Queries database for user name availability
		 * 
		 * @param userName
		 * @return true if available
		 */
		boolean chechAvailable(String userName);
		
		/**
		 * Queries user by userName
		 * 
		 * @param userName
		 * @return User entity
		 */
		UserEntity loadUserByUserName(String userName);
}
