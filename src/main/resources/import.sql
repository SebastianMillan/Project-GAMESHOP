INSERT INTO USUARIO (DNI, NOMBRE, APELLIDOS, USERNAME, EMAIL, PASSWORD, TELEFONO, FECHA_NACIM, ADMIN) VALUES ('123A','Sebastián','Millán Ordóñez','user', 'millan.orseb23@triana.salesianos.edu','1234','123123123','2000-07-26',true);

--insert into videojuego (id, calificacion, descripcion, empresa, fecha_lanzamiento, imagen, nombre, precio_base, es_edic_coleccionista, es_para_reservar, genero, pegi, tipo_desarrollo) 
--values (1, 4.5, 'Un clásico de los videojuegos de plataformas.', 'Nintendo', '1985-09-13', 'mario.jpg', 'Super Mario Bros.', 49.99, false, true, 1, 3, 2);

ALTER SEQUENCE hibernate_sequence RESTART WITH 1000;