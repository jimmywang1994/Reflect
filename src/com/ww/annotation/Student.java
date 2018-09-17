package com.ww.annotation;

@Table("tb_student")
public class Student {
    @WWField(columnName = "id",type = "int",length = 10)
    private String id;
    @WWField(columnName = "studentName",type = "varchar",length = 32)
    private String studentName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
