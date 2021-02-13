
INSERT INTO `hastane_otomasyonu`.`admin4` 
(
`name_surname`, 
`email_address`, 
`password`
) 
VALUES ('Hamit Mızrak', 'hamitmizrak@gmail.com', '123');

DELETE FROM `hastane_otomasyonu`.`admin4` WHERE (`id` = '1');


UPDATE `hastane_otomasyonu`.`admin4` SET `password` = '123456' 
WHERE (`id` = '3');

UPDATE `hastane_otomasyonu`.`admin4` SET `password` = '123456' 
WHERE (`id` = '3');
