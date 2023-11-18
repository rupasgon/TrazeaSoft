CREATE TABLE `tracersoft`.`item` (
  `idItem` INT NOT NULL AUTO_INCREMENT,
  `idProductNumber` VARCHAR(100) NOT NULL,
  `idModel` VARCHAR(100) NOT NULL,
  `idOperation` INT NOT NULL DEFAULT 0,
  `qualityStatus` VARCHAR(45) NOT NULL DEFAULT 'OK',
  `quantity` INT NOT NULL DEFAULT 1,
  `createDate` DATETIME NOT NULL DEFAULT NOW(),
  `lastUpdate` DATETIME NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`idItem`, `idProductNumber`));
