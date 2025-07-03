/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.format.DateTimeFormatter;
/**
 *
 * @author bycha
 */
public class Leche_condesada {
    
    public String nombre;
    public String hash;
    private String Email;
    public DateTimeFormatter birthdate;
    public int phone;

    public Leche_condesada(String nombre, String hash, String Email, DateTimeFormatter birthdate, int phone) {
        this.nombre = nombre;
        this.hash = hash;
        this.Email = Email;
        this.birthdate = birthdate;
        this.phone = phone;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setBirthdate(DateTimeFormatter birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHash() {
        return hash;
    }

    public DateTimeFormatter getBirthdate() {
        return birthdate;
    }

    public int getPhone() {
        return phone;
    }

   
  
}
