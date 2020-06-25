-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-06-2020 a las 22:17:23
-- Versión del servidor: 10.3.15-MariaDB
-- Versión de PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sif`
--

create database sif;
use sif;

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `gestionararea` (`opcion` INT, `p_idareaCuerpo` INT(11), `p_descripcion` VARCHAR(60), `p_lado` VARCHAR(60))  BEGIN

Declare numeroRegistros int;

if (opcion = 0) then

  Select count(1) into numeroRegistros
  From area_cuerpo
  where idareaCuerpo = p_idareaCuerpo;
  
  if (numeroRegistros = 0) then 
  
          Insert into area_cuerpo values(p_idareaCuerpo, p_descripcion, p_lado );
    
  else
  
		Update area_cuerpo set descripcion = p_descripcion , lado = p_lado
		where idareaCuerpo = p_idareaCuerpo;
  
  end if;
  
else

  Delete from area_cuerpo where idareaCuerpo = p_idareaCuerpo;

end if;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `gestionardiagnostico` (`opcion` INT, `p_idDiagnostico` INT(11), `p_idPaciente` INT(11), `p_diagnosticoGeneral` VARCHAR(100), `p_diagnosticoEspecifico` VARCHAR(100), `p_numeroSesiones` VARCHAR(45))  BEGIN

Declare numeroRegistros int;

if (opcion = 0) then

  Select count(1) into numeroRegistros
  From diagnosticos
  where idDiagnostico = p_idDiagnostico;
  
  if (numeroRegistros = 0) then 
  
          Insert into diagnosticos values(p_idDiagnostico, p_idPaciente, p_diagnosticoGeneral, 
          p_diagnosticoEspecifico, p_numeroSesiones );
    
  else
  
		Update diagnosticos set diagnosticoGeneral = p_diagnosticoGeneral , 
							diagnosticoEspecifico = p_diagnosticoEspecifico, numeroSesiones = p_numeroSesiones
		where idDiagnostico = p_idDiagnostico;
  
  end if;
  
else

  Delete from diagnosticos where idDiagnostico = p_idDiagnostico;

end if;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `gestionarpacientes` (`opcion` INT, `p_identificacionPaciente` INT(11), `p_tipoIdentificacion` VARCHAR(45), `p_nombres` VARCHAR(70), `p_apellidos` VARCHAR(70), `p_email` VARCHAR(70), `p_telefonos` VARCHAR(100))  BEGIN

Declare numeroRegistros int;

-- Variables necesarias para realizar el substring
Declare comodin TEXT DEFAULT NULL;
Declare longitudcomodin INT DEFAULT NULL;
Declare valor TEXT DEFAULT NULL;


if (opcion = 0) then

  Select count(1) into numeroRegistros
  From pacientes
  where identificacionPaciente = p_identificacionPaciente;
  
  if (numeroRegistros = 0) then 
  
          Insert into pacientes values(p_identificacionPaciente, p_tipoIdentificacion  ,
									    p_nombres , p_apellidos, p_email);
                                        
			iterator:
			LOOP  
				IF LENGTH(TRIM(p_telefonos)) = 0 OR p_telefonos IS NULL THEN
					LEAVE iterator;
				END IF;
				
				SET comodin = SUBSTRING_INDEX(p_telefonos,',',1);
				SET longitudcomodin = LENGTH(comodin);
				SET valor = TRIM(comodin);
				
				insert into telefonos values(p_identificacionPaciente,valor);
				
				SET p_telefonos = INSERT(p_telefonos,1,longitudcomodin + 1,'');

			END LOOP;
    
  else
  
		Update pacientes set nombres = p_nombres , apellidos = p_apellidos, email = p_email
		where identificacionPaciente = p_identificacionPaciente;
  
  end if;
  
else

  Delete from pacientes where identificacionPaciente = p_identificacionPaciente;

end if;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `gestionarpreciotratamiento` (`opcion` INT, `p_idPrecios` INT(11), `p_iDAreaCuerpo` INT(11), `p_valor` VARCHAR(45))  BEGIN

Declare numeroRegistros int;

if (opcion = 0) then

  Select count(1) into numeroRegistros
  From precios
  where idPrecios = p_idPrecios;
  
  if (numeroRegistros = 0) then 
  
          Insert into precios values(p_idPrecios, p_iDAreaCuerpo, p_valor );
    
  else
  
		Update precios set iDAreaCuerpo = p_iDAreaCuerpo , valor = p_valor
		where idPrecios = p_idPrecios;
  
  end if;
  
else

  Delete from precios where idPrecios = p_idPrecios;

end if;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `gestionarsesion1` (`opcion` INT, `p_idSesion` INT(11), `p_fechaRealizacion` VARCHAR(45), `p_idDiagnostico` INT(11), `p_peso` VARCHAR(45), `p_presion_arterial` VARCHAR(45), `p_temperatura` VARCHAR(45), `p_nivelDolor` VARCHAR(45), `p_resultado` VARCHAR(200))  BEGIN

Declare numeroRegistros int;

if (opcion = 0) then

  Select count(1) into numeroRegistros
  From sesiones
  where idSesion = p_idSesion;
  
  if (numeroRegistros = 0) then 
  
          Insert into sesiones values(p_idSesion, p_fechaRealizacion, p_idDiagnostico, p_peso, p_presion_arterial,
          p_temperatura, p_nivelDolor, p_resultado);
    
  else
  
		Update sesiones set fechaRealizacion = p_fechaRealizacion , idDiagnostico = p_idDiagnostico,
							peso = p_peso, presion_arterial = p_presion_arterial, temperatura = p_temperatura,
                            nivelDolor = p_nivelDolor, resultado = p_resultado
		where idSesion = p_idSesion;
  
  end if;
  
else

  Delete from sesiones where idSesion = p_idSesion;

end if;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `gestionartratamiento` (`opcion` INT, `p_idTratamiento_pr` INT(11), `p_nombreTratamiento` VARCHAR(60), `p_idPrecio` INT(11))  BEGIN

Declare numeroRegistros int;

if (opcion = 0) then

  Select count(1) into numeroRegistros
  From tratamientos
  where idTratamiento_pr = p_idTratamiento_pr;
  
  if (numeroRegistros = 0) then 
  
          Insert into tratamientos values(p_idTratamiento_pr, p_nombreTratamiento, p_idPrecio );
    
  else
  
		Update tratamientos set nombreTratamiento = p_nombreTratamiento , idPrecio = p_idPrecio
		where idTratamiento_pr = p_idTratamiento_pr;
  
  end if;
  
else

  Delete from tratamientos where idTratamiento_pr = p_idTratamiento_pr;

end if;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `gestionarusuarios` (`opcion` INT, `p_idusuario` INT(11), `p_tipoIdentificacion` VARCHAR(45), `p_nombres` VARCHAR(60), `p_apellidos` VARCHAR(60), `p_direccion` VARCHAR(100), `p_telefono` VARCHAR(45), `p_contrasena` VARCHAR(60), `p_tipo_usuario` INT(4), `p_estado` VARCHAR(60))  BEGIN

Declare numeroRegistros int;

if (opcion = 0) then

  Select count(1) into numeroRegistros
  From usuarios
  where idusuario = p_idusuario;
  
  if (numeroRegistros = 0) then 
  
          Insert into usuarios values(p_idusuario, p_tipoIdentificacion  ,
									    p_nombres , p_apellidos, p_direccion , 
									    p_telefono, p_contrasena, p_tipo_usuario, 
                                        p_estado);
    
  else
  
		Update usuarios set nombres = p_nombres , apellidos = p_apellidos, direccion = p_direccion,
							telefono = p_telefono, contrasena = p_contrasena, tipo_usuario = p_tipo_usuario,
                            estado = p_estado
		where idusuario = p_idusuario;
  
  end if;
  
else

  Delete from usuarios where idusuario = p_idusuario;

end if;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area_cuerpo`
--

