package javaca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the courses database table.
 * 
 */
@Entity
@Table(name="courses")
@NamedQuery(name="Course.findAll", query="SELECT c FROM Course c")
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String courseID;

	private int capacity;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	private int modularCredit;

	@Temporal(TemporalType.DATE)
	private Date startDate;

	private String status;

	private String title;

	//bi-directional many-to-one association to LecturerCourse
	@OneToMany(mappedBy="course")
	private List<LecturerCourse> lecturercourses;

	//bi-directional many-to-one association to StudentCourse
	@OneToMany(mappedBy="course")
	private List<StudentCourse> studentcourses;

	public Course() {
	}

	public String getCourseID() {
		return this.courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getModularCredit() {
		return this.modularCredit;
	}

	public void setModularCredit(int modularCredit) {
		this.modularCredit = modularCredit;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<LecturerCourse> getLecturercourses() {
		return this.lecturercourses;
	}

	public void setLecturercourses(List<LecturerCourse> lecturercourses) {
		this.lecturercourses = lecturercourses;
	}

	public LecturerCourse addLecturercours(LecturerCourse lecturercourse) {
		getLecturercourses().add(lecturercourse);
		lecturercourse.setCourse(this);

		return lecturercourse;
	}

	public LecturerCourse removeLecturercours(LecturerCourse lecturercourse) {
		getLecturercourses().remove(lecturercourse);
		lecturercourse.setCourse(null);

		return lecturercourse;
	}

	public List<StudentCourse> getStudentcourses() {
		return this.studentcourses;
	}

	public void setStudentcourses(List<StudentCourse> studentcourses) {
		this.studentcourses = studentcourses;
	}

	public StudentCourse addStudentcours(StudentCourse studentcourse) {
		getStudentcourses().add(studentcourse);
		studentcourse.setCourse(this);

		return studentcourse;
	}

	public StudentCourse removeStudentcours(StudentCourse studentcourse) {
		getStudentcourses().remove(studentcourse);
		studentcourse.setCourse(null);

		return studentcourse;
	}

}
