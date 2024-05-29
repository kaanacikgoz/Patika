-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee (
    id INTEGER PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE NOT NULL,
    email VARCHAR(100) NOT NULL
)

-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Jobye', '1903-07-08', 'jantoniou0@elegantthemes.com');
insert into employee (id, name, birthday, email) values (2, 'Melody', '1912-08-05', 'mlikely1@wiley.com');
insert into employee (id, name, birthday, email) values (3, 'Lynea', '1960-03-02', 'lharker2@phoca.cz');
insert into employee (id, name, birthday, email) values (4, 'Wallace', '1915-10-07', 'wmcgennis3@fema.gov');
insert into employee (id, name, birthday, email) values (5, 'Carie', '1936-12-12', 'choulston4@howstuffworks.com');
insert into employee (id, name, birthday, email) values (6, 'Gilbert', '1937-05-30', 'gmcnaughton5@wp.com');
insert into employee (id, name, birthday, email) values (7, 'Berkie', '1901-08-04', 'bumfrey6@alibaba.com');
insert into employee (id, name, birthday, email) values (8, 'Belita', '1978-11-06', 'bsermin7@sogou.com');
insert into employee (id, name, birthday, email) values (9, 'Tawsha', '1995-09-15', 'tdemarco8@addtoany.com');
insert into employee (id, name, birthday, email) values (10, 'Melita', '1983-07-04', 'mcamps9@altervista.org');
insert into employee (id, name, birthday, email) values (11, 'Shelia', '1956-11-26', 'sferrarinia@lycos.com');
insert into employee (id, name, birthday, email) values (12, 'Ronna', '1991-08-02', 'rquinetb@nymag.com');
insert into employee (id, name, birthday, email) values (13, 'Tye', '1916-10-05', 'tjakubowskyc@apache.org');
insert into employee (id, name, birthday, email) values (14, 'Berti', '1977-10-12', 'bvanweedenburgd@macromedia.com');
insert into employee (id, name, birthday, email) values (15, 'Gypsy', '1963-03-29', 'gkerfoote@businessinsider.com');
insert into employee (id, name, birthday, email) values (16, 'Cordelia', '1922-02-09', 'clebrumf@t-online.de');
insert into employee (id, name, birthday, email) values (17, 'Sharleen', '1970-09-15', 'smoulsdaleg@instagram.com');
insert into employee (id, name, birthday, email) values (18, 'Patrice', '1953-04-06', 'pscaddonh@netlog.com');
insert into employee (id, name, birthday, email) values (19, 'Aylmar', '1980-10-22', 'agoslini@usatoday.com');
insert into employee (id, name, birthday, email) values (20, 'Chuck', '1909-01-13', 'cruossj@aboutads.info');
insert into employee (id, name, birthday, email) values (21, 'Calli', '1958-04-11', 'cgagek@artisteer.com');
insert into employee (id, name, birthday, email) values (22, 'Marjorie', '1911-02-19', 'mmattheisl@wunderground.com');
insert into employee (id, name, birthday, email) values (23, 'Britni', '1939-03-05', 'bblaszczykm@shutterfly.com');
insert into employee (id, name, birthday, email) values (24, 'Joline', '1972-04-07', 'jgarsiden@ihg.com');
insert into employee (id, name, birthday, email) values (25, 'Kimbra', '1912-12-23', 'klegendreo@sitemeter.com');
insert into employee (id, name, birthday, email) values (26, 'Sarge', '1935-09-07', 'smiddletonp@cmu.edu');
insert into employee (id, name, birthday, email) values (27, 'Christophe', '1921-06-04', 'chowisonq@google.it');
insert into employee (id, name, birthday, email) values (28, 'Barthel', '1988-01-20', 'bgritlandr@xinhuanet.com');
insert into employee (id, name, birthday, email) values (29, 'Dell', '1997-12-26', 'ddaouzes@state.tx.us');
insert into employee (id, name, birthday, email) values (30, 'Val', '1923-05-27', 'vtutet@gmpg.org');
insert into employee (id, name, birthday, email) values (31, 'Gavra', '1960-11-10', 'glangstoneu@foxnews.com');
insert into employee (id, name, birthday, email) values (32, 'Sonia', '1906-06-01', 'sritchingsv@usa.gov');
insert into employee (id, name, birthday, email) values (33, 'Dev', '1997-11-29', 'drallingw@unesco.org');
insert into employee (id, name, birthday, email) values (34, 'Ester', '1960-09-09', 'egoodsellx@buzzfeed.com');
insert into employee (id, name, birthday, email) values (35, 'Kizzee', '1919-09-11', 'karnaudiy@cmu.edu');
insert into employee (id, name, birthday, email) values (36, 'Trueman', '1974-08-15', 'tsherstonz@sciencedirect.com');
insert into employee (id, name, birthday, email) values (37, 'Sergio', '1935-07-01', 'sgunther10@sourceforge.net');
insert into employee (id, name, birthday, email) values (38, 'Rozanne', '1909-11-07', 'rtimmis11@yandex.ru');
insert into employee (id, name, birthday, email) values (39, 'Berti', '1933-02-09', 'bcawcutt12@skyrock.com');
insert into employee (id, name, birthday, email) values (40, 'Allyn', '1985-04-17', 'aattride13@behance.net');
insert into employee (id, name, birthday, email) values (41, 'Teddie', '1995-05-11', 'tgraybeal14@java.com');
insert into employee (id, name, birthday, email) values (42, 'Lonna', '1916-06-29', 'lolehane15@usatoday.com');
insert into employee (id, name, birthday, email) values (43, 'Svend', '1924-12-24', 'sruske16@si.edu');
insert into employee (id, name, birthday, email) values (44, 'Cameron', '1925-04-22', 'cmcateer17@dell.com');
insert into employee (id, name, birthday, email) values (45, 'Kareem', '1907-02-13', 'kkynforth18@wikispaces.com');
insert into employee (id, name, birthday, email) values (46, 'Tani', '1963-11-06', 'taukland19@ameblo.jp');
insert into employee (id, name, birthday, email) values (47, 'Rozalin', '1976-10-04', 'rswadon1a@amazon.co.jp');
insert into employee (id, name, birthday, email) values (48, 'Ignacio', '1943-08-17', 'imixhel1b@mlb.com');
insert into employee (id, name, birthday, email) values (49, 'Kasey', '1928-09-18', 'kvann1c@51.la');
insert into employee (id, name, birthday, email) values (50, 'Janka', '1929-06-27', 'jlace1d@acquirethisname.com');

-- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET name = 'id10'
WHERE id=10;

UPDATE employee
SET birthday = '2000-02-20'
WHERE id>45;

UPDATE employee
SET id=0
WHERE name='Nilson';

UPDATE employee
SET id = 51
WHERE email ='bwhittier1@lulu.com';

UPDATE employee
SET email = 'test@gmail.com'
WHERE name ILIKE 'a%' AND birthday<'1923-10-29';

-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE name = 'id10';

DELETE FROM employee
WHERE id=0;

DELETE FROM employee
WHERE email LIKE 'b%a%m';

DELETE FROM employee
WHERE birthday>'2000-01-01';

DELETE FROM employee
WHERE name ILIKE 'd%' AND email ILIKE 'd%a%m';