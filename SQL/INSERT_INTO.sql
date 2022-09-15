

INSERT INTO `test`.`autor`
(`ID`,
`Name`,
`Vorname`)
VALUES
(1,"Wolf","Jack"),
(2,"Brecht","Fritz"),
(3,"Wolkow","Sergej"),
(4,"Wedding","Darija");


INSERT INTO `test`.`buch`
(`ISBN`,
`autoren_id`,
`Titel`)
VALUES
("978-3-16-148410-0", 3,"Von Mensch und Maüsen"),
("988-3-16-148410-0", 4,"Mein Weg zum Mars"),
("978-3-16-148410-1", 1,"Aus dem Leben einer Gastwirts");


INSERT INTO `test`.`buchladen`
(`Umsatzsteuer_id`,
`Strasse`,
`Ort`,
`PLZ`)
VALUES
("DE263318000", "Kochstrasse 114", "Leipzig", 04275 ), 
("DE263318001", "Klosterweg 28", "Karlsruhe", 76131 ),
("DE263318002", "Charles-de-Gaulle-Straße 10", "Bonn", 53113 );


INSERT INTO `test`.`bestand`
(`Umsatzsteuer_id`,
`ISBN`,
`ANZ`)
VALUES
("DE263318001", "978-3-16-148410-0", 23),
("DE263318001", "978-3-16-148410-1", 42),
("DE263318000", "978-3-16-148410-0", 10),
("DE263318002", "978-3-16-148410-0", 12),
("DE263318002", "978-3-16-148410-1", 5);
