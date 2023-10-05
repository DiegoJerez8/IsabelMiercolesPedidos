CREATE TABLE `semana4miercoles`.`pedidos` (
  `idpedidos` INT NOT NULL,
  `codigo_producto` INT NULL,
  `unidades` INT NULL,
  `total` DOUBLE NULL,
  `fecha` DATETIME NULL,
  PRIMARY KEY (`idpedidos`),
  INDEX `codigo_productos_idx` (`codigo_producto` ASC) VISIBLE,
  CONSTRAINT `FKproducto`
    FOREIGN KEY (`codigo_producto`)
    REFERENCES `semana4miercoles`.`productos` (`codigo_producto`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
