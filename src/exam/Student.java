/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author user
 */
public class Student {
    String enrollid;
    String fullname;
    int age;

    public Student() {
    }

    public Student(String enrollid, String fullname, int age) {
        this.enrollid = enrollid;
        this.fullname = fullname;
        this.age = age;
    }

    public String getEnrollid() {
        return enrollid;
    }

    public void setEnrollid(String enrollid) {
        this.enrollid = enrollid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
