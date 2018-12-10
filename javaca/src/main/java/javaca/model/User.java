package javaca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int userID;

	private String address;

	private String contact;

	private String email;

	private String firstName;

	private String lastName;

	private String status;

	//bi-directional many-to-one association to LecturerCourse
	@OneToMany(mappedBy="user")
	private List<LecturerCourse> lecturercourses;

	//bi-directional one-to-one association to Login
	@OneToOne(mappedBy="user")
	private Login login;

	//bi-directional many-to-one association to StudentCourse
	@OneToMany(mappedBy="user")
	private List<StudentCourse> studentcourses;

	//bi-directional many-to-one association to UserRole
	@ManyToOne
	@JoinColumn(name="RoleID")
	private UserRole userrole;

	public User() {
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<LecturerCourse> getLecturercourses() {
		return this.lecturercourses;
	}

	public void setLecturercourses(List<LecturerCourse> lecturercourses) {
		this.lecturercourses = lecturercourses;
	}

	public LecturerCourse addLecturercours(LecturerCourse lecturercours) {
		getLecturercourses().add(lecturercours);
		lecturercours.setUser(this);

		return lecturercours;
	}

	public LecturerCourse removeLecturercours(LecturerCourse lecturercours) {
		getLecturercourses().remove(lecturercours);
		lecturercours.setUser(null);

		return lecturercours;
	}

	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<StudentCourse> getStudentcourses() {
		return this.studentcourses;
	}

	public void setStudentcourses(List<StudentCourse> studentcourses) {
		this.studentcourses = studentcourses;
	}

	public StudentCourse addStudentcours(StudentCourse studentcours) {
		getStudentcourses().add(studentcours);
		studentcours.setUser(this);

		return studentcours;
	}

	public StudentCourse removeStudentcours(StudentCourse studentcours) {
		getStudentcourses().remove(studentcours);
		studentcours.setUser(null);

		return studentcours;
	}

	public UserRole getUserrole() {
		return this.userrole;
	}

	public void setUserrole(UserRole userrole) {
		this.userrole = userrole;
	}

}
