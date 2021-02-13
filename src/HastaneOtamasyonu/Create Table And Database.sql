
CREATE SCHEMA `hastane_otomasyonu` DEFAULT CHARACTER SET utf8 ;


CREATE TABLE `hastane_otomasyonu`.`admin4` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name_surname` VARCHAR(150) NULL,
  `email_address` VARCHAR(20) NULL,
  `password` VARCHAR(45) NULL,
  `creation_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));
