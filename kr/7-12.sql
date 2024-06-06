#7. В подключенном MySQL репозитории создать базу данных “Друзья человека” - GBkr
#8. Создать таблицы с иерархией из диаграммы в БД

create database GBkr;
use GBkr;

CREATE TABLE Animals
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    GroupName VARCHAR(20) NOT NULL
);
 
CREATE TABLE Pets
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    AnimalsId INT,
    PetsName VARCHAR(20) NOT NULL,
    FOREIGN KEY (AnimalsId)  REFERENCES Animals (Id)
);

CREATE TABLE PackAnimals
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    AnimalsId INT,
    PackAnimalsName VARCHAR(20) NOT NULL,
    FOREIGN KEY (AnimalsId)  REFERENCES Animals (Id)
);

CREATE TABLE Dogs
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    PetsId INT,
    DogName VARCHAR(20) NOT NULL,
    FOREIGN KEY (PetsId)  REFERENCES Pets (Id)
);

CREATE TABLE Cats
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    PetsId INT,
    CatName VARCHAR(20) NOT NULL,
    FOREIGN KEY (PetsId)  REFERENCES Pets (Id)
);

CREATE TABLE Hamsters
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    PetsId INT,
    HamsterName VARCHAR(20) NOT NULL,
    FOREIGN KEY (PetsId)  REFERENCES Pets (Id)
);

CREATE TABLE Horses
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    PackAnimalsId INT,
    HorseName VARCHAR(20) NOT NULL,
    FOREIGN KEY (PackAnimalsId)  REFERENCES Pets (Id)
);

CREATE TABLE Camels
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    PackAnimalsId INT,
    CamelName VARCHAR(20) NOT NULL,
    FOREIGN KEY (PackAnimalsId)  REFERENCES Pets (Id)
);

CREATE TABLE Donhkeys
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    PackAnimalsId INT,
    DonhkeyName VARCHAR(20) NOT NULL,
    FOREIGN KEY (PackAnimalsId)  REFERENCES Pets (Id)
);


#insert into animals (GroupName) Values ('Pets'), ('PackAnimals');
#insert into Pets (GroupName) Values ('Pets'), ('PackAnimals');
#insert into Pets (AnimalsId, PetsName) Values (1, 'Dogs'), (1, 'Cats'), (1, 'Hamsters');
#insert into PackAnimals (AnimalsId, PackAnimalsName) Values (2, 'Horses'), (2, 'Camels'), (2, 'Donhkeys');


#9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения

#ALTER TABLE Dogs ADD CMD VARCHAR(50);
#ALTER TABLE Dogs ADD BirthDay DATE;
#ALTER TABLE Cats ADD CMD VARCHAR(50);
#ALTER TABLE Cats ADD BirthDay DATE;
#ALTER TABLE Hamsters ADD CMD VARCHAR(50);
#ALTER TABLE Hamsters ADD BirthDay DATE;
#ALTER TABLE Horses ADD CMD VARCHAR(50);
#ALTER TABLE Horses ADD BirthDay DATE;
#ALTER TABLE Camels ADD CMD VARCHAR(50);
#ALTER TABLE Camels ADD BirthDay DATE;
#ALTER TABLE Donhkeys ADD CMD VARCHAR(50);
#ALTER TABLE Donhkeys ADD BirthDay DATE;

#insert into Dogs (PetsId, DogName, BirthDay, CMD) Values (1, 'Rich', '2020-01-01', 'sitdownpls'), (1, 'Rox', '2021-01-01', 'sitdownpls'), (1, 'Poop', '2024-01-01', 'sitdownpls');
#insert into Cats (PetsId, CatName, BirthDay, CMD) Values (2, 'Lil', '2020-01-01', 'sitdownpls'), (2, 'Lol', '2021-01-01', 'sitdownpls'), (2, 'Jil', '2024-01-01', 'sitdownpls');
#insert into Hamsters (PetsId, HamsterName, BirthDay, CMD) Values (3, 'Lop', '2020-01-01', 'sitdownpls'), (3, 'Hop', '2021-01-01', 'sitdownpls'), (3, 'Rop', '2024-01-01', 'sitdownpls');
#insert into Horses (PackAnimalsId, HorseName, BirthDay, CMD) Values (1, 'Lir', '2020-01-01', 'sitdownpls'), (1, 'Dir', '2021-01-01', 'sitdownpls'), (1, 'Mir', '2024-01-01', 'sitdownpls');
#insert into Camels (PackAnimalsId, CamelName, BirthDay, CMD) Values (2, 'Kop', '2020-01-01', 'sdogsitdownpls'), (2, 'Das', '2021-01-01', 'sitdownpls'), (2, 'Gas', '2024-01-01', 'sitdownpls');
#insert into Donhkeys (PackAnimalsId, DonhkeyName, BirthDay, CMD) Values (3, 'Goh', '2020-01-01', 'sitdownpls'), (3, 'Gik', '2021-01-01', 'sitdownpls'), (3, 'Mik', '2024-01-01', 'sitdownpls');





