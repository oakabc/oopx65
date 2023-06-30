/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author chanakarnkin
 */
public class Author {
    
    private String name;
    private String email;
    private char gender;
   
    public Author (String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
            return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
    
        return gender;
    }
    public String toString () {
        
        return String.format("Author[name=%s, email=%s, gender=%s]", name,email,gender);
    }
    
}
