package pl.coderslab;

import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

    public static void main(String[] args) {

        /* CREATE DATABASE

        create database workshop2 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
        use workshop2;
        create table users (
        id int(11) primary key not null auto_increment,
        email varchar(255) not null unique,
        username varchar(255) not null,
        password varchar(60) not null
        );
         */

        //Dodawanie uzytkownika
        User maciej = new User("Patrycja", "Pysi22@wp.pl", "wodka");

        //Tworzenie obiektu USERDAO
        UserDao userDao = new UserDao();

        //Tworzenie uzytkownia w bazie danych za pomoca DAO
        //userDao.createUser(maciej);

        System.out.println("__________________________________________________________________");

        //Wczytywanie Uzytkownika z bazy danych o id 3
        User maciejFromDatabase = userDao.read(5);

        //Zmiana maila dla wczesniej wczytanego uzytkownika
        maciejFromDatabase.setEmail("ZmianaMailaNaCos@GMAIL.COM");
        userDao.update(maciejFromDatabase);

        //Usuwanie Uzytkownika o danym id
        userDao.delete(1);
        System.out.println("__________________________________________________________________");
        //Lista wszystkich uzytkownikow

        User[] allUsers = userDao.findAll();
        for(User user: allUsers){
            if(!(user ==null)){
                System.out.println("User: " + user.getEmail());
            }

        }
    }
}
