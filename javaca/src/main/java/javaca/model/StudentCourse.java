package javaca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the studentcourse database table.
 * 
 */
@Entity
@NamedQuery(name="StudentCourse.findAll", query="SELECT s FROM StudentCourse s")
public class StudentCourse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int enrollmentID;

	@Temporal(TemporalType.DATE)
	private Date enrollmentDate;

	private String grade;

	private String status;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JoinColumn(name="CourseID")
	private Course course;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="UserID")
	private User user;

	public StudentCourse() {
	}

	public int getEnrollmentID() {
		return this.enrollmentID;
	}

	public void setEnrollmentID(int enrollmentID) {
		this.enrollmentID = enrollmentID;
	}

	public Date getEnrollmentDate() {
		return this.enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
