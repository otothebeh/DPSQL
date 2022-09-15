use test;

#AUFGABE 1 
SELECT Buch.Titel 
FROM Buch 
INNER JOIN bestand ON bestand.ISBN = buch.ISBN
INNER JOIN buchladen ON buchladen.Umsatzsteuer_id = bestand.Umsatzsteuer_id
WHERE Strasse = "Klosterweg 28";

#AUFGABE 2
SELECT Buchladen.*
FROM Buchladen
INNER JOIN bestand ON buchladen.Umsatzsteuer_id = bestand.Umsatzsteuer_id
INNER JOIN buch ON bestand.ISBN = buch.ISBN
INNER JOIN autor ON autor.id = buch.autoren_id
WHERE Name = "Wolf" AND Vorname = "Jack";

