

DROP DATABASE IF EXISTS test; 
CREATE DATABASE test;
USE test;

CREATE TABLE Autor (ID INT(3) PRIMARY KEY, Name varchar(50), Vorname varchar(50));
CREATE TABLE Buch (ISBN varchar(255) PRIMARY KEY, autoren_id int(3), Titel varchar(255), FOREIGN KEY(autoren_id) references autor(id) on delete CASCADE);
CREATE TABLE Buchladen(Umsatzsteuer_id varchar(255) PRIMARY KEY, Strasse varchar(255), Ort varchar(255), PLZ int(5));
CREATE TABLE Bestand(Umsatzsteuer_id varchar(255), ISBN varchar(255), ANZ int(4), FOREIGN KEY(Umsatzsteuer_id) references Buchladen(Umsatzsteuer_id)on delete CASCADE, FOREIGN KEY(ISBN) references Buch(ISBN)on delete CASCADE)


