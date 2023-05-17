INSERT INTO USUARIO (ID, DNI, NOMBRE, APELLIDOS, USERNAME, EMAIL, PASSWORD, TELEFONO, FECHA_NACIM, ADMIN) VALUES (80,'32132132Z','Sebastián','Millán Ordóñez','admin','millan.orseb23@triana.salesianos.edu','{bcrypt}$2a$10$RlcLSXIvm8VDjEBq19oB7OFEB3sJnxvJETStFrBeHwU1pYc0EGTTa','123123123','2000-07-26',true);
INSERT INTO USUARIO (ID, DNI, NOMBRE, APELLIDOS, USERNAME, EMAIL, PASSWORD, TELEFONO, FECHA_NACIM, ADMIN) VALUES (81,'12345678A', 'Juan', 'Pérez García', 'user', 'juanpg@email.com', '{bcrypt}$2a$10$bnFKD2JlOON0nuv94.KPqumWUSa9LORejpDtcumz/Vlg/diEjajzi', '555123456', '1990-01-01', false);
INSERT INTO USUARIO (ID, DNI, NOMBRE, APELLIDOS, USERNAME, EMAIL, PASSWORD, TELEFONO, FECHA_NACIM, ADMIN) VALUES (82,'87654321B', 'María', 'López Pérez', 'marialp', 'marialp@email.com', '{bcrypt}$2a$10$bnFKD2JlOON0nuv94.KPqumWUSa9LORejpDtcumz/Vlg/diEjajzi', '666987654', '1985-05-15', false);
INSERT INTO USUARIO (ID, DNI, NOMBRE, APELLIDOS, USERNAME, EMAIL, PASSWORD, TELEFONO, FECHA_NACIM, ADMIN) VALUES (83,'11111111A', 'Pedro', 'González Torres', 'pedrog', 'pedrog@email.com', '{bcrypt}$2a$10$RlcLSXIvm8VDjEBq19oB7OFEB3sJnxvJETStFrBeHwU1pYc0EGTTa', '777333444', '1988-10-31', true);
INSERT INTO USUARIO (ID, DNI, NOMBRE, APELLIDOS, USERNAME, EMAIL, PASSWORD, TELEFONO, FECHA_NACIM, ADMIN) VALUES (84,'22222222B', 'Ana', 'Sánchez Rodríguez', 'anasr', 'anasr@email.com', '{bcrypt}$2a$10$RlcLSXIvm8VDjEBq19oB7OFEB3sJnxvJETStFrBeHwU1pYc0EGTTa', '666111222', '1995-07-22', true);
INSERT INTO USUARIO (ID, DNI, NOMBRE, APELLIDOS, USERNAME, EMAIL, PASSWORD, TELEFONO, FECHA_NACIM, ADMIN) VALUES (85,'33333333C', 'Luis', 'García Fernández', 'luisgf', 'luisgf@email.com', '{bcrypt}$2a$10$bnFKD2JlOON0nuv94.KPqumWUSa9LORejpDtcumz/Vlg/diEjajzi', '555777888', '1992-12-18', false);
INSERT INTO USUARIO (ID, DNI, NOMBRE, APELLIDOS, USERNAME, EMAIL, PASSWORD, TELEFONO, FECHA_NACIM, ADMIN) VALUES (86,'44444444D', 'Carmen', 'Martínez García', 'carmeng', 'carmeng@email.com', '{bcrypt}$2a$10$bnFKD2JlOON0nuv94.KPqumWUSa9LORejpDtcumz/Vlg/diEjajzi', '555888999', '1998-03-09', false);
INSERT INTO USUARIO (ID, DNI, NOMBRE, APELLIDOS, USERNAME, EMAIL, PASSWORD, TELEFONO, FECHA_NACIM, ADMIN) VALUES (87,'66666666F', 'Marta', 'González Pérez', 'martagp', 'martagp@email.com', '{bcrypt}$2a$10$RlcLSXIvm8VDjEBq19oB7OFEB3sJnxvJETStFrBeHwU1pYc0EGTTa', '777666555', '1991-09-28', true);

INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (1, 9.0, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (3, 10.0, 'Videojuego de aventuras en mundo abierto', 'Nintendo', '2017-03-03', 'https://media.vandal.net/t200/43030/the-legend-of-zelda-breath-of-the-wild-201732131429_1.jpg', 'The Legend of Zelda: Breath of the Wild', 59.99, true, false, 'AVENTURA', 'SIETE', 'AAA', 'Nintendo Switch');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (2, 8.5, 'Videojuego de acción en primera persona', 'Activision', '2019-10-25', 'https://media.vandal.net/t200/73758/call-of-duty-modern-warfare-2019-2019823127419_1.jpg', 'Call of Duty: Modern Warfare', 49.99, true, true, 'DISPAROS', 'DIECIOCHO', 'AAA', 'Xbox One');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (4, 9.2, 'Un juego de rol épico con un vasto mundo abierto', 'CD Projekt', '2020-12-10', 'https://m.media-amazon.com/images/I/81Q8u826HqL._AC_SL1500_.jpg', 'Cyberpunk 2077', 59.99, true, false, 'RPG', 'DIECIOCHO', 'AAA', 'Xbox one');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (5, 9.0, 'Un juego de aventuras y acción en tercera persona', 'Rockstar Games', '2018-10-26', 'https://m.media-amazon.com/images/I/71SyRObF2yL._AC_SX385_.jpg', 'Red Dead Redemption 2', 59.99, true, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (6, 8.8, 'Un juego de estrategia en tiempo real', 'Blizzard Entertainment', '2010-07-27', 'https://i.3djuegos.com/juegos/2230/starcraft_2/fotos/ficha/starcraft_2-1684478.jpg', 'Starcraft II: Wings of Liberty', 29.99, false, false, 'ESTRATEGIA', 'DOCE', 'AAA', 'PC');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (7, 8.7, 'Un juego de simulación de construcción y gestión de ciudades', 'Paradox Interactive', '2021-03-16', 'https://i.3djuegos.com/juegos/11288/cities_skylines/fotos/ficha/cities_skylines-2708655.jpg', 'Cities: Skylines', 39.99, false, false, 'SIMULACION', 'TRES', 'INDIE', 'PC');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (8, 9.1, 'Un juego de sigilo y acción en tercera persona', 'Konami', '2015-09-01', 'https://m.media-amazon.com/images/I/71tI3My3nPS._AC_SX385_.jpg', 'Metal Gear Solid V: The Phantom Pain', 49.99, true, false, 'ACCION', 'DIECIOCHO', 'AAA', 'PlayStation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (9, 9.0, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (10, 8.0, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (11, 9.2, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (12, 7.8, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (13, 8.1, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (14, 9.2, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (15, 9.0, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (16, 10.0, 'Videojuego de aventuras en mundo abierto', 'Nintendo', '2017-03-03', 'https://media.vandal.net/t200/43030/the-legend-of-zelda-breath-of-the-wild-201732131429_1.jpg', 'The Legend of Zelda: Breath of the Wild', 59.99, true, false, 'AVENTURA', 'SIETE', 'AAA', 'Nintendo Switch');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (17, 8.5, 'Videojuego de acción en primera persona', 'Activision', '2019-10-25', 'https://media.vandal.net/t200/73758/call-of-duty-modern-warfare-2019-2019823127419_1.jpg', 'Call of Duty: Modern Warfare', 49.99, true, true, 'DISPAROS', 'DIECIOCHO', 'AAA', 'Xbox One');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (18, 9.2, 'Un juego de rol épico con un vasto mundo abierto', 'CD Projekt', '2020-12-10', 'https://m.media-amazon.com/images/I/81Q8u826HqL._AC_SL1500_.jpg', 'Cyberpunk 2077', 59.99, true, false, 'RPG', 'DIECIOCHO', 'AAA', 'Xbox one');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (19, 9.0, 'Un juego de aventuras y acción en tercera persona', 'Rockstar Games', '2018-10-26', 'https://m.media-amazon.com/images/I/71SyRObF2yL._AC_SX385_.jpg', 'Red Dead Redemption 2', 59.99, true, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (20, 9.0, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (21, 10.0, 'Videojuego de aventuras en mundo abierto', 'Nintendo', '2017-03-03', 'https://media.vandal.net/t200/43030/the-legend-of-zelda-breath-of-the-wild-201732131429_1.jpg', 'The Legend of Zelda: Breath of the Wild', 59.99, true, false, 'AVENTURA', 'SIETE', 'AAA', 'Nintendo Switch');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (22, 8.5, 'Videojuego de acción en primera persona', 'Activision', '2019-10-25', 'https://media.vandal.net/t200/73758/call-of-duty-modern-warfare-2019-2019823127419_1.jpg', 'Call of Duty: Modern Warfare', 49.99, true, true, 'DISPAROS', 'DIECIOCHO', 'AAA', 'Xbox One');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (23, 9.2, 'Un juego de rol épico con un vasto mundo abierto', 'CD Projekt', '2020-12-10', 'https://m.media-amazon.com/images/I/81Q8u826HqL._AC_SL1500_.jpg', 'Cyberpunk 2077', 59.99, true, false, 'RPG', 'DIECIOCHO', 'AAA', 'Xbox one');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (24, 9.0, 'Un juego de aventuras y acción en tercera persona', 'Rockstar Games', '2018-10-26', 'https://m.media-amazon.com/images/I/71SyRObF2yL._AC_SX385_.jpg', 'Red Dead Redemption 2', 59.99, true, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (25, 9.0, 'Videojuego de acción-aventura en mundo abierto', 'Ubisoft', '2020-11-10', 'https://media.vandal.net/t200/72324/assassins-creed-valhalla-202052220382111_1.jpg', 'Assassin''s Creed Valhalla', 59.99, false, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (26, 10.0, 'Videojuego de aventuras en mundo abierto', 'Nintendo', '2017-03-03', 'https://media.vandal.net/t200/43030/the-legend-of-zelda-breath-of-the-wild-201732131429_1.jpg', 'The Legend of Zelda: Breath of the Wild', 59.99, true, false, 'AVENTURA', 'SIETE', 'AAA', 'Nintendo Switch');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (27, 8.5, 'Videojuego de acción en primera persona', 'Activision', '2019-10-25', 'https://media.vandal.net/t200/73758/call-of-duty-modern-warfare-2019-2019823127419_1.jpg', 'Call of Duty: Modern Warfare', 49.99, true, true, 'DISPAROS', 'DIECIOCHO', 'AAA', 'Xbox One');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (28, 9.2, 'Un juego de rol épico con un vasto mundo abierto', 'CD Projekt', '2020-12-10', 'https://m.media-amazon.com/images/I/81Q8u826HqL._AC_SL1500_.jpg', 'Cyberpunk 2077', 59.99, true, false, 'RPG', 'DIECIOCHO', 'AAA', 'Xbox one');
INSERT INTO PRODUCTO(ID, CALIFICACION, DESCRIPCION, EMPRESA, FECHA_LANZAMIENTO, IMAGEN, NOMBRE, PRECIO_BASE, ES_EDIC_COLECCIONISTA, ES_PARA_RESERVAR, GENERO, PEGI, TIPO_DESARROLLO, PLATAFORMA) VALUES (29, 9.0, 'Un juego de aventuras y acción en tercera persona', 'Rockstar Games', '2018-10-26', 'https://m.media-amazon.com/images/I/71SyRObF2yL._AC_SX385_.jpg', 'Red Dead Redemption 2', 59.99, true, false, 'ACCION', 'DIECIOCHO', 'AAA', 'Playstation 4');

INSERT INTO VENTA (ID, FECHA, IMPORTE_TOTAL, IS_OPEN, USUARIO_ID) VALUES (40, '2022-05-01 15:30:00', 0, false, 80);
INSERT INTO VENTA (ID, FECHA, IMPORTE_TOTAL, IS_OPEN, USUARIO_ID) VALUES (41, '2023-05-08 10:00:00', 0, false, 81);
INSERT INTO VENTA (ID, FECHA, IMPORTE_TOTAL, IS_OPEN, USUARIO_ID) VALUES (42, '2022-04-30 18:45:00', 0, false, 80);
INSERT INTO VENTA (ID, FECHA, IMPORTE_TOTAL, IS_OPEN, USUARIO_ID) VALUES (43, '2022-06-15 12:00:00', 0, false, 86);
INSERT INTO VENTA (ID, FECHA, IMPORTE_TOTAL, IS_OPEN, USUARIO_ID) VALUES (44, '2022-12-01 18:45:00', 0, false, 82);
INSERT INTO VENTA (ID, FECHA, IMPORTE_TOTAL, IS_OPEN, USUARIO_ID) VALUES (45, '2021-03-13 18:45:00', 0, false, 84);
INSERT INTO VENTA (ID, FECHA, IMPORTE_TOTAL, IS_OPEN, USUARIO_ID) VALUES (46, '2023-02-15 12:20:00', 0, false, 87);
INSERT INTO VENTA (ID, FECHA, IMPORTE_TOTAL, IS_OPEN, USUARIO_ID) VALUES (47, '2021-01-22 19:30:00', 0, false, 86);

--INSERT INTO LINEA_VENTA(ID, CANTIDAD, IMPORTE, PRECIO_UNITARIO, PRODUCTO_ID, VENTA_ID) VALUES (60, 1, 20, (SELECT precio_unitario FROM producto p JOIN linea_venta lv WHERE p.id = lv.producto_id), 1, 40);
INSERT INTO LINEA_VENTA(ID, CANTIDAD, IMPORTE, PRECIO_UNITARIO, PRODUCTO_ID, VENTA_ID) VALUES (61, 2, 20, 20, 2, 40);
INSERT INTO LINEA_VENTA(ID, CANTIDAD, IMPORTE, PRECIO_UNITARIO, PRODUCTO_ID, VENTA_ID) VALUES (62, 1, 20, 20, 3, 41);
INSERT INTO LINEA_VENTA(ID, CANTIDAD, IMPORTE, PRECIO_UNITARIO, PRODUCTO_ID, VENTA_ID) VALUES (63, 3, 20, 20, 2, 41);
INSERT INTO LINEA_VENTA(ID, CANTIDAD, IMPORTE, PRECIO_UNITARIO, PRODUCTO_ID, VENTA_ID) VALUES (64, 1, 20, 20, 4, 41);
INSERT INTO LINEA_VENTA(ID, CANTIDAD, IMPORTE, PRECIO_UNITARIO, PRODUCTO_ID, VENTA_ID) VALUES (65, 2, 20, 20, 5, 42);
INSERT INTO LINEA_VENTA(ID, CANTIDAD, IMPORTE, PRECIO_UNITARIO, PRODUCTO_ID, VENTA_ID) VALUES (66, 1, 20, 20, 6, 43);

--SELECT precio_unitario FROM producto WHERE id = producto_id
--como se puede modificar el atributo de una pojo en funcion de otro atributo
--USAR UPDATE
--USAR SUBCONSULTA ESCALAR PARA EL VALOR

ALTER SEQUENCE hibernate_sequence RESTART WITH 1000;