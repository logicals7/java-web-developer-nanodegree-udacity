CREATE TABLE dog (
    id INTEGER AUTO_INCREMENT NOT NULL,
    name VARCHAR(20),
    breed VARCHAR(20),
    origin VARCHAR(20),
    PRIMARY KEY (id)
);


INSERT INTO dog (id, name, breed, origin)VALUES (1, 'Fluffy', 'Pomeranian', 'Mountain View, CA');
INSERT INTO dog (id, name, breed, origin)VALUES (2, 'Spot', 'Pit Bull', 'Austin, TX');
INSERT INTO dog (id, name, breed, origin)VALUES (3, 'Ginger', 'Cocker Spaniel', 'Kansas City, KS');
INSERT INTO dog (id, name, breed, origin)VALUES (4, 'Lady', 'Direwolf', 'The North');
INSERT INTO dog (id, name, breed, origin)VALUES (5, 'Sasha', 'Husky', 'Buffalo, NY');