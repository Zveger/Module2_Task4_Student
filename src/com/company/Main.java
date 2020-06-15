/* Module 2. Task 4
 * Classname: Main
 *
 * Version 1
 *
 * Herman Zviertsev,  NTU KhPI
 *
 *
3. Create a class Student  - 25 fields.
4.  Create a builder for the class Student.
 */
package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	Student leon = new Student("Leon", "Verein","Ivanovich", Gender.MALE,
            LocalDate.of(2000,3,31),
            "Kharkiv, Sumska, 21","+380663625899","loe@gmail.ru",
            true, "Philipova A.M.", true,
            Speciality.SOFTWARE_DEVELOPMENT_OF_IS,Department.SAIT, "KN-35b",
            "KN-35b-an", "KN-12533566", "XA№555533",
            true,
            EducationalMaintenanceAllowance.NO,
            true, true,ForeignLanguage.FRENCH,
            false, SportSection.TENNIS, 3.2);
	Student victor = new Student.Builder()
            .setFirstName("Viktor")
            .setLastName("Igorenko")
            .setPatronymic("Alexandrovich")
            .buid();
        System.out.println(victor);
    }
}
