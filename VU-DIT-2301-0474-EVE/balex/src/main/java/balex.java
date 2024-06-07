
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

@SupportedSourceVersion(SourceVersion.RELEASE_5)
public class balex {
	private String CourseID;
	private String CourseName;
	private int Tuition;

	public balex(String CourseID, String CourseName, int Tuition) {
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.Tuition = Tuition;
	}

	public String getCourseID() {
		return CourseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public int getTuition() {
		return Tuition;
	}
}

import java.util.Scanner;
public class balex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) {};

		// Create an array of courses
		courses[] courses = new courses[] {
			new courses("BSE", "Software Engineering", 900000),
			new courses("BIT", "Information Technology", 750000),
			new courses("BCS", "Computer Science", 800000),
			new courses("BCE", "Computer Engineering", 950000)
		};

		// Prompt the user for a CourseID
		System.out.print("Enter a CourseID: ");
		String CourseID = input.nextLine();

		// Check if the CourseID is valid
		boolean valid = false;
		for (courses course : courses) {
			if (course.getCourseID().equals(CourseID)) {
				valid = true;
				System.out.println("Course Name: " + course.getCourseName());
				System.out.println("Tuition: " + course.getTuition());
				break;
			}
		}

		if (!valid) {
			System.out.println("Wrong CourseID details");
		}
	}
}
