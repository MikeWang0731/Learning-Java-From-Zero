package com.company.model;

public class Student {
    // 学号、姓名、性别、年龄
    private String studentID;
    private String studentName;
    private String studentGender;
    private int studentAge;

    public Student() {
    }

    public Student(String studentID, String studentName, String studentGender, int studentAge) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentGender = studentGender;
        // 使用setter方法确保年龄正确输入
        this.setStudentAge(studentAge);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if (studentAge > 17 && studentAge < 100) {
            this.studentAge = studentAge;
        } else {
            this.studentAge = 18;
        }
    }

    public String info() {
        StringBuilder builder = new StringBuilder();
        builder.append("学生信息：\n");
        builder.append("学号：" + this.getStudentID() + "\n");
        builder.append("姓名：" + this.getStudentName() + "\n");
        builder.append("性别：" + this.getStudentGender() + "\n");
        builder.append("年龄：" + this.getStudentAge() + "\n");
        return builder.toString();
    }

    /**
     * 学生自我介绍的方法
     *
     * @param subName     专业名称
     * @param subDuration 学制年限
     * @return StringBuilder.toString()
     */
    public String info(String subName, int subDuration) {
        StringBuilder builder = new StringBuilder();
        builder.append("学生信息和课程信息：\n");
        builder.append("学号：" + this.getStudentID() + "\n");
        builder.append("姓名：" + this.getStudentName() + "\n");
        builder.append("性别：" + this.getStudentGender() + "\n");
        builder.append("年龄：" + this.getStudentAge() + "\n");
        builder.append("所学专业：" + subName + "\n");
        builder.append("学制年限：" + subDuration + "\n");

        return builder.toString();
    }

    /**
     * 使用对象传入的方式打印学生的信息
     *
     * @param subject 课程对象
     * @return 学生信息
     */
    public String info(Subject subject) {
        StringBuilder builder = new StringBuilder();
        builder.append("学生信息和课程信息：\n");
        builder.append("学号：" + this.getStudentID() + "\n");
        builder.append("姓名：" + this.getStudentName() + "\n");
        builder.append("性别：" + this.getStudentGender() + "\n");
        builder.append("年龄：" + this.getStudentAge() + "\n");
        builder.append("所学专业：" + subject.getSubjectName() + "\n");
        builder.append("专业代码：" + subject.getSubjectNo() + "\n");
        builder.append("学制年限：" + subject.getSubjectDuration() + "\n");

        return builder.toString();
    }
}