CREATE TABLE `area_cuerpo` (
  `idareaCuerpo` int(11) NOT NULL,
  `descripcion` varchar(60) NOT NULL,
  `lado` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `area_cuerpo`
--

INSERT INTO `area_cuerpo` (`idareaCuerpo`, `descripcion`, `lado`) VALUES
(123, 'df', 'df'),
(124, 'Luna', 'Izquierda');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_factura`
--

CREATE TABLE `detalles_factura` (
  `idDetalle` int(11) NOT NULL,
  `idTratamientoFk` int(11) NOT NULL,
  `precio` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diagnosticos`
--

CREATE TABLE `diagnosticos` (
  `idDiagnostico` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `diagnosticoGeneral` varchar(100) DEFAULT NULL,
  `diagnosticoEspecifico` varchar(100) DEFAULT NULL,
  `numeroSesiones` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `diagnosticos`
--

INSERT INTO `diagnosticos` (`idDiagnostico`, `idPaciente`, `diagnosticoGeneral`, `diagnosticoEspecifico`, `numeroSesiones`) VALUES
(56, 56, '56', '56', '56'),
(57, 57, '57', '57', '57'),
(123, 55, '56', '56', '56');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa_datos`
--

CREATE TABLE `empresa_datos` (
  `id_datoss` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `direccion` varchar(75) NOT NULL,
  `nit` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empresa_datos`
--

INSERT INTO `empresa_datos` (`id_datoss`, `nombre`, `direccion`, `nit`) VALUES
(1, 'Emovia', 'Calle 15 # 23-27', '900000001');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `idfactura` int(11) NOT NULL,
  `idpaciente` int(11) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `total` varchar(45) NOT NULL,
  `id_datos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `identificacionPaciente` int(11) NOT NULL,
  `tipoIdentificacion` varchar(45) DEFAULT NULL,
  `nombres` varchar(70) DEFAULT NULL,
  `apellidos` varchar(70) DEFAULT NULL,
  `email` varchar(70) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`identificacionPaciente`, `tipoIdentificacion`, `nombres`, `apellidos`, `email`) VALUES
(55, 'CC', '55', '55', '55'),
(56, 'CC', '56', '56', '56'),
(57, 'CC', '57', '57', '57'),
(1212, 'CC', '12', '12', '12'),
(1245, 'CC', '1245', '124', '1245');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precios`
--

CREATE TABLE `precios` (
  `idPrecios` int(11) NOT NULL,
  `iDAreaCuerpo` int(11) NOT NULL,
  `valor` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `precios`
--

INSERT INTO `precios` (`idPrecios`, `iDAreaCuerpo`, `valor`) VALUES
(11, 124, '50000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sesiones`
--

CREATE TABLE `sesiones` (
  `idSesion` int(11) NOT NULL,
  `fechaRealizacion` varchar(45) NOT NULL,
  `idDiagnostico` int(11) NOT NULL,
  `peso` varchar(45) NOT NULL,
  `presion_arterial` varchar(45) NOT NULL,
  `temperatura` varchar(45) NOT NULL,
  `nivelDolor` varchar(45) NOT NULL,
  `resultado` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sesiones`
--

INSERT INTO `sesiones` (`idSesion`, `fechaRealizacion`, `idDiagnostico`, `peso`, `presion_arterial`, `temperatura`, `nivelDolor`, `resultado`) VALUES
(57, '2020-6-17', 57, '57', '57', '57', '10', '57');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefonos`
--

CREATE TABLE `telefonos` (
  `id_paciente` int(11) NOT NULL,
  `numero_telefono` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `telefonos`
--

INSERT INTO `telefonos` (`id_paciente`, `numero_telefono`) VALUES
(55, '551'),
(55, '552'),
(56, '561'),
(56, '562'),
(57, '571'),
(57, '572'),
(1212, '123'),
(1212, '1233'),
(1245, '1245');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamientos`
--

CREATE TABLE `tratamientos` (
  `idTratamiento_pr` int(11) NOT NULL,
  `nombreTratamiento` varchar(60) DEFAULT NULL,
  `idPrecio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tratamientos`
--

INSERT INTO `tratamientos` (`idTratamiento_pr`, `nombreTratamiento`, `idPrecio`) VALUES
(1212, 'Fisioterapeutico', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idusuario` int(11) NOT NULL,
  `tipoIdentificacion` varchar(45) DEFAULT NULL,
  `nombres` varchar(60) DEFAULT NULL,
  `apellidos` varchar(60) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `contrasena` varchar(60) DEFAULT NULL,
  `tipo_usuario` int(4) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idusuario`, `tipoIdentificacion`, `nombres`, `apellidos`, `direccion`, `telefono`, `contrasena`, `tipo_usuario`, `estado`) VALUES
(123, 'CC', '123', '123', '123', '123', '123', 1, 'Desvinculado'),
(456, 'CC', '456', '456', '789', '456', '456', 2, 'Vincualado'),
(789, 'Paporte', '789', '789', '789', '789', '789', 1, 'Desvinculado'),
(1102, 'CC', '12', '12', '12', '12', '12', 0, 'Vincualado'),
(12345, 'CC', '12345', '12345', '12345', '12345', '12345', 1, '--'),
(1102838994, 'Paporte', 'Miguel Andrés', 'Pérez Arcia', 'Calle 15', '2816894', '0000', 1, 'Desvinculado');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `area_cuerpo`
--
ALTER TABLE `area_cuerpo`
  ADD PRIMARY KEY (`idareaCuerpo`);

--
-- Indices de la tabla `detalles_factura`
--
ALTER TABLE `detalles_factura`
  ADD KEY `fk_factura_idx` (`idDetalle`),
  ADD KEY `fk_tratamiento_idx` (`idTratamientoFk`);

--
-- Indices de la tabla `diagnosticos`
--
ALTER TABLE `diagnosticos`
  ADD PRIMARY KEY (`idDiagnostico`),
  ADD KEY `fk_paciente_idx` (`idPaciente`);

--
-- Indices de la tabla `empresa_datos`
--
ALTER TABLE `empresa_datos`
  ADD PRIMARY KEY (`id_datoss`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`idfactura`),
  ADD KEY `fk_paciente_idx` (`idpaciente`),
  ADD KEY `fk_datos_idx` (`id_datos`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`identificacionPaciente`);

--
-- Indices de la tabla `precios`
--
ALTER TABLE `precios`
  ADD PRIMARY KEY (`idPrecios`),
  ADD KEY `fk_area_cuerpo_idx` (`iDAreaCuerpo`);

--
-- Indices de la tabla `sesiones`
--
ALTER TABLE `sesiones`
  ADD PRIMARY KEY (`idSesion`),
  ADD KEY `fk_diagnostico_idx` (`idDiagnostico`);

--
-- Indices de la tabla `telefonos`
--
ALTER TABLE `telefonos`
  ADD PRIMARY KEY (`id_paciente`,`numero_telefono`);

--
-- Indices de la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  ADD PRIMARY KEY (`idTratamiento_pr`),
  ADD KEY `fk_preci_idx` (`idPrecio`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idusuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalles_factura`
--
ALTER TABLE `detalles_factura`
  ADD CONSTRAINT `fk_factura` FOREIGN KEY (`idDetalle`) REFERENCES `facturas` (`idfactura`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tratamient` FOREIGN KEY (`idTratamientoFk`) REFERENCES `tratamientos` (`idTratamiento_pr`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `diagnosticos`
--
ALTER TABLE `diagnosticos`
  ADD CONSTRAINT `fk_paciente` FOREIGN KEY (`idPaciente`) REFERENCES `pacientes` (`identificacionPaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `fk_datos` FOREIGN KEY (`id_datos`) REFERENCES `empresa_datos` (`id_datoss`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_pacient` FOREIGN KEY (`idpaciente`) REFERENCES `pacientes` (`identificacionPaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `precios`
--
ALTER TABLE `precios`
  ADD CONSTRAINT `fk_area_cuerpo` FOREIGN KEY (`iDAreaCuerpo`) REFERENCES `area_cuerpo` (`idareaCuerpo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `sesiones`
--
ALTER TABLE `sesiones`
  ADD CONSTRAINT `fk_diagnostico` FOREIGN KEY (`idDiagnostico`) REFERENCES `diagnosticos` (`idDiagnostico`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `telefonos`
--
ALTER TABLE `telefonos`
  ADD CONSTRAINT `fk_telefonos_paciente` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`identificacionPaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  ADD CONSTRAINT `fk_preci` FOREIGN KEY (`idPrecio`) REFERENCES `precios` (`idPrecios`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
