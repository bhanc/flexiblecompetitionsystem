package pl.sportscompetitions.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
//	@Column(name="name")
//	private String name;
//	@Column(name="lastname")
//	private String lastname;
	@Column(name = "mail")
	private String mail;
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getLastname() {
//		return lastname;
//	}
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
