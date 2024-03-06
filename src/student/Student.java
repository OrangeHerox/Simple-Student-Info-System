package student;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Jiro Mendador
 */
public class Student {

    String firstName, middleName, lastName;
    String homeAddress, permanentAddress, birthDate;
    String gender, status, nationality, religion, contactNum;
    String course, year, section;
    int studentNum;
    
    public Student() {
        firstName = "";
        middleName = "";
        lastName = "";
        homeAddress = "";
        permanentAddress = "";
        birthDate = "";
        gender = "";
        status = "";
        nationality = "";
        religion = "";
        contactNum = "";
        course = "";
        year = "";
        section = "";
    }
    
    public void setStudentNum(int studentNo) {
        this.studentNum = studentNo;
    }
    
    public void setFirstName(String fName) {
        this.firstName = fName;
    }
    
    public void setMiddleName(String MName) {
        this.middleName = MName;
    }
    
    public void setLastName(String lName) {
        this.lastName = lName;
    }
    
    public void setHomeAddress(String hAddress) {
        this.homeAddress = hAddress;
    }
    
    public void setPermanentAddress(String pAddress) {
        this.permanentAddress = pAddress;
    }
    
    public void setBirthdate(String bdate) {
        this.birthDate = bdate;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void setReligion(String religion) {
        this.religion = religion;
    }
    
    public void setContactNumber(String cNumber) {
        this.contactNum = cNumber;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    
    public void setSection(String sec) {
        this.section = sec;
    }
    
    public void setStudent() {
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM dbSCHOOL.tblStudent_Records WHERE student_no = ?;");
            statement.setInt(1,getStudentNum());
            ResultSet result = statement.executeQuery();
            
            while(result.next()) {
                firstName = result.getString("first_name");
                middleName = result.getString("middle_name");
                lastName = result.getString("last_name");
                homeAddress = result.getString("home_address");
                permanentAddress = result.getString("permanent_address");
                birthDate = result.getString("birthdate");
                gender = result.getString("gender");
                status = result.getString("status");
                nationality = result.getString("nationality");
                religion = result.getString("religion");
                contactNum = result.getString("contact_no");
                course = result.getString("course");
                year = result.getString("year");
                section = result.getString("section");
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteStudent() {
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement statement = con.prepareStatement("DELETE FROM dbSCHOOL.tblStudent_Records WHERE student_no = ?;");
            statement.setInt(1,getStudentNum());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateStudent() {
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement statement = con.prepareStatement("UPDATE dbschool.tblstudent_records SET " +
                    "    first_name = ?," +
                    "    middle_name = ?," +
                    "    last_name = ?," +
                    "    home_address = ?," +
                    "    permanent_address = ?," +
                    "    birthdate = ?," +
                    "    gender = ?," +
                    "    status = ?," +
                    "    nationality = ?," + 
                    "    religion = ?," +
                    "    contact_no = ?," +
                    "	 course = ?," +
                    "    year = ?," +
                    "    section = ? WHERE student_no = ?;"
            );
            statement.setString(1,getFirstName());
            statement.setString(2,getMiddleName());
            statement.setString(3,getLastName());
            statement.setString(4,getHomeAddress());
            statement.setString(5,getPermanentAddress());
            statement.setDate(6,getBirthdate());
            statement.setString(7,getGender());
            statement.setString(8,getStatus());
            statement.setString(9,getNationality());
            statement.setString(10,getReligion());
            statement.setString(11,getContactNumber());
            statement.setString(12,getCourse());
            statement.setString(13,getYear());
            statement.setString(14,getSection());
            statement.setInt(15,getStudentNum());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addStudent() {
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement statement = con.prepareStatement("INSERT INTO dbschool.tblstudent_records VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            statement.setInt(1,getStudentNum());
            statement.setString(2,getFirstName());
            statement.setString(3,getMiddleName());
            statement.setString(4,getLastName());
            statement.setString(5,getHomeAddress());
            statement.setString(6,getPermanentAddress());
            statement.setDate(7,getBirthdate());
            statement.setString(8,getGender());
            statement.setString(9,getStatus());
            statement.setString(10,getNationality());
            statement.setString(11,getReligion());
            statement.setString(12,getContactNumber());
            statement.setString(13,getCourse());
            statement.setString(14,getYear());
            statement.setString(15,getSection());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isPresent() {
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM dbSCHOOL.tblStudent_Records WHERE student_no = ?;");
            statement.setInt(1,getStudentNum());
            ResultSet result = statement.executeQuery();
            if(result.next()) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  false;
    }
    
    public int getLastStudentNo() {
        int lastId = 1;
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM dbSCHOOL.tblStudent_Records ORDER BY student_no DESC LIMIT 1;");
            ResultSet result = statement.executeQuery();
            if(result.next()) {
                lastId += result.getInt("student_no");
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastId;
    }
    
    public int getStudentNum() {
        return studentNum;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getMiddleName() {
        return middleName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getHomeAddress() {
        return homeAddress;
    }
    
    public String getPermanentAddress() {
        return permanentAddress;
    }
    
    public Date getBirthdate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        try {
            date = dateFormat.parse(birthDate);
        } catch (ParseException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getNationality() {
        return nationality;
    }
    
    public String getReligion() {
        return religion;
    }
    
    public String getContactNumber() {
        return contactNum;
    }
    
    public String getCourse() {
        return course;
    }
    
    public String getYear() {
        return year;
    }
    
    public String getSection() {
        return section;
    }
}
