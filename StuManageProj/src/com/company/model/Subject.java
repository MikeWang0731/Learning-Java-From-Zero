package com.company.model;

public class Subject {
    // 学科名称、编号、学制年限
    private String subjectName;
    private String subjectNo;
    private int subjectDuration;
    private Student[] myStudents;
    private int studentNum;

    // 无参构造
    public Subject() {
    }
    // 有参构造(3参数)
    public Subject(String subjectName, String subjectNo, int subjectDuration) {
        this.subjectName = subjectName;
        this.subjectNo = subjectNo;
        // 使用setter方法可以保证年份输入正确
        this.setSubjectDuration(subjectDuration);
    }
    // 有参构造(5参数)
    public Subject(String subjectName, String subjectNo, int subjectDuration, Student[] myStudents, int studentNum) {
        this.subjectName = subjectName;
        this.subjectNo = subjectNo;
        this.subjectDuration = subjectDuration;
        this.myStudents = myStudents;
        this.studentNum = studentNum;
    }

    // Getter/Setter
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectDuration() {
        return subjectDuration;
    }

    public void setSubjectDuration(int subjectDuration) {
        if (subjectDuration > 0) {
            this.subjectDuration = subjectDuration;
        } else {
            System.out.println("Duration Must Bigger Than 0!");
        }
    }

    public Student[] getMyStudents() {
        if (this.myStudents == null) {
            // 如果没有初始化，那就先初始化
            this.myStudents = new Student[10];
        }
        return myStudents;
    }

    public void setMyStudents(Student[] myStudents) {
        this.myStudents = myStudents;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    // 打印专业有关信息
    public String info() {
        StringBuilder builder = new StringBuilder();
        builder.append("专业信息如下：\n");
        builder.append("专业名称：" + this.getSubjectName() + "\n");
        builder.append("专业编号：" + this.getSubjectNo() + "\n");
        builder.append("专业年限：" + this.getSubjectDuration() + "年" + "\n");
        return builder.toString();
    }

    public void addStudent(Student student) {
        // 1. 首先将学生保存到数组
        // 2. 将学生个数保存起来
        for (int i = 0; i < this.getMyStudents().length; i++) {
            if (this.getMyStudents()[i] == null) {
                this.getMyStudents()[i] = student;
                this.studentNum = i + 1;
                break;
            }
        }
    }
}
