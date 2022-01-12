-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.9.3-beta1
-- PostgreSQL version: 13.0
-- Project Site: pgmodeler.io
-- Model Author: ---

-- Database creation must be performed outside a multi lined SQL file. 
-- These commands were put in this file only as a convenience.
-- 
-- object: "Monitores" | type: DATABASE --
-- DROP DATABASE IF EXISTS "Monitores";
CREATE DATABASE "Monitores";
-- ddl-end --


-- object: public."Socio" | type: TABLE --
-- DROP TABLE IF EXISTS public."Socio" CASCADE;
CREATE TABLE public."Socio" (
	"UUID" uuid NOT NULL,
	"NumeroSocio" smallint,
	"Nombre" varchar(40),
	"Telefono" integer,
	"Email" varchar(30),
	"TipoCuota" varchar(20),
	"NumeroCuentaBancaria" varchar(24),
	"Id_Gimnasio" integer,
	"UUID_Entrenador" uuid,
	CONSTRAINT "Socios_pk" PRIMARY KEY ("UUID")

);
-- ddl-end --
ALTER TABLE public."Socio" OWNER TO postgres;
-- ddl-end --

-- object: public."ActividadColectiva" | type: TABLE --
-- DROP TABLE IF EXISTS public."ActividadColectiva" CASCADE;
CREATE TABLE public."ActividadColectiva" (
	"Id" varchar(10) NOT NULL,
	"Tipo" varchar(15),
	"Horario" time,
	"AforoMax" smallint,
	"Sala" varchar(10),
	"Id_Gimnasio" integer,
	"UUID_Socio" uuid,
	"UUID_Monitor" uuid,
	"Fecha" date,
	CONSTRAINT "ActividadesColectivas_pk" PRIMARY KEY ("Id")

);
-- ddl-end --
ALTER TABLE public."ActividadColectiva" OWNER TO postgres;
-- ddl-end --

-- object: public."Empleado" | type: TABLE --
-- DROP TABLE IF EXISTS public."Empleado" CASCADE;
CREATE TABLE public."Empleado" (
	"UUID" uuid NOT NULL,
	"DNI" varchar(15),
	"Nombre" varchar(20),
	"FechaNacimiento" date,
	"Salario" real,
	"Telefono" integer,
	"Id_Gimnasio" integer,
	CONSTRAINT "Empleado_pk" PRIMARY KEY ("UUID")

);
-- ddl-end --
ALTER TABLE public."Empleado" OWNER TO postgres;
-- ddl-end --

-- object: public."Recepcionista" | type: TABLE --
-- DROP TABLE IF EXISTS public."Recepcionista" CASCADE;
CREATE TABLE public."Recepcionista" (

-- 	"UUID" uuid NOT NULL,
-- 	"DNI" varchar(15),
-- 	"Nombre" varchar(20),
-- 	"FechaNacimiento" date,
-- 	"Salario" real,
-- 	"Telefono" integer,
-- 	"Id_Gimnasio" integer,
	CONSTRAINT "Recepcionista_pk" PRIMARY KEY ("UUID")

)
 INHERITS(public."Empleado");
-- ddl-end --
ALTER TABLE public."Recepcionista" OWNER TO postgres;
-- ddl-end --

-- object: public."Limpiador" | type: TABLE --
-- DROP TABLE IF EXISTS public."Limpiador" CASCADE;
CREATE TABLE public."Limpiador" (
	"Turno" time,
	"ZonasAsignadas" character[],

-- 	"UUID" uuid NOT NULL,
-- 	"DNI" varchar(15),
-- 	"Nombre" varchar(20),
-- 	"FechaNacimiento" date,
-- 	"Salario" real,
-- 	"Telefono" integer,
-- 	"Id_Gimnasio" integer,
	CONSTRAINT "Limpiador_pk" PRIMARY KEY ("UUID")

)
 INHERITS(public."Empleado");
-- ddl-end --
ALTER TABLE public."Limpiador" OWNER TO postgres;
-- ddl-end --

