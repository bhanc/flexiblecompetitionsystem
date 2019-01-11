package pl.sportscompetitions.DAO;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.RollbackException;

import pl.sportscompetitions.entities.Users;
import pl.sportscompetitions.flags.Flags;

public class UsersDAO {
	private EntityManager entityManager;

	public UsersDAO(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public Flags registerUser(Users user) {
		if (isUserExist(user.getLogin())) {
			return Flags.LOGIN_EXIST;
		}
		user.setPassword(createMD5(user.getPassword()));
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(user);
			entityTransaction.commit();
			return Flags.REGISTER_SUCCESS;
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return Flags.REGISTER_FAILED;
		} catch (RollbackException e) {
			e.printStackTrace();
			entityTransaction.rollback();
			return Flags.REGISTER_FAILED;
		}

	}

	public boolean Logging(String login, String password) {
		if (isUserExist(login)) {
			Users user = getUserByLogin(login);

			if (login.equals(user.getLogin()) && createMD5(password).equals(user.getPassword())) {
				return true;
			}
		}
		return false;

	}

	private Users getUserByLogin(String login) {
		Users user = (Users) entityManager.createQuery("SELECT u FROM Users u WHERE u.login = :login")
				.setParameter("login", login).getSingleResult();

		return user;
	}

	private boolean isUserExist(String login) {
		try {
			entityManager.createQuery("SELECT u FROM Users u WHERE u.login = :login").setParameter("login", login)
					.getSingleResult();
			return true;
		} catch (NoResultException e) {
			return false;
		}
	}

	private String createMD5(String password) {
		MessageDigest m = null;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
		m.reset();
		m.update(password.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1, digest);
		String hashPassword = bigInt.toString(16);
		while (hashPassword.length() < 32) {
			hashPassword = "0" + hashPassword;
		}
		return hashPassword;
	}

}
