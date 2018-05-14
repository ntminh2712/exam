/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Controller {
    
        ArrayList<Student> studentlist = new ArrayList<>();
    public void addStudent(){
    
        while(true){
            Scanner scanid = new Scanner (System.in);
            System.out.println("Please enter EnrolID :");
            String newid = scanid.nextLine();
            Scanner scanname = new Scanner (System.in);
            System.out.println("Please enter Full Name  :");
            String newname = scanname.nextLine();
            Scanner scanage= new Scanner (System.in);
            System.out.println("Please enter Age  :");
            int newage = scanage.nextInt();
            Student newstudent = new Student(newid, newname, newage);
            if(studentlist.add(newstudent)){
                System.out.println("Add Succesful");
            }else {
                System.out.println("Đã xảy ra lỗi !");
            }
            break;
        }
    }
    
    public void save () throws IOException{
            File file = new File("student.dat");
            file.createNewFile();
            FileWriter writer = new FileWriter(file,true);
            for(int i = 0;i < studentlist.size();i++){
            writer.append(studentlist.get(i).getEnrollid()+"\t      "+studentlist.get(i).getFullname()+"\t     "+studentlist.get(i).getAge()+"\n");
            }
            writer.flush();
            writer.close();
            System.out.println("Save Succesful");
}
    public void showStudents() throws IOException{
        System.out.println("EnrilID\t"+"- Full Name\t"+"- Age\n");
        System.out.println("-------"+"  "+ "----------"+"     "+"----");
        FileReader readStudent = new FileReader("student.dat");
        int i;
        while ((i = readStudent.read()) != -1) {
            System.out.print((char) i);
        }
        readStudent.close();
       }
}