#10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

#DROP TABLE Camels;
#DELETE FROM `packanimals` WHERE (`Id` = '2');




#11.Создать новую таблицу “молодые животные” в которую попадут все
#животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
#до месяца подсчитать возраст животных в новой таблице

#create table YoungAnimals as 
#SELECT DogName as AnimalName, BirthDay, (SELECT TIMESTAMPDIFF( MONTH, BirthDay, CURDATE( ) )) AS ageMonth FROM gbkr.dogs where DATE(BirthDay) BETWEEN '2019-01-01' AND '2022-01-01'
#UNION
#SELECT CatName as AnimalName, BirthDay, (SELECT TIMESTAMPDIFF( MONTH, BirthDay, CURDATE( ) )) AS ageMonth FROM gbkr.cats where DATE(BirthDay) BETWEEN '2019-01-01' AND '2022-01-01'
#union
#SELECT HamsterName as AnimalName, BirthDay, (SELECT TIMESTAMPDIFF( MONTH, BirthDay, CURDATE( ) )) AS ageMonth FROM gbkr.hamsters where DATE(BirthDay) BETWEEN '2019-01-01' AND '2022-01-01'
#UNION
#SELECT HorseName as AnimalName, BirthDay, (SELECT TIMESTAMPDIFF( MONTH, BirthDay, CURDATE( ) )) AS ageMonth FROM gbkr.Horses where DATE(BirthDay) BETWEEN '2019-01-01' AND '2022-01-01'
#UNION
#SELECT DonhkeyName as AnimalName, BirthDay, (SELECT TIMESTAMPDIFF( MONTH, BirthDay, CURDATE( ) )) AS ageMonth FROM gbkr.donhkeys where DATE(BirthDay) BETWEEN '2019-01-01' AND '2022-01-01';

#ALTER TABLE younganimals add Id INT PRIMARY KEY AUTO_INCREMENT; - опционально



#12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
#прошлую принадлежность к старым таблицам.

#SELECT (Select Groupname from animals where animals.id = (Select animalsid from pets where petsid = id))as Animal, (Select PetsName From Pets where PetsId =  id) AS AnimalID, DogName as AnimalName, BirthDay, CMD FROM gbkr.dogs
#UNION
#SELECT (Select Groupname from animals where animals.id = (Select animalsid from pets where petsid = id))as Animal, (Select PetsName From Pets where PetsId =  id) AS AnimalID, CatName as AnimalName, BirthDay, CMD FROM gbkr.cats
#union
#SELECT (Select Groupname from animals where animals.id = (Select animalsid from pets where petsid = id))as Animal, (Select PetsName From Pets where PetsId =  id) AS AnimalID, HamsterName as AnimalName, BirthDay, CMD FROM gbkr.hamsters
#UNION
#SELECT (Select Groupname from animals where animals.id = (Select animalsid from PackAnimals where PackAnimalsId = id))as Animal, (Select PackAnimalsName From PackAnimals where PackAnimalsId =  id) AS AnimalID, HorseName as AnimalName, BirthDay, CMD FROM gbkr.Horses
#UNION
#SELECT (Select Groupname from animals where animals.id = (Select animalsid from PackAnimals where PackAnimalsId = id))as Animal, (Select PackAnimalsName From PackAnimals where PackAnimalsId =  id) AS AnimalID, donhkeyName as AnimalName, BirthDay, CMD FROM gbkr.donhkeys;