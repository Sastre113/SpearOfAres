
CREATE TABLE TB_EMPRESA (
	id_empresa VARCHAR2(36) NOT NULL UNIQUE,
	nombre VARCHAR2(100) NOT NULL,
	propietario VARCHAR2(100) NOT NULL,
	cantidad_empleados INT,
	fecha_creacion DATE NOT NULL,
	fecha_desaparicion DATE,
	PRIMARY KEY(id_empresa)
);

CREATE TABLE TB_EMPLEADO (
	id_empleado VARCHAR2(36) NOT NULL UNIQUE,
	dni VARCHAR2(9) NOT NULL,
	nombre VARCHAR2(100) NOT NULL,
	fecha_nacimiento DATE,
	PRIMARY KEY(id_empleado)
);

CREATE TABLE TB_REL_EMPRESA_EMPLEADO(
	id_relacion VARCHAR2(36) NOT NULL UNIQUE,
	id_empresa VARCHAR2(36) NOT NULL,
	id_empleado VARCHAR2(36) NOT NULL,
	tipo_puesto VARCHAR2(50),
	fecha_alta DATE NOT NULL,
	fecha_baja DATE,
	PRIMARY KEY(id_relacion),
	FOREIGN KEY (id_empresa) REFERENCES TB_EMPRESA(id_empresa) ON DELETE CASCADE,
	FOREIGN KEY (id_empleado) REFERENCES TB_EMPLEADO(id_empleado) ON DELETE CASCADE

);

INSERT INTO TB_EMPRESA (id_empresa, nombre, propietario, cantidad_empleados, fecha_creacion, fecha_desaparicion) VALUES ('d6503c52-7c8f-11ec-90d6-0242ac120003', 'Black-Mesa', 'EEUU',1500,'1942-06-01',null);
INSERT INTO TB_EMPRESA (id_empresa, nombre, propietario, cantidad_empleados, fecha_creacion, fecha_desaparicion) VALUES ('fa6ff6f4-7c8f-11ec-90d6-0242ac120003', 'Aperture-Science', 'EEUU',632,'1945-09-01',null);
INSERT INTO TB_EMPRESA (id_empresa, nombre, propietario, cantidad_empleados, fecha_creacion, fecha_desaparicion) VALUES ('1b1ca136-7c90-11ec-90d6-0242ac120003', 'Microsoft', 'Bill Gates',181000,'1975-04-04', null);

INSERT INTO TB_EMPLEADO (id_empleado, dni, nombre, fecha_nacimiento) VALUES ('c059d9ac-7c90-11ec-90d6-0242ac120003', '00000000T', 'Miguel'			,'1993-02-18');
INSERT INTO TB_EMPLEADO (id_empleado, dni, nombre, fecha_nacimiento) VALUES ('c464174c-7c90-11ec-90d6-0242ac120003', '00000000T', 'Gordon Freeman'	,'1972-02-18');
INSERT INTO TB_EMPLEADO (id_empleado, dni, nombre, fecha_nacimiento) VALUES ('c6e37a12-7c90-11ec-90d6-0242ac120003', '00000000T', 'G-Man'			,'2032-02-18');
INSERT INTO TB_EMPLEADO (id_empleado, dni, nombre, fecha_nacimiento) VALUES ('c9817562-7c90-11ec-90d6-0242ac120003', '00000000T', 'GLaDOS'			,'1986-8-13');
INSERT INTO TB_EMPLEADO (id_empleado, dni, nombre, fecha_nacimiento) VALUES ('cc640952-7c90-11ec-90d6-0242ac120003', '00000000T', 'Chell'			,'1990-05-20');

INSERT INTO TB_REL_EMPRESA_EMPLEADO (id_relacion, id_empresa, id_empleado, tipo_puesto, fecha_alta, fecha_baja) VALUES ('10a11f9c-7c91-11ec-90d6-0242ac120003','d6503c52-7c8f-11ec-90d6-0242ac120003','c464174c-7c90-11ec-90d6-0242ac120003','Cientifico'	,'1956-01-30', null);
INSERT INTO TB_REL_EMPRESA_EMPLEADO (id_relacion, id_empresa, id_empleado, tipo_puesto, fecha_alta, fecha_baja) VALUES ('64ac4850-7c91-11ec-90d6-0242ac120003','1b1ca136-7c90-11ec-90d6-0242ac120003','c059d9ac-7c90-11ec-90d6-0242ac120003','Programador'	,'1993-02-18', null);
INSERT INTO TB_REL_EMPRESA_EMPLEADO (id_relacion, id_empresa, id_empleado, tipo_puesto, fecha_alta, fecha_baja) VALUES ('669f7da8-7c91-11ec-90d6-0242ac120003','d6503c52-7c8f-11ec-90d6-0242ac120003','c6e37a12-7c90-11ec-90d6-0242ac120003','Unknown'		,'1000-01-01', null);
INSERT INTO TB_REL_EMPRESA_EMPLEADO (id_relacion, id_empresa, id_empleado, tipo_puesto, fecha_alta, fecha_baja) VALUES ('692dc778-7c91-11ec-90d6-0242ac120003','fa6ff6f4-7c8f-11ec-90d6-0242ac120003','c9817562-7c90-11ec-90d6-0242ac120003','Genetic Lifeform and Disk Operating System','2005-01-01', null);
INSERT INTO TB_REL_EMPRESA_EMPLEADO (id_relacion, id_empresa, id_empleado, tipo_puesto, fecha_alta, fecha_baja) VALUES ('6c141c9e-7c91-11ec-90d6-0242ac120003','fa6ff6f4-7c8f-11ec-90d6-0242ac120003','cc640952-7c90-11ec-90d6-0242ac120003','Cobaya'		,'1990-05-13', null);
