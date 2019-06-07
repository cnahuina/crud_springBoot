--
-- ER/Studio 8.0 SQL Code Generation
-- Company :      Microsoft
-- Project :      DATA MODEL
-- Author :       Microsoft
--
-- Date Created : Wednesday, June 05, 2019 15:38:37
-- Target DBMS : IBM DB2 AS/400 4.x
--

-- 
-- TABLE: BANCO 
--

CREATE TABLE BANCO(
    id_banco        INTEGER         NOT NULL,
    razon_social    VARCHAR(250),
    ruc             CHAR(12),
    id_sucursal     INTEGER         NOT NULL,
    CONSTRAINT PK2 PRIMARY KEY (id_banco)
)
;



-- 
-- TABLE: DEPARTAMENTO 
--

CREATE TABLE DEPARTAMENTO(
    id_departamento    INTEGER        NOT NULL,
    nombre             VARCHAR(50),
    CONSTRAINT PK16 PRIMARY KEY (id_departamento)
)
;



-- 
-- TABLE: DETALLE_ORDEN_DE_COMPRA 
--

CREATE TABLE DETALLE_ORDEN_DE_COMPRA(
    id_compra       INTEGER      NOT NULL,
    precio_total    FLOAT,
    fecha_compra    TIMESTAMP,
    id_producto     INTEGER      NOT NULL,
    id_provedor     INTEGER      NOT NULL,
    id_banco        INTEGER      NOT NULL,
    CONSTRAINT PK6 PRIMARY KEY (id_compra)
)
;



-- 
-- TABLE: PAIS 
--

CREATE TABLE PAIS(
    id_pais    INTEGER        NOT NULL,
    nombre     VARCHAR(50),
    CONSTRAINT PK15 PRIMARY KEY (id_pais)
)
;



-- 
-- TABLE: PRODUCTO 
--

CREATE TABLE PRODUCTO(
    id_producto    INTEGER         NOT NULL,
    descripcion    VARCHAR(250),
    estado         INTEGER,
    CONSTRAINT PK11 PRIMARY KEY (id_producto)
)
;



-- 
-- TABLE: PROVEEDOR 
--

CREATE TABLE PROVEEDOR(
    id_provedor     INTEGER         NOT NULL,
    razon_social    VARCHAR(150),
    ruc             CHAR(12),
    CONSTRAINT PK1 PRIMARY KEY (id_provedor)
)
;



-- 
-- TABLE: SUCURSAL 
--

CREATE TABLE SUCURSAL(
    id_sucursal    INTEGER         NOT NULL,
    nombre         VARCHAR(100),
    id_ubigeo      INTEGER         NOT NULL,
    CONSTRAINT PK14 PRIMARY KEY (id_sucursal)
)
;



-- 
-- TABLE: UBIGEO 
--

CREATE TABLE UBIGEO(
    id_ubigeo          INTEGER    NOT NULL,
    id_pais            INTEGER    NOT NULL,
    id_departamento    INTEGER    NOT NULL,
    CONSTRAINT PK3 PRIMARY KEY (id_ubigeo)
)
;



-- 
-- TABLE: BANCO 
--

ALTER TABLE BANCO ADD CONSTRAINT RefSUCURSAL19 
    FOREIGN KEY (id_sucursal)
    REFERENCES SUCURSAL(id_sucursal)
;


-- 
-- TABLE: DETALLE_ORDEN_DE_COMPRA 
--

ALTER TABLE DETALLE_ORDEN_DE_COMPRA ADD CONSTRAINT RefPRODUCTO15 
    FOREIGN KEY (id_producto)
    REFERENCES PRODUCTO(id_producto)
;

ALTER TABLE DETALLE_ORDEN_DE_COMPRA ADD CONSTRAINT RefPROVEEDOR16 
    FOREIGN KEY (id_provedor)
    REFERENCES PROVEEDOR(id_provedor)
;

ALTER TABLE DETALLE_ORDEN_DE_COMPRA ADD CONSTRAINT RefBANCO17 
    FOREIGN KEY (id_banco)
    REFERENCES BANCO(id_banco)
;


-- 
-- TABLE: SUCURSAL 
--

ALTER TABLE SUCURSAL ADD CONSTRAINT RefUBIGEO18 
    FOREIGN KEY (id_ubigeo)
    REFERENCES UBIGEO(id_ubigeo)
;


-- 
-- TABLE: UBIGEO 
--

ALTER TABLE UBIGEO ADD CONSTRAINT RefPAIS20 
    FOREIGN KEY (id_pais)
    REFERENCES PAIS(id_pais)
;

ALTER TABLE UBIGEO ADD CONSTRAINT RefDEPARTAMENTO21 
    FOREIGN KEY (id_departamento)
    REFERENCES DEPARTAMENTO(id_departamento)
;