-- object: public."Monitor" | type: TABLE --
-- DROP TABLE IF EXISTS public."Monitor" CASCADE;
CREATE TABLE public."Monitor" (
	"Actividades" character[],
	"Especialista" char(15),

-- 	"UUID" uuid NOT NULL,
-- 	"DNI" varchar(15),
-- 	"Nombre" varchar(20),
-- 	"FechaNacimiento" date,
-- 	"Salario" real,
-- 	"Telefono" integer,
-- 	"Id_Gimnasio" integer,
	CONSTRAINT "Monitor_pk" PRIMARY KEY ("UUID")

)
 INHERITS(public."Empleado");
-- ddl-end --
ALTER TABLE public."Monitor" OWNER TO postgres;
-- ddl-end --

-- object: public."Entrenador" | type: TABLE --
-- DROP TABLE IF EXISTS public."Entrenador" CASCADE;
CREATE TABLE public."Entrenador" (
	"HorasLibres" time,
	"HorasReservadas" time,

-- 	"UUID" uuid NOT NULL,
-- 	"DNI" varchar(15),
-- 	"Nombre" varchar(20),
-- 	"FechaNacimiento" date,
-- 	"Salario" real,
-- 	"Telefono" integer,
-- 	"Id_Gimnasio" integer,
	CONSTRAINT "Entrenador_pk" PRIMARY KEY ("UUID")

)
 INHERITS(public."Empleado");
-- ddl-end --
ALTER TABLE public."Entrenador" OWNER TO postgres;
-- ddl-end --

-- object: public."Gimnasio" | type: TABLE --
-- DROP TABLE IF EXISTS public."Gimnasio" CASCADE;
CREATE TABLE public."Gimnasio" (
	"Id" integer NOT NULL,
	"Empleado" public."Empleado",
	"Socios" public."Socio",
	"Actividades" public."ActividadColectiva",
	CONSTRAINT "Gimnasio_pk" PRIMARY KEY ("Id")

);
-- ddl-end --
ALTER TABLE public."Gimnasio" OWNER TO postgres;
-- ddl-end --

-- object: "Gimnasio_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Socio" DROP CONSTRAINT IF EXISTS "Gimnasio_fk" CASCADE;
ALTER TABLE public."Socio" ADD CONSTRAINT "Gimnasio_fk" FOREIGN KEY ("Id_Gimnasio")
REFERENCES public."Gimnasio" ("Id") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: "Gimnasio_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Empleado" DROP CONSTRAINT IF EXISTS "Gimnasio_fk" CASCADE;
ALTER TABLE public."Empleado" ADD CONSTRAINT "Gimnasio_fk" FOREIGN KEY ("Id_Gimnasio")
REFERENCES public."Gimnasio" ("Id") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: "Gimnasio_fk" | type: CONSTRAINT --
-- ALTER TABLE public."ActividadColectiva" DROP CONSTRAINT IF EXISTS "Gimnasio_fk" CASCADE;
ALTER TABLE public."ActividadColectiva" ADD CONSTRAINT "Gimnasio_fk" FOREIGN KEY ("Id_Gimnasio")
REFERENCES public."Gimnasio" ("Id") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: "Entrenador_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Socio" DROP CONSTRAINT IF EXISTS "Entrenador_fk" CASCADE;
ALTER TABLE public."Socio" ADD CONSTRAINT "Entrenador_fk" FOREIGN KEY ("UUID_Entrenador")
REFERENCES public."Entrenador" ("UUID") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: "Socio_fk" | type: CONSTRAINT --
-- ALTER TABLE public."ActividadColectiva" DROP CONSTRAINT IF EXISTS "Socio_fk" CASCADE;
ALTER TABLE public."ActividadColectiva" ADD CONSTRAINT "Socio_fk" FOREIGN KEY ("UUID_Socio")
REFERENCES public."Socio" ("UUID") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: "Monitor_fk" | type: CONSTRAINT --
-- ALTER TABLE public."ActividadColectiva" DROP CONSTRAINT IF EXISTS "Monitor_fk" CASCADE;
ALTER TABLE public."ActividadColectiva" ADD CONSTRAINT "Monitor_fk" FOREIGN KEY ("UUID_Monitor")
REFERENCES public."Monitor" ("UUID") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


